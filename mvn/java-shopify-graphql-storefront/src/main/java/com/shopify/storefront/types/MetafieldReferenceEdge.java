package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An auto-generated type which holds one MetafieldReference and a cursor during pagination.
 */
public class MetafieldReferenceEdge {
  /**
   * A cursor for use in pagination.
   */
  private String cursor;

  /**
   * The item at the end of MetafieldReferenceEdge.
   */
  private MetafieldReference node;

  public MetafieldReferenceEdge() {
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
   * The item at the end of MetafieldReferenceEdge.
   */
  public MetafieldReference getNode() {
    return node;
  }

  public void setNode(MetafieldReference node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "MetafieldReferenceEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldReferenceEdge that = (MetafieldReferenceEdge) o;
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
     * The item at the end of MetafieldReferenceEdge.
     */
    private MetafieldReference node;

    public MetafieldReferenceEdge build() {
      MetafieldReferenceEdge result = new MetafieldReferenceEdge();
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
     * The item at the end of MetafieldReferenceEdge.
     */
    public Builder node(MetafieldReference node) {
      this.node = node;
      return this;
    }
  }
}
