package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the details of a specific type of product within the [Shopify product taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
 */
public class StandardizedProductType {
  /**
   * The product taxonomy node associated with the standardized product type.
   */
  private ProductTaxonomyNode productTaxonomyNode;

  public StandardizedProductType() {
  }

  /**
   * The product taxonomy node associated with the standardized product type.
   */
  public ProductTaxonomyNode getProductTaxonomyNode() {
    return productTaxonomyNode;
  }

  public void setProductTaxonomyNode(ProductTaxonomyNode productTaxonomyNode) {
    this.productTaxonomyNode = productTaxonomyNode;
  }

  @Override
  public String toString() {
    return "StandardizedProductType{productTaxonomyNode='" + productTaxonomyNode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StandardizedProductType that = (StandardizedProductType) o;
    return Objects.equals(productTaxonomyNode, that.productTaxonomyNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productTaxonomyNode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The product taxonomy node associated with the standardized product type.
     */
    private ProductTaxonomyNode productTaxonomyNode;

    public StandardizedProductType build() {
      StandardizedProductType result = new StandardizedProductType();
      result.productTaxonomyNode = this.productTaxonomyNode;
      return result;
    }

    /**
     * The product taxonomy node associated with the standardized product type.
     */
    public Builder productTaxonomyNode(ProductTaxonomyNode productTaxonomyNode) {
      this.productTaxonomyNode = productTaxonomyNode;
      return this;
    }
  }
}
