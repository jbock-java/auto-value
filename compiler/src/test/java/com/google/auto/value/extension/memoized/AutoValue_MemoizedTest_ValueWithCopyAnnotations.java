package com.google.auto.value.extension.memoized;

import com.google.errorprone.annotations.concurrent.LazyInit;

import javax.annotation.Nullable;
import javax.annotation.processing.Generated;

@Nullable
@Generated("com.google.auto.value.extension.memoized.processor.MemoizeExtension")
final class AutoValue_MemoizedTest_ValueWithCopyAnnotations extends $AutoValue_MemoizedTest_ValueWithCopyAnnotations {
  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile boolean getMemoizedNative;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile boolean getMemoizedNative$Memoized;

  AutoValue_MemoizedTest_ValueWithCopyAnnotations(boolean native$) {
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
