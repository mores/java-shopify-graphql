package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An auto-generated type which holds one AppUsageRecord and a cursor during pagination.
 */
public class AppUsageRecordEdge {
  /**
   * The position of each node in an array, used in [pagination](https://shopify.dev/api/usage/pagination-graphql).
   */
  private String cursor;

  /**
   * The item at the end of AppUsageRecordEdge.
   */
  private AppUsageRecord node;

  public AppUsageRecordEdge() {
  }

  /**
   * The position of each node in an array, used in [pagination](https://shopify.dev/api/usage/pagination-graphql).
   */
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  /**
   * The item at the end of AppUsageRecordEdge.
   */
  public AppUsageRecord getNode() {
    return node;
  }

  public void setNode(AppUsageRecord node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "AppUsageRecordEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppUsageRecordEdge that = (AppUsageRecordEdge) o;
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
    /**
     * The position of each node in an array, used in [pagination](https://shopify.dev/api/usage/pagination-graphql).
     */
    private String cursor;

    /**
     * The item at the end of AppUsageRecordEdge.
     */
    private AppUsageRecord node;

    public AppUsageRecordEdge build() {
      AppUsageRecordEdge result = new AppUsageRecordEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    /**
     * The position of each node in an array, used in [pagination](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * The item at the end of AppUsageRecordEdge.
     */
    public Builder node(AppUsageRecord node) {
      this.node = node;
      return this;
    }
  }
}
