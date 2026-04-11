package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An unexpected error that occurred during a subscription billing attempt.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionBillingAttemptUnexpectedError implements SubscriptionBillingAttemptError {
  /**
   * A message describing the unexpected error.
   */
  private String message;

  public SubscriptionBillingAttemptUnexpectedError() {
  }

  /**
   * A message describing the unexpected error.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingAttemptUnexpectedError{message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingAttemptUnexpectedError that = (SubscriptionBillingAttemptUnexpectedError) o;
    return Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A message describing the unexpected error.
     */
    private String message;

    public SubscriptionBillingAttemptUnexpectedError build() {
      SubscriptionBillingAttemptUnexpectedError result = new SubscriptionBillingAttemptUnexpectedError();
      result.message = this.message;
      return result;
    }

    /**
     * A message describing the unexpected error.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
