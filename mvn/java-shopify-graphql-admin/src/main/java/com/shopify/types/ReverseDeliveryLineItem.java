package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ReverseDeliveryLineItem implements com.shopify.types.Node {
  
  private List<ReverseFulfillmentOrderDisposition> dispositions;

  
  private String id;

  
  private int quantity;

  
  private ReverseFulfillmentOrderLineItem reverseFulfillmentOrderLineItem;

  public ReverseDeliveryLineItem() {
  }

  
  public List<ReverseFulfillmentOrderDisposition> getDispositions() {
    return dispositions;
  }

  public void setDispositions(List<ReverseFulfillmentOrderDisposition> dispositions) {
    this.dispositions = dispositions;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public ReverseFulfillmentOrderLineItem getReverseFulfillmentOrderLineItem() {
    return reverseFulfillmentOrderLineItem;
  }

  public void setReverseFulfillmentOrderLineItem(
      ReverseFulfillmentOrderLineItem reverseFulfillmentOrderLineItem) {
    this.reverseFulfillmentOrderLineItem = reverseFulfillmentOrderLineItem;
  }

  @Override
  public String toString() {
    return "ReverseDeliveryLineItem{dispositions='" + dispositions + "', id='" + id + "', quantity='" + quantity + "', reverseFulfillmentOrderLineItem='" + reverseFulfillmentOrderLineItem + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseDeliveryLineItem that = (ReverseDeliveryLineItem) o;
    return Objects.equals(dispositions, that.dispositions) &&
        Objects.equals(id, that.id) &&
        quantity == that.quantity &&
        Objects.equals(reverseFulfillmentOrderLineItem, that.reverseFulfillmentOrderLineItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dispositions, id, quantity, reverseFulfillmentOrderLineItem);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<ReverseFulfillmentOrderDisposition> dispositions;

    
    private String id;

    
    private int quantity;

    
    private ReverseFulfillmentOrderLineItem reverseFulfillmentOrderLineItem;

    public ReverseDeliveryLineItem build() {
      ReverseDeliveryLineItem result = new ReverseDeliveryLineItem();
      result.dispositions = this.dispositions;
      result.id = this.id;
      result.quantity = this.quantity;
      result.reverseFulfillmentOrderLineItem = this.reverseFulfillmentOrderLineItem;
      return result;
    }

    
    public Builder dispositions(List<ReverseFulfillmentOrderDisposition> dispositions) {
      this.dispositions = dispositions;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder reverseFulfillmentOrderLineItem(
        ReverseFulfillmentOrderLineItem reverseFulfillmentOrderLineItem) {
      this.reverseFulfillmentOrderLineItem = reverseFulfillmentOrderLineItem;
      return this;
    }
  }
}
