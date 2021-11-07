package com.google.auto.value.extension.memoized;

import javax.annotation.Nullable;
import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_MemoizedTest_Value extends MemoizedTest.Value {

  private final String string;

  private final String stringWithTypeAnnotation;

  private final MemoizedTest.HashCodeAndToStringCounter counter;

  $AutoValue_MemoizedTest_Value(
      @Nullable String string,
      String stringWithTypeAnnotation,
      MemoizedTest.HashCodeAndToStringCounter counter) {
    this.string = string;
    if (stringWithTypeAnnotation == null) {
      throw new NullPointerException("Null stringWithTypeAnnotation");
    }
    this.stringWithTypeAnnotation = stringWithTypeAnnotation;
    if (counter == null) {
      throw new NullPointerException("Null counter");
    }
    this.counter = counter;
  }

  @Nullable
  @Override
  String string() {
    return string;
  }

  @Override
  String stringWithTypeAnnotation() {
    return stringWithTypeAnnotation;
  }

  @Override
  MemoizedTest.HashCodeAndToStringCounter counter() {
    return counter;
  }

  @Override
  public String toString() {
    return "Value{"
        + "string=" + string + ", "
        + "stringWithTypeAnnotation=" + stringWithTypeAnnotation + ", "
        + "counter=" + counter
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MemoizedTest.Value) {
      MemoizedTest.Value that = (MemoizedTest.Value) o;
      return (this.string == null ? that.string() == null : this.string.equals(that.string()))
          && this.stringWithTypeAnnotation.equals(that.stringWithTypeAnnotation())
          && this.counter.equals(that.counter());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (string == null) ? 0 : string.hashCode();
    h$ *= 1000003;
    h$ ^= stringWithTypeAnnotation.hashCode();
    h$ *= 1000003;
    h$ ^= counter.hashCode();
    return h$;
  }

}
