package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class InventoryBulkToggleActivationPayload {
  
  private InventoryItem inventoryItem;

  
  private List<InventoryLevel> inventoryLevels;

  
  private List<InventoryBulkToggleActivationUserError> userErrors;

  public InventoryBulkToggleActivationPayload() {
  }

  
  public InventoryItem getInventoryItem() {
    return inventoryItem;
  }

  public void setInventoryItem(InventoryItem inventoryItem) {
    this.inventoryItem = inventoryItem;
  }

  
  public List<InventoryLevel> getInventoryLevels() {
    return inventoryLevels;
  }

  public void setInventoryLevels(List<InventoryLevel> inventoryLevels) {
    this.inventoryLevels = inventoryLevels;
  }

  
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
    
    private InventoryItem inventoryItem;

    
    private List<InventoryLevel> inventoryLevels;

    
    private List<InventoryBulkToggleActivationUserError> userErrors;

    public InventoryBulkToggleActivationPayload build() {
      InventoryBulkToggleActivationPayload result = new InventoryBulkToggleActivationPayload();
      result.inventoryItem = this.inventoryItem;
      result.inventoryLevels = this.inventoryLevels;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder inventoryItem(InventoryItem inventoryItem) {
      this.inventoryItem = inventoryItem;
      return this;
    }

    
    public Builder inventoryLevels(List<InventoryLevel> inventoryLevels) {
      this.inventoryLevels = inventoryLevels;
      return this;
    }

    
    public Builder userErrors(List<InventoryBulkToggleActivationUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
