package com.google.auto.value.extension.memoized;

import com.google.errorprone.annotations.concurrent.LazyInit;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.extension.memoized.processor.MemoizeExtension")
final class AutoValue_MemoizedTest_ValueWithoutCopyAnnotations extends $AutoValue_MemoizedTest_ValueWithoutCopyAnnotations {
  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile boolean getMemoizedNative;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile boolean getMemoizedNative$Memoized;

  AutoValue_MemoizedTest_ValueWithoutCopyAnnotations(boolean native$) {
    super(native$);
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
}
