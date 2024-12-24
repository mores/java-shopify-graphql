package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class InventoryLevelInput {
  
  private int availableQuantity;

  
  private String locationId;

  public InventoryLevelInput() {
  }

  
  public int getAvailableQuantity() {
    return availableQuantity;
  }

  public void setAvailableQuantity(int availableQuantity) {
    this.availableQuantity = availableQuantity;
  }

  
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  @Override
  public String toString() {
    return "InventoryLevelInput{availableQuantity='" + availableQuantity + "', locationId='" + locationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryLevelInput that = (InventoryLevelInput) o;
    return availableQuantity == that.availableQuantity &&
        Objects.equals(locationId, that.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableQuantity, locationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int availableQuantity;

    
    private String locationId;

    public InventoryLevelInput build() {
      InventoryLevelInput result = new InventoryLevelInput();
      result.availableQuantity = this.availableQuantity;
      result.locationId = this.locationId;
      return result;
    }

    
    public Builder availableQuantity(int availableQuantity) {
      this.availableQuantity = availableQuantity;
      return this;
    }

    
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }
  }
}
