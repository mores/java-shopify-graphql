package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class AppSubscriptionEdge {
  
  private String cursor;

  
  private AppSubscription node;

  public AppSubscriptionEdge() {
  }

  
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  
  public AppSubscription getNode() {
    return node;
  }

  public void setNode(AppSubscription node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "AppSubscriptionEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppSubscriptionEdge that = (AppSubscriptionEdge) o;
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

    
    private AppSubscription node;

    public AppSubscriptionEdge build() {
      AppSubscriptionEdge result = new AppSubscriptionEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    
    public Builder node(AppSubscription node) {
      this.node = node;
      return this;
    }
  }
}
