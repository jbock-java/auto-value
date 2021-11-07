package com.google.auto.value.extension.memoized;

import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.concurrent.LazyInit;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.extension.memoized.processor.MemoizeExtension")
final class AutoValue_MemoizedTest_ListValue<T extends Number, K> extends $AutoValue_MemoizedTest_ListValue<T, K> {
  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile ImmutableList<T> myTypedList;

  AutoValue_MemoizedTest_ListValue(T value$, K otherValue$) {
    super(value$, otherValue$);
  }

  @Override
  ImmutableList<T> myTypedList() {
    if (myTypedList == null) {
      synchronized (this) {
        if (myTypedList == null) {
          myTypedList = super.myTypedList();
          if (myTypedList == null) {
            throw new NullPointerException("myTypedList() cannot return null");
          }
        }
      }
    }
    return myTypedList;
  }
}
