package com.google.auto.value.extension.toprettystring;

import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import java.util.Collection;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_ToPrettyStringTest_NestedCollection extends ToPrettyStringTest.NestedCollection {

  private final Collection<Collection<Object>> nestedCollection;

  $AutoValue_ToPrettyStringTest_NestedCollection(
      @Nullable Collection<Collection<Object>> nestedCollection) {
    this.nestedCollection = nestedCollection;
  }

  @Nullable
  @Override
  Collection<Collection<Object>> nestedCollection() {
    return nestedCollection;
  }

  @Override
  public String toString() {
    return "NestedCollection{"
        + "nestedCollection=" + nestedCollection
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ToPrettyStringTest.NestedCollection) {
      ToPrettyStringTest.NestedCollection that = (ToPrettyStringTest.NestedCollection) o;
      return (this.nestedCollection == null ? that.nestedCollection() == null : this.nestedCollection.equals(that.nestedCollection()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (nestedCollection == null) ? 0 : nestedCollection.hashCode();
    return h$;
  }

}
