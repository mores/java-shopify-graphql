package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FulfillmentInput {
  
  private FulfillmentTrackingInput trackingInfo;

  
  private Boolean notifyCustomer = false;

  
  private List<FulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder;

  
  private FulfillmentOriginAddressInput originAddress;

  public FulfillmentInput() {
  }

  
  public FulfillmentTrackingInput getTrackingInfo() {
    return trackingInfo;
  }

  public void setTrackingInfo(FulfillmentTrackingInput trackingInfo) {
    this.trackingInfo = trackingInfo;
  }

  
  public Boolean getNotifyCustomer() {
    return notifyCustomer;
  }

  public void setNotifyCustomer(Boolean notifyCustomer) {
    this.notifyCustomer = notifyCustomer;
  }

  
  public List<FulfillmentOrderLineItemsInput> getLineItemsByFulfillmentOrder() {
    return lineItemsByFulfillmentOrder;
  }

  public void setLineItemsByFulfillmentOrder(
      List<FulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder) {
    this.lineItemsByFulfillmentOrder = lineItemsByFulfillmentOrder;
  }

  
  public FulfillmentOriginAddressInput getOriginAddress() {
    return originAddress;
  }

  public void setOriginAddress(FulfillmentOriginAddressInput originAddress) {
    this.originAddress = originAddress;
  }

  @Override
  public String toString() {
    return "FulfillmentInput{trackingInfo='" + trackingInfo + "', notifyCustomer='" + notifyCustomer + "', lineItemsByFulfillmentOrder='" + lineItemsByFulfillmentOrder + "', originAddress='" + originAddress + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentInput that = (FulfillmentInput) o;
    return Objects.equals(trackingInfo, that.trackingInfo) &&
        Objects.equals(notifyCustomer, that.notifyCustomer) &&
        Objects.equals(lineItemsByFulfillmentOrder, that.lineItemsByFulfillmentOrder) &&
        Objects.equals(originAddress, that.originAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingInfo, notifyCustomer, lineItemsByFulfillmentOrder, originAddress);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private FulfillmentTrackingInput trackingInfo;

    
    private Boolean notifyCustomer = false;

    
    private List<FulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder;

    
    private FulfillmentOriginAddressInput originAddress;

    public FulfillmentInput build() {
      FulfillmentInput result = new FulfillmentInput();
      result.trackingInfo = this.trackingInfo;
      result.notifyCustomer = this.notifyCustomer;
      result.lineItemsByFulfillmentOrder = this.lineItemsByFulfillmentOrder;
      result.originAddress = this.originAddress;
      return result;
    }

    
    public Builder trackingInfo(FulfillmentTrackingInput trackingInfo) {
      this.trackingInfo = trackingInfo;
      return this;
    }

    
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      return this;
    }

    
    public Builder lineItemsByFulfillmentOrder(
        List<FulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder) {
      this.lineItemsByFulfillmentOrder = lineItemsByFulfillmentOrder;
      return this;
    }

    
    public Builder originAddress(FulfillmentOriginAddressInput originAddress) {
      this.originAddress = originAddress;
      return this;
    }
  }
}
