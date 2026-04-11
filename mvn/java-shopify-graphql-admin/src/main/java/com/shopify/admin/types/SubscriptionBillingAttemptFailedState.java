package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The billing attempt failed due to an error.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionBillingAttemptFailedState implements SubscriptionBillingAttemptState {
  /**
   * The error that caused the billing attempt to fail.
   */
  private SubscriptionBillingAttemptError error;

  public SubscriptionBillingAttemptFailedState() {
  }

  /**
   * The error that caused the billing attempt to fail.
   */
  public SubscriptionBillingAttemptError getError() {
    return error;
  }

  public void setError(SubscriptionBillingAttemptError error) {
    this.error = error;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingAttemptFailedState{error='" + error + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingAttemptFailedState that = (SubscriptionBillingAttemptFailedState) o;
    return Objects.equals(error, that.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The error that caused the billing attempt to fail.
     */
    private SubscriptionBillingAttemptError error;

    public SubscriptionBillingAttemptFailedState build() {
      SubscriptionBillingAttemptFailedState result = new SubscriptionBillingAttemptFailedState();
      result.error = this.error;
      return result;
    }

    /**
     * The error that caused the billing attempt to fail.
     */
    public Builder error(SubscriptionBillingAttemptError error) {
      this.error = error;
      return this;
    }
  }
}
