package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ProductFeedEdge {
  
  private String cursor;

  
  private ProductFeed node;

  public ProductFeedEdge() {
  }

  
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  
  public ProductFeed getNode() {
    return node;
  }

  public void setNode(ProductFeed node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "ProductFeedEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductFeedEdge that = (ProductFeedEdge) o;
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

    
    private ProductFeed node;

    public ProductFeedEdge build() {
      ProductFeedEdge result = new ProductFeedEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    
    public Builder node(ProductFeed node) {
      this.node = node;
      return this;
    }
  }
}
