package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ReverseDelivery implements com.shopify.types.Node {
  
  private ReverseDeliveryDeliverable deliverable;

  
  private String id;

  
  private ReverseDeliveryLineItemConnection reverseDeliveryLineItems;

  
  private ReverseFulfillmentOrder reverseFulfillmentOrder;

  public ReverseDelivery() {
  }

  
  public ReverseDeliveryDeliverable getDeliverable() {
    return deliverable;
  }

  public void setDeliverable(ReverseDeliveryDeliverable deliverable) {
    this.deliverable = deliverable;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public ReverseDeliveryLineItemConnection getReverseDeliveryLineItems() {
    return reverseDeliveryLineItems;
  }

  public void setReverseDeliveryLineItems(
      ReverseDeliveryLineItemConnection reverseDeliveryLineItems) {
    this.reverseDeliveryLineItems = reverseDeliveryLineItems;
  }

  
  public ReverseFulfillmentOrder getReverseFulfillmentOrder() {
    return reverseFulfillmentOrder;
  }

  public void setReverseFulfillmentOrder(ReverseFulfillmentOrder reverseFulfillmentOrder) {
    this.reverseFulfillmentOrder = reverseFulfillmentOrder;
  }

  @Override
  public String toString() {
    return "ReverseDelivery{deliverable='" + deliverable + "', id='" + id + "', reverseDeliveryLineItems='" + reverseDeliveryLineItems + "', reverseFulfillmentOrder='" + reverseFulfillmentOrder + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseDelivery that = (ReverseDelivery) o;
    return Objects.equals(deliverable, that.deliverable) &&
        Objects.equals(id, that.id) &&
        Objects.equals(reverseDeliveryLineItems, that.reverseDeliveryLineItems) &&
        Objects.equals(reverseFulfillmentOrder, that.reverseFulfillmentOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliverable, id, reverseDeliveryLineItems, reverseFulfillmentOrder);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ReverseDeliveryDeliverable deliverable;

    
    private String id;

    
    private ReverseDeliveryLineItemConnection reverseDeliveryLineItems;

    
    private ReverseFulfillmentOrder reverseFulfillmentOrder;

    public ReverseDelivery build() {
      ReverseDelivery result = new ReverseDelivery();
      result.deliverable = this.deliverable;
      result.id = this.id;
      result.reverseDeliveryLineItems = this.reverseDeliveryLineItems;
      result.reverseFulfillmentOrder = this.reverseFulfillmentOrder;
      return result;
    }

    
    public Builder deliverable(ReverseDeliveryDeliverable deliverable) {
      this.deliverable = deliverable;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder reverseDeliveryLineItems(
        ReverseDeliveryLineItemConnection reverseDeliveryLineItems) {
      this.reverseDeliveryLineItems = reverseDeliveryLineItems;
      return this;
    }

    
    public Builder reverseFulfillmentOrder(ReverseFulfillmentOrder reverseFulfillmentOrder) {
      this.reverseFulfillmentOrder = reverseFulfillmentOrder;
      return this;
    }
  }
}
