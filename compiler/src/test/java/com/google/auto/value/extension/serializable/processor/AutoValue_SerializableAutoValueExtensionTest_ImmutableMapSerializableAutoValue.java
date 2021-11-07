package com.google.auto.value.extension.serializable.processor;

import com.google.common.collect.ImmutableMap;

import javax.annotation.processing.Generated;
import java.io.Serializable;
import java.util.Optional;

@Generated("com.google.auto.value.extension.serializable.processor.SerializableAutoValueExtension")
final class AutoValue_SerializableAutoValueExtensionTest_ImmutableMapSerializableAutoValue extends $AutoValue_SerializableAutoValueExtensionTest_ImmutableMapSerializableAutoValue {
  AutoValue_SerializableAutoValueExtensionTest_ImmutableMapSerializableAutoValue(
      ImmutableMap<Optional<String>, String> a, ImmutableMap<String, Optional<String>> b) {
    super(a, b);
  }

  Object writeReplace() {
    return new Proxy$(a(), b());
  }

  static class Proxy$ implements Serializable {
    private static final long serialVersionUID = 0;
    private ImmutableMap<Optional<String>, String> a;
    private ImmutableMap<String, Optional<String>> b;
    Proxy$(ImmutableMap<Optional<String>, String> a, ImmutableMap<String, Optional<String>> b) {
      this.a = a;
      this.b = b;
    }
    Object readResolve() throws Exception {
      return new AutoValue_SerializableAutoValueExtensionTest_ImmutableMapSerializableAutoValue(a, b);
    }
  }
}
