package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SellingPlanRecurringPricingPolicyInput {
  
  private String id;

  
  private SellingPlanPricingPolicyAdjustmentType adjustmentType;

  
  private SellingPlanPricingPolicyValueInput adjustmentValue;

  
  private int afterCycle;

  public SellingPlanRecurringPricingPolicyInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public SellingPlanPricingPolicyAdjustmentType getAdjustmentType() {
    return adjustmentType;
  }

  public void setAdjustmentType(SellingPlanPricingPolicyAdjustmentType adjustmentType) {
    this.adjustmentType = adjustmentType;
  }

  
  public SellingPlanPricingPolicyValueInput getAdjustmentValue() {
    return adjustmentValue;
  }

  public void setAdjustmentValue(SellingPlanPricingPolicyValueInput adjustmentValue) {
    this.adjustmentValue = adjustmentValue;
  }

  
  public int getAfterCycle() {
    return afterCycle;
  }

  public void setAfterCycle(int afterCycle) {
    this.afterCycle = afterCycle;
  }

  @Override
  public String toString() {
    return "SellingPlanRecurringPricingPolicyInput{id='" + id + "', adjustmentType='" + adjustmentType + "', adjustmentValue='" + adjustmentValue + "', afterCycle='" + afterCycle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanRecurringPricingPolicyInput that = (SellingPlanRecurringPricingPolicyInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(adjustmentType, that.adjustmentType) &&
        Objects.equals(adjustmentValue, that.adjustmentValue) &&
        afterCycle == that.afterCycle;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, adjustmentType, adjustmentValue, afterCycle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private SellingPlanPricingPolicyAdjustmentType adjustmentType;

    
    private SellingPlanPricingPolicyValueInput adjustmentValue;

    
    private int afterCycle;

    public SellingPlanRecurringPricingPolicyInput build() {
      SellingPlanRecurringPricingPolicyInput result = new SellingPlanRecurringPricingPolicyInput();
      result.id = this.id;
      result.adjustmentType = this.adjustmentType;
      result.adjustmentValue = this.adjustmentValue;
      result.afterCycle = this.afterCycle;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder adjustmentType(SellingPlanPricingPolicyAdjustmentType adjustmentType) {
      this.adjustmentType = adjustmentType;
      return this;
    }

    
    public Builder adjustmentValue(SellingPlanPricingPolicyValueInput adjustmentValue) {
      this.adjustmentValue = adjustmentValue;
      return this;
    }

    
    public Builder afterCycle(int afterCycle) {
      this.afterCycle = afterCycle;
      return this;
    }
  }
}
