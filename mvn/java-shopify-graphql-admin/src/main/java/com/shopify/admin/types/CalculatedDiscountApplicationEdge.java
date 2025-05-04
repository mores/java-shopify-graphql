package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An auto-generated type which holds one CalculatedDiscountApplication and a cursor during pagination.
 */
public class CalculatedDiscountApplicationEdge {
  /**
   * The position of each node in an array, used in [pagination](https://shopify.dev/api/usage/pagination-graphql).
   */
  private String cursor;

  /**
   * The item at the end of CalculatedDiscountApplicationEdge.
   */
  private CalculatedDiscountApplication node;

  public CalculatedDiscountApplicationEdge() {
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
   * The item at the end of CalculatedDiscountApplicationEdge.
   */
  public CalculatedDiscountApplication getNode() {
    return node;
  }

  public void setNode(CalculatedDiscountApplication node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "CalculatedDiscountApplicationEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedDiscountApplicationEdge that = (CalculatedDiscountApplicationEdge) o;
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
     * The item at the end of CalculatedDiscountApplicationEdge.
     */
    private CalculatedDiscountApplication node;

    public CalculatedDiscountApplicationEdge build() {
      CalculatedDiscountApplicationEdge result = new CalculatedDiscountApplicationEdge();
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
     * The item at the end of CalculatedDiscountApplicationEdge.
     */
    public Builder node(CalculatedDiscountApplication node) {
      this.node = node;
      return this;
    }
  }
}
