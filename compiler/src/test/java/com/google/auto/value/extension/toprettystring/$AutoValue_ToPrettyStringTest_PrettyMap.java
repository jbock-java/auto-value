package com.google.auto.value.extension.toprettystring;

import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import java.util.Map;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_ToPrettyStringTest_PrettyMap extends ToPrettyStringTest.PrettyMap {

  private final Map<Object, Object> map;

  $AutoValue_ToPrettyStringTest_PrettyMap(
      @Nullable Map<Object, Object> map) {
    this.map = map;
  }

  @Nullable
  @Override
  Map<Object, Object> map() {
    return map;
  }

  @Override
  public String toString() {
    return "PrettyMap{"
        + "map=" + map
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ToPrettyStringTest.PrettyMap) {
      ToPrettyStringTest.PrettyMap that = (ToPrettyStringTest.PrettyMap) o;
      return (this.map == null ? that.map() == null : this.map.equals(that.map()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (map == null) ? 0 : map.hashCode();
    return h$;
  }

}
