package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An error occurred during the cart operation.
 */
public class CartOperationError {
  /**
   * The error code.
   */
  private String code;

  /**
   * The error message.
   */
  private String message;

  public CartOperationError() {
  }

  /**
   * The error code.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The error message.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "CartOperationError{code='" + code + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartOperationError that = (CartOperationError) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The error code.
     */
    private String code;

    /**
     * The error message.
     */
    private String message;

    public CartOperationError build() {
      CartOperationError result = new CartOperationError();
      result.code = this.code;
      result.message = this.message;
      return result;
    }

    /**
     * The error code.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The error message.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
