package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ShopPlan {
  
  private String displayName;

  
  private boolean partnerDevelopment;

  
  private boolean shopifyPlus;

  public ShopPlan() {
  }

  
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  public boolean getPartnerDevelopment() {
    return partnerDevelopment;
  }

  public void setPartnerDevelopment(boolean partnerDevelopment) {
    this.partnerDevelopment = partnerDevelopment;
  }

  
  public boolean getShopifyPlus() {
    return shopifyPlus;
  }

  public void setShopifyPlus(boolean shopifyPlus) {
    this.shopifyPlus = shopifyPlus;
  }

  @Override
  public String toString() {
    return "ShopPlan{displayName='" + displayName + "', partnerDevelopment='" + partnerDevelopment + "', shopifyPlus='" + shopifyPlus + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPlan that = (ShopPlan) o;
    return Objects.equals(displayName, that.displayName) &&
        partnerDevelopment == that.partnerDevelopment &&
        shopifyPlus == that.shopifyPlus;
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, partnerDevelopment, shopifyPlus);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String displayName;

    
    private boolean partnerDevelopment;

    
    private boolean shopifyPlus;

    public ShopPlan build() {
      ShopPlan result = new ShopPlan();
      result.displayName = this.displayName;
      result.partnerDevelopment = this.partnerDevelopment;
      result.shopifyPlus = this.shopifyPlus;
      return result;
    }

    
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    
    public Builder partnerDevelopment(boolean partnerDevelopment) {
      this.partnerDevelopment = partnerDevelopment;
      return this;
    }

    
    public Builder shopifyPlus(boolean shopifyPlus) {
      this.shopifyPlus = shopifyPlus;
      return this;
    }
  }
}
