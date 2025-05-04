package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to create or update a selling plan pricing policy.
 */
public class SellingPlanPricingPolicyInput {
  /**
   * Recurring pricing policy details.
   */
  private SellingPlanRecurringPricingPolicyInput recurring;

  /**
   * Fixed pricing policy details.
   */
  private SellingPlanFixedPricingPolicyInput fixed;

  public SellingPlanPricingPolicyInput() {
  }

  /**
   * Recurring pricing policy details.
   */
  public SellingPlanRecurringPricingPolicyInput getRecurring() {
    return recurring;
  }

  public void setRecurring(SellingPlanRecurringPricingPolicyInput recurring) {
    this.recurring = recurring;
  }

  /**
   * Fixed pricing policy details.
   */
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
    /**
     * Recurring pricing policy details.
     */
    private SellingPlanRecurringPricingPolicyInput recurring;

    /**
     * Fixed pricing policy details.
     */
    private SellingPlanFixedPricingPolicyInput fixed;

    public SellingPlanPricingPolicyInput build() {
      SellingPlanPricingPolicyInput result = new SellingPlanPricingPolicyInput();
      result.recurring = this.recurring;
      result.fixed = this.fixed;
      return result;
    }

    /**
     * Recurring pricing policy details.
     */
    public Builder recurring(SellingPlanRecurringPricingPolicyInput recurring) {
      this.recurring = recurring;
      return this;
    }

    /**
     * Fixed pricing policy details.
     */
    public Builder fixed(SellingPlanFixedPricingPolicyInput fixed) {
      this.fixed = fixed;
      return this;
    }
  }
}
