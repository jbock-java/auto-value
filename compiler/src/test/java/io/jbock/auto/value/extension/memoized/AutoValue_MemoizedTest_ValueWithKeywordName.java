package com.google.auto.value.extension.memoized;

import com.google.errorprone.annotations.concurrent.LazyInit;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.extension.memoized.processor.MemoizeExtension")
final class AutoValue_MemoizedTest_ValueWithKeywordName extends $AutoValue_MemoizedTest_ValueWithKeywordName {
  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile boolean getMemoizedNative;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile boolean getMemoizedNative$Memoized;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile boolean getMemoizedNative0;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile boolean getMemoizedNative0$Memoized;

  AutoValue_MemoizedTest_ValueWithKeywordName(boolean native$, boolean native0$) {
    super(native$, native0$);
  }

  @Override
  boolean getMemoizedNative() {
    if (!getMemoizedNative$Memoized) {
      synchronized (this) {
        if (!getMemoizedNative$Memoized) {
          getMemoizedNative = super.getMemoizedNative();
          getMemoizedNative$Memoized = true;
        }
      }
    }
    return getMemoizedNative;
  }

  @Override
  boolean getMemoizedNative0() {
    if (!getMemoizedNative0$Memoized) {
      synchronized (this) {
        if (!getMemoizedNative0$Memoized) {
          getMemoizedNative0 = super.getMemoizedNative0();
          getMemoizedNative0$Memoized = true;
        }
      }
    }
    return getMemoizedNative0;
  }
}
