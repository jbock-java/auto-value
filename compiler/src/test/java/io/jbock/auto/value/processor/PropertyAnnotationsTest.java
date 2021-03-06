/*
 * Copyright 2014 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jbock.auto.value.processor;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.testing.compile.Compilation;
import com.google.testing.compile.JavaFileObjects;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.annotation.Nullable;
import javax.tools.JavaFileObject;
import java.io.IOException;
import java.lang.annotation.Inherited;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.google.testing.compile.CompilationSubject.assertThat;
import static com.google.testing.compile.Compiler.javac;
import static org.hamcrest.CoreMatchers.is;

/**
 * Tests to ensure annotations are kept on AutoValue generated classes
 *
 * @author jmcampanini
 */
@RunWith(JUnit4.class)
public class PropertyAnnotationsTest {
    private static final String TEST_ANNOTATION = "@PropertyAnnotationsTest.TestAnnotation";
    private static final String TEST_ARRAY_ANNOTATION =
            "@PropertyAnnotationsTest.TestArrayAnnotation";

    public enum TestEnum {
        A,
        B;

        @Override
        public String toString() {
            // used to prove that the method we determine the value does not use the `toString()` method
            // of the enum
            return "not the same value";
        }
    }

    public @interface TestAnnotation {
        byte testByte() default 1;

        short testShort() default 2;

        int testInt() default 3;

        long testLong() default 4L;

        float testFloat() default 5.6f;

        double testDouble() default 7.8d;

        char testChar() default 'a';

        String testString() default "10";

        boolean testBoolean() default false;

        Class<?> testClass() default TestEnum.class;

        TestEnum testEnum() default TestEnum.A;

        OtherAnnotation testAnnotation() default @OtherAnnotation(foo = 23, bar = "baz");
    }

    public @interface OtherAnnotation {
        int foo() default 123;

        String bar() default "bar";
    }

    public @interface TestArrayAnnotation {
        byte[] testBytes() default {1, 2};

        short[] testShorts() default {3, 4};

        int[] testInts() default {5, 6};

        long[] testLongs() default {7L, 8L};

        float[] testFloats() default {9.1f, 2.3f};

        double[] testDoubles() default {4.5d, 6.7d};

        char[] testChars() default {'a', 'b'};

        String[] testStrings() default {"cde", "fgh"};

        boolean[] testBooleans() default {true, false};

        Class<?>[] testClasses() default {TestEnum.class, TestEnum.class};

        TestEnum[] testEnums() default {TestEnum.A, TestEnum.B};

        OtherAnnotation[] testAnnotations() default {
                @OtherAnnotation(foo = 999), @OtherAnnotation(bar = "baz")
        };
    }

    @Inherited
    public @interface InheritedAnnotation {
    }

    private static class InputFileBuilder {
        Iterable<String> imports = ImmutableList.of();
        List<String> annotations = new ArrayList<>();
        List<String> innerTypes = new ArrayList<>();

        InputFileBuilder setImports(Iterable<String> imports) {
            this.imports = imports;
            return this;
        }

        InputFileBuilder addAnnotations(String... annotations) {
            this.annotations.addAll(ImmutableList.copyOf(annotations));
            return this;
        }

        InputFileBuilder addAnnotations(Iterable<String> annotations) {
            this.annotations.addAll(ImmutableList.copyOf(annotations));
            return this;
        }

        InputFileBuilder addInnerTypes(String... innerTypes) {
            this.innerTypes.addAll(ImmutableList.copyOf(innerTypes));
            return this;
        }

        JavaFileObject build() {
            ImmutableList<String> list =
                    ImmutableList.<String>builder()
                            .add("package foo.bar;", "", "import io.jbock.auto.value.AutoValue;")
                            .addAll(imports)
                            .add("", "@AutoValue", "public abstract class Baz {")
                            .addAll(annotations)
                            .add(
                                    "  public abstract int buh();",
                                    "",
                                    "  public static Baz create(int buh) {",
                                    "    return new AutoValue_Baz(buh);",
                                    "  }")
                            .addAll(innerTypes)
                            .add("}")
                            .build();
            String[] lines = list.toArray(new String[list.size()]);
            return JavaFileObjects.forSourceLines("foo.bar.Baz", lines);
        }
    }

