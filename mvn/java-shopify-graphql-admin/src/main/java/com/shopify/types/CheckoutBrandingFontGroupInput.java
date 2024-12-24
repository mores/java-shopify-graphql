package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingFontGroupInput {
  
  private CheckoutBrandingShopifyFontGroupInput shopifyFontGroup;

  
  private CheckoutBrandingCustomFontGroupInput customFontGroup;

  public CheckoutBrandingFontGroupInput() {
  }

  
  public CheckoutBrandingShopifyFontGroupInput getShopifyFontGroup() {
    return shopifyFontGroup;
  }

  public void setShopifyFontGroup(CheckoutBrandingShopifyFontGroupInput shopifyFontGroup) {
    this.shopifyFontGroup = shopifyFontGroup;
  }

  
  public CheckoutBrandingCustomFontGroupInput getCustomFontGroup() {
    return customFontGroup;
  }

  public void setCustomFontGroup(CheckoutBrandingCustomFontGroupInput customFontGroup) {
    this.customFontGroup = customFontGroup;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingFontGroupInput{shopifyFontGroup='" + shopifyFontGroup + "', customFontGroup='" + customFontGroup + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingFontGroupInput that = (CheckoutBrandingFontGroupInput) o;
    return Objects.equals(shopifyFontGroup, that.shopifyFontGroup) &&
        Objects.equals(customFontGroup, that.customFontGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopifyFontGroup, customFontGroup);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CheckoutBrandingShopifyFontGroupInput shopifyFontGroup;

    
    private CheckoutBrandingCustomFontGroupInput customFontGroup;

    public CheckoutBrandingFontGroupInput build() {
      CheckoutBrandingFontGroupInput result = new CheckoutBrandingFontGroupInput();
      result.shopifyFontGroup = this.shopifyFontGroup;
      result.customFontGroup = this.customFontGroup;
      return result;
    }

    
    public Builder shopifyFontGroup(CheckoutBrandingShopifyFontGroupInput shopifyFontGroup) {
      this.shopifyFontGroup = shopifyFontGroup;
      return this;
    }

    
    public Builder customFontGroup(CheckoutBrandingCustomFontGroupInput customFontGroup) {
      this.customFontGroup = customFontGroup;
      return this;
    }
  }
}
