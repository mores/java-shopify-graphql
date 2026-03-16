package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryTransferDuplicate` mutation.
 */
public class InventoryTransferDuplicatePayload {
  /**
   * The duplicated inventory transfer.
   */
  private InventoryTransfer inventoryTransfer;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<InventoryTransferDuplicateUserError> userErrors;

  public InventoryTransferDuplicatePayload() {
  }

  /**
   * The duplicated inventory transfer.
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
  public List<InventoryTransferDuplicateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<InventoryTransferDuplicateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventoryTransferDuplicatePayload{inventoryTransfer='" + inventoryTransfer + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryTransferDuplicatePayload that = (InventoryTransferDuplicatePayload) o;
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
     * The duplicated inventory transfer.
     */
    private InventoryTransfer inventoryTransfer;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<InventoryTransferDuplicateUserError> userErrors;

    public InventoryTransferDuplicatePayload build() {
      InventoryTransferDuplicatePayload result = new InventoryTransferDuplicatePayload();
      result.inventoryTransfer = this.inventoryTransfer;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The duplicated inventory transfer.
     */
    public Builder inventoryTransfer(InventoryTransfer inventoryTransfer) {
      this.inventoryTransfer = inventoryTransfer;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<InventoryTransferDuplicateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
