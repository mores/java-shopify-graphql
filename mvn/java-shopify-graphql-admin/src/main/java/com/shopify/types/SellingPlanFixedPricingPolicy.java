package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents the pricing policy of a subscription or deferred purchase option selling plan.
 * The selling plan fixed pricing policy works with the billing and delivery policy
 * to determine the final price. Discounts are divided among fulfillments.
 * For example, a subscription with a $10 discount and two deliveries will have a $5
 * discount applied to each delivery.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanFixedPricingPolicy implements SellingPlanPricingPolicy, com.shopify.types.SellingPlanPricingPolicyBase {
  /**
   * The price adjustment type.
   */
  private SellingPlanPricingPolicyAdjustmentType adjustmentType;

  /**
   * The price adjustment value.
   */
  private SellingPlanPricingPolicyAdjustmentValue adjustmentValue;

  /**
   * The date and time when the fixed selling plan pricing policy was created.
   */
  private OffsetDateTime createdAt;

  public SellingPlanFixedPricingPolicy() {
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
  public SellingPlanPricingPolicyAdjustmentValue getAdjustmentValue() {
    return adjustmentValue;
  }

  public void setAdjustmentValue(SellingPlanPricingPolicyAdjustmentValue adjustmentValue) {
    this.adjustmentValue = adjustmentValue;
  }

  /**
   * The date and time when the fixed selling plan pricing policy was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public String toString() {
    return "SellingPlanFixedPricingPolicy{adjustmentType='" + adjustmentType + "', adjustmentValue='" + adjustmentValue + "', createdAt='" + createdAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanFixedPricingPolicy that = (SellingPlanFixedPricingPolicy) o;
    return Objects.equals(adjustmentType, that.adjustmentType) &&
        Objects.equals(adjustmentValue, that.adjustmentValue) &&
        Objects.equals(createdAt, that.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustmentType, adjustmentValue, createdAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The price adjustment type.
     */
    private SellingPlanPricingPolicyAdjustmentType adjustmentType;

    /**
     * The price adjustment value.
     */
    private SellingPlanPricingPolicyAdjustmentValue adjustmentValue;

    /**
     * The date and time when the fixed selling plan pricing policy was created.
     */
    private OffsetDateTime createdAt;

    public SellingPlanFixedPricingPolicy build() {
      SellingPlanFixedPricingPolicy result = new SellingPlanFixedPricingPolicy();
      result.adjustmentType = this.adjustmentType;
      result.adjustmentValue = this.adjustmentValue;
      result.createdAt = this.createdAt;
      return result;
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
    public Builder adjustmentValue(SellingPlanPricingPolicyAdjustmentValue adjustmentValue) {
      this.adjustmentValue = adjustmentValue;
      return this;
    }

    /**
     * The date and time when the fixed selling plan pricing policy was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }
  }
}
