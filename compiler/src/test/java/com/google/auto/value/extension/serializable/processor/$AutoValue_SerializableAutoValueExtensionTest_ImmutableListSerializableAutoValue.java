package com.google.auto.value.extension.serializable.processor;

import com.google.common.collect.ImmutableList;

import javax.annotation.processing.Generated;
import java.util.Optional;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_SerializableAutoValueExtensionTest_ImmutableListSerializableAutoValue extends SerializableAutoValueExtensionTest.ImmutableListSerializableAutoValue {

  private final ImmutableList<Optional<String>> payload;

  $AutoValue_SerializableAutoValueExtensionTest_ImmutableListSerializableAutoValue(
      ImmutableList<Optional<String>> payload) {
    if (payload == null) {
      throw new NullPointerException("Null payload");
    }
    this.payload = payload;
  }

  @Override
  ImmutableList<Optional<String>> payload() {
    return payload;
  }

  @Override
  public String toString() {
    return "ImmutableListSerializableAutoValue{"
        + "payload=" + payload
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SerializableAutoValueExtensionTest.ImmutableListSerializableAutoValue) {
      SerializableAutoValueExtensionTest.ImmutableListSerializableAutoValue that = (SerializableAutoValueExtensionTest.ImmutableListSerializableAutoValue) o;
      return this.payload.equals(that.payload());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= payload.hashCode();
    return h$;
  }

  static class Builder extends SerializableAutoValueExtensionTest.ImmutableListSerializableAutoValue.Builder {
    private ImmutableList<Optional<String>> payload;
    Builder() {
    }
    @Override
    SerializableAutoValueExtensionTest.ImmutableListSerializableAutoValue.Builder setPayload(ImmutableList<Optional<String>> payload) {
      if (payload == null) {
        throw new NullPointerException("Null payload");
      }
      this.payload = payload;
      return this;
    }
    @Override
    SerializableAutoValueExtensionTest.ImmutableListSerializableAutoValue build() {
      if (this.payload == null) {
        String missing = " payload";
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SerializableAutoValueExtensionTest_ImmutableListSerializableAutoValue(
          this.payload);
    }
  }

}
