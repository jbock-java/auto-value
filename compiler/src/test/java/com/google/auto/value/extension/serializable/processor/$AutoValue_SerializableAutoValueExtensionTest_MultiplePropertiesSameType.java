package com.google.auto.value.extension.serializable.processor;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_SerializableAutoValueExtensionTest_MultiplePropertiesSameType extends SerializableAutoValueExtensionTest.MultiplePropertiesSameType {

  private final String a;

  private final String b;

  $AutoValue_SerializableAutoValueExtensionTest_MultiplePropertiesSameType(
      String a,
      String b) {
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
  String a() {
    return a;
  }

  @Override
  String b() {
    return b;
  }

  @Override
  public String toString() {
    return "MultiplePropertiesSameType{"
        + "a=" + a + ", "
        + "b=" + b
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SerializableAutoValueExtensionTest.MultiplePropertiesSameType) {
      SerializableAutoValueExtensionTest.MultiplePropertiesSameType that = (SerializableAutoValueExtensionTest.MultiplePropertiesSameType) o;
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

  static class Builder extends SerializableAutoValueExtensionTest.MultiplePropertiesSameType.Builder {
    private String a;
    private String b;
    Builder() {
    }
    @Override
    SerializableAutoValueExtensionTest.MultiplePropertiesSameType.Builder setA(String a) {
      if (a == null) {
        throw new NullPointerException("Null a");
      }
      this.a = a;
      return this;
    }
    @Override
    SerializableAutoValueExtensionTest.MultiplePropertiesSameType.Builder setB(String b) {
      if (b == null) {
        throw new NullPointerException("Null b");
      }
      this.b = b;
      return this;
    }
    @Override
    SerializableAutoValueExtensionTest.MultiplePropertiesSameType build() {
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
      return new AutoValue_SerializableAutoValueExtensionTest_MultiplePropertiesSameType(
          this.a,
          this.b);
    }
  }

}
