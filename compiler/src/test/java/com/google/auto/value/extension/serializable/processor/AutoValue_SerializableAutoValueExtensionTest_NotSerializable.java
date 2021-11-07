package com.google.auto.value.extension.serializable.processor;

import javax.annotation.processing.Generated;
import java.util.Optional;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SerializableAutoValueExtensionTest_NotSerializable extends SerializableAutoValueExtensionTest.NotSerializable {

  private final Optional<String> optionalA;

  AutoValue_SerializableAutoValueExtensionTest_NotSerializable(
      Optional<String> optionalA) {
    if (optionalA == null) {
      throw new NullPointerException("Null optionalA");
    }
    this.optionalA = optionalA;
  }

  @Override
  Optional<String> optionalA() {
    return optionalA;
  }

  @Override
  public String toString() {
    return "NotSerializable{"
        + "optionalA=" + optionalA
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SerializableAutoValueExtensionTest.NotSerializable) {
      SerializableAutoValueExtensionTest.NotSerializable that = (SerializableAutoValueExtensionTest.NotSerializable) o;
      return this.optionalA.equals(that.optionalA());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= optionalA.hashCode();
    return h$;
  }

}
