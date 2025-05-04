package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to create or update a fixed selling plan pricing policy.
 */
public class SellingPlanFixedPricingPolicyInput {
  /**
   * ID of the pricing policy.
   */
  private String id;

  /**
   * Price adjustment type defined by the policy.
   */
  private SellingPlanPricingPolicyAdjustmentType adjustmentType;

  /**
   * Price adjustment value defined by the policy.
   */
  private SellingPlanPricingPolicyValueInput adjustmentValue;

  public SellingPlanFixedPricingPolicyInput() {
  }

  /**
   * ID of the pricing policy.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Price adjustment type defined by the policy.
   */
  public SellingPlanPricingPolicyAdjustmentType getAdjustmentType() {
    return adjustmentType;
  }

  public void setAdjustmentType(SellingPlanPricingPolicyAdjustmentType adjustmentType) {
    this.adjustmentType = adjustmentType;
  }

  /**
   * Price adjustment value defined by the policy.
   */
  public SellingPlanPricingPolicyValueInput getAdjustmentValue() {
    return adjustmentValue;
  }

  public void setAdjustmentValue(SellingPlanPricingPolicyValueInput adjustmentValue) {
    this.adjustmentValue = adjustmentValue;
  }

  @Override
  public String toString() {
    return "SellingPlanFixedPricingPolicyInput{id='" + id + "', adjustmentType='" + adjustmentType + "', adjustmentValue='" + adjustmentValue + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanFixedPricingPolicyInput that = (SellingPlanFixedPricingPolicyInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(adjustmentType, that.adjustmentType) &&
        Objects.equals(adjustmentValue, that.adjustmentValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, adjustmentType, adjustmentValue);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the pricing policy.
     */
    private String id;

    /**
     * Price adjustment type defined by the policy.
     */
    private SellingPlanPricingPolicyAdjustmentType adjustmentType;

    /**
     * Price adjustment value defined by the policy.
     */
    private SellingPlanPricingPolicyValueInput adjustmentValue;

    public SellingPlanFixedPricingPolicyInput build() {
      SellingPlanFixedPricingPolicyInput result = new SellingPlanFixedPricingPolicyInput();
      result.id = this.id;
      result.adjustmentType = this.adjustmentType;
      result.adjustmentValue = this.adjustmentValue;
      return result;
    }

    /**
     * ID of the pricing policy.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Price adjustment type defined by the policy.
     */
    public Builder adjustmentType(SellingPlanPricingPolicyAdjustmentType adjustmentType) {
      this.adjustmentType = adjustmentType;
      return this;
    }

    /**
     * Price adjustment value defined by the policy.
     */
    public Builder adjustmentValue(SellingPlanPricingPolicyValueInput adjustmentValue) {
      this.adjustmentValue = adjustmentValue;
      return this;
    }
  }
}
