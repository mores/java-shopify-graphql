package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class RefundLineItemInput {
  
  private String lineItemId;

  
  private int quantity;

  
  private RefundLineItemRestockType restockType;

  
  private String locationId;

  public RefundLineItemInput() {
  }

  
  public String getLineItemId() {
    return lineItemId;
  }

  public void setLineItemId(String lineItemId) {
    this.lineItemId = lineItemId;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public RefundLineItemRestockType getRestockType() {
    return restockType;
  }

  public void setRestockType(RefundLineItemRestockType restockType) {
    this.restockType = restockType;
  }

  
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  @Override
  public String toString() {
    return "RefundLineItemInput{lineItemId='" + lineItemId + "', quantity='" + quantity + "', restockType='" + restockType + "', locationId='" + locationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RefundLineItemInput that = (RefundLineItemInput) o;
    return Objects.equals(lineItemId, that.lineItemId) &&
        quantity == that.quantity &&
        Objects.equals(restockType, that.restockType) &&
        Objects.equals(locationId, that.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItemId, quantity, restockType, locationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String lineItemId;

    
    private int quantity;

    
    private RefundLineItemRestockType restockType;

    
    private String locationId;

    public RefundLineItemInput build() {
      RefundLineItemInput result = new RefundLineItemInput();
      result.lineItemId = this.lineItemId;
      result.quantity = this.quantity;
      result.restockType = this.restockType;
      result.locationId = this.locationId;
      return result;
    }

    
    public Builder lineItemId(String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder restockType(RefundLineItemRestockType restockType) {
      this.restockType = restockType;
      return this;
    }

    
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }
  }
}
