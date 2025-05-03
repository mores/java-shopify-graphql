package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An error that occurred during cart submit for completion.
 */
public class SubmissionError {
  /**
   * The error code.
   */
  private SubmissionErrorCode code;

  /**
   * The error message.
   */
  private String message;

  public SubmissionError() {
  }

  /**
   * The error code.
   */
  public SubmissionErrorCode getCode() {
    return code;
  }

  public void setCode(SubmissionErrorCode code) {
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
    return "SubmissionError{code='" + code + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubmissionError that = (SubmissionError) o;
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
    private SubmissionErrorCode code;

    /**
     * The error message.
     */
    private String message;

    public SubmissionError build() {
      SubmissionError result = new SubmissionError();
      result.code = this.code;
      result.message = this.message;
      return result;
    }

    /**
     * The error code.
     */
    public Builder code(SubmissionErrorCode code) {
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
