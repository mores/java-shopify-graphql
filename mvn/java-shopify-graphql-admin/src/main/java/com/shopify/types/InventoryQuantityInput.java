package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class InventoryQuantityInput {
  
  private String inventoryItemId;

  
  private String locationId;

  
  private int quantity;

  
  private Integer compareQuantity;

  public InventoryQuantityInput() {
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

  
  public Integer getCompareQuantity() {
    return compareQuantity;
  }

  public void setCompareQuantity(Integer compareQuantity) {
    this.compareQuantity = compareQuantity;
  }

  @Override
  public String toString() {
    return "InventoryQuantityInput{inventoryItemId='" + inventoryItemId + "', locationId='" + locationId + "', quantity='" + quantity + "', compareQuantity='" + compareQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryQuantityInput that = (InventoryQuantityInput) o;
    return Objects.equals(inventoryItemId, that.inventoryItemId) &&
        Objects.equals(locationId, that.locationId) &&
        quantity == that.quantity &&
        Objects.equals(compareQuantity, that.compareQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryItemId, locationId, quantity, compareQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String inventoryItemId;

    
    private String locationId;

    
    private int quantity;

    
    private Integer compareQuantity;

    public InventoryQuantityInput build() {
      InventoryQuantityInput result = new InventoryQuantityInput();
      result.inventoryItemId = this.inventoryItemId;
      result.locationId = this.locationId;
      result.quantity = this.quantity;
      result.compareQuantity = this.compareQuantity;
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

    
    public Builder compareQuantity(Integer compareQuantity) {
      this.compareQuantity = compareQuantity;
      return this;
    }
  }
}
