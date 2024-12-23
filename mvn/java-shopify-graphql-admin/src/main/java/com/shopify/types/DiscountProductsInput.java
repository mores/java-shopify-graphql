package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for the products and product variants attached to a discount.
 */
public class DiscountProductsInput {
  /**
   * Specifies list of product ids to add.
   */
  private List<String> productsToAdd;

  /**
   * Specifies list of product ids to remove.
   */
  private List<String> productsToRemove;

  /**
   * Specifies list of product variant ids to add.
   */
  private List<String> productVariantsToAdd;

  /**
   * Specifies list of product variant ids to remove.
   */
  private List<String> productVariantsToRemove;

  public DiscountProductsInput() {
  }

  /**
   * Specifies list of product ids to add.
   */
  public List<String> getProductsToAdd() {
    return productsToAdd;
  }

  public void setProductsToAdd(List<String> productsToAdd) {
    this.productsToAdd = productsToAdd;
  }

  /**
   * Specifies list of product ids to remove.
   */
  public List<String> getProductsToRemove() {
    return productsToRemove;
  }

  public void setProductsToRemove(List<String> productsToRemove) {
    this.productsToRemove = productsToRemove;
  }

  /**
   * Specifies list of product variant ids to add.
   */
  public List<String> getProductVariantsToAdd() {
    return productVariantsToAdd;
  }

  public void setProductVariantsToAdd(List<String> productVariantsToAdd) {
    this.productVariantsToAdd = productVariantsToAdd;
  }

  /**
   * Specifies list of product variant ids to remove.
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
     * Specifies list of product ids to add.
     */
    private List<String> productsToAdd;

    /**
     * Specifies list of product ids to remove.
     */
    private List<String> productsToRemove;

    /**
     * Specifies list of product variant ids to add.
     */
    private List<String> productVariantsToAdd;

    /**
     * Specifies list of product variant ids to remove.
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
     * Specifies list of product ids to add.
     */
    public Builder productsToAdd(List<String> productsToAdd) {
      this.productsToAdd = productsToAdd;
      return this;
    }

    /**
     * Specifies list of product ids to remove.
     */
    public Builder productsToRemove(List<String> productsToRemove) {
      this.productsToRemove = productsToRemove;
      return this;
    }

    /**
     * Specifies list of product variant ids to add.
     */
    public Builder productVariantsToAdd(List<String> productVariantsToAdd) {
      this.productVariantsToAdd = productVariantsToAdd;
      return this;
    }

    /**
     * Specifies list of product variant ids to remove.
     */
    public Builder productVariantsToRemove(List<String> productVariantsToRemove) {
      this.productVariantsToRemove = productVariantsToRemove;
      return this;
    }
  }
}
