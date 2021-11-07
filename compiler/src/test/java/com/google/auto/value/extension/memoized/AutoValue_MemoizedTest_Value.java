package com.google.auto.value.extension.memoized;

import com.google.errorprone.annotations.concurrent.LazyInit;

import javax.annotation.Nullable;
import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.extension.memoized.processor.MemoizeExtension")
final class AutoValue_MemoizedTest_Value extends $AutoValue_MemoizedTest_Value {
  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile int primitive;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile boolean primitive$Memoized;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile String notNullable;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile String nullable;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile boolean nullable$Memoized;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile String returnsNull;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile boolean returnsNull$Memoized;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile String nullableWithTypeAnnotation;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile String returnsNullWithTypeAnnotation;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile String notNullableButReturnsNull;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile String throwsException;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile int hashCode;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile boolean hashCode$Memoized;

  @LazyInit
  @SuppressWarnings("Immutable")
  private transient volatile String toString;

  AutoValue_MemoizedTest_Value(String string$, String stringWithTypeAnnotation$,
      MemoizedTest.HashCodeAndToStringCounter counter$) {
    super(string$, stringWithTypeAnnotation$, counter$);
  }

  @Override
  int primitive() {
    if (!primitive$Memoized) {
      synchronized (this) {
        if (!primitive$Memoized) {
          primitive = super.primitive();
          primitive$Memoized = true;
        }
      }
    }
    return primitive;
  }

  @Override
  String notNullable() {
    if (notNullable == null) {
      synchronized (this) {
        if (notNullable == null) {
          notNullable = super.notNullable();
          if (notNullable == null) {
            throw new NullPointerException("notNullable() cannot return null");
          }
        }
      }
    }
    return notNullable;
  }

  @Override
  @Nullable
  String nullable() {
    if (!nullable$Memoized) {
      synchronized (this) {
        if (!nullable$Memoized) {
          nullable = super.nullable();
          nullable$Memoized = true;
        }
      }
    }
    return nullable;
  }

  @Override
  @Nullable
  String returnsNull() {
    if (!returnsNull$Memoized) {
      synchronized (this) {
        if (!returnsNull$Memoized) {
          returnsNull = super.returnsNull();
          returnsNull$Memoized = true;
        }
      }
    }
    return returnsNull;
  }

  @Override
  String nullableWithTypeAnnotation() {
    if (nullableWithTypeAnnotation == null) {
      synchronized (this) {
        if (nullableWithTypeAnnotation == null) {
          nullableWithTypeAnnotation = super.nullableWithTypeAnnotation();
          if (nullableWithTypeAnnotation == null) {
            throw new NullPointerException("nullableWithTypeAnnotation() cannot return null");
          }
        }
      }
    }
    return nullableWithTypeAnnotation;
  }

  @Override
  String returnsNullWithTypeAnnotation() {
    if (returnsNullWithTypeAnnotation == null) {
      synchronized (this) {
        if (returnsNullWithTypeAnnotation == null) {
          returnsNullWithTypeAnnotation = super.returnsNullWithTypeAnnotation();
          if (returnsNullWithTypeAnnotation == null) {
            throw new NullPointerException("returnsNullWithTypeAnnotation() cannot return null");
          }
        }
      }
    }
    return returnsNullWithTypeAnnotation;
  }

  @Override
  String notNullableButReturnsNull() {
    if (notNullableButReturnsNull == null) {
      synchronized (this) {
        if (notNullableButReturnsNull == null) {
          notNullableButReturnsNull = super.notNullableButReturnsNull();
          if (notNullableButReturnsNull == null) {
            throw new NullPointerException("notNullableButReturnsNull() cannot return null");
          }
        }
      }
    }
    return notNullableButReturnsNull;
  }

  @Override
  String throwsException() throws MemoizedTest.SomeCheckedException {
    if (throwsException == null) {
      synchronized (this) {
        if (throwsException == null) {
          throwsException = super.throwsException();
          if (throwsException == null) {
            throw new NullPointerException("throwsException() cannot return null");
          }
        }
      }
    }
    return throwsException;
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
  public String toString() {
    if (toString == null) {
      synchronized (this) {
        if (toString == null) {
          toString = super.toString();
          if (toString == null) {
            throw new NullPointerException("toString() cannot return null");
          }
        }
      }
    }
    return toString;
  }

  @Override
  public boolean equals(Object that) {
    if (this == that) {
      return true;
    }
    return that instanceof AutoValue_MemoizedTest_Value && this.hashCode() == that.hashCode() && super.equals(that);
  }
}
