package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ReturnableFulfillment implements com.shopify.types.Node {
  
  private Fulfillment fulfillment;

  
  private String id;

  
  private ReturnableFulfillmentLineItemConnection returnableFulfillmentLineItems;

  public ReturnableFulfillment() {
  }

  
  public Fulfillment getFulfillment() {
    return fulfillment;
  }

  public void setFulfillment(Fulfillment fulfillment) {
    this.fulfillment = fulfillment;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public ReturnableFulfillmentLineItemConnection getReturnableFulfillmentLineItems() {
    return returnableFulfillmentLineItems;
  }

  public void setReturnableFulfillmentLineItems(
      ReturnableFulfillmentLineItemConnection returnableFulfillmentLineItems) {
    this.returnableFulfillmentLineItems = returnableFulfillmentLineItems;
  }

  @Override
  public String toString() {
    return "ReturnableFulfillment{fulfillment='" + fulfillment + "', id='" + id + "', returnableFulfillmentLineItems='" + returnableFulfillmentLineItems + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnableFulfillment that = (ReturnableFulfillment) o;
    return Objects.equals(fulfillment, that.fulfillment) &&
        Objects.equals(id, that.id) &&
        Objects.equals(returnableFulfillmentLineItems, that.returnableFulfillmentLineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillment, id, returnableFulfillmentLineItems);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Fulfillment fulfillment;

    
    private String id;

    
    private ReturnableFulfillmentLineItemConnection returnableFulfillmentLineItems;

    public ReturnableFulfillment build() {
      ReturnableFulfillment result = new ReturnableFulfillment();
      result.fulfillment = this.fulfillment;
      result.id = this.id;
      result.returnableFulfillmentLineItems = this.returnableFulfillmentLineItems;
      return result;
    }

    
    public Builder fulfillment(Fulfillment fulfillment) {
      this.fulfillment = fulfillment;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder returnableFulfillmentLineItems(
        ReturnableFulfillmentLineItemConnection returnableFulfillmentLineItems) {
      this.returnableFulfillmentLineItems = returnableFulfillmentLineItems;
      return this;
    }
  }
}
