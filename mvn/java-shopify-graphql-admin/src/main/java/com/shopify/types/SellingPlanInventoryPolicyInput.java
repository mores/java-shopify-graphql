package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to create or update an inventory policy.
 */
public class SellingPlanInventoryPolicyInput {
  /**
   * When to reserve inventory for the order. The value must be ON_FULFILLMENT or ON_SALE.
   */
  private SellingPlanReserve reserve;

  public SellingPlanInventoryPolicyInput() {
  }

  /**
   * When to reserve inventory for the order. The value must be ON_FULFILLMENT or ON_SALE.
   */
  public SellingPlanReserve getReserve() {
    return reserve;
  }

  public void setReserve(SellingPlanReserve reserve) {
    this.reserve = reserve;
  }

  @Override
  public String toString() {
    return "SellingPlanInventoryPolicyInput{reserve='" + reserve + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanInventoryPolicyInput that = (SellingPlanInventoryPolicyInput) o;
    return Objects.equals(reserve, that.reserve);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reserve);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * When to reserve inventory for the order. The value must be ON_FULFILLMENT or ON_SALE.
     */
    private SellingPlanReserve reserve;

    public SellingPlanInventoryPolicyInput build() {
      SellingPlanInventoryPolicyInput result = new SellingPlanInventoryPolicyInput();
      result.reserve = this.reserve;
      return result;
    }

    /**
     * When to reserve inventory for the order. The value must be ON_FULFILLMENT or ON_SALE.
     */
    public Builder reserve(SellingPlanReserve reserve) {
      this.reserve = reserve;
      return this;
    }
  }
}
