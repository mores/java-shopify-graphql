package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryShipmentAddItems` mutation.
 */
public class InventoryShipmentAddItemsPayload {
  /**
   * The list of added line items.
   */
  private List<InventoryShipmentLineItem> addedItems;

  /**
   * The inventory shipment with the added items.
   */
  private InventoryShipment inventoryShipment;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<InventoryShipmentAddItemsUserError> userErrors;

  public InventoryShipmentAddItemsPayload() {
  }

  /**
   * The list of added line items.
   */
  public List<InventoryShipmentLineItem> getAddedItems() {
    return addedItems;
  }

  public void setAddedItems(List<InventoryShipmentLineItem> addedItems) {
    this.addedItems = addedItems;
  }

  /**
   * The inventory shipment with the added items.
   */
  public InventoryShipment getInventoryShipment() {
    return inventoryShipment;
  }

  public void setInventoryShipment(InventoryShipment inventoryShipment) {
    this.inventoryShipment = inventoryShipment;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<InventoryShipmentAddItemsUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<InventoryShipmentAddItemsUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventoryShipmentAddItemsPayload{addedItems='" + addedItems + "', inventoryShipment='" + inventoryShipment + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryShipmentAddItemsPayload that = (InventoryShipmentAddItemsPayload) o;
    return Objects.equals(addedItems, that.addedItems) &&
        Objects.equals(inventoryShipment, that.inventoryShipment) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedItems, inventoryShipment, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of added line items.
     */
    private List<InventoryShipmentLineItem> addedItems;

    /**
     * The inventory shipment with the added items.
     */
    private InventoryShipment inventoryShipment;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<InventoryShipmentAddItemsUserError> userErrors;

    public InventoryShipmentAddItemsPayload build() {
      InventoryShipmentAddItemsPayload result = new InventoryShipmentAddItemsPayload();
      result.addedItems = this.addedItems;
      result.inventoryShipment = this.inventoryShipment;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The list of added line items.
     */
    public Builder addedItems(List<InventoryShipmentLineItem> addedItems) {
      this.addedItems = addedItems;
      return this;
    }

    /**
     * The inventory shipment with the added items.
     */
    public Builder inventoryShipment(InventoryShipment inventoryShipment) {
      this.inventoryShipment = inventoryShipment;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<InventoryShipmentAddItemsUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
