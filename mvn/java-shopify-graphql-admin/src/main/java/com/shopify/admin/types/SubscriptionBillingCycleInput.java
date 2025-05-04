package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for specifying the subscription contract and selecting the associated billing cycle.
 */
public class SubscriptionBillingCycleInput {
  /**
   * The ID of the subscription contract associated with the billing cycle.
   */
  private String contractId;

  /**
   * Selects the billing cycle by date or index.
   */
  private SubscriptionBillingCycleSelector selector;

  public SubscriptionBillingCycleInput() {
  }

  /**
   * The ID of the subscription contract associated with the billing cycle.
   */
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  /**
   * Selects the billing cycle by date or index.
   */
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
    /**
     * The ID of the subscription contract associated with the billing cycle.
     */
    private String contractId;

    /**
     * Selects the billing cycle by date or index.
     */
    private SubscriptionBillingCycleSelector selector;

    public SubscriptionBillingCycleInput build() {
      SubscriptionBillingCycleInput result = new SubscriptionBillingCycleInput();
      result.contractId = this.contractId;
      result.selector = this.selector;
      return result;
    }

    /**
     * The ID of the subscription contract associated with the billing cycle.
     */
    public Builder contractId(String contractId) {
      this.contractId = contractId;
      return this;
    }

    /**
     * Selects the billing cycle by date or index.
     */
    public Builder selector(SubscriptionBillingCycleSelector selector) {
      this.selector = selector;
      return this;
    }
  }
}
