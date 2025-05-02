package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A warning that occurred during a cart mutation.
 */
public class CartWarning {
  /**
   * The code of the warning.
   */
  private CartWarningCode code;

  /**
   * The message text of the warning.
   */
  private String message;

  /**
   * The target of the warning.
   */
  private String target;

  public CartWarning() {
  }

  /**
   * The code of the warning.
   */
  public CartWarningCode getCode() {
    return code;
  }

  public void setCode(CartWarningCode code) {
    this.code = code;
  }

  /**
   * The message text of the warning.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * The target of the warning.
   */
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  @Override
  public String toString() {
    return "CartWarning{code='" + code + "', message='" + message + "', target='" + target + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartWarning that = (CartWarning) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(message, that.message) &&
        Objects.equals(target, that.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, target);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The code of the warning.
     */
    private CartWarningCode code;

    /**
     * The message text of the warning.
     */
    private String message;

    /**
     * The target of the warning.
     */
    private String target;

    public CartWarning build() {
      CartWarning result = new CartWarning();
      result.code = this.code;
      result.message = this.message;
      result.target = this.target;
      return result;
    }

    /**
     * The code of the warning.
     */
    public Builder code(CartWarningCode code) {
      this.code = code;
      return this;
    }

    /**
     * The message text of the warning.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    /**
     * The target of the warning.
     */
    public Builder target(String target) {
      this.target = target;
      return this;
    }
  }
}
