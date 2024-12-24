package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountItemsInput {
  
  private DiscountProductsInput products;

  
  private DiscountCollectionsInput collections;

  
  private Boolean all;

  public DiscountItemsInput() {
  }

  
  public DiscountProductsInput getProducts() {
    return products;
  }

  public void setProducts(DiscountProductsInput products) {
    this.products = products;
  }

  
  public DiscountCollectionsInput getCollections() {
    return collections;
  }

  public void setCollections(DiscountCollectionsInput collections) {
    this.collections = collections;
  }

  
  public Boolean getAll() {
    return all;
  }

  public void setAll(Boolean all) {
    this.all = all;
  }

  @Override
  public String toString() {
    return "DiscountItemsInput{products='" + products + "', collections='" + collections + "', all='" + all + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountItemsInput that = (DiscountItemsInput) o;
    return Objects.equals(products, that.products) &&
        Objects.equals(collections, that.collections) &&
        Objects.equals(all, that.all);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products, collections, all);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountProductsInput products;

    
    private DiscountCollectionsInput collections;

    
    private Boolean all;

    public DiscountItemsInput build() {
      DiscountItemsInput result = new DiscountItemsInput();
      result.products = this.products;
      result.collections = this.collections;
      result.all = this.all;
      return result;
    }

    
    public Builder products(DiscountProductsInput products) {
      this.products = products;
      return this;
    }

    
    public Builder collections(DiscountCollectionsInput collections) {
      this.collections = collections;
      return this;
    }

    
    public Builder all(Boolean all) {
      this.all = all;
      return this;
    }
  }
}
