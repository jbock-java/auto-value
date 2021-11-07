package com.google.auto.value.extension.toprettystring;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.extension.toprettystring.processor.ToPrettyStringExtension")
final class AutoValue_ToPrettyStringTest_PropertyHasToPrettyString extends $AutoValue_ToPrettyStringTest_PropertyHasToPrettyString {
  AutoValue_ToPrettyStringTest_PropertyHasToPrettyString(
      ToPrettyStringTest.PropertyHasToPrettyString.HasToPrettyString<String> parameterizedWithString$,
      ToPrettyStringTest.PropertyHasToPrettyString.HasToPrettyString<Void> parameterizedWithVoid$,
      ToPrettyStringTest.PropertyHasToPrettyString.HasInheritedToPrettyString superclass$,
      ToPrettyStringTest.PropertyHasToPrettyString.HasToPrettyStringFromSuperInterface superinterface$) {
    super(parameterizedWithString$, parameterizedWithVoid$, superclass$, superinterface$);
  }

  @Override
  final String toPrettyString() {
    return "PropertyHasToPrettyString {"
        + "\n"
        + "  parameterizedWithString = " + formatHasToPrettyStringOfString(parameterizedWithString(), 1) + ","
        + "\n"
        + "  parameterizedWithVoid = " + formatHasToPrettyStringOfVoid(parameterizedWithVoid(), 1) + ","
        + "\n"
        + "  superclass = " + formatHasInheritedToPrettyString(superclass(), 1) + ","
        + "\n"
        + "  superinterface = " + formatHasToPrettyStringFromSuperInterface(superinterface(), 1) + "," + "\n" + "}";
  }

  private static String formatHasToPrettyStringOfString(
      ToPrettyStringTest.PropertyHasToPrettyString.HasToPrettyString<String> value,
      int indentLevel) {
    if (value == null) {
      return "null";
    }
    return value.toPrettyString().replace("\n", "\n" + $indent(indentLevel));
  }

  private static String formatHasToPrettyStringOfVoid(
      ToPrettyStringTest.PropertyHasToPrettyString.HasToPrettyString<Void> value, int indentLevel) {
    if (value == null) {
      return "null";
    }
    return value.toPrettyString().replace("\n", "\n" + $indent(indentLevel));
  }

  private static String formatHasInheritedToPrettyString(
      ToPrettyStringTest.PropertyHasToPrettyString.HasInheritedToPrettyString value,
      int indentLevel) {
    if (value == null) {
      return "null";
    }
    return value.toPrettyString().replace("\n", "\n" + $indent(indentLevel));
  }

  private static String formatHasToPrettyStringFromSuperInterface(
      ToPrettyStringTest.PropertyHasToPrettyString.HasToPrettyStringFromSuperInterface value,
      int indentLevel) {
    if (value == null) {
      return "null";
    }
    return value.toPrettyString().replace("\n", "\n" + $indent(indentLevel));
  }

  private static String $indent(int level) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < level; i++) {
      builder.append("  ");
    }
    return builder.toString();
  }
}
