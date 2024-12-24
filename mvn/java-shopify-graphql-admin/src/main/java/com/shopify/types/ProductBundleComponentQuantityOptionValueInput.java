package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ProductBundleComponentQuantityOptionValueInput {
  
  private String name;

  
  private int quantity;

  public ProductBundleComponentQuantityOptionValueInput() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "ProductBundleComponentQuantityOptionValueInput{name='" + name + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleComponentQuantityOptionValueInput that = (ProductBundleComponentQuantityOptionValueInput) o;
    return Objects.equals(name, that.name) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private int quantity;

    public ProductBundleComponentQuantityOptionValueInput build() {
      ProductBundleComponentQuantityOptionValueInput result = new ProductBundleComponentQuantityOptionValueInput();
      result.name = this.name;
      result.quantity = this.quantity;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
