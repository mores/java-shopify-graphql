package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryShipmentSetTracking` mutation.
 */
public class InventoryShipmentSetTrackingPayload {
  /**
   * The inventory shipment with the edited tracking info.
   */
  private InventoryShipment inventoryShipment;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<InventoryShipmentSetTrackingUserError> userErrors;

  public InventoryShipmentSetTrackingPayload() {
  }

  /**
   * The inventory shipment with the edited tracking info.
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
  public List<InventoryShipmentSetTrackingUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<InventoryShipmentSetTrackingUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventoryShipmentSetTrackingPayload{inventoryShipment='" + inventoryShipment + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryShipmentSetTrackingPayload that = (InventoryShipmentSetTrackingPayload) o;
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
     * The inventory shipment with the edited tracking info.
     */
    private InventoryShipment inventoryShipment;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<InventoryShipmentSetTrackingUserError> userErrors;

    public InventoryShipmentSetTrackingPayload build() {
      InventoryShipmentSetTrackingPayload result = new InventoryShipmentSetTrackingPayload();
      result.inventoryShipment = this.inventoryShipment;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The inventory shipment with the edited tracking info.
     */
    public Builder inventoryShipment(InventoryShipment inventoryShipment) {
      this.inventoryShipment = inventoryShipment;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<InventoryShipmentSetTrackingUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
