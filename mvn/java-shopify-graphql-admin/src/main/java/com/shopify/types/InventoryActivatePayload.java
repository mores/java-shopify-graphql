package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class InventoryActivatePayload {
  
  private InventoryLevel inventoryLevel;

  
  private List<UserError> userErrors;

  public InventoryActivatePayload() {
  }

  
  public InventoryLevel getInventoryLevel() {
    return inventoryLevel;
  }

  public void setInventoryLevel(InventoryLevel inventoryLevel) {
    this.inventoryLevel = inventoryLevel;
  }

  
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
    
    private InventoryLevel inventoryLevel;

    
    private List<UserError> userErrors;

    public InventoryActivatePayload build() {
      InventoryActivatePayload result = new InventoryActivatePayload();
      result.inventoryLevel = this.inventoryLevel;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder inventoryLevel(InventoryLevel inventoryLevel) {
      this.inventoryLevel = inventoryLevel;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
