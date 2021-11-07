package com.google.auto.value.extension.serializable.processor;

import com.google.common.collect.ImmutableMap;

import javax.annotation.processing.Generated;
import java.util.Optional;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_SerializableAutoValueExtensionTest_ImmutableMapSerializableAutoValue extends SerializableAutoValueExtensionTest.ImmutableMapSerializableAutoValue {

  private final ImmutableMap<Optional<String>, String> a;

  private final ImmutableMap<String, Optional<String>> b;

  $AutoValue_SerializableAutoValueExtensionTest_ImmutableMapSerializableAutoValue(
      ImmutableMap<Optional<String>, String> a,
      ImmutableMap<String, Optional<String>> b) {
    if (a == null) {
      throw new NullPointerException("Null a");
    }
    this.a = a;
    if (b == null) {
      throw new NullPointerException("Null b");
    }
    this.b = b;
  }

  @Override
  ImmutableMap<Optional<String>, String> a() {
    return a;
  }

  @Override
  ImmutableMap<String, Optional<String>> b() {
    return b;
  }

  @Override
  public String toString() {
    return "ImmutableMapSerializableAutoValue{"
        + "a=" + a + ", "
        + "b=" + b
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SerializableAutoValueExtensionTest.ImmutableMapSerializableAutoValue) {
      SerializableAutoValueExtensionTest.ImmutableMapSerializableAutoValue that = (SerializableAutoValueExtensionTest.ImmutableMapSerializableAutoValue) o;
      return this.a.equals(that.a())
          && this.b.equals(that.b());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= a.hashCode();
    h$ *= 1000003;
    h$ ^= b.hashCode();
    return h$;
  }

  static class Builder extends SerializableAutoValueExtensionTest.ImmutableMapSerializableAutoValue.Builder {
    private ImmutableMap<Optional<String>, String> a;
    private ImmutableMap<String, Optional<String>> b;
    Builder() {
    }
    @Override
    SerializableAutoValueExtensionTest.ImmutableMapSerializableAutoValue.Builder setA(ImmutableMap<Optional<String>, String> a) {
      if (a == null) {
        throw new NullPointerException("Null a");
      }
      this.a = a;
      return this;
    }
    @Override
    SerializableAutoValueExtensionTest.ImmutableMapSerializableAutoValue.Builder setB(ImmutableMap<String, Optional<String>> b) {
      if (b == null) {
        throw new NullPointerException("Null b");
      }
      this.b = b;
      return this;
    }
    @Override
    SerializableAutoValueExtensionTest.ImmutableMapSerializableAutoValue build() {
      if (this.a == null
          || this.b == null) {
        StringBuilder missing = new StringBuilder();
        if (this.a == null) {
          missing.append(" a");
        }
        if (this.b == null) {
          missing.append(" b");
        }
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SerializableAutoValueExtensionTest_ImmutableMapSerializableAutoValue(
          this.a,
          this.b);
    }
  }

}
