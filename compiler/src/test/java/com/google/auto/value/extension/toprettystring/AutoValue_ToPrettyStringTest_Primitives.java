package com.google.auto.value.extension.toprettystring;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.extension.toprettystring.processor.ToPrettyStringExtension")
final class AutoValue_ToPrettyStringTest_Primitives extends $AutoValue_ToPrettyStringTest_Primitives {
  AutoValue_ToPrettyStringTest_Primitives(int i$, long l$, byte b$, short s$, char c$, float f$,
      double d$, boolean bool$) {
    super(i$, l$, b$, s$, c$, f$, d$, bool$);
  }

  @Override
  final String toPrettyString() {
    return "Primitives {"
        + "\n"
        + "  i = " + i() + ","
        + "\n"
        + "  l = " + l() + ","
        + "\n"
        + "  b = " + b() + ","
        + "\n"
        + "  s = " + s() + ","
        + "\n"
        + "  c = " + c() + ","
        + "\n"
        + "  f = " + f() + ","
        + "\n"
        + "  d = " + d() + ","
        + "\n"
        + "  bool = " + bool() + "," + "\n" + "}";
  }

  private static String $indent(int level) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < level; i++) {
      builder.append("  ");
    }
    return builder.toString();
  }
}
