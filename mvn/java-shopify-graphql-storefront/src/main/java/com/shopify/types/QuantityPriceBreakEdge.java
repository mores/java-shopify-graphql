package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An auto-generated type which holds one QuantityPriceBreak and a cursor during pagination.
 */
public class QuantityPriceBreakEdge {
  /**
   * A cursor for use in pagination.
   */
  private String cursor;

  /**
   * The item at the end of QuantityPriceBreakEdge.
   */
  private QuantityPriceBreak node;

  public QuantityPriceBreakEdge() {
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
   * The item at the end of QuantityPriceBreakEdge.
   */
  public QuantityPriceBreak getNode() {
    return node;
  }

  public void setNode(QuantityPriceBreak node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "QuantityPriceBreakEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QuantityPriceBreakEdge that = (QuantityPriceBreakEdge) o;
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
     * The item at the end of QuantityPriceBreakEdge.
     */
    private QuantityPriceBreak node;

    public QuantityPriceBreakEdge build() {
      QuantityPriceBreakEdge result = new QuantityPriceBreakEdge();
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
     * The item at the end of QuantityPriceBreakEdge.
     */
    public Builder node(QuantityPriceBreak node) {
      this.node = node;
      return this;
    }
  }
}
