package com.google.auto.value.extension.serializable.processor;

import com.google.common.collect.ImmutableMap;

import javax.annotation.processing.Generated;
import java.io.Serializable;
import java.util.Optional;

@Generated("com.google.auto.value.extension.serializable.processor.SerializableAutoValueExtension")
final class AutoValue_SerializableAutoValueExtensionTest_ComplexType extends $AutoValue_SerializableAutoValueExtensionTest_ComplexType {
  AutoValue_SerializableAutoValueExtensionTest_ComplexType(
      ImmutableMap<String, ImmutableMap<String, Optional<String>>> a) {
    super(a);
  }

  Object writeReplace() {
    return new Proxy$(a());
  }

  static class Proxy$ implements Serializable {
    private static final long serialVersionUID = 0;
    private ImmutableMap<String, ImmutableMap<String, Optional<String>>> a;
    Proxy$(ImmutableMap<String, ImmutableMap<String, Optional<String>>> a) {
      this.a = a;
    }
    Object readResolve() throws Exception {
      return new AutoValue_SerializableAutoValueExtensionTest_ComplexType(a);
    }
  }
}
