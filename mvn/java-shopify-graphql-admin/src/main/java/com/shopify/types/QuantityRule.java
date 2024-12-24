package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class QuantityRule {
  
  private int increment;

  
  private boolean isDefault;

  
  private Integer maximum;

  
  private int minimum;

  
  private QuantityRuleOriginType originType;

  
  private ProductVariant productVariant;

  public QuantityRule() {
  }

  
  public int getIncrement() {
    return increment;
  }

  public void setIncrement(int increment) {
    this.increment = increment;
  }

  
  public boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(boolean isDefault) {
    this.isDefault = isDefault;
  }

  
  public Integer getMaximum() {
    return maximum;
  }

  public void setMaximum(Integer maximum) {
    this.maximum = maximum;
  }

  
  public int getMinimum() {
    return minimum;
  }

  public void setMinimum(int minimum) {
    this.minimum = minimum;
  }

  
  public QuantityRuleOriginType getOriginType() {
    return originType;
  }

  public void setOriginType(QuantityRuleOriginType originType) {
    this.originType = originType;
  }

  
  public ProductVariant getProductVariant() {
    return productVariant;
  }

  public void setProductVariant(ProductVariant productVariant) {
    this.productVariant = productVariant;
  }

  @Override
  public String toString() {
    return "QuantityRule{increment='" + increment + "', isDefault='" + isDefault + "', maximum='" + maximum + "', minimum='" + minimum + "', originType='" + originType + "', productVariant='" + productVariant + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuantityRule that = (QuantityRule) o;
    return increment == that.increment &&
        isDefault == that.isDefault &&
        Objects.equals(maximum, that.maximum) &&
        minimum == that.minimum &&
        Objects.equals(originType, that.originType) &&
        Objects.equals(productVariant, that.productVariant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(increment, isDefault, maximum, minimum, originType, productVariant);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int increment;

    
    private boolean isDefault;

    
    private Integer maximum;

    
    private int minimum;

    
    private QuantityRuleOriginType originType;

    
    private ProductVariant productVariant;

    public QuantityRule build() {
      QuantityRule result = new QuantityRule();
      result.increment = this.increment;
      result.isDefault = this.isDefault;
      result.maximum = this.maximum;
      result.minimum = this.minimum;
      result.originType = this.originType;
      result.productVariant = this.productVariant;
      return result;
    }

    
    public Builder increment(int increment) {
      this.increment = increment;
      return this;
    }

    
    public Builder isDefault(boolean isDefault) {
      this.isDefault = isDefault;
      return this;
    }

    
    public Builder maximum(Integer maximum) {
      this.maximum = maximum;
      return this;
    }

    
    public Builder minimum(int minimum) {
      this.minimum = minimum;
      return this;
    }

    
    public Builder originType(QuantityRuleOriginType originType) {
      this.originType = originType;
      return this;
    }

    
    public Builder productVariant(ProductVariant productVariant) {
      this.productVariant = productVariant;
      return this;
    }
  }
}
