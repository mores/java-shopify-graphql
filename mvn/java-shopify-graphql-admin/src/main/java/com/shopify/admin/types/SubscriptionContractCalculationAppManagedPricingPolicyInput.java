package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for the app-managed pricing policy on a subscription line, the
 * calculate API equivalent of `SubscriptionPricingPolicyInput`. The policy is
 * informational metadata and doesn't drive pricing; the line's price field does.
 * When you restate a line without it, the stored policy is cleared.
 */
public class SubscriptionContractCalculationAppManagedPricingPolicyInput {
  /**
   * The base price per unit for the subscription line. The amount must be greater than or equal to 0.
   */
  private MoneyInput basePrice;

  /**
   * The expected pricing changes for each billing cycle.
   */
  private List<SubscriptionContractCalculationCyclePriceAdjustmentInput> cyclePriceAdjustments;

  public SubscriptionContractCalculationAppManagedPricingPolicyInput() {
  }

  /**
   * The base price per unit for the subscription line. The amount must be greater than or equal to 0.
   */
  public MoneyInput getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(MoneyInput basePrice) {
    this.basePrice = basePrice;
  }

  /**
   * The expected pricing changes for each billing cycle.
   */
  public List<SubscriptionContractCalculationCyclePriceAdjustmentInput> getCyclePriceAdjustments() {
    return cyclePriceAdjustments;
  }

  public void setCyclePriceAdjustments(
      List<SubscriptionContractCalculationCyclePriceAdjustmentInput> cyclePriceAdjustments) {
    this.cyclePriceAdjustments = cyclePriceAdjustments;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationAppManagedPricingPolicyInput{basePrice='" + basePrice + "', cyclePriceAdjustments='" + cyclePriceAdjustments + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationAppManagedPricingPolicyInput that = (SubscriptionContractCalculationAppManagedPricingPolicyInput) o;
    return Objects.equals(basePrice, that.basePrice) &&
        Objects.equals(cyclePriceAdjustments, that.cyclePriceAdjustments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basePrice, cyclePriceAdjustments);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The base price per unit for the subscription line. The amount must be greater than or equal to 0.
     */
    private MoneyInput basePrice;

    /**
     * The expected pricing changes for each billing cycle.
     */
    private List<SubscriptionContractCalculationCyclePriceAdjustmentInput> cyclePriceAdjustments;

    public SubscriptionContractCalculationAppManagedPricingPolicyInput build() {
      SubscriptionContractCalculationAppManagedPricingPolicyInput result = new SubscriptionContractCalculationAppManagedPricingPolicyInput();
      result.basePrice = this.basePrice;
      result.cyclePriceAdjustments = this.cyclePriceAdjustments;
      return result;
    }

    /**
     * The base price per unit for the subscription line. The amount must be greater than or equal to 0.
     */
    public Builder basePrice(MoneyInput basePrice) {
      this.basePrice = basePrice;
      return this;
    }

    /**
     * The expected pricing changes for each billing cycle.
     */
    public Builder cyclePriceAdjustments(
        List<SubscriptionContractCalculationCyclePriceAdjustmentInput> cyclePriceAdjustments) {
      this.cyclePriceAdjustments = cyclePriceAdjustments;
      return this;
    }
  }
}
