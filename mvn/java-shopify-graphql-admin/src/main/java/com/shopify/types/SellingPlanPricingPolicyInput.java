package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SellingPlanPricingPolicyInput {
  
  private SellingPlanRecurringPricingPolicyInput recurring;

  
  private SellingPlanFixedPricingPolicyInput fixed;

  public SellingPlanPricingPolicyInput() {
  }

  
  public SellingPlanRecurringPricingPolicyInput getRecurring() {
    return recurring;
  }

  public void setRecurring(SellingPlanRecurringPricingPolicyInput recurring) {
    this.recurring = recurring;
  }

  
  public SellingPlanFixedPricingPolicyInput getFixed() {
    return fixed;
  }

  public void setFixed(SellingPlanFixedPricingPolicyInput fixed) {
    this.fixed = fixed;
  }

  @Override
  public String toString() {
    return "SellingPlanPricingPolicyInput{recurring='" + recurring + "', fixed='" + fixed + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanPricingPolicyInput that = (SellingPlanPricingPolicyInput) o;
    return Objects.equals(recurring, that.recurring) &&
        Objects.equals(fixed, that.fixed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recurring, fixed);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SellingPlanRecurringPricingPolicyInput recurring;

    
    private SellingPlanFixedPricingPolicyInput fixed;

    public SellingPlanPricingPolicyInput build() {
      SellingPlanPricingPolicyInput result = new SellingPlanPricingPolicyInput();
      result.recurring = this.recurring;
      result.fixed = this.fixed;
      return result;
    }

    
    public Builder recurring(SellingPlanRecurringPricingPolicyInput recurring) {
      this.recurring = recurring;
      return this;
    }

    
    public Builder fixed(SellingPlanFixedPricingPolicyInput fixed) {
      this.fixed = fixed;
      return this;
    }
  }
}
