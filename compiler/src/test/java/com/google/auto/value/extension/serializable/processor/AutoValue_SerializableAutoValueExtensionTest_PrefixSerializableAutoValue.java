package com.google.auto.value.extension.serializable.processor;

import javax.annotation.processing.Generated;
import java.io.Serializable;
import java.util.Optional;

@Generated("com.google.auto.value.extension.serializable.processor.SerializableAutoValueExtension")
final class AutoValue_SerializableAutoValueExtensionTest_PrefixSerializableAutoValue extends $AutoValue_SerializableAutoValueExtensionTest_PrefixSerializableAutoValue {
  AutoValue_SerializableAutoValueExtensionTest_PrefixSerializableAutoValue(String a, boolean b,
      Optional<String> c, Optional<Boolean> d) {
    super(a, b, c, d);
  }

  Object writeReplace() {
    return new Proxy$(getA(), isB(), getC(), getD());
  }

  static class Proxy$ implements Serializable {
    private static final long serialVersionUID = 0;
    private String a;
    private boolean b;
    private String c;
    private Boolean d;
    Proxy$(String a, boolean b, Optional<String> c, Optional<Boolean> d) {
      this.a = a;
      this.b = b;
      this.c = c.isPresent() ? c.get() : null;
      this.d = d.isPresent() ? d.get() : null;
    }
    Object readResolve() throws Exception {
      return new AutoValue_SerializableAutoValueExtensionTest_PrefixSerializableAutoValue(a, b, Optional.ofNullable(c == null ? null : c), Optional.ofNullable(d == null ? null : d));
    }
  }
}
