package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionContractProductChangeInput {
  
  private String productVariantId;

  
  private String currentPrice;

  public SubscriptionContractProductChangeInput() {
  }

  
  public String getProductVariantId() {
    return productVariantId;
  }

  public void setProductVariantId(String productVariantId) {
    this.productVariantId = productVariantId;
  }

  
  public String getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(String currentPrice) {
    this.currentPrice = currentPrice;
  }

  @Override
  public String toString() {
    return "SubscriptionContractProductChangeInput{productVariantId='" + productVariantId + "', currentPrice='" + currentPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractProductChangeInput that = (SubscriptionContractProductChangeInput) o;
    return Objects.equals(productVariantId, that.productVariantId) &&
        Objects.equals(currentPrice, that.currentPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVariantId, currentPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String productVariantId;

    
    private String currentPrice;

    public SubscriptionContractProductChangeInput build() {
      SubscriptionContractProductChangeInput result = new SubscriptionContractProductChangeInput();
      result.productVariantId = this.productVariantId;
      result.currentPrice = this.currentPrice;
      return result;
    }

    
    public Builder productVariantId(String productVariantId) {
      this.productVariantId = productVariantId;
      return this;
    }

    
    public Builder currentPrice(String currentPrice) {
      this.currentPrice = currentPrice;
      return this;
    }
  }
}
