package com.google.auto.value.extension.toprettystring;

import com.google.common.primitives.ImmutableIntArray;

import javax.annotation.Nullable;
import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_ToPrettyStringTest_ImmutablePrimitiveArray extends ToPrettyStringTest.ImmutablePrimitiveArray {

  private final ImmutableIntArray immutableIntArray;

  $AutoValue_ToPrettyStringTest_ImmutablePrimitiveArray(
      @Nullable ImmutableIntArray immutableIntArray) {
    this.immutableIntArray = immutableIntArray;
  }

  @Nullable
  @Override
  ImmutableIntArray immutableIntArray() {
    return immutableIntArray;
  }

  @Override
  public String toString() {
    return "ImmutablePrimitiveArray{"
        + "immutableIntArray=" + immutableIntArray
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ToPrettyStringTest.ImmutablePrimitiveArray) {
      ToPrettyStringTest.ImmutablePrimitiveArray that = (ToPrettyStringTest.ImmutablePrimitiveArray) o;
      return (this.immutableIntArray == null ? that.immutableIntArray() == null : this.immutableIntArray.equals(that.immutableIntArray()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (immutableIntArray == null) ? 0 : immutableIntArray.hashCode();
    return h$;
  }

}
