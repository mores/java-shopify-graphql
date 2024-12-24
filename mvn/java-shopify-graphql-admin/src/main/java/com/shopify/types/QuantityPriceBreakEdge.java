package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class QuantityPriceBreakEdge {
  
  private String cursor;

  
  private QuantityPriceBreak node;

  public QuantityPriceBreakEdge() {
  }

  
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  
  public QuantityPriceBreak getNode() {
    return node;
  }

  public void setNode(QuantityPriceBreak node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "QuantityPriceBreakEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuantityPriceBreakEdge that = (QuantityPriceBreakEdge) o;
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

    
    private QuantityPriceBreak node;

    public QuantityPriceBreakEdge build() {
      QuantityPriceBreakEdge result = new QuantityPriceBreakEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    
    public Builder node(QuantityPriceBreak node) {
      this.node = node;
      return this;
    }
  }
}
