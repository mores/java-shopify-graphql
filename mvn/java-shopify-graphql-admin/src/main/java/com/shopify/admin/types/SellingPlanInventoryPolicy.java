package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The selling plan inventory policy.
 */
public class SellingPlanInventoryPolicy {
  /**
   * When to reserve inventory for the order.
   */
  private SellingPlanReserve reserve;

  public SellingPlanInventoryPolicy() {
  }

  /**
   * When to reserve inventory for the order.
   */
  public SellingPlanReserve getReserve() {
    return reserve;
  }

  public void setReserve(SellingPlanReserve reserve) {
    this.reserve = reserve;
  }

  @Override
  public String toString() {
    return "SellingPlanInventoryPolicy{reserve='" + reserve + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanInventoryPolicy that = (SellingPlanInventoryPolicy) o;
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
     * When to reserve inventory for the order.
     */
    private SellingPlanReserve reserve;

    public SellingPlanInventoryPolicy build() {
      SellingPlanInventoryPolicy result = new SellingPlanInventoryPolicy();
      result.reserve = this.reserve;
      return result;
    }

    /**
     * When to reserve inventory for the order.
     */
    public Builder reserve(SellingPlanReserve reserve) {
      this.reserve = reserve;
      return this;
    }
  }
}
