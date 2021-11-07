package com.google.auto.value.extension.serializable.processor;

import com.google.common.collect.ImmutableList;

import javax.annotation.processing.Generated;
import java.io.Serializable;
import java.util.Optional;

@Generated("com.google.auto.value.extension.serializable.processor.SerializableAutoValueExtension")
final class AutoValue_SerializableAutoValueExtensionTest_ImmutableListSerializableAutoValue extends $AutoValue_SerializableAutoValueExtensionTest_ImmutableListSerializableAutoValue {
  AutoValue_SerializableAutoValueExtensionTest_ImmutableListSerializableAutoValue(
      ImmutableList<Optional<String>> payload) {
    super(payload);
  }

  Object writeReplace() {
    return new Proxy$(payload());
  }

  static class Proxy$ implements Serializable {
    private static final long serialVersionUID = 0;
    private ImmutableList<Optional<String>> payload;
    Proxy$(ImmutableList<Optional<String>> payload) {
      this.payload = payload;
    }
    Object readResolve() throws Exception {
      return new AutoValue_SerializableAutoValueExtensionTest_ImmutableListSerializableAutoValue(payload);
    }
  }
}
