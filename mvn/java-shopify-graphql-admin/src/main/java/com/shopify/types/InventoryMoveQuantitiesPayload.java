package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `inventoryMoveQuantities` mutation.
 */
public class InventoryMoveQuantitiesPayload {
  /**
   * The group of changes made by the operation.
   */
  private InventoryAdjustmentGroup inventoryAdjustmentGroup;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<InventoryMoveQuantitiesUserError> userErrors;

  public InventoryMoveQuantitiesPayload() {
  }

  /**
   * The group of changes made by the operation.
   */
  public InventoryAdjustmentGroup getInventoryAdjustmentGroup() {
    return inventoryAdjustmentGroup;
  }

  public void setInventoryAdjustmentGroup(InventoryAdjustmentGroup inventoryAdjustmentGroup) {
    this.inventoryAdjustmentGroup = inventoryAdjustmentGroup;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<InventoryMoveQuantitiesUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<InventoryMoveQuantitiesUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventoryMoveQuantitiesPayload{inventoryAdjustmentGroup='" + inventoryAdjustmentGroup + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryMoveQuantitiesPayload that = (InventoryMoveQuantitiesPayload) o;
    return Objects.equals(inventoryAdjustmentGroup, that.inventoryAdjustmentGroup) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryAdjustmentGroup, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The group of changes made by the operation.
     */
    private InventoryAdjustmentGroup inventoryAdjustmentGroup;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<InventoryMoveQuantitiesUserError> userErrors;

    public InventoryMoveQuantitiesPayload build() {
      InventoryMoveQuantitiesPayload result = new InventoryMoveQuantitiesPayload();
      result.inventoryAdjustmentGroup = this.inventoryAdjustmentGroup;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The group of changes made by the operation.
     */
    public Builder inventoryAdjustmentGroup(InventoryAdjustmentGroup inventoryAdjustmentGroup) {
      this.inventoryAdjustmentGroup = inventoryAdjustmentGroup;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<InventoryMoveQuantitiesUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
