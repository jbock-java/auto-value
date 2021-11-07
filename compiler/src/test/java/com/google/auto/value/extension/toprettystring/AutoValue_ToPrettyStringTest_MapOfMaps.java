package com.google.auto.value.extension.toprettystring;

import javax.annotation.processing.Generated;
import java.util.Map;

@Generated("com.google.auto.value.extension.toprettystring.processor.ToPrettyStringExtension")
final class AutoValue_ToPrettyStringTest_MapOfMaps extends $AutoValue_ToPrettyStringTest_MapOfMaps {
  AutoValue_ToPrettyStringTest_MapOfMaps(Map<Map<Object, Object>, Map<Object, Object>> mapOfMaps$) {
    super(mapOfMaps$);
  }

  @Override
  final String toPrettyString() {
    return "MapOfMaps {"
        + "\n"
        + "  mapOfMaps = " + formatMapOfMapToMap(mapOfMaps(), 1) + "," + "\n" + "}";
  }

  private static String format(Object value, int indentLevel) {
    if (value == null) {
      return "null";
    }
    return value.toString().replace("\n", "\n" + $indent(indentLevel));
  }

  private static String formatMapOfObjectToObject(Map<Object, Object> value, int indentLevel) {
    if (value == null) {
      return "null";
    }
    StringBuilder builder = new StringBuilder().append("{");
    boolean hasElements = false;
    for (Map.Entry<Object, Object> entry : value.entrySet()) {
      builder.append("\n").append($indent(indentLevel + 1)).append(format(entry.getKey(), indentLevel + 1)).append(": ").append(format(entry.getValue(), indentLevel + 1)).append(",");
      hasElements = true;
    }
    if (hasElements) {
      builder.append("\n").append($indent(indentLevel));
    }
    return builder.append("}").toString();
  }

  private static String formatMapOfMapToMap(Map<Map<Object, Object>, Map<Object, Object>> value,
      int indentLevel) {
    if (value == null) {
      return "null";
    }
    StringBuilder builder = new StringBuilder().append("{");
    boolean hasElements = false;
    for (Map.Entry<Map<Object, Object>, Map<Object, Object>> entry : value.entrySet()) {
      builder.append("\n").append($indent(indentLevel + 1)).append(formatMapOfObjectToObject(entry.getKey(), indentLevel + 1)).append(": ").append(formatMapOfObjectToObject(entry.getValue(), indentLevel + 1)).append(",");
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
