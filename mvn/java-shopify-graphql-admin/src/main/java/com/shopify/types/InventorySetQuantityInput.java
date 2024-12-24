package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class InventorySetQuantityInput {
  
  private String inventoryItemId;

  
  private String locationId;

  
  private int quantity;

  public InventorySetQuantityInput() {
  }

  
  public String getInventoryItemId() {
    return inventoryItemId;
  }

  public void setInventoryItemId(String inventoryItemId) {
    this.inventoryItemId = inventoryItemId;
  }

  
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "InventorySetQuantityInput{inventoryItemId='" + inventoryItemId + "', locationId='" + locationId + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventorySetQuantityInput that = (InventorySetQuantityInput) o;
    return Objects.equals(inventoryItemId, that.inventoryItemId) &&
        Objects.equals(locationId, that.locationId) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryItemId, locationId, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String inventoryItemId;

    
    private String locationId;

    
    private int quantity;

    public InventorySetQuantityInput build() {
      InventorySetQuantityInput result = new InventorySetQuantityInput();
      result.inventoryItemId = this.inventoryItemId;
      result.locationId = this.locationId;
      result.quantity = this.quantity;
      return result;
    }

    
    public Builder inventoryItemId(String inventoryItemId) {
      this.inventoryItemId = inventoryItemId;
      return this;
    }

    
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
