package com.google.auto.value.extension.serializable.processor;

import javax.annotation.processing.Generated;
import java.util.Optional;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_SerializableAutoValueExtensionTest_PrefixSerializableAutoValue extends SerializableAutoValueExtensionTest.PrefixSerializableAutoValue {

  private final String a;

  private final boolean b;

  private final Optional<String> c;

  private final Optional<Boolean> d;

  $AutoValue_SerializableAutoValueExtensionTest_PrefixSerializableAutoValue(
      String a,
      boolean b,
      Optional<String> c,
      Optional<Boolean> d) {
    if (a == null) {
      throw new NullPointerException("Null a");
    }
    this.a = a;
    this.b = b;
    if (c == null) {
      throw new NullPointerException("Null c");
    }
    this.c = c;
    if (d == null) {
      throw new NullPointerException("Null d");
    }
    this.d = d;
  }

  @Override
  String getA() {
    return a;
  }

  @Override
  boolean isB() {
    return b;
  }

  @Override
  Optional<String> getC() {
    return c;
  }

  @Override
  Optional<Boolean> getD() {
    return d;
  }

  @Override
  public String toString() {
    return "PrefixSerializableAutoValue{"
        + "a=" + a + ", "
        + "b=" + b + ", "
        + "c=" + c + ", "
        + "d=" + d
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SerializableAutoValueExtensionTest.PrefixSerializableAutoValue) {
      SerializableAutoValueExtensionTest.PrefixSerializableAutoValue that = (SerializableAutoValueExtensionTest.PrefixSerializableAutoValue) o;
      return this.a.equals(that.getA())
          && this.b == that.isB()
          && this.c.equals(that.getC())
          && this.d.equals(that.getD());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= a.hashCode();
    h$ *= 1000003;
    h$ ^= b ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= c.hashCode();
    h$ *= 1000003;
    h$ ^= d.hashCode();
    return h$;
  }

  static class Builder extends SerializableAutoValueExtensionTest.PrefixSerializableAutoValue.Builder {
    private String a;
    private Boolean b;
    private Optional<String> c = Optional.empty();
    private Optional<Boolean> d = Optional.empty();
    Builder() {
    }
    @Override
    SerializableAutoValueExtensionTest.PrefixSerializableAutoValue.Builder a(String a) {
      if (a == null) {
        throw new NullPointerException("Null a");
      }
      this.a = a;
      return this;
    }
    @Override
    SerializableAutoValueExtensionTest.PrefixSerializableAutoValue.Builder b(boolean b) {
      this.b = b;
      return this;
    }
    @Override
    SerializableAutoValueExtensionTest.PrefixSerializableAutoValue.Builder c(String c) {
      this.c = Optional.of(c);
      return this;
    }
    @Override
    SerializableAutoValueExtensionTest.PrefixSerializableAutoValue.Builder d(boolean d) {
      this.d = Optional.of(d);
      return this;
    }
    @Override
    SerializableAutoValueExtensionTest.PrefixSerializableAutoValue build() {
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
      return new AutoValue_SerializableAutoValueExtensionTest_PrefixSerializableAutoValue(
          this.a,
          this.b,
          this.c,
          this.d);
    }
  }

}
