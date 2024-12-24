package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PriceListPriceInput {
  
  private String variantId;

  
  private MoneyInput price;

  
  private MoneyInput compareAtPrice;

  public PriceListPriceInput() {
  }

  
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  
  public MoneyInput getPrice() {
    return price;
  }

  public void setPrice(MoneyInput price) {
    this.price = price;
  }

  
  public MoneyInput getCompareAtPrice() {
    return compareAtPrice;
  }

  public void setCompareAtPrice(MoneyInput compareAtPrice) {
    this.compareAtPrice = compareAtPrice;
  }

  @Override
  public String toString() {
    return "PriceListPriceInput{variantId='" + variantId + "', price='" + price + "', compareAtPrice='" + compareAtPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListPriceInput that = (PriceListPriceInput) o;
    return Objects.equals(variantId, that.variantId) &&
        Objects.equals(price, that.price) &&
        Objects.equals(compareAtPrice, that.compareAtPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variantId, price, compareAtPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String variantId;

    
    private MoneyInput price;

    
    private MoneyInput compareAtPrice;

    public PriceListPriceInput build() {
      PriceListPriceInput result = new PriceListPriceInput();
      result.variantId = this.variantId;
      result.price = this.price;
      result.compareAtPrice = this.compareAtPrice;
      return result;
    }

    
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    
    public Builder price(MoneyInput price) {
      this.price = price;
      return this;
    }

    
    public Builder compareAtPrice(MoneyInput compareAtPrice) {
      this.compareAtPrice = compareAtPrice;
      return this;
    }
  }
}
