package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ReverseFulfillmentOrderLineItemEdge {
  
  private String cursor;

  
  private ReverseFulfillmentOrderLineItem node;

  public ReverseFulfillmentOrderLineItemEdge() {
  }

  
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  
  public ReverseFulfillmentOrderLineItem getNode() {
    return node;
  }

  public void setNode(ReverseFulfillmentOrderLineItem node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "ReverseFulfillmentOrderLineItemEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseFulfillmentOrderLineItemEdge that = (ReverseFulfillmentOrderLineItemEdge) o;
    return Objects.equals(cursor, that.cursor) &&
        Objects.equals(node, that.node);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, node);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String cursor;

    
    private ReverseFulfillmentOrderLineItem node;

    public ReverseFulfillmentOrderLineItemEdge build() {
      ReverseFulfillmentOrderLineItemEdge result = new ReverseFulfillmentOrderLineItemEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    
    public Builder node(ReverseFulfillmentOrderLineItem node) {
      this.node = node;
      return this;
    }
  }
}
