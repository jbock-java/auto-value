package com.google.auto.value.extension.memoized;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
abstract class $AutoValue_MemoizedTest_ResourceUriPath<InputT> extends MemoizedTest.ResourceUriPath<InputT> {

  private final MemoizedTest.TypeEdgeIterable<InputT, MemoizedTest.ResourceUri> edges;

  $AutoValue_MemoizedTest_ResourceUriPath(
      MemoizedTest.TypeEdgeIterable<InputT, MemoizedTest.ResourceUri> edges) {
    if (edges == null) {
      throw new NullPointerException("Null edges");
    }
    this.edges = edges;
  }

  @Override
  MemoizedTest.TypeEdgeIterable<InputT, MemoizedTest.ResourceUri> edges() {
    return edges;
  }

  @Override
  public String toString() {
    return "ResourceUriPath{"
        + "edges=" + edges
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MemoizedTest.ResourceUriPath) {
      MemoizedTest.ResourceUriPath<?> that = (MemoizedTest.ResourceUriPath<?>) o;
      return this.edges.equals(that.edges());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= edges.hashCode();
    return h$;
  }

}
