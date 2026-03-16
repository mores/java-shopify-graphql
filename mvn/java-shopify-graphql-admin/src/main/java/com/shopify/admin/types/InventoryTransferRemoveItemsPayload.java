package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryTransferRemoveItems` mutation.
 */
public class InventoryTransferRemoveItemsPayload {
  /**
   * The transfer with line items removed.
   */
  private InventoryTransfer inventoryTransfer;

  /**
   * The line items that have had their shippable quantity removed.
   */
  private List<InventoryTransferLineItemUpdate> removedQuantities;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<InventoryTransferRemoveItemsUserError> userErrors;

  public InventoryTransferRemoveItemsPayload() {
  }

  /**
   * The transfer with line items removed.
   */
  public InventoryTransfer getInventoryTransfer() {
    return inventoryTransfer;
  }

  public void setInventoryTransfer(InventoryTransfer inventoryTransfer) {
    this.inventoryTransfer = inventoryTransfer;
  }

  /**
   * The line items that have had their shippable quantity removed.
   */
  public List<InventoryTransferLineItemUpdate> getRemovedQuantities() {
    return removedQuantities;
  }

  public void setRemovedQuantities(List<InventoryTransferLineItemUpdate> removedQuantities) {
    this.removedQuantities = removedQuantities;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<InventoryTransferRemoveItemsUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<InventoryTransferRemoveItemsUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventoryTransferRemoveItemsPayload{inventoryTransfer='" + inventoryTransfer + "', removedQuantities='" + removedQuantities + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryTransferRemoveItemsPayload that = (InventoryTransferRemoveItemsPayload) o;
    return Objects.equals(inventoryTransfer, that.inventoryTransfer) &&
        Objects.equals(removedQuantities, that.removedQuantities) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryTransfer, removedQuantities, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The transfer with line items removed.
     */
    private InventoryTransfer inventoryTransfer;

    /**
     * The line items that have had their shippable quantity removed.
     */
    private List<InventoryTransferLineItemUpdate> removedQuantities;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<InventoryTransferRemoveItemsUserError> userErrors;

    public InventoryTransferRemoveItemsPayload build() {
      InventoryTransferRemoveItemsPayload result = new InventoryTransferRemoveItemsPayload();
      result.inventoryTransfer = this.inventoryTransfer;
      result.removedQuantities = this.removedQuantities;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The transfer with line items removed.
     */
    public Builder inventoryTransfer(InventoryTransfer inventoryTransfer) {
      this.inventoryTransfer = inventoryTransfer;
      return this;
    }

    /**
     * The line items that have had their shippable quantity removed.
     */
    public Builder removedQuantities(List<InventoryTransferLineItemUpdate> removedQuantities) {
      this.removedQuantities = removedQuantities;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<InventoryTransferRemoveItemsUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
