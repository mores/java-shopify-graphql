package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DiscountProductsInput {
  
  private List<String> productsToAdd;

  
  private List<String> productsToRemove;

  
  private List<String> productVariantsToAdd;

  
  private List<String> productVariantsToRemove;

  public DiscountProductsInput() {
  }

  
  public List<String> getProductsToAdd() {
    return productsToAdd;
  }

  public void setProductsToAdd(List<String> productsToAdd) {
    this.productsToAdd = productsToAdd;
  }

  
  public List<String> getProductsToRemove() {
    return productsToRemove;
  }

  public void setProductsToRemove(List<String> productsToRemove) {
    this.productsToRemove = productsToRemove;
  }

  
  public List<String> getProductVariantsToAdd() {
    return productVariantsToAdd;
  }

  public void setProductVariantsToAdd(List<String> productVariantsToAdd) {
    this.productVariantsToAdd = productVariantsToAdd;
  }

  
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
    
    private List<String> productsToAdd;

    
    private List<String> productsToRemove;

    
    private List<String> productVariantsToAdd;

    
    private List<String> productVariantsToRemove;

    public DiscountProductsInput build() {
      DiscountProductsInput result = new DiscountProductsInput();
      result.productsToAdd = this.productsToAdd;
      result.productsToRemove = this.productsToRemove;
      result.productVariantsToAdd = this.productVariantsToAdd;
      result.productVariantsToRemove = this.productVariantsToRemove;
      return result;
    }

    
    public Builder productsToAdd(List<String> productsToAdd) {
      this.productsToAdd = productsToAdd;
      return this;
    }

    
    public Builder productsToRemove(List<String> productsToRemove) {
      this.productsToRemove = productsToRemove;
      return this;
    }

    
    public Builder productVariantsToAdd(List<String> productVariantsToAdd) {
      this.productVariantsToAdd = productVariantsToAdd;
      return this;
    }

    
    public Builder productVariantsToRemove(List<String> productVariantsToRemove) {
      this.productVariantsToRemove = productVariantsToRemove;
      return this;
    }
  }
}
