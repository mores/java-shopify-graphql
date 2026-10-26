package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
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
   * Controls which product discounts can apply together on the same cart line. By
   * default, only one product discount applies per line. Available only on a Shopify
   * Plus plan and requires the `productDiscounts` field to be set to `true`.
   *   
   * For discounts to apply together, they must match tags in both directions. Each
   * discount has two tag sets: the tags that identify the discount, and the tags that
   * it agrees to apply with. Use the `tags` field on the discount input to set the
   * discount's own tags. This field returns the tags that this discount agrees to
   * apply with. Two discounts apply together only if each one allows at least one tag
   * that the other is tagged with. Any number of product discounts can apply to the
   * same line if this two-way match holds for every pair in the group.
   *   
   * Example: Discount A is tagged with `LOYALTY` and allows `SEASONAL`, and Discount B
   * is tagged with `SEASONAL` and allows `LOYALTY`. They apply together. To add a
   * third discount, it must meet the same mutual-match rule with both A and B.
   *   
   * Buy X Get Y discounts stack only on the customer-gets products (GY), not the
   * customer-buys products (BX). See
   * [Limitations for discount combinations](https://help.shopify.com/manual/discounts/discount-combinations#considerations)
   * for details.
   */
  private List<String> productDiscountsWithTagsOnSameCartLine;

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
   * Controls which product discounts can apply together on the same cart line. By
   * default, only one product discount applies per line. Available only on a Shopify
   * Plus plan and requires the `productDiscounts` field to be set to `true`.
   *   
   * For discounts to apply together, they must match tags in both directions. Each
   * discount has two tag sets: the tags that identify the discount, and the tags that
   * it agrees to apply with. Use the `tags` field on the discount input to set the
   * discount's own tags. This field returns the tags that this discount agrees to
   * apply with. Two discounts apply together only if each one allows at least one tag
   * that the other is tagged with. Any number of product discounts can apply to the
   * same line if this two-way match holds for every pair in the group.
   *   
   * Example: Discount A is tagged with `LOYALTY` and allows `SEASONAL`, and Discount B
   * is tagged with `SEASONAL` and allows `LOYALTY`. They apply together. To add a
   * third discount, it must meet the same mutual-match rule with both A and B.
   *   
   * Buy X Get Y discounts stack only on the customer-gets products (GY), not the
   * customer-buys products (BX). See
   * [Limitations for discount combinations](https://help.shopify.com/manual/discounts/discount-combinations#considerations)
   * for details.
   */
  public List<String> getProductDiscountsWithTagsOnSameCartLine() {
    return productDiscountsWithTagsOnSameCartLine;
  }

  public void setProductDiscountsWithTagsOnSameCartLine(
      List<String> productDiscountsWithTagsOnSameCartLine) {
    this.productDiscountsWithTagsOnSameCartLine = productDiscountsWithTagsOnSameCartLine;
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
    return "DiscountCombinesWith{orderDiscounts='" + orderDiscounts + "', productDiscounts='" + productDiscounts + "', productDiscountsWithTagsOnSameCartLine='" + productDiscountsWithTagsOnSameCartLine + "', shippingDiscounts='" + shippingDiscounts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCombinesWith that = (DiscountCombinesWith) o;
    return orderDiscounts == that.orderDiscounts &&
        productDiscounts == that.productDiscounts &&
        Objects.equals(productDiscountsWithTagsOnSameCartLine, that.productDiscountsWithTagsOnSameCartLine) &&
        shippingDiscounts == that.shippingDiscounts;
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderDiscounts, productDiscounts, productDiscountsWithTagsOnSameCartLine, shippingDiscounts);
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
     * Controls which product discounts can apply together on the same cart line. By
     * default, only one product discount applies per line. Available only on a Shopify
     * Plus plan and requires the `productDiscounts` field to be set to `true`.
     *   
     * For discounts to apply together, they must match tags in both directions. Each
     * discount has two tag sets: the tags that identify the discount, and the tags that
     * it agrees to apply with. Use the `tags` field on the discount input to set the
     * discount's own tags. This field returns the tags that this discount agrees to
     * apply with. Two discounts apply together only if each one allows at least one tag
     * that the other is tagged with. Any number of product discounts can apply to the
     * same line if this two-way match holds for every pair in the group.
     *   
     * Example: Discount A is tagged with `LOYALTY` and allows `SEASONAL`, and Discount B
     * is tagged with `SEASONAL` and allows `LOYALTY`. They apply together. To add a
     * third discount, it must meet the same mutual-match rule with both A and B.
     *   
     * Buy X Get Y discounts stack only on the customer-gets products (GY), not the
     * customer-buys products (BX). See
     * [Limitations for discount combinations](https://help.shopify.com/manual/discounts/discount-combinations#considerations)
     * for details.
     */
    private List<String> productDiscountsWithTagsOnSameCartLine;

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
      result.productDiscountsWithTagsOnSameCartLine = this.productDiscountsWithTagsOnSameCartLine;
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
     * Controls which product discounts can apply together on the same cart line. By
     * default, only one product discount applies per line. Available only on a Shopify
     * Plus plan and requires the `productDiscounts` field to be set to `true`.
     *   
     * For discounts to apply together, they must match tags in both directions. Each
     * discount has two tag sets: the tags that identify the discount, and the tags that
     * it agrees to apply with. Use the `tags` field on the discount input to set the
     * discount's own tags. This field returns the tags that this discount agrees to
     * apply with. Two discounts apply together only if each one allows at least one tag
     * that the other is tagged with. Any number of product discounts can apply to the
     * same line if this two-way match holds for every pair in the group.
     *   
     * Example: Discount A is tagged with `LOYALTY` and allows `SEASONAL`, and Discount B
     * is tagged with `SEASONAL` and allows `LOYALTY`. They apply together. To add a
     * third discount, it must meet the same mutual-match rule with both A and B.
     *   
     * Buy X Get Y discounts stack only on the customer-gets products (GY), not the
     * customer-buys products (BX). See
     * [Limitations for discount combinations](https://help.shopify.com/manual/discounts/discount-combinations#considerations)
     * for details.
     */
    public Builder productDiscountsWithTagsOnSameCartLine(
        List<String> productDiscountsWithTagsOnSameCartLine) {
      this.productDiscountsWithTagsOnSameCartLine = productDiscountsWithTagsOnSameCartLine;
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
