package com.google.auto.value.extension.toprettystring;

import com.google.common.base.Optional;
import com.google.common.collect.Multimap;
import com.google.common.primitives.ImmutableIntArray;

import javax.annotation.processing.Generated;
import java.util.List;
import java.util.Map;

@Generated("com.google.auto.value.extension.toprettystring.processor.ToPrettyStringExtension")
final class AutoValue_ToPrettyStringTest_NestAllTheThings extends $AutoValue_ToPrettyStringTest_NestAllTheThings {
  AutoValue_ToPrettyStringTest_NestAllTheThings(
      Optional<java.util.Optional<List<Map<ImmutableIntArray, Multimap<int[][], Object>>>>> value$) {
    super(value$);
  }

  @Override
  final String toPrettyString() {
    return "NestAllTheThings {"
        + "\n"
        + "  value = " + format(value(), 1) + "," + "\n" + "}";
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
