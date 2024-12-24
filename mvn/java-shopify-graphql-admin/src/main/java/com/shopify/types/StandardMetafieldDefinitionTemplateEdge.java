package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class StandardMetafieldDefinitionTemplateEdge {
  
  private String cursor;

  
  private StandardMetafieldDefinitionTemplate node;

  public StandardMetafieldDefinitionTemplateEdge() {
  }

  
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  
  public StandardMetafieldDefinitionTemplate getNode() {
    return node;
  }

  public void setNode(StandardMetafieldDefinitionTemplate node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "StandardMetafieldDefinitionTemplateEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StandardMetafieldDefinitionTemplateEdge that = (StandardMetafieldDefinitionTemplateEdge) o;
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

    
    private StandardMetafieldDefinitionTemplate node;

    public StandardMetafieldDefinitionTemplateEdge build() {
      StandardMetafieldDefinitionTemplateEdge result = new StandardMetafieldDefinitionTemplateEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    
    public Builder node(StandardMetafieldDefinitionTemplate node) {
      this.node = node;
      return this;
    }
  }
}