    private static class OutputFileBuilder {
        Iterable<String> imports = ImmutableList.of();
        List<String> fieldAnnotations = new ArrayList<>();
        List<String> methodAnnotations = new ArrayList<>();

        OutputFileBuilder setImports(Iterable<String> imports) {
            this.imports = imports;
            return this;
        }

        OutputFileBuilder addFieldAnnotations(String... annotations) {
            this.fieldAnnotations.addAll(ImmutableList.copyOf(annotations).stream().map(s -> "  " + s).collect(Collectors.toList()));
            return this;
        }

        OutputFileBuilder addMethodAnnotations(String... innerTypes) {
            this.methodAnnotations.addAll(ImmutableList.copyOf(innerTypes).stream().map(s -> "  " + s).collect(Collectors.toList()));
            return this;
        }

        OutputFileBuilder addMethodAnnotations(Iterable<String> innerTypes) {
            this.methodAnnotations.addAll(ImmutableList.copyOf(innerTypes).stream().map(s -> "  " + s).collect(Collectors.toList()));
            return this;
        }

        String[] build() {
            String nullable = methodAnnotations.contains("@Nullable") ? "@Nullable " : "";
            ImmutableSortedSet<String> allImports =
                    ImmutableSortedSet.<String>naturalOrder()
                            .add(GeneratedImport.importGeneratedAnnotationType())
                            .addAll(imports)
                            .build();
            ImmutableList<String> list =
                    ImmutableList.<String>builder()
                            .add("package foo.bar;", "")
                            .addAll(allImports)
                            .add(
                                    "",
                                    "@Generated(\"" + AutoValueProcessor.class.getName() + "\")",
                                    "final class AutoValue_Baz extends Baz {",
                                    "")
                            .addAll(fieldAnnotations)
                            .add(
                                    "  private final int buh;",
                                    "",
                                    "  AutoValue_Baz(",
                                    "      " + nullable + "int buh) {",
                                    "    this.buh = buh;",
                                    "  }",
                                    "")
                            .addAll(methodAnnotations)
                            .add(
                                    "  @Override",
                                    "  public int buh() {",
                                    "    return buh;",
                                    "  }",
                                    "",
                                    "  @Override",
                                    "  public String toString() {",
                                    "    return \"Baz{\"",
                                    "        + \"buh=\" + buh",
                                    "        + \"}\";",
                                    "  }",
                                    "",
                                    "  @Override",
                                    "  public boolean equals(Object o) {",
                                    "    if (o == this) {",
                                    "      return true;",
                                    "    }",
                                    "    if (o instanceof Baz) {",
                                    "      Baz that = (Baz) o;",
                                    "      return this.buh == that.buh();",
                                    "    }",
                                    "    return false;",
                                    "  }",
                                    "",
                                    "  @Override",
                                    "  public int hashCode() {",
                                    "    int h$ = 1;",
                                    "    h$ *= 1000003;",
                                    "    h$ ^= buh;",
                                    "    return h$;",
                                    "  }",
                                    "",
                                    "}")
                            .build();

            return list.toArray(new String[list.size()]);
        }
    }

    private ImmutableSet<String> getImports(Class<?>... classes) {
        ImmutableSet.Builder<String> stringBuilder = ImmutableSortedSet.naturalOrder();
        for (Class<?> clazz : classes) {
            stringBuilder.add("import " + clazz.getName() + ";");
        }
        return stringBuilder.build();
    }

    private void assertGeneratedMatches(
            Iterable<String> imports,
            Iterable<String> annotations,
            Iterable<String> expectedMethodAnnotations) throws IOException {

        JavaFileObject javaFileObject =
                new InputFileBuilder().setImports(imports).addAnnotations(annotations).build();

        String[] expectedOutput =
                new OutputFileBuilder()
                        .setImports(imports)
                        .addMethodAnnotations(expectedMethodAnnotations)
                        .build();

        Compilation compilation =
                javac()
                        .withProcessors(new AutoValueProcessor())
                        .compile(javaFileObject);
        assertThat(compilation).succeeded();
        String actualOutput = compilation.generatedSourceFile("foo.bar.AutoValue_Baz")
                .orElseThrow().getCharContent(false).toString();
        MatcherAssert.assertThat(actualOutput.lines().toArray(), is(expectedOutput));
    }

