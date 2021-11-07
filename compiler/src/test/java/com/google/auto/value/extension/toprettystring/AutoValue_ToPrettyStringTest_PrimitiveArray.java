package com.google.auto.value.extension.toprettystring;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.extension.toprettystring.processor.ToPrettyStringExtension")
final class AutoValue_ToPrettyStringTest_PrimitiveArray extends $AutoValue_ToPrettyStringTest_PrimitiveArray {
  AutoValue_ToPrettyStringTest_PrimitiveArray(long[] longs$) {
    super(longs$);
  }

  @Override
  final String toPrettyString() {
    return "PrimitiveArray {"
        + "\n"
        + "  longs = " + formatLongArray(longs(), 1) + "," + "\n" + "}";
  }

  private static String formatLongArray(long[] value, int indentLevel) {
    if (value == null) {
      return "null";
    }
    StringBuilder builder = new StringBuilder().append("[");
    boolean hasElements = false;
    for (long element : value) {
      builder.append("\n").append($indent(indentLevel + 1)).append(element).append(",");
      hasElements = true;
    }
    if (hasElements) {
      builder.append("\n").append($indent(indentLevel));
    }
    return builder.append("]").toString();
  }

  private static String $indent(int level) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < level; i++) {
      builder.append("  ");
    }
    return builder.toString();
  }
}
