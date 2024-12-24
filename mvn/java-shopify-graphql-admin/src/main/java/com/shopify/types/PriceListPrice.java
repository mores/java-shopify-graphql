package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PriceListPrice {
  
  private MoneyV2 compareAtPrice;

  
  private PriceListPriceOriginType originType;

  
  private MoneyV2 price;

  
  private QuantityPriceBreakConnection quantityPriceBreaks;

  
  private ProductVariant variant;

  public PriceListPrice() {
  }

  
  public MoneyV2 getCompareAtPrice() {
    return compareAtPrice;
  }

  public void setCompareAtPrice(MoneyV2 compareAtPrice) {
    this.compareAtPrice = compareAtPrice;
  }

  
  public PriceListPriceOriginType getOriginType() {
    return originType;
  }

  public void setOriginType(PriceListPriceOriginType originType) {
    this.originType = originType;
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

  
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  @Override
  public String toString() {
    return "PriceListPrice{compareAtPrice='" + compareAtPrice + "', originType='" + originType + "', price='" + price + "', quantityPriceBreaks='" + quantityPriceBreaks + "', variant='" + variant + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListPrice that = (PriceListPrice) o;
    return Objects.equals(compareAtPrice, that.compareAtPrice) &&
        Objects.equals(originType, that.originType) &&
        Objects.equals(price, that.price) &&
        Objects.equals(quantityPriceBreaks, that.quantityPriceBreaks) &&
        Objects.equals(variant, that.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compareAtPrice, originType, price, quantityPriceBreaks, variant);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 compareAtPrice;

    
    private PriceListPriceOriginType originType;

    
    private MoneyV2 price;

    
    private QuantityPriceBreakConnection quantityPriceBreaks;

    
    private ProductVariant variant;

    public PriceListPrice build() {
      PriceListPrice result = new PriceListPrice();
      result.compareAtPrice = this.compareAtPrice;
      result.originType = this.originType;
      result.price = this.price;
      result.quantityPriceBreaks = this.quantityPriceBreaks;
      result.variant = this.variant;
      return result;
    }

    
    public Builder compareAtPrice(MoneyV2 compareAtPrice) {
      this.compareAtPrice = compareAtPrice;
      return this;
    }

    
    public Builder originType(PriceListPriceOriginType originType) {
      this.originType = originType;
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

    
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }
  }
}
