package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a line item on an inventory shipment.
 */
public class InventoryShipmentLineItemInput {
  /**
   * The inventory item ID for the shipment line item.
   */
  private String inventoryItemId;

  /**
   * The quantity for the shipment line item.
   */
  private int quantity;

  public InventoryShipmentLineItemInput() {
  }

  /**
   * The inventory item ID for the shipment line item.
   */
  public String getInventoryItemId() {
    return inventoryItemId;
  }

  public void setInventoryItemId(String inventoryItemId) {
    this.inventoryItemId = inventoryItemId;
  }

  /**
   * The quantity for the shipment line item.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "InventoryShipmentLineItemInput{inventoryItemId='" + inventoryItemId + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryShipmentLineItemInput that = (InventoryShipmentLineItemInput) o;
    return Objects.equals(inventoryItemId, that.inventoryItemId) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryItemId, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The inventory item ID for the shipment line item.
     */
    private String inventoryItemId;

    /**
     * The quantity for the shipment line item.
     */
    private int quantity;

    public InventoryShipmentLineItemInput build() {
      InventoryShipmentLineItemInput result = new InventoryShipmentLineItemInput();
      result.inventoryItemId = this.inventoryItemId;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The inventory item ID for the shipment line item.
     */
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      return this;
    }

    /**
     * The quantity for the shipment line item.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
