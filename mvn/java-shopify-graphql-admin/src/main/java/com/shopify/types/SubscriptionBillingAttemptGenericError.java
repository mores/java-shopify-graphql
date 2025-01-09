package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A base error type that applies to all uncategorized error classes.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionBillingAttemptGenericError implements com.shopify.types.SubscriptionBillingAttemptProcessingError {
  /**
   * The code for the error.
   */
  private SubscriptionBillingAttemptErrorCode code;

  /**
   * An explanation of the error.
   */
  private String message;

  public SubscriptionBillingAttemptGenericError() {
  }

  /**
   * The code for the error.
   */
  public SubscriptionBillingAttemptErrorCode getCode() {
    return code;
  }

  public void setCode(SubscriptionBillingAttemptErrorCode code) {
    this.code = code;
  }

  /**
   * An explanation of the error.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingAttemptGenericError{code='" + code + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingAttemptGenericError that = (SubscriptionBillingAttemptGenericError) o;
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
     * The code for the error.
     */
    private SubscriptionBillingAttemptErrorCode code;

    /**
     * An explanation of the error.
     */
    private String message;

    public SubscriptionBillingAttemptGenericError build() {
      SubscriptionBillingAttemptGenericError result = new SubscriptionBillingAttemptGenericError();
      result.code = this.code;
      result.message = this.message;
      return result;
    }

    /**
     * The code for the error.
     */
    public Builder code(SubscriptionBillingAttemptErrorCode code) {
      this.code = code;
      return this;
    }

    /**
     * An explanation of the error.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
