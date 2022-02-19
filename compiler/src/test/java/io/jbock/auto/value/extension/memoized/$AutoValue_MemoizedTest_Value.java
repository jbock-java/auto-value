package io.jbock.auto.value.extension.memoized;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_MemoizedTest_Value extends MemoizedTest.Value {

  private final String string;

  private final @org.checkerframework.checker.nullness.qual.Nullable String stringWithTypeAnnotation;

  private final MemoizedTest.HashCodeAndToStringCounter counter;

  $AutoValue_MemoizedTest_Value(
      @javax.annotation.Nullable String string,
      @org.checkerframework.checker.nullness.qual.Nullable String stringWithTypeAnnotation,
      MemoizedTest.HashCodeAndToStringCounter counter) {
    this.string = string;
    this.stringWithTypeAnnotation = stringWithTypeAnnotation;
    if (counter == null) {
      throw new NullPointerException("Null counter");
    }
    this.counter = counter;
  }

  @javax.annotation.Nullable
  @Override
  String string() {
    return string;
  }

  @Override
  @org.checkerframework.checker.nullness.qual.Nullable String stringWithTypeAnnotation() {
    return stringWithTypeAnnotation;
  }

  @Override
  MemoizedTest.HashCodeAndToStringCounter counter() {
    return counter;
  }

  @Override
  public String toString() {
    return "Value{"
        + "string=" + string + ", "
        + "stringWithTypeAnnotation=" + stringWithTypeAnnotation + ", "
        + "counter=" + counter
        + "}";
  }

  @Override
  public boolean equals(@org.checkerframework.checker.nullness.qual.Nullable Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MemoizedTest.Value) {
      MemoizedTest.Value that = (MemoizedTest.Value) o;
      return (this.string == null ? that.string() == null : this.string.equals(that.string()))
          && (this.stringWithTypeAnnotation == null ? that.stringWithTypeAnnotation() == null : this.stringWithTypeAnnotation.equals(that.stringWithTypeAnnotation()))
          && this.counter.equals(that.counter());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (string == null) ? 0 : string.hashCode();
    h$ *= 1000003;
    h$ ^= (stringWithTypeAnnotation == null) ? 0 : stringWithTypeAnnotation.hashCode();
    h$ *= 1000003;
    h$ ^= counter.hashCode();
    return h$;
  }

}
