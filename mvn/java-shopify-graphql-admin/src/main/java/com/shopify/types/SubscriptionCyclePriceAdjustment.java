package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionCyclePriceAdjustment {
  
  private SellingPlanPricingPolicyAdjustmentType adjustmentType;

  
  private SellingPlanPricingPolicyAdjustmentValue adjustmentValue;

  
  private int afterCycle;

  
  private MoneyV2 computedPrice;

  public SubscriptionCyclePriceAdjustment() {
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

  
  public int getAfterCycle() {
    return afterCycle;
  }

  public void setAfterCycle(int afterCycle) {
    this.afterCycle = afterCycle;
  }

  
  public MoneyV2 getComputedPrice() {
    return computedPrice;
  }

  public void setComputedPrice(MoneyV2 computedPrice) {
    this.computedPrice = computedPrice;
  }

  @Override
  public String toString() {
    return "SubscriptionCyclePriceAdjustment{adjustmentType='" + adjustmentType + "', adjustmentValue='" + adjustmentValue + "', afterCycle='" + afterCycle + "', computedPrice='" + computedPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionCyclePriceAdjustment that = (SubscriptionCyclePriceAdjustment) o;
    return Objects.equals(adjustmentType, that.adjustmentType) &&
        Objects.equals(adjustmentValue, that.adjustmentValue) &&
        afterCycle == that.afterCycle &&
        Objects.equals(computedPrice, that.computedPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustmentType, adjustmentValue, afterCycle, computedPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SellingPlanPricingPolicyAdjustmentType adjustmentType;

    
    private SellingPlanPricingPolicyAdjustmentValue adjustmentValue;

    
    private int afterCycle;

    
    private MoneyV2 computedPrice;

    public SubscriptionCyclePriceAdjustment build() {
      SubscriptionCyclePriceAdjustment result = new SubscriptionCyclePriceAdjustment();
      result.adjustmentType = this.adjustmentType;
      result.adjustmentValue = this.adjustmentValue;
      result.afterCycle = this.afterCycle;
      result.computedPrice = this.computedPrice;
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

    
    public Builder afterCycle(int afterCycle) {
      this.afterCycle = afterCycle;
      return this;
    }

    
    public Builder computedPrice(MoneyV2 computedPrice) {
      this.computedPrice = computedPrice;
      return this;
    }
  }
}
