package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryShipmentUpdateItemQuantities` mutation.
 */
public class InventoryShipmentUpdateItemQuantitiesPayload {
  /**
   * The inventory shipment with updated item quantities.
   */
  private InventoryShipment shipment;

  /**
   * The updated item quantities.
   */
  private List<InventoryShipmentLineItem> updatedLineItems;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<InventoryShipmentUpdateItemQuantitiesUserError> userErrors;

  public InventoryShipmentUpdateItemQuantitiesPayload() {
  }

  /**
   * The inventory shipment with updated item quantities.
   */
  public InventoryShipment getShipment() {
    return shipment;
  }

  public void setShipment(InventoryShipment shipment) {
    this.shipment = shipment;
  }

  /**
   * The updated item quantities.
   */
  public List<InventoryShipmentLineItem> getUpdatedLineItems() {
    return updatedLineItems;
  }

  public void setUpdatedLineItems(List<InventoryShipmentLineItem> updatedLineItems) {
    this.updatedLineItems = updatedLineItems;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<InventoryShipmentUpdateItemQuantitiesUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<InventoryShipmentUpdateItemQuantitiesUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventoryShipmentUpdateItemQuantitiesPayload{shipment='" + shipment + "', updatedLineItems='" + updatedLineItems + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryShipmentUpdateItemQuantitiesPayload that = (InventoryShipmentUpdateItemQuantitiesPayload) o;
    return Objects.equals(shipment, that.shipment) &&
        Objects.equals(updatedLineItems, that.updatedLineItems) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipment, updatedLineItems, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The inventory shipment with updated item quantities.
     */
    private InventoryShipment shipment;

    /**
     * The updated item quantities.
     */
    private List<InventoryShipmentLineItem> updatedLineItems;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<InventoryShipmentUpdateItemQuantitiesUserError> userErrors;

    public InventoryShipmentUpdateItemQuantitiesPayload build() {
      InventoryShipmentUpdateItemQuantitiesPayload result = new InventoryShipmentUpdateItemQuantitiesPayload();
      result.shipment = this.shipment;
      result.updatedLineItems = this.updatedLineItems;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The inventory shipment with updated item quantities.
     */
    public Builder shipment(InventoryShipment shipment) {
      this.shipment = shipment;
      return this;
    }

    /**
     * The updated item quantities.
     */
    public Builder updatedLineItems(List<InventoryShipmentLineItem> updatedLineItems) {
      this.updatedLineItems = updatedLineItems;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<InventoryShipmentUpdateItemQuantitiesUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
