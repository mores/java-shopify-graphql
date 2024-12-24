package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class WeightInput {
  
  private double value;

  
  private WeightUnit unit;

  public WeightInput() {
  }

  
  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  
  public WeightUnit getUnit() {
    return unit;
  }

  public void setUnit(WeightUnit unit) {
    this.unit = unit;
  }

  @Override
  public String toString() {
    return "WeightInput{value='" + value + "', unit='" + unit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WeightInput that = (WeightInput) o;
    return value == that.value &&
        Objects.equals(unit, that.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private double value;

    
    private WeightUnit unit;

    public WeightInput build() {
      WeightInput result = new WeightInput();
      result.value = this.value;
      result.unit = this.unit;
      return result;
    }

    
    public Builder value(double value) {
      this.value = value;
      return this;
    }

    
    public Builder unit(WeightUnit unit) {
      this.unit = unit;
      return this;
    }
  }
}
