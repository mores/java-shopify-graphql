package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to receive an item on an inventory shipment.
 */
public class InventoryShipmentReceiveItemInput {
  /**
   * The shipment line item ID to be received.
   */
  private String shipmentLineItemId;

  /**
   * The quantity for the item to be received.
   */
  private int quantity;

  /**
   * The reason for received item.
   */
  private InventoryShipmentReceiveLineItemReason reason;

  public InventoryShipmentReceiveItemInput() {
  }

  /**
   * The shipment line item ID to be received.
   */
  public String getShipmentLineItemId() {
    return shipmentLineItemId;
  }

  public void setShipmentLineItemId(String shipmentLineItemId) {
    this.shipmentLineItemId = shipmentLineItemId;
  }

  /**
   * The quantity for the item to be received.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The reason for received item.
   */
  public InventoryShipmentReceiveLineItemReason getReason() {
    return reason;
  }

  public void setReason(InventoryShipmentReceiveLineItemReason reason) {
    this.reason = reason;
  }

  @Override
  public String toString() {
    return "InventoryShipmentReceiveItemInput{shipmentLineItemId='" + shipmentLineItemId + "', quantity='" + quantity + "', reason='" + reason + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryShipmentReceiveItemInput that = (InventoryShipmentReceiveItemInput) o;
    return Objects.equals(shipmentLineItemId, that.shipmentLineItemId) &&
        quantity == that.quantity &&
        Objects.equals(reason, that.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentLineItemId, quantity, reason);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The shipment line item ID to be received.
     */
    private String shipmentLineItemId;

    /**
     * The quantity for the item to be received.
     */
    private int quantity;

    /**
     * The reason for received item.
     */
    private InventoryShipmentReceiveLineItemReason reason;

    public InventoryShipmentReceiveItemInput build() {
      InventoryShipmentReceiveItemInput result = new InventoryShipmentReceiveItemInput();
      result.shipmentLineItemId = this.shipmentLineItemId;
      result.quantity = this.quantity;
      result.reason = this.reason;
      return result;
    }

    /**
     * The shipment line item ID to be received.
     */
    public Builder shipmentLineItemId(String shipmentLineItemId) {
      this.shipmentLineItemId = shipmentLineItemId;
      return this;
    }

    /**
     * The quantity for the item to be received.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The reason for received item.
     */
    public Builder reason(InventoryShipmentReceiveLineItemReason reason) {
      this.reason = reason;
      return this;
    }
  }
}
