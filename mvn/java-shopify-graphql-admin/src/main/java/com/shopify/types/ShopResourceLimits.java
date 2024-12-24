package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ShopResourceLimits {
  
  private int locationLimit;

  
  private int maxProductOptions;

  
  private int maxProductVariants;

  
  private boolean redirectLimitReached;

  public ShopResourceLimits() {
  }

  
  public int getLocationLimit() {
    return locationLimit;
  }

  public void setLocationLimit(int locationLimit) {
    this.locationLimit = locationLimit;
  }

  
  public int getMaxProductOptions() {
    return maxProductOptions;
  }

  public void setMaxProductOptions(int maxProductOptions) {
    this.maxProductOptions = maxProductOptions;
  }

  
  public int getMaxProductVariants() {
    return maxProductVariants;
  }

  public void setMaxProductVariants(int maxProductVariants) {
    this.maxProductVariants = maxProductVariants;
  }

  
  public boolean getRedirectLimitReached() {
    return redirectLimitReached;
  }

  public void setRedirectLimitReached(boolean redirectLimitReached) {
    this.redirectLimitReached = redirectLimitReached;
  }

  @Override
  public String toString() {
    return "ShopResourceLimits{locationLimit='" + locationLimit + "', maxProductOptions='" + maxProductOptions + "', maxProductVariants='" + maxProductVariants + "', redirectLimitReached='" + redirectLimitReached + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopResourceLimits that = (ShopResourceLimits) o;
    return locationLimit == that.locationLimit &&
        maxProductOptions == that.maxProductOptions &&
        maxProductVariants == that.maxProductVariants &&
        redirectLimitReached == that.redirectLimitReached;
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationLimit, maxProductOptions, maxProductVariants, redirectLimitReached);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int locationLimit;

    
    private int maxProductOptions;

    
    private int maxProductVariants;

    
    private boolean redirectLimitReached;

    public ShopResourceLimits build() {
      ShopResourceLimits result = new ShopResourceLimits();
      result.locationLimit = this.locationLimit;
      result.maxProductOptions = this.maxProductOptions;
      result.maxProductVariants = this.maxProductVariants;
      result.redirectLimitReached = this.redirectLimitReached;
      return result;
    }

    
    public Builder locationLimit(int locationLimit) {
      this.locationLimit = locationLimit;
      return this;
    }

    
    public Builder maxProductOptions(int maxProductOptions) {
      this.maxProductOptions = maxProductOptions;
      return this;
    }

    
    public Builder maxProductVariants(int maxProductVariants) {
      this.maxProductVariants = maxProductVariants;
      return this;
    }

    
    public Builder redirectLimitReached(boolean redirectLimitReached) {
      this.redirectLimitReached = redirectLimitReached;
      return this;
    }
  }
}
