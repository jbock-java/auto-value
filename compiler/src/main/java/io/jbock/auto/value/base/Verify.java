package io.jbock.auto.value.base;

public class Verify {

  public static void verify(boolean expression) {
    if (!expression) {
      throw new IllegalArgumentException("verify failed");
    }
  }

    public static void verify(boolean expression, String errorMessageTemplate, Object p1) {
    if (!expression) {
      throw new IllegalArgumentException(String.format(errorMessageTemplate, p1));
    }
  }
}
