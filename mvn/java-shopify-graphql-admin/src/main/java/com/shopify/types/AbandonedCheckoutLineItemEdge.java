package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class AbandonedCheckoutLineItemEdge {
  
  private String cursor;

  
  private AbandonedCheckoutLineItem node;

  public AbandonedCheckoutLineItemEdge() {
  }

  
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  
  public AbandonedCheckoutLineItem getNode() {
    return node;
  }

  public void setNode(AbandonedCheckoutLineItem node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "AbandonedCheckoutLineItemEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AbandonedCheckoutLineItemEdge that = (AbandonedCheckoutLineItemEdge) o;
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

    
    private AbandonedCheckoutLineItem node;

    public AbandonedCheckoutLineItemEdge build() {
      AbandonedCheckoutLineItemEdge result = new AbandonedCheckoutLineItemEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    
    public Builder node(AbandonedCheckoutLineItem node) {
      this.node = node;
      return this;
    }
  }
}
