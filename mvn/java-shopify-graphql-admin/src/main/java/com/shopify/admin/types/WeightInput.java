package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the weight unit and value inputs.
 */
public class WeightInput {
  /**
   * The weight value using the unit system specified with `weight_unit`.
   */
  private double value;

  /**
   * Unit of measurement for `value`.
   */
  private WeightUnit unit;

  public WeightInput() {
  }

  /**
   * The weight value using the unit system specified with `weight_unit`.
   */
  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  /**
   * Unit of measurement for `value`.
   */
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
    /**
     * The weight value using the unit system specified with `weight_unit`.
     */
    private double value;

    /**
     * Unit of measurement for `value`.
     */
    private WeightUnit unit;

    public WeightInput build() {
      WeightInput result = new WeightInput();
      result.value = this.value;
      result.unit = this.unit;
      return result;
    }

    /**
     * The weight value using the unit system specified with `weight_unit`.
     */
    public Builder value(double value) {
      this.value = value;
      return this;
    }

    /**
     * Unit of measurement for `value`.
     */
    public Builder unit(WeightUnit unit) {
      this.unit = unit;
      return this;
    }
  }
}
