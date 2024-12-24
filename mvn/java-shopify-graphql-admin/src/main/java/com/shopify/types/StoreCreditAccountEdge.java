package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class StoreCreditAccountEdge {
  
  private String cursor;

  
  private StoreCreditAccount node;

  public StoreCreditAccountEdge() {
  }

  
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  
  public StoreCreditAccount getNode() {
    return node;
  }

  public void setNode(StoreCreditAccount node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "StoreCreditAccountEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StoreCreditAccountEdge that = (StoreCreditAccountEdge) o;
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

    
    private StoreCreditAccount node;

    public StoreCreditAccountEdge build() {
      StoreCreditAccountEdge result = new StoreCreditAccountEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    
    public Builder node(StoreCreditAccount node) {
      this.node = node;
      return this;
    }
  }
}
