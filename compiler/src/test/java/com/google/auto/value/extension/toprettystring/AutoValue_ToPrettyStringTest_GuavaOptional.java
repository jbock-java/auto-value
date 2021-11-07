package com.google.auto.value.extension.toprettystring;

import com.google.common.base.Optional;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.extension.toprettystring.processor.ToPrettyStringExtension")
final class AutoValue_ToPrettyStringTest_GuavaOptional extends $AutoValue_ToPrettyStringTest_GuavaOptional {
  AutoValue_ToPrettyStringTest_GuavaOptional(Optional<Object> optional$) {
    super(optional$);
  }

  @Override
  final String toPrettyString() {
    return "GuavaOptional {"
        + "\n"
        + "  optional = " + format(optional(), 1) + "," + "\n" + "}";
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
