package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class InventoryLevelEdge {
  
  private String cursor;

  
  private InventoryLevel node;

  public InventoryLevelEdge() {
  }

  
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  
  public InventoryLevel getNode() {
    return node;
  }

  public void setNode(InventoryLevel node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "InventoryLevelEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryLevelEdge that = (InventoryLevelEdge) o;
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

    
    private InventoryLevel node;

    public InventoryLevelEdge build() {
      InventoryLevelEdge result = new InventoryLevelEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    
    public Builder node(InventoryLevel node) {
      this.node = node;
      return this;
    }
  }
}
