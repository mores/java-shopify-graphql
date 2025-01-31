package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionBillingCycleChargePayload {
  
  private SubscriptionBillingAttempt subscriptionBillingAttempt;

  
  private List<BillingAttemptUserError> userErrors;

  public SubscriptionBillingCycleChargePayload() {
  }

  
  public SubscriptionBillingAttempt getSubscriptionBillingAttempt() {
    return subscriptionBillingAttempt;
  }

  public void setSubscriptionBillingAttempt(SubscriptionBillingAttempt subscriptionBillingAttempt) {
    this.subscriptionBillingAttempt = subscriptionBillingAttempt;
  }

  
  public List<BillingAttemptUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BillingAttemptUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingCycleChargePayload{subscriptionBillingAttempt='" + subscriptionBillingAttempt + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCycleChargePayload that = (SubscriptionBillingCycleChargePayload) o;
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
    
    private SubscriptionBillingAttempt subscriptionBillingAttempt;

    
    private List<BillingAttemptUserError> userErrors;

    public SubscriptionBillingCycleChargePayload build() {
      SubscriptionBillingCycleChargePayload result = new SubscriptionBillingCycleChargePayload();
      result.subscriptionBillingAttempt = this.subscriptionBillingAttempt;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder subscriptionBillingAttempt(
        SubscriptionBillingAttempt subscriptionBillingAttempt) {
      this.subscriptionBillingAttempt = subscriptionBillingAttempt;
      return this;
    }

    
    public Builder userErrors(List<BillingAttemptUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
