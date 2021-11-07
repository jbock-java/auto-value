package com.google.auto.value.extension.toprettystring;

import com.google.common.base.Optional;

import javax.annotation.Nullable;
import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_ToPrettyStringTest_GuavaOptional extends ToPrettyStringTest.GuavaOptional {

  private final Optional<Object> optional;

  $AutoValue_ToPrettyStringTest_GuavaOptional(
      @Nullable Optional<Object> optional) {
    this.optional = optional;
  }

  @Nullable
  @Override
  Optional<Object> optional() {
    return optional;
  }

  @Override
  public String toString() {
    return "GuavaOptional{"
        + "optional=" + optional
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ToPrettyStringTest.GuavaOptional) {
      ToPrettyStringTest.GuavaOptional that = (ToPrettyStringTest.GuavaOptional) o;
      return (this.optional == null ? that.optional() == null : this.optional.equals(that.optional()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (optional == null) ? 0 : optional.hashCode();
    return h$;
  }

}
