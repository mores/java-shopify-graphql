package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An auto-generated type which holds one ProductBundleComponent and a cursor during pagination.
 */
public class ProductBundleComponentEdge {
  /**
   * The position of each node in an array, used in [pagination](https://shopify.dev/api/usage/pagination-graphql).
   */
  private String cursor;

  /**
   * The item at the end of ProductBundleComponentEdge.
   */
  private ProductBundleComponent node;

  public ProductBundleComponentEdge() {
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
   * The item at the end of ProductBundleComponentEdge.
   */
  public ProductBundleComponent getNode() {
    return node;
  }

  public void setNode(ProductBundleComponent node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "ProductBundleComponentEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleComponentEdge that = (ProductBundleComponentEdge) o;
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
     * The item at the end of ProductBundleComponentEdge.
     */
    private ProductBundleComponent node;

    public ProductBundleComponentEdge build() {
      ProductBundleComponentEdge result = new ProductBundleComponentEdge();
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
     * The item at the end of ProductBundleComponentEdge.
     */
    public Builder node(ProductBundleComponent node) {
      this.node = node;
      return this;
    }
  }
}
