package com.google.auto.value.extension.toprettystring;

import javax.annotation.Nullable;
import javax.annotation.processing.Generated;
import java.util.Arrays;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_ToPrettyStringTest_PrimitiveArray extends ToPrettyStringTest.PrimitiveArray {

  private final long[] longs;

  $AutoValue_ToPrettyStringTest_PrimitiveArray(
      @Nullable long[] longs) {
    this.longs = longs;
  }

  @Nullable
  @SuppressWarnings("mutable")
  @Override
  long[] longs() {
    return longs;
  }

  @Override
  public String toString() {
    return "PrimitiveArray{"
        + "longs=" + Arrays.toString(longs)
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ToPrettyStringTest.PrimitiveArray) {
      ToPrettyStringTest.PrimitiveArray that = (ToPrettyStringTest.PrimitiveArray) o;
      return Arrays.equals(this.longs, (that instanceof $AutoValue_ToPrettyStringTest_PrimitiveArray) ? (($AutoValue_ToPrettyStringTest_PrimitiveArray) that).longs : that.longs());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= Arrays.hashCode(longs);
    return h$;
  }

}
