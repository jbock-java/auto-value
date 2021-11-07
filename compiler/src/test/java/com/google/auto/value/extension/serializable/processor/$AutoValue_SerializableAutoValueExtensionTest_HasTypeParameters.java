package com.google.auto.value.extension.serializable.processor;

import javax.annotation.processing.Generated;
import java.io.Serializable;
import java.util.Optional;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_SerializableAutoValueExtensionTest_HasTypeParameters<T extends Serializable, S> extends SerializableAutoValueExtensionTest.HasTypeParameters<T, S> {

  private final T a;

  private final Optional<S> optionalB;

  $AutoValue_SerializableAutoValueExtensionTest_HasTypeParameters(
      T a,
      Optional<S> optionalB) {
    if (a == null) {
      throw new NullPointerException("Null a");
    }
    this.a = a;
    if (optionalB == null) {
      throw new NullPointerException("Null optionalB");
    }
    this.optionalB = optionalB;
  }

  @Override
  T a() {
    return a;
  }

  @Override
  Optional<S> optionalB() {
    return optionalB;
  }

  @Override
  public String toString() {
    return "HasTypeParameters{"
        + "a=" + a + ", "
        + "optionalB=" + optionalB
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SerializableAutoValueExtensionTest.HasTypeParameters) {
      SerializableAutoValueExtensionTest.HasTypeParameters<?, ?> that = (SerializableAutoValueExtensionTest.HasTypeParameters<?, ?>) o;
      return this.a.equals(that.a())
          && this.optionalB.equals(that.optionalB());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= a.hashCode();
    h$ *= 1000003;
    h$ ^= optionalB.hashCode();
    return h$;
  }

  static class Builder<T extends Serializable, S> extends SerializableAutoValueExtensionTest.HasTypeParameters.Builder<T, S> {
    private T a;
    private Optional<S> optionalB = Optional.empty();
    Builder() {
    }
    @Override
    SerializableAutoValueExtensionTest.HasTypeParameters.Builder<T, S> setA(T a) {
      if (a == null) {
        throw new NullPointerException("Null a");
      }
      this.a = a;
      return this;
    }
    @Override
    SerializableAutoValueExtensionTest.HasTypeParameters.Builder<T, S> setOptionalB(S optionalB) {
      this.optionalB = Optional.of(optionalB);
      return this;
    }
    @Override
    SerializableAutoValueExtensionTest.HasTypeParameters<T, S> build() {
      if (this.a == null) {
        String missing = " a";
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SerializableAutoValueExtensionTest_HasTypeParameters<T, S>(
          this.a,
          this.optionalB);
    }
  }

}
