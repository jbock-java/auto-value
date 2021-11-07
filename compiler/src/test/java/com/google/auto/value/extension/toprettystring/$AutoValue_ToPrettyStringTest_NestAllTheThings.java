package com.google.auto.value.extension.toprettystring;

import com.google.common.collect.Multimap;
import com.google.common.primitives.ImmutableIntArray;

import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import java.util.List;
import java.util.Map;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_ToPrettyStringTest_NestAllTheThings extends ToPrettyStringTest.NestAllTheThings {

  private final com.google.common.base.Optional<java.util.Optional<List<Map<ImmutableIntArray, Multimap<int[][], Object>>>>> value;

  $AutoValue_ToPrettyStringTest_NestAllTheThings(
      @Nullable com.google.common.base.Optional<java.util.Optional<List<Map<ImmutableIntArray, Multimap<int[][], Object>>>>> value) {
    this.value = value;
  }

  @Nullable
  @Override
  com.google.common.base.Optional<java.util.Optional<List<Map<ImmutableIntArray, Multimap<int[][], Object>>>>> value() {
    return value;
  }

  @Override
  public String toString() {
    return "NestAllTheThings{"
        + "value=" + value
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ToPrettyStringTest.NestAllTheThings) {
      ToPrettyStringTest.NestAllTheThings that = (ToPrettyStringTest.NestAllTheThings) o;
      return (this.value == null ? that.value() == null : this.value.equals(that.value()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (value == null) ? 0 : value.hashCode();
    return h$;
  }

}
