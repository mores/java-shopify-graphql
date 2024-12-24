package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetafieldDefinitionConstraintValueEdge {
  
  private String cursor;

  
  private MetafieldDefinitionConstraintValue node;

  public MetafieldDefinitionConstraintValueEdge() {
  }

  
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  
  public MetafieldDefinitionConstraintValue getNode() {
    return node;
  }

  public void setNode(MetafieldDefinitionConstraintValue node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionConstraintValueEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionConstraintValueEdge that = (MetafieldDefinitionConstraintValueEdge) o;
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

    
    private MetafieldDefinitionConstraintValue node;

    public MetafieldDefinitionConstraintValueEdge build() {
      MetafieldDefinitionConstraintValueEdge result = new MetafieldDefinitionConstraintValueEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    
    public Builder node(MetafieldDefinitionConstraintValue node) {
      this.node = node;
      return this;
    }
  }
}
