package io.jbock.auto.value.extension.memoized;

import com.google.errorprone.annotations.concurrent.LazyInit;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.extension.memoized.processor.MemoizeExtension")
final class AutoValue_MemoizedTest_HashCodeEqualsOptimizationOffWhenEqualsIsFinal extends $AutoValue_MemoizedTest_HashCodeEqualsOptimizationOffWhenEqualsIsFinal {
  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile int hashCode;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile boolean hashCode$Memoized;

  AutoValue_MemoizedTest_HashCodeEqualsOptimizationOffWhenEqualsIsFinal() {
    super();
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
}
