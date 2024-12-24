package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanFixedPricingPolicy implements SellingPlanPricingPolicy, com.shopify.types.SellingPlanPricingPolicyBase {
  
  private SellingPlanPricingPolicyAdjustmentType adjustmentType;

  
  private SellingPlanPricingPolicyAdjustmentValue adjustmentValue;

  
  private OffsetDateTime createdAt;

  public SellingPlanFixedPricingPolicy() {
  }

  
  public SellingPlanPricingPolicyAdjustmentType getAdjustmentType() {
    return adjustmentType;
  }

  public void setAdjustmentType(SellingPlanPricingPolicyAdjustmentType adjustmentType) {
    this.adjustmentType = adjustmentType;
  }

  
  public SellingPlanPricingPolicyAdjustmentValue getAdjustmentValue() {
    return adjustmentValue;
  }

  public void setAdjustmentValue(SellingPlanPricingPolicyAdjustmentValue adjustmentValue) {
    this.adjustmentValue = adjustmentValue;
  }

  
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
    
    private SellingPlanPricingPolicyAdjustmentType adjustmentType;

    
    private SellingPlanPricingPolicyAdjustmentValue adjustmentValue;

    
    private OffsetDateTime createdAt;

    public SellingPlanFixedPricingPolicy build() {
      SellingPlanFixedPricingPolicy result = new SellingPlanFixedPricingPolicy();
      result.adjustmentType = this.adjustmentType;
      result.adjustmentValue = this.adjustmentValue;
      result.createdAt = this.createdAt;
      return result;
    }

    
    public Builder adjustmentType(SellingPlanPricingPolicyAdjustmentType adjustmentType) {
      this.adjustmentType = adjustmentType;
      return this;
    }

    
    public Builder adjustmentValue(SellingPlanPricingPolicyAdjustmentValue adjustmentValue) {
      this.adjustmentValue = adjustmentValue;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }
  }
}
