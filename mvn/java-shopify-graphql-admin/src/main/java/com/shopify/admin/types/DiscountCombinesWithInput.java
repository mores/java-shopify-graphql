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

  /**
   * Controls which product discounts can apply together on the same cart line. By
   * default, only one product discount applies per line. Available only on a Shopify
   * Plus plan and requires the `productDiscounts` field to be set to `true`.
   *   
   * For discounts to apply together, they must match tags in both directions. Each
   * discount has two tag sets: the tags that identify the discount, and the tags that
   * it agrees to apply with. Use the `tags` field on the discount input to set the
   * discount's own tags. Use this field to set the tags that the discount can apply
   * with. Two discounts apply together only if each one allows at least one tag that
   * the other is tagged with. Any number of product discounts can apply to the same
   * line if this two-way match holds for every pair in the group.
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
  private ProductDiscountsWithTagsOnSameCartLineInput productDiscountsWithTagsOnSameCartLine;

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

  /**
   * Controls which product discounts can apply together on the same cart line. By
   * default, only one product discount applies per line. Available only on a Shopify
   * Plus plan and requires the `productDiscounts` field to be set to `true`.
   *   
   * For discounts to apply together, they must match tags in both directions. Each
   * discount has two tag sets: the tags that identify the discount, and the tags that
   * it agrees to apply with. Use the `tags` field on the discount input to set the
   * discount's own tags. Use this field to set the tags that the discount can apply
   * with. Two discounts apply together only if each one allows at least one tag that
   * the other is tagged with. Any number of product discounts can apply to the same
   * line if this two-way match holds for every pair in the group.
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
  public ProductDiscountsWithTagsOnSameCartLineInput getProductDiscountsWithTagsOnSameCartLine() {
    return productDiscountsWithTagsOnSameCartLine;
  }

  public void setProductDiscountsWithTagsOnSameCartLine(
      ProductDiscountsWithTagsOnSameCartLineInput productDiscountsWithTagsOnSameCartLine) {
    this.productDiscountsWithTagsOnSameCartLine = productDiscountsWithTagsOnSameCartLine;
  }

  @Override
  public String toString() {
    return "DiscountCombinesWithInput{productDiscounts='" + productDiscounts + "', orderDiscounts='" + orderDiscounts + "', shippingDiscounts='" + shippingDiscounts + "', productDiscountsWithTagsOnSameCartLine='" + productDiscountsWithTagsOnSameCartLine + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCombinesWithInput that = (DiscountCombinesWithInput) o;
    return Objects.equals(productDiscounts, that.productDiscounts) &&
        Objects.equals(orderDiscounts, that.orderDiscounts) &&
        Objects.equals(shippingDiscounts, that.shippingDiscounts) &&
        Objects.equals(productDiscountsWithTagsOnSameCartLine, that.productDiscountsWithTagsOnSameCartLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productDiscounts, orderDiscounts, shippingDiscounts, productDiscountsWithTagsOnSameCartLine);
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

    /**
     * Controls which product discounts can apply together on the same cart line. By
     * default, only one product discount applies per line. Available only on a Shopify
     * Plus plan and requires the `productDiscounts` field to be set to `true`.
     *   
     * For discounts to apply together, they must match tags in both directions. Each
     * discount has two tag sets: the tags that identify the discount, and the tags that
     * it agrees to apply with. Use the `tags` field on the discount input to set the
     * discount's own tags. Use this field to set the tags that the discount can apply
     * with. Two discounts apply together only if each one allows at least one tag that
     * the other is tagged with. Any number of product discounts can apply to the same
     * line if this two-way match holds for every pair in the group.
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
    private ProductDiscountsWithTagsOnSameCartLineInput productDiscountsWithTagsOnSameCartLine;

    public DiscountCombinesWithInput build() {
      DiscountCombinesWithInput result = new DiscountCombinesWithInput();
      result.productDiscounts = this.productDiscounts;
      result.orderDiscounts = this.orderDiscounts;
      result.shippingDiscounts = this.shippingDiscounts;
      result.productDiscountsWithTagsOnSameCartLine = this.productDiscountsWithTagsOnSameCartLine;
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

    /**
     * Controls which product discounts can apply together on the same cart line. By
     * default, only one product discount applies per line. Available only on a Shopify
     * Plus plan and requires the `productDiscounts` field to be set to `true`.
     *   
     * For discounts to apply together, they must match tags in both directions. Each
     * discount has two tag sets: the tags that identify the discount, and the tags that
     * it agrees to apply with. Use the `tags` field on the discount input to set the
     * discount's own tags. Use this field to set the tags that the discount can apply
     * with. Two discounts apply together only if each one allows at least one tag that
     * the other is tagged with. Any number of product discounts can apply to the same
     * line if this two-way match holds for every pair in the group.
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
        ProductDiscountsWithTagsOnSameCartLineInput productDiscountsWithTagsOnSameCartLine) {
      this.productDiscountsWithTagsOnSameCartLine = productDiscountsWithTagsOnSameCartLine;
      return this;
    }
  }
}
