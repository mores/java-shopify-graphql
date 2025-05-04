package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a discount code to apply to an order. Only one type of discount can be applied to an order.
 */
public class OrderCreateDiscountCodeInput {
  /**
   * A percentage discount code applied to the line items on the order.
   */
  private OrderCreatePercentageDiscountCodeAttributesInput itemPercentageDiscountCode;

  /**
   * A fixed amount discount code applied to the line items on the order.
   */
  private OrderCreateFixedDiscountCodeAttributesInput itemFixedDiscountCode;

  /**
   * A free shipping discount code applied to the shipping on an order.
   */
  private OrderCreateFreeShippingDiscountCodeAttributesInput freeShippingDiscountCode;

  public OrderCreateDiscountCodeInput() {
  }

  /**
   * A percentage discount code applied to the line items on the order.
   */
  public OrderCreatePercentageDiscountCodeAttributesInput getItemPercentageDiscountCode() {
    return itemPercentageDiscountCode;
  }

  public void setItemPercentageDiscountCode(
      OrderCreatePercentageDiscountCodeAttributesInput itemPercentageDiscountCode) {
    this.itemPercentageDiscountCode = itemPercentageDiscountCode;
  }

  /**
   * A fixed amount discount code applied to the line items on the order.
   */
  public OrderCreateFixedDiscountCodeAttributesInput getItemFixedDiscountCode() {
    return itemFixedDiscountCode;
  }

  public void setItemFixedDiscountCode(
      OrderCreateFixedDiscountCodeAttributesInput itemFixedDiscountCode) {
    this.itemFixedDiscountCode = itemFixedDiscountCode;
  }

  /**
   * A free shipping discount code applied to the shipping on an order.
   */
  public OrderCreateFreeShippingDiscountCodeAttributesInput getFreeShippingDiscountCode() {
    return freeShippingDiscountCode;
  }

  public void setFreeShippingDiscountCode(
      OrderCreateFreeShippingDiscountCodeAttributesInput freeShippingDiscountCode) {
    this.freeShippingDiscountCode = freeShippingDiscountCode;
  }

  @Override
  public String toString() {
    return "OrderCreateDiscountCodeInput{itemPercentageDiscountCode='" + itemPercentageDiscountCode + "', itemFixedDiscountCode='" + itemFixedDiscountCode + "', freeShippingDiscountCode='" + freeShippingDiscountCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateDiscountCodeInput that = (OrderCreateDiscountCodeInput) o;
    return Objects.equals(itemPercentageDiscountCode, that.itemPercentageDiscountCode) &&
        Objects.equals(itemFixedDiscountCode, that.itemFixedDiscountCode) &&
        Objects.equals(freeShippingDiscountCode, that.freeShippingDiscountCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemPercentageDiscountCode, itemFixedDiscountCode, freeShippingDiscountCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A percentage discount code applied to the line items on the order.
     */
    private OrderCreatePercentageDiscountCodeAttributesInput itemPercentageDiscountCode;

    /**
     * A fixed amount discount code applied to the line items on the order.
     */
    private OrderCreateFixedDiscountCodeAttributesInput itemFixedDiscountCode;

    /**
     * A free shipping discount code applied to the shipping on an order.
     */
    private OrderCreateFreeShippingDiscountCodeAttributesInput freeShippingDiscountCode;

    public OrderCreateDiscountCodeInput build() {
      OrderCreateDiscountCodeInput result = new OrderCreateDiscountCodeInput();
      result.itemPercentageDiscountCode = this.itemPercentageDiscountCode;
      result.itemFixedDiscountCode = this.itemFixedDiscountCode;
      result.freeShippingDiscountCode = this.freeShippingDiscountCode;
      return result;
    }

    /**
     * A percentage discount code applied to the line items on the order.
     */
    public Builder itemPercentageDiscountCode(
        OrderCreatePercentageDiscountCodeAttributesInput itemPercentageDiscountCode) {
      this.itemPercentageDiscountCode = itemPercentageDiscountCode;
      return this;
    }

    /**
     * A fixed amount discount code applied to the line items on the order.
     */
    public Builder itemFixedDiscountCode(
        OrderCreateFixedDiscountCodeAttributesInput itemFixedDiscountCode) {
      this.itemFixedDiscountCode = itemFixedDiscountCode;
      return this;
    }

    /**
     * A free shipping discount code applied to the shipping on an order.
     */
    public Builder freeShippingDiscountCode(
        OrderCreateFreeShippingDiscountCodeAttributesInput freeShippingDiscountCode) {
      this.freeShippingDiscountCode = freeShippingDiscountCode;
      return this;
    }
  }
}
