package com.google.auto.value.extension.toprettystring;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_ToPrettyStringTest_JavaBeans extends ToPrettyStringTest.JavaBeans {

  private final int int0;

  private final boolean boolean0;

  private final String notAJavaIdentifier;

  $AutoValue_ToPrettyStringTest_JavaBeans(
      int int0,
      boolean boolean0,
      String notAJavaIdentifier) {
    this.int0 = int0;
    this.boolean0 = boolean0;
    if (notAJavaIdentifier == null) {
      throw new NullPointerException("Null notAJavaIdentifier");
    }
    this.notAJavaIdentifier = notAJavaIdentifier;
  }

  @Override
  int getInt() {
    return int0;
  }

  @Override
  boolean isBoolean() {
    return boolean0;
  }

  @Override
  String getNotAJavaIdentifier() {
    return notAJavaIdentifier;
  }

  @Override
  public String toString() {
    return "JavaBeans{"
        + "int=" + int0 + ", "
        + "boolean=" + boolean0 + ", "
        + "notAJavaIdentifier=" + notAJavaIdentifier
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ToPrettyStringTest.JavaBeans) {
      ToPrettyStringTest.JavaBeans that = (ToPrettyStringTest.JavaBeans) o;
      return this.int0 == that.getInt()
          && this.boolean0 == that.isBoolean()
          && this.notAJavaIdentifier.equals(that.getNotAJavaIdentifier());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= int0;
    h$ *= 1000003;
    h$ ^= boolean0 ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= notAJavaIdentifier.hashCode();
    return h$;
  }

}
