package com.google.auto.value.extension.toprettystring;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.extension.toprettystring.processor.ToPrettyStringExtension")
final class AutoValue_ToPrettyStringTest_WithCustomName extends $AutoValue_ToPrettyStringTest_WithCustomName {
  AutoValue_ToPrettyStringTest_WithCustomName(int i$) {
    super(i$);
  }

  @Override
  final String customName() {
    return "WithCustomName {"
        + "\n"
        + "  i = " + i() + "," + "\n" + "}";
  }

  private static String $indent(int level) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < level; i++) {
      builder.append("  ");
    }
    return builder.toString();
  }
}
