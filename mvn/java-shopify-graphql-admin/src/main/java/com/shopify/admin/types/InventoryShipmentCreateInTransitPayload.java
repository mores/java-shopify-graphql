package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryShipmentCreateInTransit` mutation.
 */
public class InventoryShipmentCreateInTransitPayload {
  /**
   * The created inventory shipment.
   */
  private InventoryShipment inventoryShipment;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<InventoryShipmentCreateInTransitUserError> userErrors;

  public InventoryShipmentCreateInTransitPayload() {
  }

  /**
   * The created inventory shipment.
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
  public List<InventoryShipmentCreateInTransitUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<InventoryShipmentCreateInTransitUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventoryShipmentCreateInTransitPayload{inventoryShipment='" + inventoryShipment + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryShipmentCreateInTransitPayload that = (InventoryShipmentCreateInTransitPayload) o;
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
     * The created inventory shipment.
     */
    private InventoryShipment inventoryShipment;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<InventoryShipmentCreateInTransitUserError> userErrors;

    public InventoryShipmentCreateInTransitPayload build() {
      InventoryShipmentCreateInTransitPayload result = new InventoryShipmentCreateInTransitPayload();
      result.inventoryShipment = this.inventoryShipment;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created inventory shipment.
     */
    public Builder inventoryShipment(InventoryShipment inventoryShipment) {
      this.inventoryShipment = inventoryShipment;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<InventoryShipmentCreateInTransitUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
