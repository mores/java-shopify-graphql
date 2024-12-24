package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ScriptTagEdge {
  
  private String cursor;

  
  private ScriptTag node;

  public ScriptTagEdge() {
  }

  
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  
  public ScriptTag getNode() {
    return node;
  }

  public void setNode(ScriptTag node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "ScriptTagEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ScriptTagEdge that = (ScriptTagEdge) o;
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

    
    private ScriptTag node;

    public ScriptTagEdge build() {
      ScriptTagEdge result = new ScriptTagEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    
    public Builder node(ScriptTag node) {
      this.node = node;
      return this;
    }
  }
}
