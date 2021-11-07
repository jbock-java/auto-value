package com.google.auto.value.extension.toprettystring;

import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import java.util.Map;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_ToPrettyStringTest_MapOfMaps extends ToPrettyStringTest.MapOfMaps {

  private final Map<Map<Object, Object>, Map<Object, Object>> mapOfMaps;

  $AutoValue_ToPrettyStringTest_MapOfMaps(
      @Nullable Map<Map<Object, Object>, Map<Object, Object>> mapOfMaps) {
    this.mapOfMaps = mapOfMaps;
  }

  @Nullable
  @Override
  Map<Map<Object, Object>, Map<Object, Object>> mapOfMaps() {
    return mapOfMaps;
  }

  @Override
  public String toString() {
    return "MapOfMaps{"
        + "mapOfMaps=" + mapOfMaps
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ToPrettyStringTest.MapOfMaps) {
      ToPrettyStringTest.MapOfMaps that = (ToPrettyStringTest.MapOfMaps) o;
      return (this.mapOfMaps == null ? that.mapOfMaps() == null : this.mapOfMaps.equals(that.mapOfMaps()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (mapOfMaps == null) ? 0 : mapOfMaps.hashCode();
    return h$;
  }

}
