package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryTransferEdit` mutation.
 */
public class InventoryTransferEditPayload {
  /**
   * The edited inventory transfer.
   */
  private InventoryTransfer inventoryTransfer;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<InventoryTransferEditUserError> userErrors;

  public InventoryTransferEditPayload() {
  }

  /**
   * The edited inventory transfer.
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
  public List<InventoryTransferEditUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<InventoryTransferEditUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventoryTransferEditPayload{inventoryTransfer='" + inventoryTransfer + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryTransferEditPayload that = (InventoryTransferEditPayload) o;
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
     * The edited inventory transfer.
     */
    private InventoryTransfer inventoryTransfer;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<InventoryTransferEditUserError> userErrors;

    public InventoryTransferEditPayload build() {
      InventoryTransferEditPayload result = new InventoryTransferEditPayload();
      result.inventoryTransfer = this.inventoryTransfer;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The edited inventory transfer.
     */
    public Builder inventoryTransfer(InventoryTransfer inventoryTransfer) {
      this.inventoryTransfer = inventoryTransfer;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<InventoryTransferEditUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
