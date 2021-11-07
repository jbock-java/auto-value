package com.google.auto.value.extension.serializable.processor;

import javax.annotation.processing.Generated;
import java.io.Serializable;

@Generated("com.google.auto.value.extension.serializable.processor.SerializableAutoValueExtension")
final class AutoValue_SerializableAutoValueExtensionTest_MultiplePropertiesSameType extends $AutoValue_SerializableAutoValueExtensionTest_MultiplePropertiesSameType {
  AutoValue_SerializableAutoValueExtensionTest_MultiplePropertiesSameType(String a, String b) {
    super(a, b);
  }

  Object writeReplace() {
    return new Proxy$(a(), b());
  }

  static class Proxy$ implements Serializable {
    private static final long serialVersionUID = 0;
    private String a;
    private String b;
    Proxy$(String a, String b) {
      this.a = a;
      this.b = b;
    }
    Object readResolve() throws Exception {
      return new AutoValue_SerializableAutoValueExtensionTest_MultiplePropertiesSameType(a, b);
    }
  }
}
