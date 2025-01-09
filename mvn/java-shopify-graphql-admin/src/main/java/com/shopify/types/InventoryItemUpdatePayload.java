package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryItemUpdate` mutation.
 */
public class InventoryItemUpdatePayload {
  /**
   * The inventory item that was updated.
   */
  private InventoryItem inventoryItem;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public InventoryItemUpdatePayload() {
  }

  /**
   * The inventory item that was updated.
   */
  public InventoryItem getInventoryItem() {
    return inventoryItem;
  }

  public void setInventoryItem(InventoryItem inventoryItem) {
    this.inventoryItem = inventoryItem;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventoryItemUpdatePayload{inventoryItem='" + inventoryItem + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryItemUpdatePayload that = (InventoryItemUpdatePayload) o;
    return Objects.equals(inventoryItem, that.inventoryItem) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryItem, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The inventory item that was updated.
     */
    private InventoryItem inventoryItem;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public InventoryItemUpdatePayload build() {
      InventoryItemUpdatePayload result = new InventoryItemUpdatePayload();
      result.inventoryItem = this.inventoryItem;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The inventory item that was updated.
     */
    public Builder inventoryItem(InventoryItem inventoryItem) {
      this.inventoryItem = inventoryItem;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
