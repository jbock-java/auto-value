package com.google.auto.value.extension.serializable.processor;

import javax.annotation.processing.Generated;
import java.io.Serializable;
import java.util.Optional;

@Generated("com.google.auto.value.extension.serializable.processor.SerializableAutoValueExtension")
final class AutoValue_SerializableAutoValueExtensionTest_DummySerializableAutoValue extends $AutoValue_SerializableAutoValueExtensionTest_DummySerializableAutoValue {
  AutoValue_SerializableAutoValueExtensionTest_DummySerializableAutoValue(String a, int b,
      Optional<String> optionalC, Optional<Integer> optionalD) {
    super(a, b, optionalC, optionalD);
  }

  Object writeReplace() {
    return new Proxy$(a(), b(), optionalC(), optionalD());
  }

  static class Proxy$ implements Serializable {
    private static final long serialVersionUID = 0;
    private String a;
    private int b;
    private String optionalC;
    private Integer optionalD;
    Proxy$(String a, int b, Optional<String> optionalC, Optional<Integer> optionalD) {
      this.a = a;
      this.b = b;
      this.optionalC = optionalC.isPresent() ? optionalC.get() : null;
      this.optionalD = optionalD.isPresent() ? optionalD.get() : null;
    }
    Object readResolve() throws Exception {
      return new AutoValue_SerializableAutoValueExtensionTest_DummySerializableAutoValue(a, b, Optional.ofNullable(optionalC == null ? null : optionalC), Optional.ofNullable(optionalD == null ? null : optionalD));
    }
  }
}
