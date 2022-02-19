package io.jbock.auto.value.extension.memoized;

import com.google.errorprone.annotations.ImmutableTypeParameter;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_MemoizedTest_Unchanging<@ImmutableTypeParameter T> extends MemoizedTest.Unchanging<T> {

  private final T value;

  $AutoValue_MemoizedTest_Unchanging(
      T value) {
    if (value == null) {
      throw new NullPointerException("Null value");
    }
    this.value = value;
  }

  @Override
  T value() {
    return value;
  }

  @Override
  public String toString() {
    return "Unchanging{"
        + "value=" + value
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MemoizedTest.Unchanging) {
      MemoizedTest.Unchanging<?> that = (MemoizedTest.Unchanging<?>) o;
      return this.value.equals(that.value());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= value.hashCode();
    return h$;
  }

}
