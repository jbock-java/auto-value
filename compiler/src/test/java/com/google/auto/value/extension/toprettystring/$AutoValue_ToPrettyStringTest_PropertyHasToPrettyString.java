package com.google.auto.value.extension.toprettystring;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_ToPrettyStringTest_PropertyHasToPrettyString extends ToPrettyStringTest.PropertyHasToPrettyString {

  private final ToPrettyStringTest.PropertyHasToPrettyString.HasToPrettyString<String> parameterizedWithString;

  private final ToPrettyStringTest.PropertyHasToPrettyString.HasToPrettyString<Void> parameterizedWithVoid;

  private final ToPrettyStringTest.PropertyHasToPrettyString.HasInheritedToPrettyString superclass;

  private final ToPrettyStringTest.PropertyHasToPrettyString.HasToPrettyStringFromSuperInterface superinterface;

  $AutoValue_ToPrettyStringTest_PropertyHasToPrettyString(
      ToPrettyStringTest.PropertyHasToPrettyString.HasToPrettyString<String> parameterizedWithString,
      ToPrettyStringTest.PropertyHasToPrettyString.HasToPrettyString<Void> parameterizedWithVoid,
      ToPrettyStringTest.PropertyHasToPrettyString.HasInheritedToPrettyString superclass,
      ToPrettyStringTest.PropertyHasToPrettyString.HasToPrettyStringFromSuperInterface superinterface) {
    if (parameterizedWithString == null) {
      throw new NullPointerException("Null parameterizedWithString");
    }
    this.parameterizedWithString = parameterizedWithString;
    if (parameterizedWithVoid == null) {
      throw new NullPointerException("Null parameterizedWithVoid");
    }
    this.parameterizedWithVoid = parameterizedWithVoid;
    if (superclass == null) {
      throw new NullPointerException("Null superclass");
    }
    this.superclass = superclass;
    if (superinterface == null) {
      throw new NullPointerException("Null superinterface");
    }
    this.superinterface = superinterface;
  }

  @Override
  ToPrettyStringTest.PropertyHasToPrettyString.HasToPrettyString<String> parameterizedWithString() {
    return parameterizedWithString;
  }

  @Override
  ToPrettyStringTest.PropertyHasToPrettyString.HasToPrettyString<Void> parameterizedWithVoid() {
    return parameterizedWithVoid;
  }

  @Override
  ToPrettyStringTest.PropertyHasToPrettyString.HasInheritedToPrettyString superclass() {
    return superclass;
  }

  @Override
  ToPrettyStringTest.PropertyHasToPrettyString.HasToPrettyStringFromSuperInterface superinterface() {
    return superinterface;
  }

  @Override
  public String toString() {
    return "PropertyHasToPrettyString{"
        + "parameterizedWithString=" + parameterizedWithString + ", "
        + "parameterizedWithVoid=" + parameterizedWithVoid + ", "
        + "superclass=" + superclass + ", "
        + "superinterface=" + superinterface
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ToPrettyStringTest.PropertyHasToPrettyString) {
      ToPrettyStringTest.PropertyHasToPrettyString that = (ToPrettyStringTest.PropertyHasToPrettyString) o;
      return this.parameterizedWithString.equals(that.parameterizedWithString())
          && this.parameterizedWithVoid.equals(that.parameterizedWithVoid())
          && this.superclass.equals(that.superclass())
          && this.superinterface.equals(that.superinterface());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= parameterizedWithString.hashCode();
    h$ *= 1000003;
    h$ ^= parameterizedWithVoid.hashCode();
    h$ *= 1000003;
    h$ ^= superclass.hashCode();
    h$ *= 1000003;
    h$ ^= superinterface.hashCode();
    return h$;
  }

}
