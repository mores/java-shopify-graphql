package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class QuantityPriceBreakInput {
  
  private String variantId;

  
  private MoneyInput price;

  
  private int minimumQuantity;

  public QuantityPriceBreakInput() {
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

  
  public int getMinimumQuantity() {
    return minimumQuantity;
  }

  public void setMinimumQuantity(int minimumQuantity) {
    this.minimumQuantity = minimumQuantity;
  }

  @Override
  public String toString() {
    return "QuantityPriceBreakInput{variantId='" + variantId + "', price='" + price + "', minimumQuantity='" + minimumQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuantityPriceBreakInput that = (QuantityPriceBreakInput) o;
    return Objects.equals(variantId, that.variantId) &&
        Objects.equals(price, that.price) &&
        minimumQuantity == that.minimumQuantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(variantId, price, minimumQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String variantId;

    
    private MoneyInput price;

    
    private int minimumQuantity;

    public QuantityPriceBreakInput build() {
      QuantityPriceBreakInput result = new QuantityPriceBreakInput();
      result.variantId = this.variantId;
      result.price = this.price;
      result.minimumQuantity = this.minimumQuantity;
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

    
    public Builder minimumQuantity(int minimumQuantity) {
      this.minimumQuantity = minimumQuantity;
      return this;
    }
  }
}
