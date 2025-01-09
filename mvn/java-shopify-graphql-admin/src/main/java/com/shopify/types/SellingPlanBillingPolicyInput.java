package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields that are required to create or update a billing policy type.
 */
public class SellingPlanBillingPolicyInput {
  /**
   * The fixed billing policy details.
   */
  private SellingPlanFixedBillingPolicyInput fixed;

  /**
   * The recurring billing policy details.
   */
  private SellingPlanRecurringBillingPolicyInput recurring;

  public SellingPlanBillingPolicyInput() {
  }

  /**
   * The fixed billing policy details.
   */
  public SellingPlanFixedBillingPolicyInput getFixed() {
    return fixed;
  }

  public void setFixed(SellingPlanFixedBillingPolicyInput fixed) {
    this.fixed = fixed;
  }

  /**
   * The recurring billing policy details.
   */
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
    /**
     * The fixed billing policy details.
     */
    private SellingPlanFixedBillingPolicyInput fixed;

    /**
     * The recurring billing policy details.
     */
    private SellingPlanRecurringBillingPolicyInput recurring;

    public SellingPlanBillingPolicyInput build() {
      SellingPlanBillingPolicyInput result = new SellingPlanBillingPolicyInput();
      result.fixed = this.fixed;
      result.recurring = this.recurring;
      return result;
    }

    /**
     * The fixed billing policy details.
     */
    public Builder fixed(SellingPlanFixedBillingPolicyInput fixed) {
      this.fixed = fixed;
      return this;
    }

    /**
     * The recurring billing policy details.
     */
    public Builder recurring(SellingPlanRecurringBillingPolicyInput recurring) {
      this.recurring = recurring;
      return this;
    }
  }
}
