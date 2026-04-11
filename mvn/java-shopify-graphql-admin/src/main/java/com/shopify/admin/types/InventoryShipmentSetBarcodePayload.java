package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryShipmentSetBarcode` mutation.
 */
public class InventoryShipmentSetBarcodePayload {
  /**
   * The inventory shipment with the updated barcode.
   */
  private InventoryShipment inventoryShipment;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<InventoryShipmentSetBarcodeUserError> userErrors;

  public InventoryShipmentSetBarcodePayload() {
  }

  /**
   * The inventory shipment with the updated barcode.
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
  public List<InventoryShipmentSetBarcodeUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<InventoryShipmentSetBarcodeUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventoryShipmentSetBarcodePayload{inventoryShipment='" + inventoryShipment + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryShipmentSetBarcodePayload that = (InventoryShipmentSetBarcodePayload) o;
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
     * The inventory shipment with the updated barcode.
     */
    private InventoryShipment inventoryShipment;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<InventoryShipmentSetBarcodeUserError> userErrors;

    public InventoryShipmentSetBarcodePayload build() {
      InventoryShipmentSetBarcodePayload result = new InventoryShipmentSetBarcodePayload();
      result.inventoryShipment = this.inventoryShipment;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The inventory shipment with the updated barcode.
     */
    public Builder inventoryShipment(InventoryShipment inventoryShipment) {
      this.inventoryShipment = inventoryShipment;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<InventoryShipmentSetBarcodeUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
