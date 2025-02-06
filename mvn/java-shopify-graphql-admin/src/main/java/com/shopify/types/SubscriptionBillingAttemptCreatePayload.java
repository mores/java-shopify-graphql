package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionBillingAttemptCreate` mutation.
 */
public class SubscriptionBillingAttemptCreatePayload {
  /**
   * The subscription billing attempt.
   */
  private SubscriptionBillingAttempt subscriptionBillingAttempt;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BillingAttemptUserError> userErrors;

  public SubscriptionBillingAttemptCreatePayload() {
  }

  /**
   * The subscription billing attempt.
   */
  public SubscriptionBillingAttempt getSubscriptionBillingAttempt() {
    return subscriptionBillingAttempt;
  }

  public void setSubscriptionBillingAttempt(SubscriptionBillingAttempt subscriptionBillingAttempt) {
    this.subscriptionBillingAttempt = subscriptionBillingAttempt;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<BillingAttemptUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BillingAttemptUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingAttemptCreatePayload{subscriptionBillingAttempt='" + subscriptionBillingAttempt + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingAttemptCreatePayload that = (SubscriptionBillingAttemptCreatePayload) o;
    return Objects.equals(subscriptionBillingAttempt, that.subscriptionBillingAttempt) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionBillingAttempt, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The subscription billing attempt.
     */
    private SubscriptionBillingAttempt subscriptionBillingAttempt;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BillingAttemptUserError> userErrors;

    public SubscriptionBillingAttemptCreatePayload build() {
      SubscriptionBillingAttemptCreatePayload result = new SubscriptionBillingAttemptCreatePayload();
      result.subscriptionBillingAttempt = this.subscriptionBillingAttempt;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The subscription billing attempt.
     */
    public Builder subscriptionBillingAttempt(
        SubscriptionBillingAttempt subscriptionBillingAttempt) {
      this.subscriptionBillingAttempt = subscriptionBillingAttempt;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<BillingAttemptUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
