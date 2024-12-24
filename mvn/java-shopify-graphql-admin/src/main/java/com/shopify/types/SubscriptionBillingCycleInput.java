package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionBillingCycleInput {
  
  private String contractId;

  
  private SubscriptionBillingCycleSelector selector;

  public SubscriptionBillingCycleInput() {
  }

  
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  
  public SubscriptionBillingCycleSelector getSelector() {
    return selector;
  }

  public void setSelector(SubscriptionBillingCycleSelector selector) {
    this.selector = selector;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingCycleInput{contractId='" + contractId + "', selector='" + selector + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCycleInput that = (SubscriptionBillingCycleInput) o;
    return Objects.equals(contractId, that.contractId) &&
        Objects.equals(selector, that.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, selector);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String contractId;

    
    private SubscriptionBillingCycleSelector selector;

    public SubscriptionBillingCycleInput build() {
      SubscriptionBillingCycleInput result = new SubscriptionBillingCycleInput();
      result.contractId = this.contractId;
      result.selector = this.selector;
      return result;
    }

    
    public Builder contractId(String contractId) {
      this.contractId = contractId;
      return this;
    }

    
    public Builder selector(SubscriptionBillingCycleSelector selector) {
      this.selector = selector;
      return this;
    }
  }
}
