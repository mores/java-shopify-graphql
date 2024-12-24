package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ProductSetInventoryInput {
  
  private String locationId;

  
  private String name;

  
  private int quantity;

  public ProductSetInventoryInput() {
  }

  
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "ProductSetInventoryInput{locationId='" + locationId + "', name='" + name + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductSetInventoryInput that = (ProductSetInventoryInput) o;
    return Objects.equals(locationId, that.locationId) &&
        Objects.equals(name, that.name) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, name, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String locationId;

    
    private String name;

    
    private int quantity;

    public ProductSetInventoryInput build() {
      ProductSetInventoryInput result = new ProductSetInventoryInput();
      result.locationId = this.locationId;
      result.name = this.name;
      result.quantity = this.quantity;
      return result;
    }

    
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
