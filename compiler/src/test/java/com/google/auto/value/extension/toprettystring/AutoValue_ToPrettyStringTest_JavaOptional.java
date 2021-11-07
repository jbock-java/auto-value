package com.google.auto.value.extension.toprettystring;

import javax.annotation.processing.Generated;
import java.util.Optional;

@Generated("com.google.auto.value.extension.toprettystring.processor.ToPrettyStringExtension")
final class AutoValue_ToPrettyStringTest_JavaOptional extends $AutoValue_ToPrettyStringTest_JavaOptional {
  AutoValue_ToPrettyStringTest_JavaOptional(Optional<Object> optional$) {
    super(optional$);
  }

  @Override
  final String toPrettyString() {
    return "JavaOptional {"
        + "\n"
        + "  optional = " + formatOptionalOfObject(optional(), 1) + "," + "\n" + "}";
  }

  private static String format(Object value, int indentLevel) {
    if (value == null) {
      return "null";
    }
    return value.toString().replace("\n", "\n" + $indent(indentLevel));
  }

  private static String formatOptionalOfObject(Optional<Object> value, int indentLevel) {
    if (value == null) {
      return "null";
    }
    return (value.isPresent() ? format(value.get(), indentLevel) : "<empty>");
  }

  private static String $indent(int level) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < level; i++) {
      builder.append("  ");
    }
    return builder.toString();
  }
}
