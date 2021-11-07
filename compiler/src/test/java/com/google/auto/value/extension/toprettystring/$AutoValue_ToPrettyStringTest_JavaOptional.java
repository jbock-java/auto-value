package com.google.auto.value.extension.toprettystring;

import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import java.util.Optional;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_ToPrettyStringTest_JavaOptional extends ToPrettyStringTest.JavaOptional {

  private final Optional<Object> optional;

  $AutoValue_ToPrettyStringTest_JavaOptional(
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
    return "JavaOptional{"
        + "optional=" + optional
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ToPrettyStringTest.JavaOptional) {
      ToPrettyStringTest.JavaOptional that = (ToPrettyStringTest.JavaOptional) o;
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
