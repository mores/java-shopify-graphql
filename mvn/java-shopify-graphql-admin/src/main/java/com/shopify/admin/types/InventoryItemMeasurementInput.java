package com.shopify.admin.types;

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

  /**
   * Shipping package associated with inventory item.
   */
  private String shippingPackageId;

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

  /**
   * Shipping package associated with inventory item.
   */
  public String getShippingPackageId() {
    return shippingPackageId;
  }

  public void setShippingPackageId(String shippingPackageId) {
    this.shippingPackageId = shippingPackageId;
  }

  @Override
  public String toString() {
    return "InventoryItemMeasurementInput{weight='" + weight + "', shippingPackageId='" + shippingPackageId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryItemMeasurementInput that = (InventoryItemMeasurementInput) o;
    return Objects.equals(weight, that.weight) &&
        Objects.equals(shippingPackageId, that.shippingPackageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, shippingPackageId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The weight of the inventory item.
     */
    private WeightInput weight;

    /**
     * Shipping package associated with inventory item.
     */
    private String shippingPackageId;

    public InventoryItemMeasurementInput build() {
      InventoryItemMeasurementInput result = new InventoryItemMeasurementInput();
      result.weight = this.weight;
      result.shippingPackageId = this.shippingPackageId;
      return result;
    }

    /**
     * The weight of the inventory item.
     */
    public Builder weight(WeightInput weight) {
      this.weight = weight;
      return this;
    }

    /**
     * Shipping package associated with inventory item.
     */
    public Builder shippingPackageId(String shippingPackageId) {
      this.shippingPackageId = shippingPackageId;
      return this;
    }
  }
}
