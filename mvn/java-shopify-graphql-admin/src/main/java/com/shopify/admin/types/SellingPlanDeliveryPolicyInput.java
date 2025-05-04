package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields that are required to create or update a delivery policy.
 */
public class SellingPlanDeliveryPolicyInput {
  /**
   * The fixed delivery policy details.
   */
  private SellingPlanFixedDeliveryPolicyInput fixed;

  /**
   * The recurring delivery policy details.
   */
  private SellingPlanRecurringDeliveryPolicyInput recurring;

  public SellingPlanDeliveryPolicyInput() {
  }

  /**
   * The fixed delivery policy details.
   */
  public SellingPlanFixedDeliveryPolicyInput getFixed() {
    return fixed;
  }

  public void setFixed(SellingPlanFixedDeliveryPolicyInput fixed) {
    this.fixed = fixed;
  }

  /**
   * The recurring delivery policy details.
   */
  public SellingPlanRecurringDeliveryPolicyInput getRecurring() {
    return recurring;
  }

  public void setRecurring(SellingPlanRecurringDeliveryPolicyInput recurring) {
    this.recurring = recurring;
  }

  @Override
  public String toString() {
    return "SellingPlanDeliveryPolicyInput{fixed='" + fixed + "', recurring='" + recurring + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanDeliveryPolicyInput that = (SellingPlanDeliveryPolicyInput) o;
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
     * The fixed delivery policy details.
     */
    private SellingPlanFixedDeliveryPolicyInput fixed;

    /**
     * The recurring delivery policy details.
     */
    private SellingPlanRecurringDeliveryPolicyInput recurring;

    public SellingPlanDeliveryPolicyInput build() {
      SellingPlanDeliveryPolicyInput result = new SellingPlanDeliveryPolicyInput();
      result.fixed = this.fixed;
      result.recurring = this.recurring;
      return result;
    }

    /**
     * The fixed delivery policy details.
     */
    public Builder fixed(SellingPlanFixedDeliveryPolicyInput fixed) {
      this.fixed = fixed;
      return this;
    }

    /**
     * The recurring delivery policy details.
     */
    public Builder recurring(SellingPlanRecurringDeliveryPolicyInput recurring) {
      this.recurring = recurring;
      return this;
    }
  }
}
