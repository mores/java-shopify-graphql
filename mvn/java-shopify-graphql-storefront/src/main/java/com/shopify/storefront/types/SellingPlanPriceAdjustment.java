package com.shopify.storefront.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents by how much the price of a variant associated with a selling plan is
 * adjusted. Each variant can have up to two price adjustments. If a variant has
 * multiple price adjustments, then the first price adjustment applies when the
 * variant is initially purchased. The second price adjustment applies after a
 * certain number of orders (specified by the `orderCount` field) are made. If a
 * selling plan doesn't have any price adjustments, then the unadjusted price of
 * the variant is the effective price.
 */
public class SellingPlanPriceAdjustment {
  /**
   * The type of price adjustment. An adjustment value can have one of three types: percentage, amount off, or a new price.
   */
  private SellingPlanPriceAdjustmentValue adjustmentValue;

  /**
   * The number of orders that the price adjustment applies to. If the price
   * adjustment always applies, then this field is `null`.
   */
  private Integer orderCount;

  public SellingPlanPriceAdjustment() {
  }

  /**
   * The type of price adjustment. An adjustment value can have one of three types: percentage, amount off, or a new price.
   */
  public SellingPlanPriceAdjustmentValue getAdjustmentValue() {
    return adjustmentValue;
  }

  public void setAdjustmentValue(SellingPlanPriceAdjustmentValue adjustmentValue) {
    this.adjustmentValue = adjustmentValue;
  }

  /**
   * The number of orders that the price adjustment applies to. If the price
   * adjustment always applies, then this field is `null`.
   */
  public Integer getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(Integer orderCount) {
    this.orderCount = orderCount;
  }

  @Override
  public String toString() {
    return "SellingPlanPriceAdjustment{adjustmentValue='" + adjustmentValue + "', orderCount='" + orderCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanPriceAdjustment that = (SellingPlanPriceAdjustment) o;
    return Objects.equals(adjustmentValue, that.adjustmentValue) &&
        Objects.equals(orderCount, that.orderCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustmentValue, orderCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The type of price adjustment. An adjustment value can have one of three types: percentage, amount off, or a new price.
     */
    private SellingPlanPriceAdjustmentValue adjustmentValue;

    /**
     * The number of orders that the price adjustment applies to. If the price
     * adjustment always applies, then this field is `null`.
     */
    private Integer orderCount;

    public SellingPlanPriceAdjustment build() {
      SellingPlanPriceAdjustment result = new SellingPlanPriceAdjustment();
      result.adjustmentValue = this.adjustmentValue;
      result.orderCount = this.orderCount;
      return result;
    }

    /**
     * The type of price adjustment. An adjustment value can have one of three types: percentage, amount off, or a new price.
     */
    public Builder adjustmentValue(SellingPlanPriceAdjustmentValue adjustmentValue) {
      this.adjustmentValue = adjustmentValue;
      return this;
    }

    /**
     * The number of orders that the price adjustment applies to. If the price
     * adjustment always applies, then this field is `null`.
     */
    public Builder orderCount(Integer orderCount) {
      this.orderCount = orderCount;
      return this;
    }
  }
}
