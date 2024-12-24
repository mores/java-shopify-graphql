package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PriceListAdjustment {
  
  private PriceListAdjustmentType type;

  
  private double value;

  public PriceListAdjustment() {
  }

  
  public PriceListAdjustmentType getType() {
    return type;
  }

  public void setType(PriceListAdjustmentType type) {
    this.type = type;
  }

  
  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "PriceListAdjustment{type='" + type + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListAdjustment that = (PriceListAdjustment) o;
    return Objects.equals(type, that.type) &&
        value == that.value;
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private PriceListAdjustmentType type;

    
    private double value;

    public PriceListAdjustment build() {
      PriceListAdjustment result = new PriceListAdjustment();
      result.type = this.type;
      result.value = this.value;
      return result;
    }

    
    public Builder type(PriceListAdjustmentType type) {
      this.type = type;
      return this;
    }

    
    public Builder value(double value) {
      this.value = value;
      return this;
    }
  }
}
