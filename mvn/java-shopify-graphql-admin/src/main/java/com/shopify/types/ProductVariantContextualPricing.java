package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ProductVariantContextualPricing {
  
  private MoneyV2 compareAtPrice;

  
  private MoneyV2 price;

  
  private QuantityPriceBreakConnection quantityPriceBreaks;

  
  private QuantityRule quantityRule;

  public ProductVariantContextualPricing() {
  }

  
  public MoneyV2 getCompareAtPrice() {
    return compareAtPrice;
  }

  public void setCompareAtPrice(MoneyV2 compareAtPrice) {
    this.compareAtPrice = compareAtPrice;
  }

  
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  
  public QuantityPriceBreakConnection getQuantityPriceBreaks() {
    return quantityPriceBreaks;
  }

  public void setQuantityPriceBreaks(QuantityPriceBreakConnection quantityPriceBreaks) {
    this.quantityPriceBreaks = quantityPriceBreaks;
  }

  
  public QuantityRule getQuantityRule() {
    return quantityRule;
  }

  public void setQuantityRule(QuantityRule quantityRule) {
    this.quantityRule = quantityRule;
  }

  @Override
  public String toString() {
    return "ProductVariantContextualPricing{compareAtPrice='" + compareAtPrice + "', price='" + price + "', quantityPriceBreaks='" + quantityPriceBreaks + "', quantityRule='" + quantityRule + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantContextualPricing that = (ProductVariantContextualPricing) o;
    return Objects.equals(compareAtPrice, that.compareAtPrice) &&
        Objects.equals(price, that.price) &&
        Objects.equals(quantityPriceBreaks, that.quantityPriceBreaks) &&
        Objects.equals(quantityRule, that.quantityRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compareAtPrice, price, quantityPriceBreaks, quantityRule);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 compareAtPrice;

    
    private MoneyV2 price;

    
    private QuantityPriceBreakConnection quantityPriceBreaks;

    
    private QuantityRule quantityRule;

    public ProductVariantContextualPricing build() {
      ProductVariantContextualPricing result = new ProductVariantContextualPricing();
      result.compareAtPrice = this.compareAtPrice;
      result.price = this.price;
      result.quantityPriceBreaks = this.quantityPriceBreaks;
      result.quantityRule = this.quantityRule;
      return result;
    }

    
    public Builder compareAtPrice(MoneyV2 compareAtPrice) {
      this.compareAtPrice = compareAtPrice;
      return this;
    }

    
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }

    
    public Builder quantityPriceBreaks(QuantityPriceBreakConnection quantityPriceBreaks) {
      this.quantityPriceBreaks = quantityPriceBreaks;
      return this;
    }

    
    public Builder quantityRule(QuantityRule quantityRule) {
      this.quantityRule = quantityRule;
      return this;
    }
  }
}
