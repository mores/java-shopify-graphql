package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionPricingPolicyInput {
  
  private String basePrice;

  
  private List<SubscriptionPricingPolicyCycleDiscountsInput> cycleDiscounts;

  public SubscriptionPricingPolicyInput() {
  }

  
  public String getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(String basePrice) {
    this.basePrice = basePrice;
  }

  
  public List<SubscriptionPricingPolicyCycleDiscountsInput> getCycleDiscounts() {
    return cycleDiscounts;
  }

  public void setCycleDiscounts(List<SubscriptionPricingPolicyCycleDiscountsInput> cycleDiscounts) {
    this.cycleDiscounts = cycleDiscounts;
  }

  @Override
  public String toString() {
    return "SubscriptionPricingPolicyInput{basePrice='" + basePrice + "', cycleDiscounts='" + cycleDiscounts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionPricingPolicyInput that = (SubscriptionPricingPolicyInput) o;
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
    
    private String basePrice;

    
    private List<SubscriptionPricingPolicyCycleDiscountsInput> cycleDiscounts;

    public SubscriptionPricingPolicyInput build() {
      SubscriptionPricingPolicyInput result = new SubscriptionPricingPolicyInput();
      result.basePrice = this.basePrice;
      result.cycleDiscounts = this.cycleDiscounts;
      return result;
    }

    
    public Builder basePrice(String basePrice) {
      this.basePrice = basePrice;
      return this;
    }

    
    public Builder cycleDiscounts(
        List<SubscriptionPricingPolicyCycleDiscountsInput> cycleDiscounts) {
      this.cycleDiscounts = cycleDiscounts;
      return this;
    }
  }
}
