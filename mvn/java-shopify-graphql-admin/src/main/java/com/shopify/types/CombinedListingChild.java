package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CombinedListingChild {
  
  private ProductVariant parentVariant;

  
  private Product product;

  public CombinedListingChild() {
  }

  
  public ProductVariant getParentVariant() {
    return parentVariant;
  }

  public void setParentVariant(ProductVariant parentVariant) {
    this.parentVariant = parentVariant;
  }

  
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  @Override
  public String toString() {
    return "CombinedListingChild{parentVariant='" + parentVariant + "', product='" + product + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CombinedListingChild that = (CombinedListingChild) o;
    return Objects.equals(parentVariant, that.parentVariant) &&
        Objects.equals(product, that.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentVariant, product);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ProductVariant parentVariant;

    
    private Product product;

    public CombinedListingChild build() {
      CombinedListingChild result = new CombinedListingChild();
      result.parentVariant = this.parentVariant;
      result.product = this.product;
      return result;
    }

    
    public Builder parentVariant(ProductVariant parentVariant) {
      this.parentVariant = parentVariant;
      return this;
    }

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }
  }
}
