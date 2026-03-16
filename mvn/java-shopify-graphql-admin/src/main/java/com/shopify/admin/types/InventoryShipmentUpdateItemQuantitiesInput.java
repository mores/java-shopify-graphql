package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a line item on an inventory shipment.
 */
public class InventoryShipmentUpdateItemQuantitiesInput {
  /**
   * The ID for the inventory shipment line item.
   */
  private String shipmentLineItemId;

  /**
   * The quantity for the shipment line item.
   */
  private int quantity;

  public InventoryShipmentUpdateItemQuantitiesInput() {
  }

  /**
   * The ID for the inventory shipment line item.
   */
  public String getShipmentLineItemId() {
    return shipmentLineItemId;
  }

  public void setShipmentLineItemId(String shipmentLineItemId) {
    this.shipmentLineItemId = shipmentLineItemId;
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
    return "InventoryShipmentUpdateItemQuantitiesInput{shipmentLineItemId='" + shipmentLineItemId + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryShipmentUpdateItemQuantitiesInput that = (InventoryShipmentUpdateItemQuantitiesInput) o;
    return Objects.equals(shipmentLineItemId, that.shipmentLineItemId) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentLineItemId, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID for the inventory shipment line item.
     */
    private String shipmentLineItemId;

    /**
     * The quantity for the shipment line item.
     */
    private int quantity;

    public InventoryShipmentUpdateItemQuantitiesInput build() {
      InventoryShipmentUpdateItemQuantitiesInput result = new InventoryShipmentUpdateItemQuantitiesInput();
      result.shipmentLineItemId = this.shipmentLineItemId;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The ID for the inventory shipment line item.
     */
    public Builder shipmentLineItemId(String shipmentLineItemId) {
      this.shipmentLineItemId = shipmentLineItemId;
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
