package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CheckoutBrandingShopifyFontGroupInput {
  
  private String name;

  
  private Integer baseWeight;

  
  private Integer boldWeight;

  
  private CheckoutBrandingFontLoadingStrategy loadingStrategy;

  public CheckoutBrandingShopifyFontGroupInput() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public Integer getBaseWeight() {
    return baseWeight;
  }

  public void setBaseWeight(Integer baseWeight) {
    this.baseWeight = baseWeight;
  }

  
  public Integer getBoldWeight() {
    return boldWeight;
  }

  public void setBoldWeight(Integer boldWeight) {
    this.boldWeight = boldWeight;
  }

  
  public CheckoutBrandingFontLoadingStrategy getLoadingStrategy() {
    return loadingStrategy;
  }

  public void setLoadingStrategy(CheckoutBrandingFontLoadingStrategy loadingStrategy) {
    this.loadingStrategy = loadingStrategy;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingShopifyFontGroupInput{name='" + name + "', baseWeight='" + baseWeight + "', boldWeight='" + boldWeight + "', loadingStrategy='" + loadingStrategy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingShopifyFontGroupInput that = (CheckoutBrandingShopifyFontGroupInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(baseWeight, that.baseWeight) &&
        Objects.equals(boldWeight, that.boldWeight) &&
        Objects.equals(loadingStrategy, that.loadingStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, baseWeight, boldWeight, loadingStrategy);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private Integer baseWeight;

    
    private Integer boldWeight;

    
    private CheckoutBrandingFontLoadingStrategy loadingStrategy;

    public CheckoutBrandingShopifyFontGroupInput build() {
      CheckoutBrandingShopifyFontGroupInput result = new CheckoutBrandingShopifyFontGroupInput();
      result.name = this.name;
      result.baseWeight = this.baseWeight;
      result.boldWeight = this.boldWeight;
      result.loadingStrategy = this.loadingStrategy;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder baseWeight(Integer baseWeight) {
      this.baseWeight = baseWeight;
      return this;
    }

    
    public Builder boldWeight(Integer boldWeight) {
      this.boldWeight = boldWeight;
      return this;
    }

    
    public Builder loadingStrategy(CheckoutBrandingFontLoadingStrategy loadingStrategy) {
      this.loadingStrategy = loadingStrategy;
      return this;
    }
  }
}
