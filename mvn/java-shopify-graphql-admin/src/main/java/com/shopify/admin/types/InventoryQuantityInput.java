package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the quantity to be set for an inventory item at a location.
 */
public class InventoryQuantityInput {
  /**
   * Specifies the inventory item to which the quantity will be set.
   */
  private String inventoryItemId;

  /**
   * Specifies the location at which the quantity will be set.
   */
  private String locationId;

  /**
   * The quantity to which the inventory quantity will be set.
   */
  private int quantity;

  /**
   * The current quantity to be compared against the persisted quantity.
   */
  private Integer compareQuantity;

  public InventoryQuantityInput() {
  }

  /**
   * Specifies the inventory item to which the quantity will be set.
   */
  public String getInventoryItemId() {
    return inventoryItemId;
  }

  public void setInventoryItemId(String inventoryItemId) {
    this.inventoryItemId = inventoryItemId;
  }

  /**
   * Specifies the location at which the quantity will be set.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  /**
   * The quantity to which the inventory quantity will be set.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The current quantity to be compared against the persisted quantity.
   */
  public Integer getCompareQuantity() {
    return compareQuantity;
  }

  public void setCompareQuantity(Integer compareQuantity) {
    this.compareQuantity = compareQuantity;
  }

  @Override
  public String toString() {
    return "InventoryQuantityInput{inventoryItemId='" + inventoryItemId + "', locationId='" + locationId + "', quantity='" + quantity + "', compareQuantity='" + compareQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryQuantityInput that = (InventoryQuantityInput) o;
    return Objects.equals(inventoryItemId, that.inventoryItemId) &&
        Objects.equals(locationId, that.locationId) &&
        quantity == that.quantity &&
        Objects.equals(compareQuantity, that.compareQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryItemId, locationId, quantity, compareQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Specifies the inventory item to which the quantity will be set.
     */
    private String inventoryItemId;

    /**
     * Specifies the location at which the quantity will be set.
     */
    private String locationId;

    /**
     * The quantity to which the inventory quantity will be set.
     */
    private int quantity;

    /**
     * The current quantity to be compared against the persisted quantity.
     */
    private Integer compareQuantity;

    public InventoryQuantityInput build() {
      InventoryQuantityInput result = new InventoryQuantityInput();
      result.inventoryItemId = this.inventoryItemId;
      result.locationId = this.locationId;
      result.quantity = this.quantity;
      result.compareQuantity = this.compareQuantity;
      return result;
    }

    /**
     * Specifies the inventory item to which the quantity will be set.
     */
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      return this;
    }

    /**
     * Specifies the location at which the quantity will be set.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * The quantity to which the inventory quantity will be set.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The current quantity to be compared against the persisted quantity.
     */
    public Builder compareQuantity(Integer compareQuantity) {
      this.compareQuantity = compareQuantity;
      return this;
    }
  }
}
