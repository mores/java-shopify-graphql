package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionPricingPolicy {
  
  private MoneyV2 basePrice;

  
  private List<SubscriptionCyclePriceAdjustment> cycleDiscounts;

  public SubscriptionPricingPolicy() {
  }

  
  public MoneyV2 getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(MoneyV2 basePrice) {
    this.basePrice = basePrice;
  }

  
  public List<SubscriptionCyclePriceAdjustment> getCycleDiscounts() {
    return cycleDiscounts;
  }

  public void setCycleDiscounts(List<SubscriptionCyclePriceAdjustment> cycleDiscounts) {
    this.cycleDiscounts = cycleDiscounts;
  }

  @Override
  public String toString() {
    return "SubscriptionPricingPolicy{basePrice='" + basePrice + "', cycleDiscounts='" + cycleDiscounts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionPricingPolicy that = (SubscriptionPricingPolicy) o;
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
    
    private MoneyV2 basePrice;

    
    private List<SubscriptionCyclePriceAdjustment> cycleDiscounts;

    public SubscriptionPricingPolicy build() {
      SubscriptionPricingPolicy result = new SubscriptionPricingPolicy();
      result.basePrice = this.basePrice;
      result.cycleDiscounts = this.cycleDiscounts;
      return result;
    }

    
    public Builder basePrice(MoneyV2 basePrice) {
      this.basePrice = basePrice;
      return this;
    }

    
    public Builder cycleDiscounts(List<SubscriptionCyclePriceAdjustment> cycleDiscounts) {
      this.cycleDiscounts = cycleDiscounts;
      return this;
    }
  }
}
