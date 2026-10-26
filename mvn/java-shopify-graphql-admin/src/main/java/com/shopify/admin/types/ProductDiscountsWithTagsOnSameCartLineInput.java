package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Controls which product discounts can apply together on the same cart line. By
 * default, only one product discount applies per line. Available only on a Shopify
 * Plus plan.
 *
 * For discounts to apply together, they must match tags in both directions. Each
 * discount has two tag sets: the tags that identify the discount, and the tags that
 * it agrees to apply with. Use the `tags` field on the discount input to set the
 * discount's own tags. Use this input object to set the tags that the discount can
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
public class ProductDiscountsWithTagsOnSameCartLineInput {
  /**
   * The tags to add to this discount's combination list. This field doesn't add
   * tags to the discount itself. To change the tags on the discount, use the
   * discount input's `tags` field or the
   * [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
   * and [`tagsRemove`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsremove)
   * mutations.
   *   
   * If another product discount has a matching tag and also allows at least one
   * tag on this discount, then both discounts can apply to the same cart line.
   */
  private List<String> add;

  /**
   * The tags to remove from this discount's combination list. This field doesn't
   * remove tags from the discount itself. To change the tags on the discount, use
   * the discount input's `tags` field or the
   * [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
   * and [`tagsRemove`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsremove)
   * mutations.
   *   
   * If this discount and another product discount still match tags in both
   * directions after the removal, then both discounts can still apply to the same
   * cart line.
   */
  private List<String> remove;

  public ProductDiscountsWithTagsOnSameCartLineInput() {
  }

  /**
   * The tags to add to this discount's combination list. This field doesn't add
   * tags to the discount itself. To change the tags on the discount, use the
   * discount input's `tags` field or the
   * [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
   * and [`tagsRemove`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsremove)
   * mutations.
   *   
   * If another product discount has a matching tag and also allows at least one
   * tag on this discount, then both discounts can apply to the same cart line.
   */
  public List<String> getAdd() {
    return add;
  }

  public void setAdd(List<String> add) {
    this.add = add;
  }

  /**
   * The tags to remove from this discount's combination list. This field doesn't
   * remove tags from the discount itself. To change the tags on the discount, use
   * the discount input's `tags` field or the
   * [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
   * and [`tagsRemove`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsremove)
   * mutations.
   *   
   * If this discount and another product discount still match tags in both
   * directions after the removal, then both discounts can still apply to the same
   * cart line.
   */
  public List<String> getRemove() {
    return remove;
  }

  public void setRemove(List<String> remove) {
    this.remove = remove;
  }

  @Override
  public String toString() {
    return "ProductDiscountsWithTagsOnSameCartLineInput{add='" + add + "', remove='" + remove + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductDiscountsWithTagsOnSameCartLineInput that = (ProductDiscountsWithTagsOnSameCartLineInput) o;
    return Objects.equals(add, that.add) &&
        Objects.equals(remove, that.remove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, remove);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The tags to add to this discount's combination list. This field doesn't add
     * tags to the discount itself. To change the tags on the discount, use the
     * discount input's `tags` field or the
     * [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
     * and [`tagsRemove`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsremove)
     * mutations.
     *   
     * If another product discount has a matching tag and also allows at least one
     * tag on this discount, then both discounts can apply to the same cart line.
     */
    private List<String> add;

    /**
     * The tags to remove from this discount's combination list. This field doesn't
     * remove tags from the discount itself. To change the tags on the discount, use
     * the discount input's `tags` field or the
     * [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
     * and [`tagsRemove`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsremove)
     * mutations.
     *   
     * If this discount and another product discount still match tags in both
     * directions after the removal, then both discounts can still apply to the same
     * cart line.
     */
    private List<String> remove;

    public ProductDiscountsWithTagsOnSameCartLineInput build() {
      ProductDiscountsWithTagsOnSameCartLineInput result = new ProductDiscountsWithTagsOnSameCartLineInput();
      result.add = this.add;
      result.remove = this.remove;
      return result;
    }

    /**
     * The tags to add to this discount's combination list. This field doesn't add
     * tags to the discount itself. To change the tags on the discount, use the
     * discount input's `tags` field or the
     * [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
     * and [`tagsRemove`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsremove)
     * mutations.
     *   
     * If another product discount has a matching tag and also allows at least one
     * tag on this discount, then both discounts can apply to the same cart line.
     */
    public Builder add(List<String> add) {
      this.add = add;
      return this;
    }

    /**
     * The tags to remove from this discount's combination list. This field doesn't
     * remove tags from the discount itself. To change the tags on the discount, use
     * the discount input's `tags` field or the
     * [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
     * and [`tagsRemove`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsremove)
     * mutations.
     *   
     * If this discount and another product discount still match tags in both
     * directions after the removal, then both discounts can still apply to the same
     * cart line.
     */
    public Builder remove(List<String> remove) {
      this.remove = remove;
      return this;
    }
  }
}
