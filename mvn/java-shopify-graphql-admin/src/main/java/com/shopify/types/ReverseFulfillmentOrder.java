package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ReverseFulfillmentOrder implements com.shopify.types.Node {
  
  private String id;

  
  private ReverseFulfillmentOrderLineItemConnection lineItems;

  
  private Order order;

  
  private ReverseDeliveryConnection reverseDeliveries;

  
  private ReverseFulfillmentOrderStatus status;

  
  private ReverseFulfillmentOrderThirdPartyConfirmation thirdPartyConfirmation;

  public ReverseFulfillmentOrder() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public ReverseFulfillmentOrderLineItemConnection getLineItems() {
    return lineItems;
  }

  public void setLineItems(ReverseFulfillmentOrderLineItemConnection lineItems) {
    this.lineItems = lineItems;
  }

  
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  
  public ReverseDeliveryConnection getReverseDeliveries() {
    return reverseDeliveries;
  }

  public void setReverseDeliveries(ReverseDeliveryConnection reverseDeliveries) {
    this.reverseDeliveries = reverseDeliveries;
  }

  
  public ReverseFulfillmentOrderStatus getStatus() {
    return status;
  }

  public void setStatus(ReverseFulfillmentOrderStatus status) {
    this.status = status;
  }

  
  public ReverseFulfillmentOrderThirdPartyConfirmation getThirdPartyConfirmation() {
    return thirdPartyConfirmation;
  }

  public void setThirdPartyConfirmation(
      ReverseFulfillmentOrderThirdPartyConfirmation thirdPartyConfirmation) {
    this.thirdPartyConfirmation = thirdPartyConfirmation;
  }

  @Override
  public String toString() {
    return "ReverseFulfillmentOrder{id='" + id + "', lineItems='" + lineItems + "', order='" + order + "', reverseDeliveries='" + reverseDeliveries + "', status='" + status + "', thirdPartyConfirmation='" + thirdPartyConfirmation + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseFulfillmentOrder that = (ReverseFulfillmentOrder) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(order, that.order) &&
        Objects.equals(reverseDeliveries, that.reverseDeliveries) &&
        Objects.equals(status, that.status) &&
        Objects.equals(thirdPartyConfirmation, that.thirdPartyConfirmation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lineItems, order, reverseDeliveries, status, thirdPartyConfirmation);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private ReverseFulfillmentOrderLineItemConnection lineItems;

    
    private Order order;

    
    private ReverseDeliveryConnection reverseDeliveries;

    
    private ReverseFulfillmentOrderStatus status;

    
    private ReverseFulfillmentOrderThirdPartyConfirmation thirdPartyConfirmation;

    public ReverseFulfillmentOrder build() {
      ReverseFulfillmentOrder result = new ReverseFulfillmentOrder();
      result.id = this.id;
      result.lineItems = this.lineItems;
      result.order = this.order;
      result.reverseDeliveries = this.reverseDeliveries;
      result.status = this.status;
      result.thirdPartyConfirmation = this.thirdPartyConfirmation;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder lineItems(ReverseFulfillmentOrderLineItemConnection lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    
    public Builder reverseDeliveries(ReverseDeliveryConnection reverseDeliveries) {
      this.reverseDeliveries = reverseDeliveries;
      return this;
    }

    
    public Builder status(ReverseFulfillmentOrderStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder thirdPartyConfirmation(
        ReverseFulfillmentOrderThirdPartyConfirmation thirdPartyConfirmation) {
      this.thirdPartyConfirmation = thirdPartyConfirmation;
      return this;
    }
  }
}
