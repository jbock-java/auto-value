package com.google.auto.value.extension.serializable.processor;

import com.google.common.collect.ImmutableMap;

import javax.annotation.processing.Generated;
import java.util.Optional;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_SerializableAutoValueExtensionTest_ComplexType extends SerializableAutoValueExtensionTest.ComplexType {

  private final ImmutableMap<String, ImmutableMap<String, Optional<String>>> a;

  $AutoValue_SerializableAutoValueExtensionTest_ComplexType(
      ImmutableMap<String, ImmutableMap<String, Optional<String>>> a) {
    if (a == null) {
      throw new NullPointerException("Null a");
    }
    this.a = a;
  }

  @Override
  ImmutableMap<String, ImmutableMap<String, Optional<String>>> a() {
    return a;
  }

  @Override
  public String toString() {
    return "ComplexType{"
        + "a=" + a
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SerializableAutoValueExtensionTest.ComplexType) {
      SerializableAutoValueExtensionTest.ComplexType that = (SerializableAutoValueExtensionTest.ComplexType) o;
      return this.a.equals(that.a());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= a.hashCode();
    return h$;
  }

  static class Builder extends SerializableAutoValueExtensionTest.ComplexType.Builder {
    private ImmutableMap<String, ImmutableMap<String, Optional<String>>> a;
    Builder() {
    }
    @Override
    SerializableAutoValueExtensionTest.ComplexType.Builder setA(ImmutableMap<String, ImmutableMap<String, Optional<String>>> a) {
      if (a == null) {
        throw new NullPointerException("Null a");
      }
      this.a = a;
      return this;
    }
    @Override
    SerializableAutoValueExtensionTest.ComplexType build() {
      if (this.a == null) {
        String missing = " a";
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SerializableAutoValueExtensionTest_ComplexType(
          this.a);
    }
  }

}
