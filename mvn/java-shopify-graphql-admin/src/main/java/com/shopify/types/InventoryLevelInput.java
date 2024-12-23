package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for an inventory level.
 */
public class InventoryLevelInput {
  /**
   * The available quantity of an inventory item at a location.
   */
  private int availableQuantity;

  /**
   * The ID of a location associated with the inventory level.
   */
  private String locationId;

  public InventoryLevelInput() {
  }

  /**
   * The available quantity of an inventory item at a location.
   */
  public int getAvailableQuantity() {
    return availableQuantity;
  }

  public void setAvailableQuantity(int availableQuantity) {
    this.availableQuantity = availableQuantity;
  }

  /**
   * The ID of a location associated with the inventory level.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  @Override
  public String toString() {
    return "InventoryLevelInput{availableQuantity='" + availableQuantity + "', locationId='" + locationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryLevelInput that = (InventoryLevelInput) o;
    return availableQuantity == that.availableQuantity &&
        Objects.equals(locationId, that.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableQuantity, locationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The available quantity of an inventory item at a location.
     */
    private int availableQuantity;

    /**
     * The ID of a location associated with the inventory level.
     */
    private String locationId;

    public InventoryLevelInput build() {
      InventoryLevelInput result = new InventoryLevelInput();
      result.availableQuantity = this.availableQuantity;
      result.locationId = this.locationId;
      return result;
    }

    /**
     * The available quantity of an inventory item at a location.
     */
    public Builder availableQuantity(int availableQuantity) {
      this.availableQuantity = availableQuantity;
      return this;
    }

    /**
     * The ID of a location associated with the inventory level.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }
  }
}
