package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryShipmentRemoveItems` mutation.
 */
public class InventoryShipmentRemoveItemsPayload {
  /**
   * The inventory shipment with items removed.
   */
  private InventoryShipment inventoryShipment;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<InventoryShipmentRemoveItemsUserError> userErrors;

  public InventoryShipmentRemoveItemsPayload() {
  }

  /**
   * The inventory shipment with items removed.
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
  public List<InventoryShipmentRemoveItemsUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<InventoryShipmentRemoveItemsUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventoryShipmentRemoveItemsPayload{inventoryShipment='" + inventoryShipment + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryShipmentRemoveItemsPayload that = (InventoryShipmentRemoveItemsPayload) o;
    return Objects.equals(inventoryShipment, that.inventoryShipment) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryShipment, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The inventory shipment with items removed.
     */
    private InventoryShipment inventoryShipment;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<InventoryShipmentRemoveItemsUserError> userErrors;

    public InventoryShipmentRemoveItemsPayload build() {
      InventoryShipmentRemoveItemsPayload result = new InventoryShipmentRemoveItemsPayload();
      result.inventoryShipment = this.inventoryShipment;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The inventory shipment with items removed.
     */
    public Builder inventoryShipment(InventoryShipment inventoryShipment) {
      this.inventoryShipment = inventoryShipment;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<InventoryShipmentRemoveItemsUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
