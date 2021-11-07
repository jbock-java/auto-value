package com.google.auto.value.extension.toprettystring;

import com.google.common.primitives.ImmutableIntArray;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.extension.toprettystring.processor.ToPrettyStringExtension")
final class AutoValue_ToPrettyStringTest_ImmutablePrimitiveArray extends $AutoValue_ToPrettyStringTest_ImmutablePrimitiveArray {
  AutoValue_ToPrettyStringTest_ImmutablePrimitiveArray(ImmutableIntArray immutableIntArray$) {
    super(immutableIntArray$);
  }

  @Override
  final String toPrettyString() {
    return "ImmutablePrimitiveArray {"
        + "\n"
        + "  immutableIntArray = " + format(immutableIntArray(), 1) + "," + "\n" + "}";
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
