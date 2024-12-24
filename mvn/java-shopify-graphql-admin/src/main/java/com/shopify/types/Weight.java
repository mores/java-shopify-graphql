package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Weight implements DeliveryConditionCriteria {
  
  private WeightUnit unit;

  
  private double value;

  public Weight() {
  }

  
  public WeightUnit getUnit() {
    return unit;
  }

  public void setUnit(WeightUnit unit) {
    this.unit = unit;
  }

  
  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Weight{unit='" + unit + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Weight that = (Weight) o;
    return Objects.equals(unit, that.unit) &&
        value == that.value;
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private WeightUnit unit;

    
    private double value;

    public Weight build() {
      Weight result = new Weight();
      result.unit = this.unit;
      result.value = this.value;
      return result;
    }

    
    public Builder unit(WeightUnit unit) {
      this.unit = unit;
      return this;
    }

    
    public Builder value(double value) {
      this.value = value;
      return this;
    }
  }
}
