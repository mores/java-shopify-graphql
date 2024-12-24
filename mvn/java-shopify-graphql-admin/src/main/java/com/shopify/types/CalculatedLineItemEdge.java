package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CalculatedLineItemEdge {
  
  private String cursor;

  
  private CalculatedLineItem node;

  public CalculatedLineItemEdge() {
  }

  
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  
  public CalculatedLineItem getNode() {
    return node;
  }

  public void setNode(CalculatedLineItem node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "CalculatedLineItemEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedLineItemEdge that = (CalculatedLineItemEdge) o;
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

    
    private CalculatedLineItem node;

    public CalculatedLineItemEdge build() {
      CalculatedLineItemEdge result = new CalculatedLineItemEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    
    public Builder node(CalculatedLineItem node) {
      this.node = node;
      return this;
    }
  }
}
