package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ReverseDeliveryEdge {
  
  private String cursor;

  
  private ReverseDelivery node;

  public ReverseDeliveryEdge() {
  }

  
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  
  public ReverseDelivery getNode() {
    return node;
  }

  public void setNode(ReverseDelivery node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "ReverseDeliveryEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReverseDeliveryEdge that = (ReverseDeliveryEdge) o;
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

    
    private ReverseDelivery node;

    public ReverseDeliveryEdge build() {
      ReverseDeliveryEdge result = new ReverseDeliveryEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    
    public Builder node(ReverseDelivery node) {
      this.node = node;
      return this;
    }
  }
}
