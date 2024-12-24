package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OrderCreateFulfillmentInput {
  
  private String locationId;

  
  private FulfillmentOriginAddressInput originAddress;

  
  private Boolean notifyCustomer = false;

  
  private FulfillmentEventStatus shipmentStatus;

  
  private String trackingNumber;

  
  private String trackingCompany;

  public OrderCreateFulfillmentInput() {
  }

  
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  
  public FulfillmentOriginAddressInput getOriginAddress() {
    return originAddress;
  }

  public void setOriginAddress(FulfillmentOriginAddressInput originAddress) {
    this.originAddress = originAddress;
  }

  
  public Boolean getNotifyCustomer() {
    return notifyCustomer;
  }

  public void setNotifyCustomer(Boolean notifyCustomer) {
    this.notifyCustomer = notifyCustomer;
  }

  
  public FulfillmentEventStatus getShipmentStatus() {
    return shipmentStatus;
  }

  public void setShipmentStatus(FulfillmentEventStatus shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
  }

  
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  
  public String getTrackingCompany() {
    return trackingCompany;
  }

  public void setTrackingCompany(String trackingCompany) {
    this.trackingCompany = trackingCompany;
  }

  @Override
  public String toString() {
    return "OrderCreateFulfillmentInput{locationId='" + locationId + "', originAddress='" + originAddress + "', notifyCustomer='" + notifyCustomer + "', shipmentStatus='" + shipmentStatus + "', trackingNumber='" + trackingNumber + "', trackingCompany='" + trackingCompany + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateFulfillmentInput that = (OrderCreateFulfillmentInput) o;
    return Objects.equals(locationId, that.locationId) &&
        Objects.equals(originAddress, that.originAddress) &&
        Objects.equals(notifyCustomer, that.notifyCustomer) &&
        Objects.equals(shipmentStatus, that.shipmentStatus) &&
        Objects.equals(trackingNumber, that.trackingNumber) &&
        Objects.equals(trackingCompany, that.trackingCompany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, originAddress, notifyCustomer, shipmentStatus, trackingNumber, trackingCompany);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String locationId;

    
    private FulfillmentOriginAddressInput originAddress;

    
    private Boolean notifyCustomer = false;

    
    private FulfillmentEventStatus shipmentStatus;

    
    private String trackingNumber;

    
    private String trackingCompany;

    public OrderCreateFulfillmentInput build() {
      OrderCreateFulfillmentInput result = new OrderCreateFulfillmentInput();
      result.locationId = this.locationId;
      result.originAddress = this.originAddress;
      result.notifyCustomer = this.notifyCustomer;
      result.shipmentStatus = this.shipmentStatus;
      result.trackingNumber = this.trackingNumber;
      result.trackingCompany = this.trackingCompany;
      return result;
    }

    
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    
    public Builder originAddress(FulfillmentOriginAddressInput originAddress) {
      this.originAddress = originAddress;
      return this;
    }

    
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      return this;
    }

    
    public Builder shipmentStatus(FulfillmentEventStatus shipmentStatus) {
      this.shipmentStatus = shipmentStatus;
      return this;
    }

    
    public Builder trackingNumber(String trackingNumber) {
      this.trackingNumber = trackingNumber;
      return this;
    }

    
    public Builder trackingCompany(String trackingCompany) {
      this.trackingCompany = trackingCompany;
      return this;
    }
  }
}
