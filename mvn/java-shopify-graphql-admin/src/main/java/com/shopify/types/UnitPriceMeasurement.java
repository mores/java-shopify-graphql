package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class UnitPriceMeasurement {
  
  private UnitPriceMeasurementMeasuredType measuredType;

  
  private UnitPriceMeasurementMeasuredUnit quantityUnit;

  
  private double quantityValue;

  
  private UnitPriceMeasurementMeasuredUnit referenceUnit;

  
  private int referenceValue;

  public UnitPriceMeasurement() {
  }

  
  public UnitPriceMeasurementMeasuredType getMeasuredType() {
    return measuredType;
  }

  public void setMeasuredType(UnitPriceMeasurementMeasuredType measuredType) {
    this.measuredType = measuredType;
  }

  
  public UnitPriceMeasurementMeasuredUnit getQuantityUnit() {
    return quantityUnit;
  }

  public void setQuantityUnit(UnitPriceMeasurementMeasuredUnit quantityUnit) {
    this.quantityUnit = quantityUnit;
  }

  
  public double getQuantityValue() {
    return quantityValue;
  }

  public void setQuantityValue(double quantityValue) {
    this.quantityValue = quantityValue;
  }

  
  public UnitPriceMeasurementMeasuredUnit getReferenceUnit() {
    return referenceUnit;
  }

  public void setReferenceUnit(UnitPriceMeasurementMeasuredUnit referenceUnit) {
    this.referenceUnit = referenceUnit;
  }

  
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
    
    private UnitPriceMeasurementMeasuredType measuredType;

    
    private UnitPriceMeasurementMeasuredUnit quantityUnit;

    
    private double quantityValue;

    
    private UnitPriceMeasurementMeasuredUnit referenceUnit;

    
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

    
    public Builder measuredType(UnitPriceMeasurementMeasuredType measuredType) {
      this.measuredType = measuredType;
      return this;
    }

    
    public Builder quantityUnit(UnitPriceMeasurementMeasuredUnit quantityUnit) {
      this.quantityUnit = quantityUnit;
      return this;
    }

    
    public Builder quantityValue(double quantityValue) {
      this.quantityValue = quantityValue;
      return this;
    }

    
    public Builder referenceUnit(UnitPriceMeasurementMeasuredUnit referenceUnit) {
      this.referenceUnit = referenceUnit;
      return this;
    }

    
    public Builder referenceValue(int referenceValue) {
      this.referenceValue = referenceValue;
      return this;
    }
  }
}
