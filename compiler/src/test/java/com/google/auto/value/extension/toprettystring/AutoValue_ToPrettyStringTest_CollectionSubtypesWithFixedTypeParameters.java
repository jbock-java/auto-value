package com.google.auto.value.extension.toprettystring;

import javax.annotation.processing.Generated;
import java.util.Collection;
import java.util.Map;

@Generated("com.google.auto.value.extension.toprettystring.processor.ToPrettyStringExtension")
final class AutoValue_ToPrettyStringTest_CollectionSubtypesWithFixedTypeParameters extends $AutoValue_ToPrettyStringTest_CollectionSubtypesWithFixedTypeParameters {
  AutoValue_ToPrettyStringTest_CollectionSubtypesWithFixedTypeParameters(
      ToPrettyStringTest.CollectionSubtypesWithFixedTypeParameters.StringList list$,
      ToPrettyStringTest.CollectionSubtypesWithFixedTypeParameters.StringMap map$) {
    super(list$, map$);
  }

  @Override
  final String toPrettyString() {
    return "CollectionSubtypesWithFixedTypeParameters {"
        + "\n"
        + "  list = " + formatCollectionOfString(list(), 1) + ","
        + "\n"
        + "  map = " + formatMapOfStringToString(map(), 1) + "," + "\n" + "}";
  }

  private static String format(Object value, int indentLevel) {
    if (value == null) {
      return "null";
    }
    return value.toString().replace("\n", "\n" + $indent(indentLevel));
  }

  private static String formatCollectionOfString(Collection<String> value, int indentLevel) {
    if (value == null) {
      return "null";
    }
    StringBuilder builder = new StringBuilder().append("[");
    boolean hasElements = false;
    for (String element : value) {
      builder.append("\n").append($indent(indentLevel + 1)).append(format(element, indentLevel + 1)).append(",");
      hasElements = true;
    }
    if (hasElements) {
      builder.append("\n").append($indent(indentLevel));
    }
    return builder.append("]").toString();
  }

  private static String formatMapOfStringToString(Map<String, String> value, int indentLevel) {
    if (value == null) {
      return "null";
    }
    StringBuilder builder = new StringBuilder().append("{");
    boolean hasElements = false;
    for (Map.Entry<String, String> entry : value.entrySet()) {
      builder.append("\n").append($indent(indentLevel + 1)).append(format(entry.getKey(), indentLevel + 1)).append(": ").append(format(entry.getValue(), indentLevel + 1)).append(",");
      hasElements = true;
    }
    if (hasElements) {
      builder.append("\n").append($indent(indentLevel));
    }
    return builder.append("}").toString();
  }

  private static String $indent(int level) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < level; i++) {
      builder.append("  ");
    }
    return builder.toString();
  }
}
