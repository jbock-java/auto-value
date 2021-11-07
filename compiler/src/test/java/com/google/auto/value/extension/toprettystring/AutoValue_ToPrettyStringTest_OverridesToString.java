package com.google.auto.value.extension.toprettystring;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.extension.toprettystring.processor.ToPrettyStringExtension")
final class AutoValue_ToPrettyStringTest_OverridesToString extends $AutoValue_ToPrettyStringTest_OverridesToString {
  AutoValue_ToPrettyStringTest_OverridesToString(int i$) {
    super(i$);
  }

  @Override
  public final String toString() {
    return "OverridesToString {"
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
