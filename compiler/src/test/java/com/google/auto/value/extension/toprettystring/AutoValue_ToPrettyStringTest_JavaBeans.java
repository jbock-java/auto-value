package com.google.auto.value.extension.toprettystring;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.extension.toprettystring.processor.ToPrettyStringExtension")
final class AutoValue_ToPrettyStringTest_JavaBeans extends $AutoValue_ToPrettyStringTest_JavaBeans {
  AutoValue_ToPrettyStringTest_JavaBeans(int int$, boolean boolean$, String notAJavaIdentifier$) {
    super(int$, boolean$, notAJavaIdentifier$);
  }

  @Override
  final String toPrettyString() {
    return "JavaBeans {"
        + "\n"
        + "  int = " + getInt() + ","
        + "\n"
        + "  boolean = " + isBoolean() + ","
        + "\n"
        + "  notAJavaIdentifier = " + format(getNotAJavaIdentifier(), 1) + "," + "\n" + "}";
  }

  private static String format(Object value, int indentLevel) {
    if (value == null) {
      return "null";
    }
    return value.toString().replace("\n", "\n" + $indent(indentLevel));
  }

  private static String $indent(int level) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < level; i++) {
      builder.append("  ");
    }
    return builder.toString();
  }
}
