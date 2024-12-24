package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ResourcePublicationV2Edge {
  
  private String cursor;

  
  private ResourcePublicationV2 node;

  public ResourcePublicationV2Edge() {
  }

  
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  
  public ResourcePublicationV2 getNode() {
    return node;
  }

  public void setNode(ResourcePublicationV2 node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "ResourcePublicationV2Edge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResourcePublicationV2Edge that = (ResourcePublicationV2Edge) o;
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

    
    private ResourcePublicationV2 node;

    public ResourcePublicationV2Edge build() {
      ResourcePublicationV2Edge result = new ResourcePublicationV2Edge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    
    public Builder node(ResourcePublicationV2 node) {
      this.node = node;
      return this;
    }
  }
}
