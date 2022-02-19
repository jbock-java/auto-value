package io.jbock.auto.value.extension.memoized;

import com.google.errorprone.annotations.concurrent.LazyInit;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.extension.memoized.processor.MemoizeExtension")
final class AutoValue_MemoizedTest_ResourceUriPath<InputT> extends $AutoValue_MemoizedTest_ResourceUriPath<InputT> {
  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile MemoizedTest.TypePath<InputT, String> toServiceName;

  AutoValue_MemoizedTest_ResourceUriPath(
      MemoizedTest.TypeEdgeIterable<InputT, MemoizedTest.ResourceUri> edges$) {
    super(edges$);
  }

  @Override
  MemoizedTest.TypePath<InputT, String> toServiceName() {
    if (toServiceName == null) {
      synchronized (this) {
        if (toServiceName == null) {
          toServiceName = super.toServiceName();
          if (toServiceName == null) {
            throw new NullPointerException("toServiceName() cannot return null");
          }
        }
      }
    }
    return toServiceName;
  }
}
