package com.google.auto.value.extension.serializable.processor;

import javax.annotation.processing.Generated;
import java.util.Optional;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_SerializableAutoValueExtensionTest_DummySerializableAutoValue extends SerializableAutoValueExtensionTest.DummySerializableAutoValue {

  private final String a;

  private final int b;

  private final Optional<String> optionalC;

  private final Optional<Integer> optionalD;

  $AutoValue_SerializableAutoValueExtensionTest_DummySerializableAutoValue(
      String a,
      int b,
      Optional<String> optionalC,
      Optional<Integer> optionalD) {
    if (a == null) {
      throw new NullPointerException("Null a");
    }
    this.a = a;
    this.b = b;
    if (optionalC == null) {
      throw new NullPointerException("Null optionalC");
    }
    this.optionalC = optionalC;
    if (optionalD == null) {
      throw new NullPointerException("Null optionalD");
    }
    this.optionalD = optionalD;
  }

  @Override
  String a() {
    return a;
  }

  @Override
  int b() {
    return b;
  }

  @Override
  Optional<String> optionalC() {
    return optionalC;
  }

  @Override
  Optional<Integer> optionalD() {
    return optionalD;
  }

  @Override
  public String toString() {
    return "DummySerializableAutoValue{"
        + "a=" + a + ", "
        + "b=" + b + ", "
        + "optionalC=" + optionalC + ", "
        + "optionalD=" + optionalD
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SerializableAutoValueExtensionTest.DummySerializableAutoValue) {
      SerializableAutoValueExtensionTest.DummySerializableAutoValue that = (SerializableAutoValueExtensionTest.DummySerializableAutoValue) o;
      return this.a.equals(that.a())
          && this.b == that.b()
          && this.optionalC.equals(that.optionalC())
          && this.optionalD.equals(that.optionalD());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= a.hashCode();
    h$ *= 1000003;
    h$ ^= b;
    h$ *= 1000003;
    h$ ^= optionalC.hashCode();
    h$ *= 1000003;
    h$ ^= optionalD.hashCode();
    return h$;
  }

  static class Builder extends SerializableAutoValueExtensionTest.DummySerializableAutoValue.Builder {
    private String a;
    private Integer b;
    private Optional<String> optionalC = Optional.empty();
    private Optional<Integer> optionalD = Optional.empty();
    Builder() {
    }
    @Override
    SerializableAutoValueExtensionTest.DummySerializableAutoValue.Builder setA(String a) {
      if (a == null) {
        throw new NullPointerException("Null a");
      }
      this.a = a;
      return this;
    }
    @Override
    SerializableAutoValueExtensionTest.DummySerializableAutoValue.Builder setB(int b) {
      this.b = b;
      return this;
    }
    @Override
    SerializableAutoValueExtensionTest.DummySerializableAutoValue.Builder setOptionalC(String optionalC) {
      this.optionalC = Optional.of(optionalC);
      return this;
    }
    @Override
    SerializableAutoValueExtensionTest.DummySerializableAutoValue.Builder setOptionalD(int optionalD) {
      this.optionalD = Optional.of(optionalD);
      return this;
    }
    @Override
    SerializableAutoValueExtensionTest.DummySerializableAutoValue build() {
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
      return new AutoValue_SerializableAutoValueExtensionTest_DummySerializableAutoValue(
          this.a,
          this.b,
          this.optionalC,
          this.optionalD);
    }
  }

}
