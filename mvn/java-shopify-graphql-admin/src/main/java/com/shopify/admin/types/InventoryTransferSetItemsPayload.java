package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryTransferSetItems` mutation.
 */
public class InventoryTransferSetItemsPayload {
  /**
   * The Transfer with its line items updated.
   */
  private InventoryTransfer inventoryTransfer;

  /**
   * The updated line items.
   */
  private List<InventoryTransferLineItemUpdate> updatedLineItems;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<InventoryTransferSetItemsUserError> userErrors;

  public InventoryTransferSetItemsPayload() {
  }

  /**
   * The Transfer with its line items updated.
   */
  public InventoryTransfer getInventoryTransfer() {
    return inventoryTransfer;
  }

  public void setInventoryTransfer(InventoryTransfer inventoryTransfer) {
    this.inventoryTransfer = inventoryTransfer;
  }

  /**
   * The updated line items.
   */
  public List<InventoryTransferLineItemUpdate> getUpdatedLineItems() {
    return updatedLineItems;
  }

  public void setUpdatedLineItems(List<InventoryTransferLineItemUpdate> updatedLineItems) {
    this.updatedLineItems = updatedLineItems;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<InventoryTransferSetItemsUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<InventoryTransferSetItemsUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventoryTransferSetItemsPayload{inventoryTransfer='" + inventoryTransfer + "', updatedLineItems='" + updatedLineItems + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryTransferSetItemsPayload that = (InventoryTransferSetItemsPayload) o;
    return Objects.equals(inventoryTransfer, that.inventoryTransfer) &&
        Objects.equals(updatedLineItems, that.updatedLineItems) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryTransfer, updatedLineItems, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The Transfer with its line items updated.
     */
    private InventoryTransfer inventoryTransfer;

    /**
     * The updated line items.
     */
    private List<InventoryTransferLineItemUpdate> updatedLineItems;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<InventoryTransferSetItemsUserError> userErrors;

    public InventoryTransferSetItemsPayload build() {
      InventoryTransferSetItemsPayload result = new InventoryTransferSetItemsPayload();
      result.inventoryTransfer = this.inventoryTransfer;
      result.updatedLineItems = this.updatedLineItems;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The Transfer with its line items updated.
     */
    public Builder inventoryTransfer(InventoryTransfer inventoryTransfer) {
      this.inventoryTransfer = inventoryTransfer;
      return this;
    }

    /**
     * The updated line items.
     */
    public Builder updatedLineItems(List<InventoryTransferLineItemUpdate> updatedLineItems) {
      this.updatedLineItems = updatedLineItems;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<InventoryTransferSetItemsUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
