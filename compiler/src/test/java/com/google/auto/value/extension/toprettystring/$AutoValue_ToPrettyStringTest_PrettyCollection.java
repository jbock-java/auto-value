package com.google.auto.value.extension.toprettystring;

import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import java.util.Collection;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_ToPrettyStringTest_PrettyCollection extends ToPrettyStringTest.PrettyCollection {

  private final Collection<Object> collection;

  $AutoValue_ToPrettyStringTest_PrettyCollection(
      @Nullable Collection<Object> collection) {
    this.collection = collection;
  }

  @Nullable
  @Override
  Collection<Object> collection() {
    return collection;
  }

  @Override
  public String toString() {
    return "PrettyCollection{"
        + "collection=" + collection
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ToPrettyStringTest.PrettyCollection) {
      ToPrettyStringTest.PrettyCollection that = (ToPrettyStringTest.PrettyCollection) o;
      return (this.collection == null ? that.collection() == null : this.collection.equals(that.collection()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (collection == null) ? 0 : collection.hashCode();
    return h$;
  }

}
