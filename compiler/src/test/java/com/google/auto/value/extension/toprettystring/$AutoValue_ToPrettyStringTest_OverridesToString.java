package com.google.auto.value.extension.toprettystring;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_ToPrettyStringTest_OverridesToString extends ToPrettyStringTest.OverridesToString {

  private final int i;

  $AutoValue_ToPrettyStringTest_OverridesToString(
      int i) {
    this.i = i;
  }

  @Override
  int i() {
    return i;
  }

  @Override
  public String toString() {
    return "OverridesToString{"
        + "i=" + i
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ToPrettyStringTest.OverridesToString) {
      ToPrettyStringTest.OverridesToString that = (ToPrettyStringTest.OverridesToString) o;
      return this.i == that.i();
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= i;
    return h$;
  }

}
