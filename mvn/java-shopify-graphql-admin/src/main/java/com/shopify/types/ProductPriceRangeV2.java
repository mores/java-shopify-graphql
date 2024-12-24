package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ProductPriceRangeV2 {
  
  private MoneyV2 maxVariantPrice;

  
  private MoneyV2 minVariantPrice;

  public ProductPriceRangeV2() {
  }

  
  public MoneyV2 getMaxVariantPrice() {
    return maxVariantPrice;
  }

  public void setMaxVariantPrice(MoneyV2 maxVariantPrice) {
    this.maxVariantPrice = maxVariantPrice;
  }

  
  public MoneyV2 getMinVariantPrice() {
    return minVariantPrice;
  }

  public void setMinVariantPrice(MoneyV2 minVariantPrice) {
    this.minVariantPrice = minVariantPrice;
  }

  @Override
  public String toString() {
    return "ProductPriceRangeV2{maxVariantPrice='" + maxVariantPrice + "', minVariantPrice='" + minVariantPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductPriceRangeV2 that = (ProductPriceRangeV2) o;
    return Objects.equals(maxVariantPrice, that.maxVariantPrice) &&
        Objects.equals(minVariantPrice, that.minVariantPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxVariantPrice, minVariantPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 maxVariantPrice;

    
    private MoneyV2 minVariantPrice;

    public ProductPriceRangeV2 build() {
      ProductPriceRangeV2 result = new ProductPriceRangeV2();
      result.maxVariantPrice = this.maxVariantPrice;
      result.minVariantPrice = this.minVariantPrice;
      return result;
    }

    
    public Builder maxVariantPrice(MoneyV2 maxVariantPrice) {
      this.maxVariantPrice = maxVariantPrice;
      return this;
    }

    
    public Builder minVariantPrice(MoneyV2 minVariantPrice) {
      this.minVariantPrice = minVariantPrice;
      return this;
    }
  }
}
