package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class InventorySetQuantitiesPayload {
  
  private InventoryAdjustmentGroup inventoryAdjustmentGroup;

  
  private List<InventorySetQuantitiesUserError> userErrors;

  public InventorySetQuantitiesPayload() {
  }

  
  public InventoryAdjustmentGroup getInventoryAdjustmentGroup() {
    return inventoryAdjustmentGroup;
  }

  public void setInventoryAdjustmentGroup(InventoryAdjustmentGroup inventoryAdjustmentGroup) {
    this.inventoryAdjustmentGroup = inventoryAdjustmentGroup;
  }

  
  public List<InventorySetQuantitiesUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<InventorySetQuantitiesUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "InventorySetQuantitiesPayload{inventoryAdjustmentGroup='" + inventoryAdjustmentGroup + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventorySetQuantitiesPayload that = (InventorySetQuantitiesPayload) o;
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
    
    private InventoryAdjustmentGroup inventoryAdjustmentGroup;

    
    private List<InventorySetQuantitiesUserError> userErrors;

    public InventorySetQuantitiesPayload build() {
      InventorySetQuantitiesPayload result = new InventorySetQuantitiesPayload();
      result.inventoryAdjustmentGroup = this.inventoryAdjustmentGroup;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder inventoryAdjustmentGroup(InventoryAdjustmentGroup inventoryAdjustmentGroup) {
      this.inventoryAdjustmentGroup = inventoryAdjustmentGroup;
      return this;
    }

    
    public Builder userErrors(List<InventorySetQuantitiesUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
