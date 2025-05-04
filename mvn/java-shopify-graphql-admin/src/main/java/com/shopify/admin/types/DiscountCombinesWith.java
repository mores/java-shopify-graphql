package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The [discount classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
 * that you can use in combination with
 * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
 */
public class DiscountCombinesWith {
  /**
   * Whether the discount combines with the
   * [order discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * class.
   */
  private boolean orderDiscounts;

  /**
   * Whether the discount combines with the
   * [product discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * class.
   */
  private boolean productDiscounts;

  /**
   * Whether the discount combines with the
   * [shipping discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * class.
   */
  private boolean shippingDiscounts;

  public DiscountCombinesWith() {
  }

  /**
   * Whether the discount combines with the
   * [order discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * class.
   */
  public boolean getOrderDiscounts() {
    return orderDiscounts;
  }

  public void setOrderDiscounts(boolean orderDiscounts) {
    this.orderDiscounts = orderDiscounts;
  }

  /**
   * Whether the discount combines with the
   * [product discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * class.
   */
  public boolean getProductDiscounts() {
    return productDiscounts;
  }

  public void setProductDiscounts(boolean productDiscounts) {
    this.productDiscounts = productDiscounts;
  }

  /**
   * Whether the discount combines with the
   * [shipping discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * class.
   */
  public boolean getShippingDiscounts() {
    return shippingDiscounts;
  }

  public void setShippingDiscounts(boolean shippingDiscounts) {
    this.shippingDiscounts = shippingDiscounts;
  }

  @Override
  public String toString() {
    return "DiscountCombinesWith{orderDiscounts='" + orderDiscounts + "', productDiscounts='" + productDiscounts + "', shippingDiscounts='" + shippingDiscounts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCombinesWith that = (DiscountCombinesWith) o;
    return orderDiscounts == that.orderDiscounts &&
        productDiscounts == that.productDiscounts &&
        shippingDiscounts == that.shippingDiscounts;
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderDiscounts, productDiscounts, shippingDiscounts);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the discount combines with the
     * [order discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * class.
     */
    private boolean orderDiscounts;

    /**
     * Whether the discount combines with the
     * [product discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * class.
     */
    private boolean productDiscounts;

    /**
     * Whether the discount combines with the
     * [shipping discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * class.
     */
    private boolean shippingDiscounts;

    public DiscountCombinesWith build() {
      DiscountCombinesWith result = new DiscountCombinesWith();
      result.orderDiscounts = this.orderDiscounts;
      result.productDiscounts = this.productDiscounts;
      result.shippingDiscounts = this.shippingDiscounts;
      return result;
    }

    /**
     * Whether the discount combines with the
     * [order discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * class.
     */
    public Builder orderDiscounts(boolean orderDiscounts) {
      this.orderDiscounts = orderDiscounts;
      return this;
    }

    /**
     * Whether the discount combines with the
     * [product discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * class.
     */
    public Builder productDiscounts(boolean productDiscounts) {
      this.productDiscounts = productDiscounts;
      return this;
    }

    /**
     * Whether the discount combines with the
     * [shipping discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * class.
     */
    public Builder shippingDiscounts(boolean shippingDiscounts) {
      this.shippingDiscounts = shippingDiscounts;
      return this;
    }
  }
}
