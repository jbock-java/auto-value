package com.google.auto.value.extension.memoized;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_MemoizedTest_HashCodeEqualsOptimization extends MemoizedTest.HashCodeEqualsOptimization {

  private final MemoizedTest.HashCodeEqualsOptimization.EqualsCounter equalsCounter;

  $AutoValue_MemoizedTest_HashCodeEqualsOptimization(
      MemoizedTest.HashCodeEqualsOptimization.EqualsCounter equalsCounter) {
    if (equalsCounter == null) {
      throw new NullPointerException("Null equalsCounter");
    }
    this.equalsCounter = equalsCounter;
  }

  @Override
  MemoizedTest.HashCodeEqualsOptimization.EqualsCounter equalsCounter() {
    return equalsCounter;
  }

  @Override
  public String toString() {
    return "HashCodeEqualsOptimization{"
        + "equalsCounter=" + equalsCounter
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MemoizedTest.HashCodeEqualsOptimization) {
      MemoizedTest.HashCodeEqualsOptimization that = (MemoizedTest.HashCodeEqualsOptimization) o;
      return this.equalsCounter.equals(that.equalsCounter());
    }
    return false;
  }

}
