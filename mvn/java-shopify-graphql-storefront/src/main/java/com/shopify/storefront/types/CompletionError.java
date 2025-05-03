package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An error that occurred during a cart completion attempt.
 */
public class CompletionError {
  /**
   * The error code.
   */
  private CompletionErrorCode code;

  /**
   * The error message.
   */
  private String message;

  public CompletionError() {
  }

  /**
   * The error code.
   */
  public CompletionErrorCode getCode() {
    return code;
  }

  public void setCode(CompletionErrorCode code) {
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
    return "CompletionError{code='" + code + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompletionError that = (CompletionError) o;
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
    private CompletionErrorCode code;

    /**
     * The error message.
     */
    private String message;

    public CompletionError build() {
      CompletionError result = new CompletionError();
      result.code = this.code;
      result.message = this.message;
      return result;
    }

    /**
     * The error code.
     */
    public Builder code(CompletionErrorCode code) {
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
