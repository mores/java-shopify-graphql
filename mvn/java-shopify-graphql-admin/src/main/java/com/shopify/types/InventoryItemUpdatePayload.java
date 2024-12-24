package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class InventoryItemUpdatePayload {
  
  private InventoryItem inventoryItem;

  
  private List<UserError> userErrors;

  public InventoryItemUpdatePayload() {
  }

  
  public InventoryItem getInventoryItem() {
    return inventoryItem;
  }

  public void setInventoryItem(InventoryItem inventoryItem) {
    this.inventoryItem = inventoryItem;
  }

  
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
    
    private InventoryItem inventoryItem;

    
    private List<UserError> userErrors;

    public InventoryItemUpdatePayload build() {
      InventoryItemUpdatePayload result = new InventoryItemUpdatePayload();
      result.inventoryItem = this.inventoryItem;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder inventoryItem(InventoryItem inventoryItem) {
      this.inventoryItem = inventoryItem;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
