package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryTransferMarkAsReadyToShip` mutation.
 */
public class InventoryTransferMarkAsReadyToShipPayload {
  /**
   * The ready to ship inventory transfer.
   */
  private InventoryTransfer inventoryTransfer;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<InventoryTransferMarkAsReadyToShipUserError> userErrors;

  public InventoryTransferMarkAsReadyToShipPayload() {
  }

  /**
   * The ready to ship inventory transfer.
   */
  public InventoryTransfer getInventoryTransfer() {
    return inventoryTransfer;
  }

  public void setInventoryTransfer(InventoryTransfer inventoryTransfer) {
    this.inventoryTransfer = inventoryTransfer;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<InventoryTransferMarkAsReadyToShipUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<InventoryTransferMarkAsReadyToShipUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventoryTransferMarkAsReadyToShipPayload{inventoryTransfer='" + inventoryTransfer + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryTransferMarkAsReadyToShipPayload that = (InventoryTransferMarkAsReadyToShipPayload) o;
    return Objects.equals(inventoryTransfer, that.inventoryTransfer) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryTransfer, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ready to ship inventory transfer.
     */
    private InventoryTransfer inventoryTransfer;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<InventoryTransferMarkAsReadyToShipUserError> userErrors;

    public InventoryTransferMarkAsReadyToShipPayload build() {
      InventoryTransferMarkAsReadyToShipPayload result = new InventoryTransferMarkAsReadyToShipPayload();
      result.inventoryTransfer = this.inventoryTransfer;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ready to ship inventory transfer.
     */
    public Builder inventoryTransfer(InventoryTransfer inventoryTransfer) {
      this.inventoryTransfer = inventoryTransfer;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<InventoryTransferMarkAsReadyToShipUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
