package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A payment challenge that the customer must complete.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionBillingAttemptPaymentChallenge implements SubscriptionBillingAttemptAction {
  /**
   * URL to redirect the customer for authentication.
   */
  private String nextActionUrl;

  /**
   * The status of the payment challenge.
   */
  private SubscriptionBillingAttemptPaymentChallengeStatus status;

  public SubscriptionBillingAttemptPaymentChallenge() {
  }

  /**
   * URL to redirect the customer for authentication.
   */
  public String getNextActionUrl() {
    return nextActionUrl;
  }

  public void setNextActionUrl(String nextActionUrl) {
    this.nextActionUrl = nextActionUrl;
  }

  /**
   * The status of the payment challenge.
   */
  public SubscriptionBillingAttemptPaymentChallengeStatus getStatus() {
    return status;
  }

  public void setStatus(SubscriptionBillingAttemptPaymentChallengeStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingAttemptPaymentChallenge{nextActionUrl='" + nextActionUrl + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingAttemptPaymentChallenge that = (SubscriptionBillingAttemptPaymentChallenge) o;
    return Objects.equals(nextActionUrl, that.nextActionUrl) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextActionUrl, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * URL to redirect the customer for authentication.
     */
    private String nextActionUrl;

    /**
     * The status of the payment challenge.
     */
    private SubscriptionBillingAttemptPaymentChallengeStatus status;

    public SubscriptionBillingAttemptPaymentChallenge build() {
      SubscriptionBillingAttemptPaymentChallenge result = new SubscriptionBillingAttemptPaymentChallenge();
      result.nextActionUrl = this.nextActionUrl;
      result.status = this.status;
      return result;
    }

    /**
     * URL to redirect the customer for authentication.
     */
    public Builder nextActionUrl(String nextActionUrl) {
      this.nextActionUrl = nextActionUrl;
      return this;
    }

    /**
     * The status of the payment challenge.
     */
    public Builder status(SubscriptionBillingAttemptPaymentChallengeStatus status) {
      this.status = status;
      return this;
    }
  }
}
