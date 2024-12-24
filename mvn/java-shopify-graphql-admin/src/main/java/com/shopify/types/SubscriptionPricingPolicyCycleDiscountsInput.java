package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionPricingPolicyCycleDiscountsInput {
  
  private int afterCycle;

  
  private SellingPlanPricingPolicyAdjustmentType adjustmentType;

  
  private SellingPlanPricingPolicyValueInput adjustmentValue;

  
  private String computedPrice;

  public SubscriptionPricingPolicyCycleDiscountsInput() {
  }

  
  public int getAfterCycle() {
    return afterCycle;
  }

  public void setAfterCycle(int afterCycle) {
    this.afterCycle = afterCycle;
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
    
    private int afterCycle;

    
    private SellingPlanPricingPolicyAdjustmentType adjustmentType;

    
    private SellingPlanPricingPolicyValueInput adjustmentValue;

    
    private String computedPrice;

    public SubscriptionPricingPolicyCycleDiscountsInput build() {
      SubscriptionPricingPolicyCycleDiscountsInput result = new SubscriptionPricingPolicyCycleDiscountsInput();
      result.afterCycle = this.afterCycle;
      result.adjustmentType = this.adjustmentType;
      result.adjustmentValue = this.adjustmentValue;
      result.computedPrice = this.computedPrice;
      return result;
    }

    
    public Builder afterCycle(int afterCycle) {
      this.afterCycle = afterCycle;
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

    
    public Builder computedPrice(String computedPrice) {
      this.computedPrice = computedPrice;
      return this;
    }
  }
}
