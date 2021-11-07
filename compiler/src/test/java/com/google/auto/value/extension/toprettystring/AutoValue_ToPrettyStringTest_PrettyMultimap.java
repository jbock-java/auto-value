package com.google.auto.value.extension.toprettystring;

import com.google.common.collect.Multimap;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.extension.toprettystring.processor.ToPrettyStringExtension")
final class AutoValue_ToPrettyStringTest_PrettyMultimap extends $AutoValue_ToPrettyStringTest_PrettyMultimap {
  AutoValue_ToPrettyStringTest_PrettyMultimap(Multimap<Object, Object> multimap$) {
    super(multimap$);
  }

  @Override
  final String toPrettyString() {
    return "PrettyMultimap {"
        + "\n"
        + "  multimap = " + format(multimap(), 1) + "," + "\n" + "}";
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
