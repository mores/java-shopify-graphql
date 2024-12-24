package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ProductCategory {
  
  private ProductTaxonomyNode productTaxonomyNode;

  public ProductCategory() {
  }

  
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
    
    private ProductTaxonomyNode productTaxonomyNode;

    public ProductCategory build() {
      ProductCategory result = new ProductCategory();
      result.productTaxonomyNode = this.productTaxonomyNode;
      return result;
    }

    
    public Builder productTaxonomyNode(ProductTaxonomyNode productTaxonomyNode) {
      this.productTaxonomyNode = productTaxonomyNode;
      return this;
    }
  }
}
