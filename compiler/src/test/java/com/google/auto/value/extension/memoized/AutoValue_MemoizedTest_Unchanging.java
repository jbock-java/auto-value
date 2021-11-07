package com.google.auto.value.extension.memoized;

import com.google.errorprone.annotations.ImmutableTypeParameter;
import com.google.errorprone.annotations.concurrent.LazyInit;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.extension.memoized.processor.MemoizeExtension")
final class AutoValue_MemoizedTest_Unchanging<@ImmutableTypeParameter T> extends $AutoValue_MemoizedTest_Unchanging<T> {
  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile int hashCode;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile boolean hashCode$Memoized;

  AutoValue_MemoizedTest_Unchanging(T value$) {
    super(value$);
  }

  @Override
  public int hashCode() {
    if (!hashCode$Memoized) {
      synchronized (this) {
        if (!hashCode$Memoized) {
          hashCode = super.hashCode();
          hashCode$Memoized = true;
        }
      }
    }
    return hashCode;
  }

  @Override
  public boolean equals(Object that) {
    if (this == that) {
      return true;
    }
    return that instanceof AutoValue_MemoizedTest_Unchanging && this.hashCode() == that.hashCode() && super.equals(that);
  }
}
