package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryBulkToggleActivation` mutation.
 */
public class InventoryBulkToggleActivationPayload {
  /**
   * The inventory item that was updated.
   */
  private InventoryItem inventoryItem;

  /**
   * The activated inventory levels.
   */
  private List<InventoryLevel> inventoryLevels;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<InventoryBulkToggleActivationUserError> userErrors;

  public InventoryBulkToggleActivationPayload() {
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
   * The activated inventory levels.
   */
  public List<InventoryLevel> getInventoryLevels() {
    return inventoryLevels;
  }

  public void setInventoryLevels(List<InventoryLevel> inventoryLevels) {
    this.inventoryLevels = inventoryLevels;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<InventoryBulkToggleActivationUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<InventoryBulkToggleActivationUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventoryBulkToggleActivationPayload{inventoryItem='" + inventoryItem + "', inventoryLevels='" + inventoryLevels + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryBulkToggleActivationPayload that = (InventoryBulkToggleActivationPayload) o;
    return Objects.equals(inventoryItem, that.inventoryItem) &&
        Objects.equals(inventoryLevels, that.inventoryLevels) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryItem, inventoryLevels, userErrors);
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
     * The activated inventory levels.
     */
    private List<InventoryLevel> inventoryLevels;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<InventoryBulkToggleActivationUserError> userErrors;

    public InventoryBulkToggleActivationPayload build() {
      InventoryBulkToggleActivationPayload result = new InventoryBulkToggleActivationPayload();
      result.inventoryItem = this.inventoryItem;
      result.inventoryLevels = this.inventoryLevels;
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
     * The activated inventory levels.
     */
    public Builder inventoryLevels(List<InventoryLevel> inventoryLevels) {
      this.inventoryLevels = inventoryLevels;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<InventoryBulkToggleActivationUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
