package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SellingPlanBillingPolicyInput {
  
  private SellingPlanFixedBillingPolicyInput fixed;

  
  private SellingPlanRecurringBillingPolicyInput recurring;

  public SellingPlanBillingPolicyInput() {
  }

  
  public SellingPlanFixedBillingPolicyInput getFixed() {
    return fixed;
  }

  public void setFixed(SellingPlanFixedBillingPolicyInput fixed) {
    this.fixed = fixed;
  }

  
  public SellingPlanRecurringBillingPolicyInput getRecurring() {
    return recurring;
  }

  public void setRecurring(SellingPlanRecurringBillingPolicyInput recurring) {
    this.recurring = recurring;
  }

  @Override
  public String toString() {
    return "SellingPlanBillingPolicyInput{fixed='" + fixed + "', recurring='" + recurring + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanBillingPolicyInput that = (SellingPlanBillingPolicyInput) o;
    return Objects.equals(fixed, that.fixed) &&
        Objects.equals(recurring, that.recurring);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fixed, recurring);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private SellingPlanFixedBillingPolicyInput fixed;

    
    private SellingPlanRecurringBillingPolicyInput recurring;

    public SellingPlanBillingPolicyInput build() {
      SellingPlanBillingPolicyInput result = new SellingPlanBillingPolicyInput();
      result.fixed = this.fixed;
      result.recurring = this.recurring;
      return result;
    }

    
    public Builder fixed(SellingPlanFixedBillingPolicyInput fixed) {
      this.fixed = fixed;
      return this;
    }

    
    public Builder recurring(SellingPlanRecurringBillingPolicyInput recurring) {
      this.recurring = recurring;
      return this;
    }
  }
}
