package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the items attached to a discount. You can specify the discount items by product ID or collection ID.
 */
public class DiscountItemsInput {
  /**
   * The products and product variants that are attached to a discount.
   */
  private DiscountProductsInput products;

  /**
   * The collections that are attached to a discount.
   */
  private DiscountCollectionsInput collections;

  /**
   * Whether all items should be selected.
   */
  private Boolean all;

  public DiscountItemsInput() {
  }

  /**
   * The products and product variants that are attached to a discount.
   */
  public DiscountProductsInput getProducts() {
    return products;
  }

  public void setProducts(DiscountProductsInput products) {
    this.products = products;
  }

  /**
   * The collections that are attached to a discount.
   */
  public DiscountCollectionsInput getCollections() {
    return collections;
  }

  public void setCollections(DiscountCollectionsInput collections) {
    this.collections = collections;
  }

  /**
   * Whether all items should be selected.
   */
  public Boolean getAll() {
    return all;
  }

  public void setAll(Boolean all) {
    this.all = all;
  }

  @Override
  public String toString() {
    return "DiscountItemsInput{products='" + products + "', collections='" + collections + "', all='" + all + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountItemsInput that = (DiscountItemsInput) o;
    return Objects.equals(products, that.products) &&
        Objects.equals(collections, that.collections) &&
        Objects.equals(all, that.all);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products, collections, all);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The products and product variants that are attached to a discount.
     */
    private DiscountProductsInput products;

    /**
     * The collections that are attached to a discount.
     */
    private DiscountCollectionsInput collections;

    /**
     * Whether all items should be selected.
     */
    private Boolean all;

    public DiscountItemsInput build() {
      DiscountItemsInput result = new DiscountItemsInput();
      result.products = this.products;
      result.collections = this.collections;
      result.all = this.all;
      return result;
    }

    /**
     * The products and product variants that are attached to a discount.
     */
    public Builder products(DiscountProductsInput products) {
      this.products = products;
      return this;
    }

    /**
     * The collections that are attached to a discount.
     */
    public Builder collections(DiscountCollectionsInput collections) {
      this.collections = collections;
      return this;
    }

    /**
     * Whether all items should be selected.
     */
    public Builder all(Boolean all) {
      this.all = all;
      return this;
    }
  }
}
