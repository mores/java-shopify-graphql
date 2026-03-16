package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the quantity to be set for an inventory item at a location.
 */
public class InventorySetQuantityInput {
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
   * The current quantity to be compared against the persisted quantity. For more
   * information, refer to the [Compare and Swap documentation](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states#compare-and-swap).
   */
  private Integer changeFromQuantity;

  public InventorySetQuantityInput() {
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
   * The current quantity to be compared against the persisted quantity. For more
   * information, refer to the [Compare and Swap documentation](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states#compare-and-swap).
   */
  public Integer getChangeFromQuantity() {
    return changeFromQuantity;
  }

  public void setChangeFromQuantity(Integer changeFromQuantity) {
    this.changeFromQuantity = changeFromQuantity;
  }

  @Override
  public String toString() {
    return "InventorySetQuantityInput{inventoryItemId='" + inventoryItemId + "', locationId='" + locationId + "', quantity='" + quantity + "', changeFromQuantity='" + changeFromQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventorySetQuantityInput that = (InventorySetQuantityInput) o;
    return Objects.equals(inventoryItemId, that.inventoryItemId) &&
        Objects.equals(locationId, that.locationId) &&
        quantity == that.quantity &&
        Objects.equals(changeFromQuantity, that.changeFromQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryItemId, locationId, quantity, changeFromQuantity);
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
     * The current quantity to be compared against the persisted quantity. For more
     * information, refer to the [Compare and Swap documentation](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states#compare-and-swap).
     */
    private Integer changeFromQuantity;

    public InventorySetQuantityInput build() {
      InventorySetQuantityInput result = new InventorySetQuantityInput();
      result.inventoryItemId = this.inventoryItemId;
      result.locationId = this.locationId;
      result.quantity = this.quantity;
      result.changeFromQuantity = this.changeFromQuantity;
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
     * The current quantity to be compared against the persisted quantity. For more
     * information, refer to the [Compare and Swap documentation](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states#compare-and-swap).
     */
    public Builder changeFromQuantity(Integer changeFromQuantity) {
      this.changeFromQuantity = changeFromQuantity;
      return this;
    }
  }
}
