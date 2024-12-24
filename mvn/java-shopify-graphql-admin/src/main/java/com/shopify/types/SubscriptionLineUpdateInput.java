package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionLineUpdateInput {
  
  private String productVariantId;

  
  private Integer quantity;

  
  private String sellingPlanId;

  
  private String sellingPlanName;

  
  private String currentPrice;

  
  private List<AttributeInput> customAttributes;

  
  private SubscriptionPricingPolicyInput pricingPolicy;

  public SubscriptionLineUpdateInput() {
  }

  
  public String getProductVariantId() {
    return productVariantId;
  }

  public void setProductVariantId(String productVariantId) {
    this.productVariantId = productVariantId;
  }

  
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
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

  
  public SubscriptionPricingPolicyInput getPricingPolicy() {
    return pricingPolicy;
  }

  public void setPricingPolicy(SubscriptionPricingPolicyInput pricingPolicy) {
    this.pricingPolicy = pricingPolicy;
  }

  @Override
  public String toString() {
    return "SubscriptionLineUpdateInput{productVariantId='" + productVariantId + "', quantity='" + quantity + "', sellingPlanId='" + sellingPlanId + "', sellingPlanName='" + sellingPlanName + "', currentPrice='" + currentPrice + "', customAttributes='" + customAttributes + "', pricingPolicy='" + pricingPolicy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionLineUpdateInput that = (SubscriptionLineUpdateInput) o;
    return Objects.equals(productVariantId, that.productVariantId) &&
        Objects.equals(quantity, that.quantity) &&
        Objects.equals(sellingPlanId, that.sellingPlanId) &&
        Objects.equals(sellingPlanName, that.sellingPlanName) &&
        Objects.equals(currentPrice, that.currentPrice) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(pricingPolicy, that.pricingPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVariantId, quantity, sellingPlanId, sellingPlanName, currentPrice, customAttributes, pricingPolicy);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String productVariantId;

    
    private Integer quantity;

    
    private String sellingPlanId;

    
    private String sellingPlanName;

    
    private String currentPrice;

    
    private List<AttributeInput> customAttributes;

    
    private SubscriptionPricingPolicyInput pricingPolicy;

    public SubscriptionLineUpdateInput build() {
      SubscriptionLineUpdateInput result = new SubscriptionLineUpdateInput();
      result.productVariantId = this.productVariantId;
      result.quantity = this.quantity;
      result.sellingPlanId = this.sellingPlanId;
      result.sellingPlanName = this.sellingPlanName;
      result.currentPrice = this.currentPrice;
      result.customAttributes = this.customAttributes;
      result.pricingPolicy = this.pricingPolicy;
      return result;
    }

    
    public Builder productVariantId(String productVariantId) {
      this.productVariantId = productVariantId;
      return this;
    }

    
    public Builder quantity(Integer quantity) {
      this.quantity = quantity;
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

    
    public Builder currentPrice(String currentPrice) {
      this.currentPrice = currentPrice;
      return this;
    }

    
    public Builder customAttributes(List<AttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    
    public Builder pricingPolicy(SubscriptionPricingPolicyInput pricingPolicy) {
      this.pricingPolicy = pricingPolicy;
      return this;
    }
  }
}
