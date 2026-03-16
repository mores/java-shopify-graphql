package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The measurement data used to calculate unit prices for a [`ProductVariant`](https://shopify.dev/docs/api/storefront/current/objects/ProductVariant).
 * Unit pricing helps customers compare costs across different package sizes by
 * showing a standardized price, such as "$9.99 / 100ml".
 *
 * The object includes the quantity being sold (value and unit) and the reference
 * measurement used for price comparison. Use this alongside the variant's [`unitPrice`](https://shopify.dev/docs/api/storefront/current/objects/ProductVariant#field-ProductVariant.fields.unitPrice)
 * field to display complete unit pricing information.
 */
public class UnitPriceMeasurement {
  /**
   * The type of unit of measurement for the unit price measurement.
   */
  private UnitPriceMeasurementMeasuredType measuredType;

  /**
   * The quantity unit for the unit price measurement.
   */
  private UnitPriceMeasurementMeasuredUnit quantityUnit;

  /**
   * The quantity value for the unit price measurement.
   */
  private double quantityValue;

  /**
   * The reference unit for the unit price measurement.
   */
  private UnitPriceMeasurementMeasuredUnit referenceUnit;

  /**
   * The reference value for the unit price measurement.
   */
  private int referenceValue;

  public UnitPriceMeasurement() {
  }

  /**
   * The type of unit of measurement for the unit price measurement.
   */
  public UnitPriceMeasurementMeasuredType getMeasuredType() {
    return measuredType;
  }

  public void setMeasuredType(UnitPriceMeasurementMeasuredType measuredType) {
    this.measuredType = measuredType;
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
   * The quantity value for the unit price measurement.
   */
  public double getQuantityValue() {
    return quantityValue;
  }

  public void setQuantityValue(double quantityValue) {
    this.quantityValue = quantityValue;
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

  /**
   * The reference value for the unit price measurement.
   */
  public int getReferenceValue() {
    return referenceValue;
  }

  public void setReferenceValue(int referenceValue) {
    this.referenceValue = referenceValue;
  }

  @Override
  public String toString() {
    return "UnitPriceMeasurement{measuredType='" + measuredType + "', quantityUnit='" + quantityUnit + "', quantityValue='" + quantityValue + "', referenceUnit='" + referenceUnit + "', referenceValue='" + referenceValue + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UnitPriceMeasurement that = (UnitPriceMeasurement) o;
    return Objects.equals(measuredType, that.measuredType) &&
        Objects.equals(quantityUnit, that.quantityUnit) &&
        quantityValue == that.quantityValue &&
        Objects.equals(referenceUnit, that.referenceUnit) &&
        referenceValue == that.referenceValue;
  }

  @Override
  public int hashCode() {
    return Objects.hash(measuredType, quantityUnit, quantityValue, referenceUnit, referenceValue);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The type of unit of measurement for the unit price measurement.
     */
    private UnitPriceMeasurementMeasuredType measuredType;

    /**
     * The quantity unit for the unit price measurement.
     */
    private UnitPriceMeasurementMeasuredUnit quantityUnit;

    /**
     * The quantity value for the unit price measurement.
     */
    private double quantityValue;

    /**
     * The reference unit for the unit price measurement.
     */
    private UnitPriceMeasurementMeasuredUnit referenceUnit;

    /**
     * The reference value for the unit price measurement.
     */
    private int referenceValue;

    public UnitPriceMeasurement build() {
      UnitPriceMeasurement result = new UnitPriceMeasurement();
      result.measuredType = this.measuredType;
      result.quantityUnit = this.quantityUnit;
      result.quantityValue = this.quantityValue;
      result.referenceUnit = this.referenceUnit;
      result.referenceValue = this.referenceValue;
      return result;
    }

    /**
     * The type of unit of measurement for the unit price measurement.
     */
    public Builder measuredType(UnitPriceMeasurementMeasuredType measuredType) {
      this.measuredType = measuredType;
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
     * The quantity value for the unit price measurement.
     */
    public Builder quantityValue(double quantityValue) {
      this.quantityValue = quantityValue;
      return this;
    }

    /**
     * The reference unit for the unit price measurement.
     */
    public Builder referenceUnit(UnitPriceMeasurementMeasuredUnit referenceUnit) {
      this.referenceUnit = referenceUnit;
      return this;
    }

    /**
     * The reference value for the unit price measurement.
     */
    public Builder referenceValue(int referenceValue) {
      this.referenceValue = referenceValue;
      return this;
    }
  }
}
