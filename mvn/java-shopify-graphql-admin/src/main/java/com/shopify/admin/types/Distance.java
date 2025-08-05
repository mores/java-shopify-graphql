package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A distance, which includes a numeric value and a unit of measurement.
 */
public class Distance {
  /**
   * The unit of measurement for `value`.
   */
  private DistanceUnit unit;

  /**
   * The distance value using the unit system specified with `unit`.
   */
  private double value;

  public Distance() {
  }

  /**
   * The unit of measurement for `value`.
   */
  public DistanceUnit getUnit() {
    return unit;
  }

  public void setUnit(DistanceUnit unit) {
    this.unit = unit;
  }

  /**
   * The distance value using the unit system specified with `unit`.
   */
  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Distance{unit='" + unit + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Distance that = (Distance) o;
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
    /**
     * The unit of measurement for `value`.
     */
    private DistanceUnit unit;

    /**
     * The distance value using the unit system specified with `unit`.
     */
    private double value;

    public Distance build() {
      Distance result = new Distance();
      result.unit = this.unit;
      result.value = this.value;
      return result;
    }

    /**
     * The unit of measurement for `value`.
     */
    public Builder unit(DistanceUnit unit) {
      this.unit = unit;
      return this;
    }

    /**
     * The distance value using the unit system specified with `unit`.
     */
    public Builder value(double value) {
      this.value = value;
      return this;
    }
  }
}
