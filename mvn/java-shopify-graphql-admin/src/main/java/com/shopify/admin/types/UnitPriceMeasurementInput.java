package com.shopify.admin.types;

import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the measurement used to calculate a unit price for a product variant (e.g. $9.99 / 100ml).
 */
public class UnitPriceMeasurementInput {
  /**
   * The quantity value for the unit price measurement.
   */
  private Double quantityValue;

  /**
   * The quantity unit for the unit price measurement.
   */
  private UnitPriceMeasurementMeasuredUnit quantityUnit;

  /**
   * The reference value for the unit price measurement.
   */
  private Integer referenceValue;

  /**
   * The reference unit for the unit price measurement.
   */
  private UnitPriceMeasurementMeasuredUnit referenceUnit;

  public UnitPriceMeasurementInput() {
  }

  /**
   * The quantity value for the unit price measurement.
   */
  public Double getQuantityValue() {
    return quantityValue;
  }

  public void setQuantityValue(Double quantityValue) {
    this.quantityValue = quantityValue;
  }

  /**
   * The quantity unit for the unit price measurement.
   */
  public UnitPriceMeasurementMeasuredUnit getQuantityUnit() {
    return quantityUnit;
  }

  public void setQuantityUnit(UnitPriceMeasurementMeasuredUnit quantityUnit) {
    this.quantityUnit = quantityUnit;
  }

  /**
   * The reference value for the unit price measurement.
   */
  public Integer getReferenceValue() {
    return referenceValue;
  }

  public void setReferenceValue(Integer referenceValue) {
    this.referenceValue = referenceValue;
  }

  /**
   * The reference unit for the unit price measurement.
   */
  public UnitPriceMeasurementMeasuredUnit getReferenceUnit() {
    return referenceUnit;
  }

  public void setReferenceUnit(UnitPriceMeasurementMeasuredUnit referenceUnit) {
    this.referenceUnit = referenceUnit;
  }

  @Override
  public String toString() {
    return "UnitPriceMeasurementInput{quantityValue='" + quantityValue + "', quantityUnit='" + quantityUnit + "', referenceValue='" + referenceValue + "', referenceUnit='" + referenceUnit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UnitPriceMeasurementInput that = (UnitPriceMeasurementInput) o;
    return Objects.equals(quantityValue, that.quantityValue) &&
        Objects.equals(quantityUnit, that.quantityUnit) &&
        Objects.equals(referenceValue, that.referenceValue) &&
        Objects.equals(referenceUnit, that.referenceUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityValue, quantityUnit, referenceValue, referenceUnit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The quantity value for the unit price measurement.
     */
    private Double quantityValue;

    /**
     * The quantity unit for the unit price measurement.
     */
    private UnitPriceMeasurementMeasuredUnit quantityUnit;

    /**
     * The reference value for the unit price measurement.
     */
    private Integer referenceValue;

    /**
     * The reference unit for the unit price measurement.
     */
    private UnitPriceMeasurementMeasuredUnit referenceUnit;

    public UnitPriceMeasurementInput build() {
      UnitPriceMeasurementInput result = new UnitPriceMeasurementInput();
      result.quantityValue = this.quantityValue;
      result.quantityUnit = this.quantityUnit;
      result.referenceValue = this.referenceValue;
      result.referenceUnit = this.referenceUnit;
      return result;
    }

    /**
     * The quantity value for the unit price measurement.
     */
    public Builder quantityValue(Double quantityValue) {
      this.quantityValue = quantityValue;
      return this;
    }

    /**
     * The quantity unit for the unit price measurement.
     */
    public Builder quantityUnit(UnitPriceMeasurementMeasuredUnit quantityUnit) {
      this.quantityUnit = quantityUnit;
      return this;
    }

    /**
     * The reference value for the unit price measurement.
     */
    public Builder referenceValue(Integer referenceValue) {
      this.referenceValue = referenceValue;
      return this;
    }

    /**
     * The reference unit for the unit price measurement.
     */
    public Builder referenceUnit(UnitPriceMeasurementMeasuredUnit referenceUnit) {
      this.referenceUnit = referenceUnit;
      return this;
    }
  }
}
