package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class StandardizedProductType {
  
  private ProductTaxonomyNode productTaxonomyNode;

  public StandardizedProductType() {
  }

  
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
    
    private ProductTaxonomyNode productTaxonomyNode;

    public StandardizedProductType build() {
      StandardizedProductType result = new StandardizedProductType();
      result.productTaxonomyNode = this.productTaxonomyNode;
      return result;
    }

    
    public Builder productTaxonomyNode(ProductTaxonomyNode productTaxonomyNode) {
      this.productTaxonomyNode = productTaxonomyNode;
      return this;
    }
  }
}
