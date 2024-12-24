package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionLineInput {
  
  private String productVariantId;

  
  private int quantity;

  
  private String currentPrice;

  
  private List<AttributeInput> customAttributes;

  
  private String sellingPlanId;

  
  private String sellingPlanName;

  
  private SubscriptionPricingPolicyInput pricingPolicy;

  public SubscriptionLineInput() {
  }

  
  public String getProductVariantId() {
    return productVariantId;
  }

  public void setProductVariantId(String productVariantId) {
    this.productVariantId = productVariantId;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public String getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(String currentPrice) {
    this.currentPrice = currentPrice;
  }

  
  public List<AttributeInput> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<AttributeInput> customAttributes) {
    this.customAttributes = customAttributes;
  }

  
  public String getSellingPlanId() {
    return sellingPlanId;
  }

  public void setSellingPlanId(String sellingPlanId) {
    this.sellingPlanId = sellingPlanId;
  }

  
  public String getSellingPlanName() {
    return sellingPlanName;
  }

  public void setSellingPlanName(String sellingPlanName) {
    this.sellingPlanName = sellingPlanName;
  }

  
  public SubscriptionPricingPolicyInput getPricingPolicy() {
    return pricingPolicy;
  }

  public void setPricingPolicy(SubscriptionPricingPolicyInput pricingPolicy) {
    this.pricingPolicy = pricingPolicy;
  }

  @Override
  public String toString() {
    return "SubscriptionLineInput{productVariantId='" + productVariantId + "', quantity='" + quantity + "', currentPrice='" + currentPrice + "', customAttributes='" + customAttributes + "', sellingPlanId='" + sellingPlanId + "', sellingPlanName='" + sellingPlanName + "', pricingPolicy='" + pricingPolicy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionLineInput that = (SubscriptionLineInput) o;
    return Objects.equals(productVariantId, that.productVariantId) &&
        quantity == that.quantity &&
        Objects.equals(currentPrice, that.currentPrice) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(sellingPlanId, that.sellingPlanId) &&
        Objects.equals(sellingPlanName, that.sellingPlanName) &&
        Objects.equals(pricingPolicy, that.pricingPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVariantId, quantity, currentPrice, customAttributes, sellingPlanId, sellingPlanName, pricingPolicy);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String productVariantId;

    
    private int quantity;

    
    private String currentPrice;

    
    private List<AttributeInput> customAttributes;

    
    private String sellingPlanId;

    
    private String sellingPlanName;

    
    private SubscriptionPricingPolicyInput pricingPolicy;

    public SubscriptionLineInput build() {
      SubscriptionLineInput result = new SubscriptionLineInput();
      result.productVariantId = this.productVariantId;
      result.quantity = this.quantity;
      result.currentPrice = this.currentPrice;
      result.customAttributes = this.customAttributes;
      result.sellingPlanId = this.sellingPlanId;
      result.sellingPlanName = this.sellingPlanName;
      result.pricingPolicy = this.pricingPolicy;
      return result;
    }

    
    public Builder productVariantId(String productVariantId) {
      this.productVariantId = productVariantId;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder currentPrice(String currentPrice) {
      this.currentPrice = currentPrice;
      return this;
    }

    
    public Builder customAttributes(List<AttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    
    public Builder sellingPlanId(String sellingPlanId) {
      this.sellingPlanId = sellingPlanId;
      return this;
    }

    
    public Builder sellingPlanName(String sellingPlanName) {
      this.sellingPlanName = sellingPlanName;
      return this;
    }

    
    public Builder pricingPolicy(SubscriptionPricingPolicyInput pricingPolicy) {
      this.pricingPolicy = pricingPolicy;
      return this;
    }
  }
}
