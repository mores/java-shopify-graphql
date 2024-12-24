package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PriceListProductPriceInput {
  
  private String productId;

  
  private MoneyInput price;

  public PriceListProductPriceInput() {
  }

  
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  public MoneyInput getPrice() {
    return price;
  }

  public void setPrice(MoneyInput price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "PriceListProductPriceInput{productId='" + productId + "', price='" + price + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListProductPriceInput that = (PriceListProductPriceInput) o;
    return Objects.equals(productId, that.productId) &&
        Objects.equals(price, that.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, price);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String productId;

    
    private MoneyInput price;

    public PriceListProductPriceInput build() {
      PriceListProductPriceInput result = new PriceListProductPriceInput();
      result.productId = this.productId;
      result.price = this.price;
      return result;
    }

    
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    
    public Builder price(MoneyInput price) {
      this.price = price;
      return this;
    }
  }
}
