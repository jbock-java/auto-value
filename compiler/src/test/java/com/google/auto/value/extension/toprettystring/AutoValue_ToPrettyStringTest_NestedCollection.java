package com.google.auto.value.extension.toprettystring;

import javax.annotation.processing.Generated;
import java.util.Collection;

@Generated("com.google.auto.value.extension.toprettystring.processor.ToPrettyStringExtension")
final class AutoValue_ToPrettyStringTest_NestedCollection extends $AutoValue_ToPrettyStringTest_NestedCollection {
  AutoValue_ToPrettyStringTest_NestedCollection(Collection<Collection<Object>> nestedCollection$) {
    super(nestedCollection$);
  }

  @Override
  final String toPrettyString() {
    return "NestedCollection {"
        + "\n"
        + "  nestedCollection = " + formatCollectionOfCollection(nestedCollection(), 1) + "," + "\n" + "}";
  }

  private static String format(Object value, int indentLevel) {
    if (value == null) {
      return "null";
    }
    return value.toString().replace("\n", "\n" + $indent(indentLevel));
  }

  private static String formatCollectionOfObject(Collection<Object> value, int indentLevel) {
    if (value == null) {
      return "null";
    }
    StringBuilder builder = new StringBuilder().append("[");
    boolean hasElements = false;
    for (Object element : value) {
      builder.append("\n").append($indent(indentLevel + 1)).append(format(element, indentLevel + 1)).append(",");
      hasElements = true;
    }
    if (hasElements) {
      builder.append("\n").append($indent(indentLevel));
    }
    return builder.append("]").toString();
  }

  private static String formatCollectionOfCollection(Collection<Collection<Object>> value,
      int indentLevel) {
    if (value == null) {
      return "null";
    }
    StringBuilder builder = new StringBuilder().append("[");
    boolean hasElements = false;
    for (Collection<Object> element : value) {
      builder.append("\n").append($indent(indentLevel + 1)).append(formatCollectionOfObject(element, indentLevel + 1)).append(",");
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
