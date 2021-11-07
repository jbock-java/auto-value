package com.google.auto.value.extension.serializable.processor;

import javax.annotation.processing.Generated;
import java.io.Serializable;
import java.util.Optional;

@Generated("com.google.auto.value.extension.serializable.processor.SerializableAutoValueExtension")
final class AutoValue_SerializableAutoValueExtensionTest_HasTypeParameters<T extends Serializable, S> extends $AutoValue_SerializableAutoValueExtensionTest_HasTypeParameters<T, S> {
  AutoValue_SerializableAutoValueExtensionTest_HasTypeParameters(T a, Optional<S> optionalB) {
    super(a, optionalB);
  }

  Object writeReplace() {
    return new Proxy$<T, S>(a(), optionalB());
  }

  static class Proxy$<T extends Serializable, S> implements Serializable {
    private static final long serialVersionUID = 0;
    private T a;
    private S optionalB;
    Proxy$(T a, Optional<S> optionalB) {
      this.a = a;
      this.optionalB = optionalB.isPresent() ? optionalB.get() : null;
    }
    Object readResolve() throws Exception {
      return new AutoValue_SerializableAutoValueExtensionTest_HasTypeParameters<T, S>(a, Optional.ofNullable(optionalB == null ? null : optionalB));
    }
  }
}
