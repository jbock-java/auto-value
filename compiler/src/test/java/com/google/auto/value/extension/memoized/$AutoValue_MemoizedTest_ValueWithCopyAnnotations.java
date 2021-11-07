package com.google.auto.value.extension.memoized;

import javax.annotation.Nullable;
import javax.annotation.processing.Generated;

@Nullable
@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_MemoizedTest_ValueWithCopyAnnotations extends MemoizedTest.ValueWithCopyAnnotations {

  private final boolean native0;

  $AutoValue_MemoizedTest_ValueWithCopyAnnotations(
      boolean native0) {
    this.native0 = native0;
  }

  @Override
  boolean getNative() {
    return native0;
  }

  @Override
  public String toString() {
    return "ValueWithCopyAnnotations{"
        + "native=" + native0
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MemoizedTest.ValueWithCopyAnnotations) {
      MemoizedTest.ValueWithCopyAnnotations that = (MemoizedTest.ValueWithCopyAnnotations) o;
      return this.native0 == that.getNative();
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= native0 ? 1231 : 1237;
    return h$;
  }

}
