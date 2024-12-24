package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionBillingCycleUnskipPayload {
  
  private SubscriptionBillingCycle billingCycle;

  
  private List<SubscriptionBillingCycleUnskipUserError> userErrors;

  public SubscriptionBillingCycleUnskipPayload() {
  }

  
  public SubscriptionBillingCycle getBillingCycle() {
    return billingCycle;
  }

  public void setBillingCycle(SubscriptionBillingCycle billingCycle) {
    this.billingCycle = billingCycle;
  }

  
  public List<SubscriptionBillingCycleUnskipUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SubscriptionBillingCycleUnskipUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingCycleUnskipPayload{billingCycle='" + billingCycle + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCycleUnskipPayload that = (SubscriptionBillingCycleUnskipPayload) o;
    return Objects.equals(billingCycle, that.billingCycle) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingCycle, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SubscriptionBillingCycle billingCycle;

    
    private List<SubscriptionBillingCycleUnskipUserError> userErrors;

    public SubscriptionBillingCycleUnskipPayload build() {
      SubscriptionBillingCycleUnskipPayload result = new SubscriptionBillingCycleUnskipPayload();
      result.billingCycle = this.billingCycle;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder billingCycle(SubscriptionBillingCycle billingCycle) {
      this.billingCycle = billingCycle;
      return this;
    }

    
    public Builder userErrors(List<SubscriptionBillingCycleUnskipUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
