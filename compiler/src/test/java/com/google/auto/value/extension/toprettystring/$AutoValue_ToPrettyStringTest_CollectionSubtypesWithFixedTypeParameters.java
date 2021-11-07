package com.google.auto.value.extension.toprettystring;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_ToPrettyStringTest_CollectionSubtypesWithFixedTypeParameters extends ToPrettyStringTest.CollectionSubtypesWithFixedTypeParameters {

  private final ToPrettyStringTest.CollectionSubtypesWithFixedTypeParameters.StringList list;

  private final ToPrettyStringTest.CollectionSubtypesWithFixedTypeParameters.StringMap map;

  $AutoValue_ToPrettyStringTest_CollectionSubtypesWithFixedTypeParameters(
      ToPrettyStringTest.CollectionSubtypesWithFixedTypeParameters.StringList list,
      ToPrettyStringTest.CollectionSubtypesWithFixedTypeParameters.StringMap map) {
    if (list == null) {
      throw new NullPointerException("Null list");
    }
    this.list = list;
    if (map == null) {
      throw new NullPointerException("Null map");
    }
    this.map = map;
  }

  @Override
  ToPrettyStringTest.CollectionSubtypesWithFixedTypeParameters.StringList list() {
    return list;
  }

  @Override
  ToPrettyStringTest.CollectionSubtypesWithFixedTypeParameters.StringMap map() {
    return map;
  }

  @Override
  public String toString() {
    return "CollectionSubtypesWithFixedTypeParameters{"
        + "list=" + list + ", "
        + "map=" + map
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ToPrettyStringTest.CollectionSubtypesWithFixedTypeParameters) {
      ToPrettyStringTest.CollectionSubtypesWithFixedTypeParameters that = (ToPrettyStringTest.CollectionSubtypesWithFixedTypeParameters) o;
      return this.list.equals(that.list())
          && this.map.equals(that.map());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= list.hashCode();
    h$ *= 1000003;
    h$ ^= map.hashCode();
    return h$;
  }

}
