package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The details of a specific product category within the [Shopify product taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
 */
public class ProductCategory {
  /**
   * The product taxonomy node associated with the product category.
   */
  private ProductTaxonomyNode productTaxonomyNode;

  public ProductCategory() {
  }

  /**
   * The product taxonomy node associated with the product category.
   */
  public ProductTaxonomyNode getProductTaxonomyNode() {
    return productTaxonomyNode;
  }

  public void setProductTaxonomyNode(ProductTaxonomyNode productTaxonomyNode) {
    this.productTaxonomyNode = productTaxonomyNode;
  }

  @Override
  public String toString() {
    return "ProductCategory{productTaxonomyNode='" + productTaxonomyNode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductCategory that = (ProductCategory) o;
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
     * The product taxonomy node associated with the product category.
     */
    private ProductTaxonomyNode productTaxonomyNode;

    public ProductCategory build() {
      ProductCategory result = new ProductCategory();
      result.productTaxonomyNode = this.productTaxonomyNode;
      return result;
    }

    /**
     * The product taxonomy node associated with the product category.
     */
    public Builder productTaxonomyNode(ProductTaxonomyNode productTaxonomyNode) {
      this.productTaxonomyNode = productTaxonomyNode;
      return this;
    }
  }
}
