package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryActivate` mutation.
 */
public class InventoryActivatePayload {
  /**
   * The inventory level that was activated.
   */
  private InventoryLevel inventoryLevel;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public InventoryActivatePayload() {
  }

  /**
   * The inventory level that was activated.
   */
  public InventoryLevel getInventoryLevel() {
    return inventoryLevel;
  }

  public void setInventoryLevel(InventoryLevel inventoryLevel) {
    this.inventoryLevel = inventoryLevel;
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
    return "InventoryActivatePayload{inventoryLevel='" + inventoryLevel + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryActivatePayload that = (InventoryActivatePayload) o;
    return Objects.equals(inventoryLevel, that.inventoryLevel) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryLevel, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The inventory level that was activated.
     */
    private InventoryLevel inventoryLevel;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public InventoryActivatePayload build() {
      InventoryActivatePayload result = new InventoryActivatePayload();
      result.inventoryLevel = this.inventoryLevel;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The inventory level that was activated.
     */
    public Builder inventoryLevel(InventoryLevel inventoryLevel) {
      this.inventoryLevel = inventoryLevel;
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
