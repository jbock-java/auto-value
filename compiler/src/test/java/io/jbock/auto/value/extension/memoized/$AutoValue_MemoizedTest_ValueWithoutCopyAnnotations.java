package com.google.auto.value.extension.memoized;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_MemoizedTest_ValueWithoutCopyAnnotations extends MemoizedTest.ValueWithoutCopyAnnotations {

  private final boolean native0;

  $AutoValue_MemoizedTest_ValueWithoutCopyAnnotations(
      boolean native0) {
    this.native0 = native0;
  }

  @Override
  boolean getNative() {
    return native0;
  }

  @Override
  public String toString() {
    return "ValueWithoutCopyAnnotations{"
        + "native=" + native0
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MemoizedTest.ValueWithoutCopyAnnotations) {
      MemoizedTest.ValueWithoutCopyAnnotations that = (MemoizedTest.ValueWithoutCopyAnnotations) o;
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
