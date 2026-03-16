package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a line item belonging to an inventory transfer.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class InventoryTransferLineItem implements com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The inventory item associated with this line item.
   */
  private InventoryItem inventoryItem;

  /**
   * The quantity of the item that has been picked for a draft shipment but not yet shipped.
   */
  private int pickedForShipmentQuantity;

  /**
   * The quantity of the item that can be actioned upon, such as editing the item
   * quantity on the transfer or adding to a shipment.
   */
  private int processableQuantity;

  /**
   * The quantity of the item that can be shipped.
   */
  private int shippableQuantity;

  /**
   * The quantity of the item that has been shipped.
   */
  private int shippedQuantity;

  /**
   * The title of the product associated with this line item.
   */
  private String title;

  /**
   * The total quantity of items being transferred.
   */
  private int totalQuantity;

  public InventoryTransferLineItem() {
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
   * The quantity of the item that has been picked for a draft shipment but not yet shipped.
   */
  public int getPickedForShipmentQuantity() {
    return pickedForShipmentQuantity;
  }

  public void setPickedForShipmentQuantity(int pickedForShipmentQuantity) {
    this.pickedForShipmentQuantity = pickedForShipmentQuantity;
  }

  /**
   * The quantity of the item that can be actioned upon, such as editing the item
   * quantity on the transfer or adding to a shipment.
   */
  public int getProcessableQuantity() {
    return processableQuantity;
  }

  public void setProcessableQuantity(int processableQuantity) {
    this.processableQuantity = processableQuantity;
  }

  /**
   * The quantity of the item that can be shipped.
   */
  public int getShippableQuantity() {
    return shippableQuantity;
  }

  public void setShippableQuantity(int shippableQuantity) {
    this.shippableQuantity = shippableQuantity;
  }

  /**
   * The quantity of the item that has been shipped.
   */
  public int getShippedQuantity() {
    return shippedQuantity;
  }

  public void setShippedQuantity(int shippedQuantity) {
    this.shippedQuantity = shippedQuantity;
  }

  /**
   * The title of the product associated with this line item.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The total quantity of items being transferred.
   */
  public int getTotalQuantity() {
    return totalQuantity;
  }

  public void setTotalQuantity(int totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  @Override
  public String toString() {
    return "InventoryTransferLineItem{id='" + id + "', inventoryItem='" + inventoryItem + "', pickedForShipmentQuantity='" + pickedForShipmentQuantity + "', processableQuantity='" + processableQuantity + "', shippableQuantity='" + shippableQuantity + "', shippedQuantity='" + shippedQuantity + "', title='" + title + "', totalQuantity='" + totalQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryTransferLineItem that = (InventoryTransferLineItem) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(inventoryItem, that.inventoryItem) &&
        pickedForShipmentQuantity == that.pickedForShipmentQuantity &&
        processableQuantity == that.processableQuantity &&
        shippableQuantity == that.shippableQuantity &&
        shippedQuantity == that.shippedQuantity &&
        Objects.equals(title, that.title) &&
        totalQuantity == that.totalQuantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inventoryItem, pickedForShipmentQuantity, processableQuantity, shippableQuantity, shippedQuantity, title, totalQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The inventory item associated with this line item.
     */
    private InventoryItem inventoryItem;

    /**
     * The quantity of the item that has been picked for a draft shipment but not yet shipped.
     */
    private int pickedForShipmentQuantity;

    /**
     * The quantity of the item that can be actioned upon, such as editing the item
     * quantity on the transfer or adding to a shipment.
     */
    private int processableQuantity;

    /**
     * The quantity of the item that can be shipped.
     */
    private int shippableQuantity;

    /**
     * The quantity of the item that has been shipped.
     */
    private int shippedQuantity;

    /**
     * The title of the product associated with this line item.
     */
    private String title;

    /**
     * The total quantity of items being transferred.
     */
    private int totalQuantity;

    public InventoryTransferLineItem build() {
      InventoryTransferLineItem result = new InventoryTransferLineItem();
      result.id = this.id;
      result.inventoryItem = this.inventoryItem;
      result.pickedForShipmentQuantity = this.pickedForShipmentQuantity;
      result.processableQuantity = this.processableQuantity;
      result.shippableQuantity = this.shippableQuantity;
      result.shippedQuantity = this.shippedQuantity;
      result.title = this.title;
      result.totalQuantity = this.totalQuantity;
      return result;
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
     * The quantity of the item that has been picked for a draft shipment but not yet shipped.
     */
    public Builder pickedForShipmentQuantity(int pickedForShipmentQuantity) {
      this.pickedForShipmentQuantity = pickedForShipmentQuantity;
      return this;
    }

    /**
     * The quantity of the item that can be actioned upon, such as editing the item
     * quantity on the transfer or adding to a shipment.
     */
    public Builder processableQuantity(int processableQuantity) {
      this.processableQuantity = processableQuantity;
      return this;
    }

    /**
     * The quantity of the item that can be shipped.
     */
    public Builder shippableQuantity(int shippableQuantity) {
      this.shippableQuantity = shippableQuantity;
      return this;
    }

    /**
     * The quantity of the item that has been shipped.
     */
    public Builder shippedQuantity(int shippedQuantity) {
      this.shippedQuantity = shippedQuantity;
      return this;
    }

    /**
     * The title of the product associated with this line item.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The total quantity of items being transferred.
     */
    public Builder totalQuantity(int totalQuantity) {
      this.totalQuantity = totalQuantity;
      return this;
    }
  }
}
