package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for adding and removing
 * [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) and
 * [product variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/productvariant)
 * as prerequisites or as eligible items for a discount.
 */
public class DiscountProductsInput {
  /**
   * The IDs of the products to add as prerequisites or as eligible items for a discount.
   */
  private List<String> productsToAdd;

  /**
   * The IDs of the products to remove as prerequisites or as eligible items for a discount.
   */
  private List<String> productsToRemove;

  /**
   * The IDs of the product variants to add as prerequisites or as eligible items for a discount.
   */
  private List<String> productVariantsToAdd;

  /**
   * The IDs of the product variants to remove as prerequisites or as eligible items for a discount.
   */
  private List<String> productVariantsToRemove;

  public DiscountProductsInput() {
  }

  /**
   * The IDs of the products to add as prerequisites or as eligible items for a discount.
   */
  public List<String> getProductsToAdd() {
    return productsToAdd;
  }

  public void setProductsToAdd(List<String> productsToAdd) {
    this.productsToAdd = productsToAdd;
  }

  /**
   * The IDs of the products to remove as prerequisites or as eligible items for a discount.
   */
  public List<String> getProductsToRemove() {
    return productsToRemove;
  }

  public void setProductsToRemove(List<String> productsToRemove) {
    this.productsToRemove = productsToRemove;
  }

  /**
   * The IDs of the product variants to add as prerequisites or as eligible items for a discount.
   */
  public List<String> getProductVariantsToAdd() {
    return productVariantsToAdd;
  }

  public void setProductVariantsToAdd(List<String> productVariantsToAdd) {
    this.productVariantsToAdd = productVariantsToAdd;
  }

  /**
   * The IDs of the product variants to remove as prerequisites or as eligible items for a discount.
   */
  public List<String> getProductVariantsToRemove() {
    return productVariantsToRemove;
  }

  public void setProductVariantsToRemove(List<String> productVariantsToRemove) {
    this.productVariantsToRemove = productVariantsToRemove;
  }

  @Override
  public String toString() {
    return "DiscountProductsInput{productsToAdd='" + productsToAdd + "', productsToRemove='" + productsToRemove + "', productVariantsToAdd='" + productVariantsToAdd + "', productVariantsToRemove='" + productVariantsToRemove + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountProductsInput that = (DiscountProductsInput) o;
    return Objects.equals(productsToAdd, that.productsToAdd) &&
        Objects.equals(productsToRemove, that.productsToRemove) &&
        Objects.equals(productVariantsToAdd, that.productVariantsToAdd) &&
        Objects.equals(productVariantsToRemove, that.productVariantsToRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productsToAdd, productsToRemove, productVariantsToAdd, productVariantsToRemove);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The IDs of the products to add as prerequisites or as eligible items for a discount.
     */
    private List<String> productsToAdd;

    /**
     * The IDs of the products to remove as prerequisites or as eligible items for a discount.
     */
    private List<String> productsToRemove;

    /**
     * The IDs of the product variants to add as prerequisites or as eligible items for a discount.
     */
    private List<String> productVariantsToAdd;

    /**
     * The IDs of the product variants to remove as prerequisites or as eligible items for a discount.
     */
    private List<String> productVariantsToRemove;

    public DiscountProductsInput build() {
      DiscountProductsInput result = new DiscountProductsInput();
      result.productsToAdd = this.productsToAdd;
      result.productsToRemove = this.productsToRemove;
      result.productVariantsToAdd = this.productVariantsToAdd;
      result.productVariantsToRemove = this.productVariantsToRemove;
      return result;
    }

    /**
     * The IDs of the products to add as prerequisites or as eligible items for a discount.
     */
    public Builder productsToAdd(List<String> productsToAdd) {
      this.productsToAdd = productsToAdd;
      return this;
    }

    /**
     * The IDs of the products to remove as prerequisites or as eligible items for a discount.
     */
    public Builder productsToRemove(List<String> productsToRemove) {
      this.productsToRemove = productsToRemove;
      return this;
    }

    /**
     * The IDs of the product variants to add as prerequisites or as eligible items for a discount.
     */
    public Builder productVariantsToAdd(List<String> productVariantsToAdd) {
      this.productVariantsToAdd = productVariantsToAdd;
      return this;
    }

    /**
     * The IDs of the product variants to remove as prerequisites or as eligible items for a discount.
     */
    public Builder productVariantsToRemove(List<String> productVariantsToRemove) {
      this.productVariantsToRemove = productVariantsToRemove;
      return this;
    }
  }
}
