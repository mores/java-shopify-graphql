package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for an inventory item measurement.
 */
public class InventoryItemMeasurementInput {
  /**
   * The weight of the inventory item.
   */
  private WeightInput weight;

  public InventoryItemMeasurementInput() {
  }

  /**
   * The weight of the inventory item.
   */
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
    /**
     * The weight of the inventory item.
     */
    private WeightInput weight;

    public InventoryItemMeasurementInput build() {
      InventoryItemMeasurementInput result = new InventoryItemMeasurementInput();
      result.weight = this.weight;
      return result;
    }

    /**
     * The weight of the inventory item.
     */
    public Builder weight(WeightInput weight) {
      this.weight = weight;
      return this;
    }
  }
}
