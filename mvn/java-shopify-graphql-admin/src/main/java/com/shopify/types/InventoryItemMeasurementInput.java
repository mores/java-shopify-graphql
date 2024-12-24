package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class InventoryItemMeasurementInput {
  
  private WeightInput weight;

  public InventoryItemMeasurementInput() {
  }

  
  public WeightInput getWeight() {
    return weight;
  }

  public void setWeight(WeightInput weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "InventoryItemMeasurementInput{weight='" + weight + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryItemMeasurementInput that = (InventoryItemMeasurementInput) o;
    return Objects.equals(weight, that.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private WeightInput weight;

    public InventoryItemMeasurementInput build() {
      InventoryItemMeasurementInput result = new InventoryItemMeasurementInput();
      result.weight = this.weight;
      return result;
    }

    
    public Builder weight(WeightInput weight) {
      this.weight = weight;
      return this;
    }
  }
}
