package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to specify whether the inventory item should be activated or not at the specified location.
 */
public class InventoryBulkToggleActivationInput {
  /**
   * The ID of the location to modify the inventory item's stocked status.
   */
  private String locationId;

  /**
   * Whether the inventory item can be stocked at the specified location. To
   * deactivate, set the value to false which removes an inventory item's
   * quantities from that location, and turns off inventory at that location.
   */
  private boolean activate;

  public InventoryBulkToggleActivationInput() {
  }

  /**
   * The ID of the location to modify the inventory item's stocked status.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  /**
   * Whether the inventory item can be stocked at the specified location. To
   * deactivate, set the value to false which removes an inventory item's
   * quantities from that location, and turns off inventory at that location.
   */
  public boolean getActivate() {
    return activate;
  }

  public void setActivate(boolean activate) {
    this.activate = activate;
  }

  @Override
  public String toString() {
    return "InventoryBulkToggleActivationInput{locationId='" + locationId + "', activate='" + activate + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryBulkToggleActivationInput that = (InventoryBulkToggleActivationInput) o;
    return Objects.equals(locationId, that.locationId) &&
        activate == that.activate;
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, activate);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the location to modify the inventory item's stocked status.
     */
    private String locationId;

    /**
     * Whether the inventory item can be stocked at the specified location. To
     * deactivate, set the value to false which removes an inventory item's
     * quantities from that location, and turns off inventory at that location.
     */
    private boolean activate;

    public InventoryBulkToggleActivationInput build() {
      InventoryBulkToggleActivationInput result = new InventoryBulkToggleActivationInput();
      result.locationId = this.locationId;
      result.activate = this.activate;
      return result;
    }

    /**
     * The ID of the location to modify the inventory item's stocked status.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * Whether the inventory item can be stocked at the specified location. To
     * deactivate, set the value to false which removes an inventory item's
     * quantities from that location, and turns off inventory at that location.
     */
    public Builder activate(boolean activate) {
      this.activate = activate;
      return this;
    }
  }
}
