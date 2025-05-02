package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An auto-generated type which holds one DiscountApplication and a cursor during pagination.
 */
public class DiscountApplicationEdge {
  /**
   * A cursor for use in pagination.
   */
  private String cursor;

  /**
   * The item at the end of DiscountApplicationEdge.
   */
  private DiscountApplication node;

  public DiscountApplicationEdge() {
  }

  /**
   * A cursor for use in pagination.
   */
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  /**
   * The item at the end of DiscountApplicationEdge.
   */
  public DiscountApplication getNode() {
    return node;
  }

  public void setNode(DiscountApplication node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "DiscountApplicationEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountApplicationEdge that = (DiscountApplicationEdge) o;
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
     * A cursor for use in pagination.
     */
    private String cursor;

    /**
     * The item at the end of DiscountApplicationEdge.
     */
    private DiscountApplication node;

    public DiscountApplicationEdge build() {
      DiscountApplicationEdge result = new DiscountApplicationEdge();
      result.cursor = this.cursor;
      result.node = this.node;
      return result;
    }

    /**
     * A cursor for use in pagination.
     */
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * The item at the end of DiscountApplicationEdge.
     */
    public Builder node(DiscountApplication node) {
      this.node = node;
      return this;
    }
  }
}
