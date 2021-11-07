package com.google.auto.value.extension.toprettystring;

import com.google.common.collect.Multimap;

import javax.annotation.Nullable;
import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_ToPrettyStringTest_PrettyMultimap extends ToPrettyStringTest.PrettyMultimap {

  private final Multimap<Object, Object> multimap;

  $AutoValue_ToPrettyStringTest_PrettyMultimap(
      @Nullable Multimap<Object, Object> multimap) {
    this.multimap = multimap;
  }

  @Nullable
  @Override
  Multimap<Object, Object> multimap() {
    return multimap;
  }

  @Override
  public String toString() {
    return "PrettyMultimap{"
        + "multimap=" + multimap
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ToPrettyStringTest.PrettyMultimap) {
      ToPrettyStringTest.PrettyMultimap that = (ToPrettyStringTest.PrettyMultimap) o;
      return (this.multimap == null ? that.multimap() == null : this.multimap.equals(that.multimap()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (multimap == null) ? 0 : multimap.hashCode();
    return h$;
  }

}
