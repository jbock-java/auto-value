package com.google.auto.value.extension.toprettystring;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_ToPrettyStringTest_Primitives extends ToPrettyStringTest.Primitives {

  private final int i;

  private final long l;

  private final byte b;

  private final short s;

  private final char c;

  private final float f;

  private final double d;

  private final boolean bool;

  $AutoValue_ToPrettyStringTest_Primitives(
      int i,
      long l,
      byte b,
      short s,
      char c,
      float f,
      double d,
      boolean bool) {
    this.i = i;
    this.l = l;
    this.b = b;
    this.s = s;
    this.c = c;
    this.f = f;
    this.d = d;
    this.bool = bool;
  }

  @Override
  int i() {
    return i;
  }

  @Override
  long l() {
    return l;
  }

  @Override
  byte b() {
    return b;
  }

  @Override
  short s() {
    return s;
  }

  @Override
  char c() {
    return c;
  }

  @Override
  float f() {
    return f;
  }

  @Override
  double d() {
    return d;
  }

  @Override
  boolean bool() {
    return bool;
  }

  @Override
  public String toString() {
    return "Primitives{"
        + "i=" + i + ", "
        + "l=" + l + ", "
        + "b=" + b + ", "
        + "s=" + s + ", "
        + "c=" + c + ", "
        + "f=" + f + ", "
        + "d=" + d + ", "
        + "bool=" + bool
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ToPrettyStringTest.Primitives) {
      ToPrettyStringTest.Primitives that = (ToPrettyStringTest.Primitives) o;
      return this.i == that.i()
          && this.l == that.l()
          && this.b == that.b()
          && this.s == that.s()
          && this.c == that.c()
          && Float.floatToIntBits(this.f) == Float.floatToIntBits(that.f())
          && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(that.d())
          && this.bool == that.bool();
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= i;
    h$ *= 1000003;
    h$ ^= (int) ((l >>> 32) ^ l);
    h$ *= 1000003;
    h$ ^= b;
    h$ *= 1000003;
    h$ ^= s;
    h$ *= 1000003;
    h$ ^= c;
    h$ *= 1000003;
    h$ ^= Float.floatToIntBits(f);
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(d) >>> 32) ^ Double.doubleToLongBits(d));
    h$ *= 1000003;
    h$ ^= bool ? 1231 : 1237;
    return h$;
  }

}
