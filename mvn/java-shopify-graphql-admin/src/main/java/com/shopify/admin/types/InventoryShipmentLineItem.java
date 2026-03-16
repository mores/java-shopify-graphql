package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a single line item within an inventory shipment.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class InventoryShipmentLineItem implements com.shopify.admin.types.Node {
  /**
   * The quantity of items that were accepted in this shipment line item.
   */
  private int acceptedQuantity;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The inventory item associated with this line item.
   */
  private InventoryItem inventoryItem;

  /**
   * The quantity of items in this shipment line item.
   */
  private int quantity;

  /**
   * The quantity of items that were rejected in this shipment line item.
   */
  private int rejectedQuantity;

  /**
   * The total quantity of units that haven't been received (neither accepted or rejected) in this shipment line item.
   */
  private int unreceivedQuantity;

  public InventoryShipmentLineItem() {
  }

  /**
   * The quantity of items that were accepted in this shipment line item.
   */
  public int getAcceptedQuantity() {
    return acceptedQuantity;
  }

  public void setAcceptedQuantity(int acceptedQuantity) {
    this.acceptedQuantity = acceptedQuantity;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The inventory item associated with this line item.
   */
  public InventoryItem getInventoryItem() {
    return inventoryItem;
  }

  public void setInventoryItem(InventoryItem inventoryItem) {
    this.inventoryItem = inventoryItem;
  }

  /**
   * The quantity of items in this shipment line item.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The quantity of items that were rejected in this shipment line item.
   */
  public int getRejectedQuantity() {
    return rejectedQuantity;
  }

  public void setRejectedQuantity(int rejectedQuantity) {
    this.rejectedQuantity = rejectedQuantity;
  }

  /**
   * The total quantity of units that haven't been received (neither accepted or rejected) in this shipment line item.
   */
  public int getUnreceivedQuantity() {
    return unreceivedQuantity;
  }

  public void setUnreceivedQuantity(int unreceivedQuantity) {
    this.unreceivedQuantity = unreceivedQuantity;
  }

  @Override
  public String toString() {
    return "InventoryShipmentLineItem{acceptedQuantity='" + acceptedQuantity + "', id='" + id + "', inventoryItem='" + inventoryItem + "', quantity='" + quantity + "', rejectedQuantity='" + rejectedQuantity + "', unreceivedQuantity='" + unreceivedQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryShipmentLineItem that = (InventoryShipmentLineItem) o;
    return acceptedQuantity == that.acceptedQuantity &&
        Objects.equals(id, that.id) &&
        Objects.equals(inventoryItem, that.inventoryItem) &&
        quantity == that.quantity &&
        rejectedQuantity == that.rejectedQuantity &&
        unreceivedQuantity == that.unreceivedQuantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedQuantity, id, inventoryItem, quantity, rejectedQuantity, unreceivedQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The quantity of items that were accepted in this shipment line item.
     */
    private int acceptedQuantity;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The inventory item associated with this line item.
     */
    private InventoryItem inventoryItem;

    /**
     * The quantity of items in this shipment line item.
     */
    private int quantity;

    /**
     * The quantity of items that were rejected in this shipment line item.
     */
    private int rejectedQuantity;

    /**
     * The total quantity of units that haven't been received (neither accepted or rejected) in this shipment line item.
     */
    private int unreceivedQuantity;

    public InventoryShipmentLineItem build() {
      InventoryShipmentLineItem result = new InventoryShipmentLineItem();
      result.acceptedQuantity = this.acceptedQuantity;
      result.id = this.id;
      result.inventoryItem = this.inventoryItem;
      result.quantity = this.quantity;
      result.rejectedQuantity = this.rejectedQuantity;
      result.unreceivedQuantity = this.unreceivedQuantity;
      return result;
    }

    /**
     * The quantity of items that were accepted in this shipment line item.
     */
    public Builder acceptedQuantity(int acceptedQuantity) {
      this.acceptedQuantity = acceptedQuantity;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The inventory item associated with this line item.
     */
    public Builder inventoryItem(InventoryItem inventoryItem) {
      this.inventoryItem = inventoryItem;
      return this;
    }

    /**
     * The quantity of items in this shipment line item.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The quantity of items that were rejected in this shipment line item.
     */
    public Builder rejectedQuantity(int rejectedQuantity) {
      this.rejectedQuantity = rejectedQuantity;
      return this;
    }

    /**
     * The total quantity of units that haven't been received (neither accepted or rejected) in this shipment line item.
     */
    public Builder unreceivedQuantity(int unreceivedQuantity) {
      this.unreceivedQuantity = unreceivedQuantity;
      return this;
    }
  }
}
