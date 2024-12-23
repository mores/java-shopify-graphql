package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for expected price changes of the subscription line over time.
 */
public class SubscriptionPricingPolicyInput {
  /**
   * The base price per unit for the subscription line in the contract's currency.
   */
  private String basePrice;

  /**
   * An array containing all pricing changes for each billing cycle.
   */
  private List<SubscriptionPricingPolicyCycleDiscountsInput> cycleDiscounts;

  public SubscriptionPricingPolicyInput() {
  }

  /**
   * The base price per unit for the subscription line in the contract's currency.
   */
  public String getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(String basePrice) {
    this.basePrice = basePrice;
  }

  /**
   * An array containing all pricing changes for each billing cycle.
   */
  public List<SubscriptionPricingPolicyCycleDiscountsInput> getCycleDiscounts() {
    return cycleDiscounts;
  }

  public void setCycleDiscounts(List<SubscriptionPricingPolicyCycleDiscountsInput> cycleDiscounts) {
    this.cycleDiscounts = cycleDiscounts;
  }

  @Override
  public String toString() {
    return "SubscriptionPricingPolicyInput{basePrice='" + basePrice + "', cycleDiscounts='" + cycleDiscounts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionPricingPolicyInput that = (SubscriptionPricingPolicyInput) o;
    return Objects.equals(basePrice, that.basePrice) &&
        Objects.equals(cycleDiscounts, that.cycleDiscounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basePrice, cycleDiscounts);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The base price per unit for the subscription line in the contract's currency.
     */
    private String basePrice;

    /**
     * An array containing all pricing changes for each billing cycle.
     */
    private List<SubscriptionPricingPolicyCycleDiscountsInput> cycleDiscounts;

    public SubscriptionPricingPolicyInput build() {
      SubscriptionPricingPolicyInput result = new SubscriptionPricingPolicyInput();
      result.basePrice = this.basePrice;
      result.cycleDiscounts = this.cycleDiscounts;
      return result;
    }

    /**
     * The base price per unit for the subscription line in the contract's currency.
     */
    public Builder basePrice(String basePrice) {
      this.basePrice = basePrice;
      return this;
    }

    /**
     * An array containing all pricing changes for each billing cycle.
     */
    public Builder cycleDiscounts(
        List<SubscriptionPricingPolicyCycleDiscountsInput> cycleDiscounts) {
      this.cycleDiscounts = cycleDiscounts;
      return this;
    }
  }
}
