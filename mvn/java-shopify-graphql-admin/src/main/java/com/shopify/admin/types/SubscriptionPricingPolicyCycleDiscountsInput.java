package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for an array containing all pricing changes for each billing cycle.
 */
public class SubscriptionPricingPolicyCycleDiscountsInput {
  /**
   * The cycle after which the pricing policy applies.
   */
  private int afterCycle;

  /**
   * The price adjustment type.
   */
  private SellingPlanPricingPolicyAdjustmentType adjustmentType;

  /**
   * The price adjustment value.
   */
  private SellingPlanPricingPolicyValueInput adjustmentValue;

  /**
   * The computed price after the adjustments are applied.
   */
  private String computedPrice;

  public SubscriptionPricingPolicyCycleDiscountsInput() {
  }

  /**
   * The cycle after which the pricing policy applies.
   */
  public int getAfterCycle() {
    return afterCycle;
  }

  public void setAfterCycle(int afterCycle) {
    this.afterCycle = afterCycle;
  }

  /**
   * The price adjustment type.
   */
  public SellingPlanPricingPolicyAdjustmentType getAdjustmentType() {
    return adjustmentType;
  }

  public void setAdjustmentType(SellingPlanPricingPolicyAdjustmentType adjustmentType) {
    this.adjustmentType = adjustmentType;
  }

  /**
   * The price adjustment value.
   */
  public SellingPlanPricingPolicyValueInput getAdjustmentValue() {
    return adjustmentValue;
  }

  public void setAdjustmentValue(SellingPlanPricingPolicyValueInput adjustmentValue) {
    this.adjustmentValue = adjustmentValue;
  }

  /**
   * The computed price after the adjustments are applied.
   */
  public String getComputedPrice() {
    return computedPrice;
  }

  public void setComputedPrice(String computedPrice) {
    this.computedPrice = computedPrice;
  }

  @Override
  public String toString() {
    return "SubscriptionPricingPolicyCycleDiscountsInput{afterCycle='" + afterCycle + "', adjustmentType='" + adjustmentType + "', adjustmentValue='" + adjustmentValue + "', computedPrice='" + computedPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionPricingPolicyCycleDiscountsInput that = (SubscriptionPricingPolicyCycleDiscountsInput) o;
    return afterCycle == that.afterCycle &&
        Objects.equals(adjustmentType, that.adjustmentType) &&
        Objects.equals(adjustmentValue, that.adjustmentValue) &&
        Objects.equals(computedPrice, that.computedPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterCycle, adjustmentType, adjustmentValue, computedPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The cycle after which the pricing policy applies.
     */
    private int afterCycle;

    /**
     * The price adjustment type.
     */
    private SellingPlanPricingPolicyAdjustmentType adjustmentType;

    /**
     * The price adjustment value.
     */
    private SellingPlanPricingPolicyValueInput adjustmentValue;

    /**
     * The computed price after the adjustments are applied.
     */
    private String computedPrice;

    public SubscriptionPricingPolicyCycleDiscountsInput build() {
      SubscriptionPricingPolicyCycleDiscountsInput result = new SubscriptionPricingPolicyCycleDiscountsInput();
      result.afterCycle = this.afterCycle;
      result.adjustmentType = this.adjustmentType;
      result.adjustmentValue = this.adjustmentValue;
      result.computedPrice = this.computedPrice;
      return result;
    }

    /**
     * The cycle after which the pricing policy applies.
     */
    public Builder afterCycle(int afterCycle) {
      this.afterCycle = afterCycle;
      return this;
    }

    /**
     * The price adjustment type.
     */
    public Builder adjustmentType(SellingPlanPricingPolicyAdjustmentType adjustmentType) {
      this.adjustmentType = adjustmentType;
      return this;
    }

    /**
     * The price adjustment value.
     */
    public Builder adjustmentValue(SellingPlanPricingPolicyValueInput adjustmentValue) {
      this.adjustmentValue = adjustmentValue;
      return this;
    }

    /**
     * The computed price after the adjustments are applied.
     */
    public Builder computedPrice(String computedPrice) {
      this.computedPrice = computedPrice;
      return this;
    }
  }
}
