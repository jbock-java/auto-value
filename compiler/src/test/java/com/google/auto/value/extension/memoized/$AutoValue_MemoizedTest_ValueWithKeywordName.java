package com.google.auto.value.extension.memoized;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_MemoizedTest_ValueWithKeywordName extends MemoizedTest.ValueWithKeywordName {

  private final boolean native1;

  private final boolean native0;

  $AutoValue_MemoizedTest_ValueWithKeywordName(
      boolean native1,
      boolean native0) {
    this.native1 = native1;
    this.native0 = native0;
  }

  @Override
  boolean getNative() {
    return native1;
  }

  @Override
  boolean getNative0() {
    return native0;
  }

  @Override
  public String toString() {
    return "ValueWithKeywordName{"
        + "native=" + native1 + ", "
        + "native0=" + native0
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MemoizedTest.ValueWithKeywordName) {
      MemoizedTest.ValueWithKeywordName that = (MemoizedTest.ValueWithKeywordName) o;
      return this.native1 == that.getNative()
          && this.native0 == that.getNative0();
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= native1 ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= native0 ? 1231 : 1237;
    return h$;
  }

}
