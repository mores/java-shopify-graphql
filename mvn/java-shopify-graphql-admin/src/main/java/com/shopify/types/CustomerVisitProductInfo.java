package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CustomerVisitProductInfo {
  
  private Product product;

  
  private int quantity;

  
  private ProductVariant variant;

  public CustomerVisitProductInfo() {
  }

  
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  @Override
  public String toString() {
    return "CustomerVisitProductInfo{product='" + product + "', quantity='" + quantity + "', variant='" + variant + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerVisitProductInfo that = (CustomerVisitProductInfo) o;
    return Objects.equals(product, that.product) &&
        quantity == that.quantity &&
        Objects.equals(variant, that.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, quantity, variant);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Product product;

    
    private int quantity;

    
    private ProductVariant variant;

    public CustomerVisitProductInfo build() {
      CustomerVisitProductInfo result = new CustomerVisitProductInfo();
      result.product = this.product;
      result.quantity = this.quantity;
      result.variant = this.variant;
      return result;
    }

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }
  }
}
