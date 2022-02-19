package io.jbock.auto.value.extension.memoized;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_MemoizedTest_ListValue<T extends Number, K> extends MemoizedTest.ListValue<T, K> {

  private final T value;

  private final K otherValue;

  $AutoValue_MemoizedTest_ListValue(
      T value,
      K otherValue) {
    if (value == null) {
      throw new NullPointerException("Null value");
    }
    this.value = value;
    if (otherValue == null) {
      throw new NullPointerException("Null otherValue");
    }
    this.otherValue = otherValue;
  }

  @Override
  T value() {
    return value;
  }

  @Override
  K otherValue() {
    return otherValue;
  }

  @Override
  public String toString() {
    return "ListValue{"
        + "value=" + value + ", "
        + "otherValue=" + otherValue
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MemoizedTest.ListValue) {
      MemoizedTest.ListValue<?, ?> that = (MemoizedTest.ListValue<?, ?>) o;
      return this.value.equals(that.value())
          && this.otherValue.equals(that.otherValue());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= value.hashCode();
    h$ *= 1000003;
    h$ ^= otherValue.hashCode();
    return h$;
  }

}
