package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to determine which discount classes the discount can combine with.
 */
public class DiscountCombinesWithInput {
  /**
   * Whether the discount combines with the
   * [product discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * class.
   */
  private Boolean productDiscounts = false;

  /**
   * Whether the discount combines with the
   * [order discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * class.
   */
  private Boolean orderDiscounts = false;

  /**
   * Whether the discount combines
   * with the
   * [shipping discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * class.
   */
  private Boolean shippingDiscounts = false;

  public DiscountCombinesWithInput() {
  }

  /**
   * Whether the discount combines with the
   * [product discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * class.
   */
  public Boolean getProductDiscounts() {
    return productDiscounts;
  }

  public void setProductDiscounts(Boolean productDiscounts) {
    this.productDiscounts = productDiscounts;
  }

  /**
   * Whether the discount combines with the
   * [order discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * class.
   */
  public Boolean getOrderDiscounts() {
    return orderDiscounts;
  }

  public void setOrderDiscounts(Boolean orderDiscounts) {
    this.orderDiscounts = orderDiscounts;
  }

  /**
   * Whether the discount combines
   * with the
   * [shipping discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * class.
   */
  public Boolean getShippingDiscounts() {
    return shippingDiscounts;
  }

  public void setShippingDiscounts(Boolean shippingDiscounts) {
    this.shippingDiscounts = shippingDiscounts;
  }

  @Override
  public String toString() {
    return "DiscountCombinesWithInput{productDiscounts='" + productDiscounts + "', orderDiscounts='" + orderDiscounts + "', shippingDiscounts='" + shippingDiscounts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCombinesWithInput that = (DiscountCombinesWithInput) o;
    return Objects.equals(productDiscounts, that.productDiscounts) &&
        Objects.equals(orderDiscounts, that.orderDiscounts) &&
        Objects.equals(shippingDiscounts, that.shippingDiscounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productDiscounts, orderDiscounts, shippingDiscounts);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the discount combines with the
     * [product discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * class.
     */
    private Boolean productDiscounts = false;

    /**
     * Whether the discount combines with the
     * [order discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * class.
     */
    private Boolean orderDiscounts = false;

    /**
     * Whether the discount combines
     * with the
     * [shipping discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * class.
     */
    private Boolean shippingDiscounts = false;

    public DiscountCombinesWithInput build() {
      DiscountCombinesWithInput result = new DiscountCombinesWithInput();
      result.productDiscounts = this.productDiscounts;
      result.orderDiscounts = this.orderDiscounts;
      result.shippingDiscounts = this.shippingDiscounts;
      return result;
    }

    /**
     * Whether the discount combines with the
     * [product discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * class.
     */
    public Builder productDiscounts(Boolean productDiscounts) {
      this.productDiscounts = productDiscounts;
      return this;
    }

    /**
     * Whether the discount combines with the
     * [order discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * class.
     */
    public Builder orderDiscounts(Boolean orderDiscounts) {
      this.orderDiscounts = orderDiscounts;
      return this;
    }

    /**
     * Whether the discount combines
     * with the
     * [shipping discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * class.
     */
    public Builder shippingDiscounts(Boolean shippingDiscounts) {
      this.shippingDiscounts = shippingDiscounts;
      return this;
    }
  }
}
