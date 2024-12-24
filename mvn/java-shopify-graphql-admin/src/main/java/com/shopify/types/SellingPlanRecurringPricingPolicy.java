package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanRecurringPricingPolicy implements SellingPlanPricingPolicy, com.shopify.types.SellingPlanPricingPolicyBase {
  
  private SellingPlanPricingPolicyAdjustmentType adjustmentType;

  
  private SellingPlanPricingPolicyAdjustmentValue adjustmentValue;

  
  private Integer afterCycle;

  
  private OffsetDateTime createdAt;

  public SellingPlanRecurringPricingPolicy() {
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

  
  public Integer getAfterCycle() {
    return afterCycle;
  }

  public void setAfterCycle(Integer afterCycle) {
    this.afterCycle = afterCycle;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public String toString() {
    return "SellingPlanRecurringPricingPolicy{adjustmentType='" + adjustmentType + "', adjustmentValue='" + adjustmentValue + "', afterCycle='" + afterCycle + "', createdAt='" + createdAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanRecurringPricingPolicy that = (SellingPlanRecurringPricingPolicy) o;
    return Objects.equals(adjustmentType, that.adjustmentType) &&
        Objects.equals(adjustmentValue, that.adjustmentValue) &&
        Objects.equals(afterCycle, that.afterCycle) &&
        Objects.equals(createdAt, that.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustmentType, adjustmentValue, afterCycle, createdAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SellingPlanPricingPolicyAdjustmentType adjustmentType;

    
    private SellingPlanPricingPolicyAdjustmentValue adjustmentValue;

    
    private Integer afterCycle;

    
    private OffsetDateTime createdAt;

    public SellingPlanRecurringPricingPolicy build() {
      SellingPlanRecurringPricingPolicy result = new SellingPlanRecurringPricingPolicy();
      result.adjustmentType = this.adjustmentType;
      result.adjustmentValue = this.adjustmentValue;
      result.afterCycle = this.afterCycle;
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

    
    public Builder afterCycle(Integer afterCycle) {
      this.afterCycle = afterCycle;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }
  }
}
