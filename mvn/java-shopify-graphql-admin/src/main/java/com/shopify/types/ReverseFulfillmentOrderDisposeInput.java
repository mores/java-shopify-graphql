package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ReverseFulfillmentOrderDisposeInput {
  
  private String reverseFulfillmentOrderLineItemId;

  
  private int quantity;

  
  private String locationId;

  
  private ReverseFulfillmentOrderDispositionType dispositionType;

  public ReverseFulfillmentOrderDisposeInput() {
  }

  
  public String getReverseFulfillmentOrderLineItemId() {
    return reverseFulfillmentOrderLineItemId;
  }

  public void setReverseFulfillmentOrderLineItemId(String reverseFulfillmentOrderLineItemId) {
    this.reverseFulfillmentOrderLineItemId = reverseFulfillmentOrderLineItemId;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  
  public ReverseFulfillmentOrderDispositionType getDispositionType() {
    return dispositionType;
  }

  public void setDispositionType(ReverseFulfillmentOrderDispositionType dispositionType) {
    this.dispositionType = dispositionType;
  }

  @Override
  public String toString() {
    return "ReverseFulfillmentOrderDisposeInput{reverseFulfillmentOrderLineItemId='" + reverseFulfillmentOrderLineItemId + "', quantity='" + quantity + "', locationId='" + locationId + "', dispositionType='" + dispositionType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseFulfillmentOrderDisposeInput that = (ReverseFulfillmentOrderDisposeInput) o;
    return Objects.equals(reverseFulfillmentOrderLineItemId, that.reverseFulfillmentOrderLineItemId) &&
        quantity == that.quantity &&
        Objects.equals(locationId, that.locationId) &&
        Objects.equals(dispositionType, that.dispositionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reverseFulfillmentOrderLineItemId, quantity, locationId, dispositionType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String reverseFulfillmentOrderLineItemId;

    
    private int quantity;

    
    private String locationId;

    
    private ReverseFulfillmentOrderDispositionType dispositionType;

    public ReverseFulfillmentOrderDisposeInput build() {
      ReverseFulfillmentOrderDisposeInput result = new ReverseFulfillmentOrderDisposeInput();
      result.reverseFulfillmentOrderLineItemId = this.reverseFulfillmentOrderLineItemId;
      result.quantity = this.quantity;
      result.locationId = this.locationId;
      result.dispositionType = this.dispositionType;
      return result;
    }

    
    public Builder reverseFulfillmentOrderLineItemId(String reverseFulfillmentOrderLineItemId) {
      this.reverseFulfillmentOrderLineItemId = reverseFulfillmentOrderLineItemId;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    
    public Builder dispositionType(ReverseFulfillmentOrderDispositionType dispositionType) {
      this.dispositionType = dispositionType;
      return this;
    }
  }
}