    @Test
    public void testSimpleAnnotation() throws IOException {
        assertGeneratedMatches(
                ImmutableList.of(), ImmutableList.of("@Deprecated"), ImmutableList.of("@Deprecated"));
    }

    @Test
    public void testSingleStringValueAnnotation() throws IOException {
        assertGeneratedMatches(
                ImmutableList.of(),
                ImmutableList.of("@SuppressWarnings(\"a\")"),
                ImmutableList.of("@SuppressWarnings(\"a\")"));
    }

    @Test
    public void testMultiStringValueAnnotation() throws IOException {
        assertGeneratedMatches(
                ImmutableList.of(),
                ImmutableList.of("@SuppressWarnings({\"a\", \"b\"})"),
                ImmutableList.of("@SuppressWarnings({\"a\", \"b\"})"));
    }

    @Test
    public void testNumberValueAnnotation() throws IOException {
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class),
                ImmutableList.of(TEST_ANNOTATION + "(testShort = 1, testInt = 2, testLong = 3L)"),
                ImmutableList.of(TEST_ANNOTATION + "(testShort = 1, testInt = 2, testLong = 3L)"));
    }

    @Test
    public void testByteValueAnnotation() throws IOException {
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class),
                ImmutableList.of(TEST_ANNOTATION + "(testByte = 0)"),
                ImmutableList.of(TEST_ANNOTATION + "(testByte = 0)"));
    }

    @Test
    public void testDecimalValueAnnotation() throws IOException {
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class),
                ImmutableList.of(TEST_ANNOTATION + "(testDouble = 1.2, testFloat = 3.4F)"),
                ImmutableList.of(TEST_ANNOTATION + "(testDouble = 1.2, testFloat = 3.4F)"));
    }

    @Test
    public void testOtherValuesAnnotation() throws IOException {
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class),
                ImmutableList.of(
                        TEST_ANNOTATION + "(testBoolean = true, testString = \"hallo\", testChar = 'a')"),
                ImmutableList.of(
                        TEST_ANNOTATION + "(testBoolean = true, testString = \"hallo\", testChar = 'a')"));
    }

    @Test
    public void testClassAnnotation() throws IOException {
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class),
                ImmutableList.of(TEST_ANNOTATION + "(testClass = String.class)"),
                ImmutableList.of(TEST_ANNOTATION + "(testClass = String.class)"));
    }

    @Test
    public void testEnumAnnotation() throws IOException {
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class),
                ImmutableList.of(
                        TEST_ANNOTATION
                                + "(testEnum = "
                                + PropertyAnnotationsTest.class.getName()
                                + ".TestEnum.A)"),
                ImmutableList.of(TEST_ANNOTATION + "(testEnum = PropertyAnnotationsTest.TestEnum.A)"));
    }

    @Test
    public void testEmptyAnnotationAnnotation() throws IOException {
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class),
                ImmutableList.of(
                        TEST_ANNOTATION + "(testAnnotation = @PropertyAnnotationsTest.OtherAnnotation)"),
                ImmutableList.of(
                        TEST_ANNOTATION + "(testAnnotation = @PropertyAnnotationsTest.OtherAnnotation)"));
    }

    @Test
    public void testValuedAnnotationAnnotation() throws IOException {
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class),
                ImmutableList.of(
                        TEST_ANNOTATION
                                + "(testAnnotation = @PropertyAnnotationsTest.OtherAnnotation(foo = 999))"),
                ImmutableList.of(
                        TEST_ANNOTATION
                                + "(testAnnotation = @PropertyAnnotationsTest.OtherAnnotation(foo = 999))"));
    }

    @Test
    public void testNumberArrayAnnotation() throws IOException {
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class),
                ImmutableList.of(
                        TEST_ARRAY_ANNOTATION
                                + "(testShorts = {2, 3}, testInts = {4, 5}, testLongs = {6L, 7L})"),
                ImmutableList.of(
                        TEST_ARRAY_ANNOTATION
                                + "(testShorts = {2, 3}, testInts = {4, 5}, testLongs = {6L, 7L})"));
    }

    @Test
    public void testByteArrayAnnotation() throws IOException {
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class),
                ImmutableList.of(TEST_ARRAY_ANNOTATION + "(testBytes = {0, 1})"),
                ImmutableList.of(TEST_ARRAY_ANNOTATION + "(testBytes = {0, 1})"));
    }

    @Test
    public void testDecimalArrayAnnotation() throws IOException {
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class),
                ImmutableList.of(
                        TEST_ARRAY_ANNOTATION + "(testDoubles = {1.2, 3.4}, testFloats = {5.6F, 7.8F})"),
                ImmutableList.of(
                        TEST_ARRAY_ANNOTATION + "(testDoubles = {1.2, 3.4}, testFloats = {5.6F, 7.8F})"));
    }

    @Test
    public void testOtherArrayAnnotation() throws IOException {
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class),
                ImmutableList.of(
                        TEST_ARRAY_ANNOTATION
                                + "(testBooleans = {false, false},"
                                + " testStrings = {\"aaa\", \"bbb\"}, testChars = {'x', 'y'})"),
                ImmutableList.of(
                        TEST_ARRAY_ANNOTATION
                                + "(testBooleans = {false, false},"
                                + " testStrings = {\"aaa\", \"bbb\"}, testChars = {'x', 'y'})"));
    }

    @Test
    public void testClassArrayAnnotation() throws IOException {
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class),
                ImmutableList.of(TEST_ARRAY_ANNOTATION + "(testClasses = {String.class, Long.class})"),
                ImmutableList.of(TEST_ARRAY_ANNOTATION + "(testClasses = {String.class, Long.class})"));
    }

    @Test
    public void testImportedClassArrayAnnotation() throws IOException {
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class, Nullable.class),
                ImmutableList.of(
                        TEST_ARRAY_ANNOTATION
                                + "(testClasses = {javax.annotation.Nullable.class, Long.class})"),
                ImmutableList.of(TEST_ARRAY_ANNOTATION + "(testClasses = {Nullable.class, Long.class})"));
    }

    @Test
    public void testEnumArrayAnnotation() throws IOException {
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class),
                ImmutableList.of(
                        TEST_ARRAY_ANNOTATION
                                + "(testEnums = {PropertyAnnotationsTest.TestEnum.A,"
                                + " PropertyAnnotationsTest.TestEnum.B})"),
                ImmutableList.of(
                        TEST_ARRAY_ANNOTATION
                                + "(testEnums = {PropertyAnnotationsTest.TestEnum.A,"
                                + " PropertyAnnotationsTest.TestEnum.B})"));
    }

    @Test
    public void testArrayOfEmptyAnnotationAnnotation() throws IOException {
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class),
                ImmutableList.of(
                        TEST_ARRAY_ANNOTATION
                                + "(testAnnotations = {@PropertyAnnotationsTest.OtherAnnotation})"),
                ImmutableList.of(
                        TEST_ARRAY_ANNOTATION
                                + "(testAnnotations = @PropertyAnnotationsTest.OtherAnnotation)"));
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class),
                ImmutableList.of(
                        TEST_ARRAY_ANNOTATION
                                + "(testAnnotations = {@PropertyAnnotationsTest.OtherAnnotation,"
                                + " @PropertyAnnotationsTest.OtherAnnotation})"),
                ImmutableList.of(
                        TEST_ARRAY_ANNOTATION
                                + "(testAnnotations = {@PropertyAnnotationsTest.OtherAnnotation,"
                                + " @PropertyAnnotationsTest.OtherAnnotation})"));
    }

    @Test
    public void testArrayOfValuedAnnotationAnnotation() throws IOException {
        assertGeneratedMatches(
                getImports(PropertyAnnotationsTest.class),
                ImmutableList.of(
                        TEST_ARRAY_ANNOTATION
                                + "(testAnnotations = {@PropertyAnnotationsTest.OtherAnnotation(foo = 999)})"),
                ImmutableList.of(
                        TEST_ARRAY_ANNOTATION
                                + "(testAnnotations = @PropertyAnnotationsTest.OtherAnnotation(foo = 999))"));
    }
}
