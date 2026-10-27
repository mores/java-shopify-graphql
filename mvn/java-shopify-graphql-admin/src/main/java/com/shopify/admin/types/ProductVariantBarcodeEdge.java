package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An auto-generated type which holds one ProductVariantBarcode and a cursor during pagination.
 */
public class ProductVariantBarcodeEdge {
  /**
   * The position of each node in an array, used in [pagination](https://shopify.dev/api/usage/pagination-graphql).
   */
  private String cursor;

  /**
   * The item at the end of ProductVariantBarcodeEdge.
   */
  private ProductVariantBarcode node;

  public ProductVariantBarcodeEdge() {
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
   * The item at the end of ProductVariantBarcodeEdge.
   */
  public ProductVariantBarcode getNode() {
    return node;
  }

  public void setNode(ProductVariantBarcode node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "ProductVariantBarcodeEdge{cursor='" + cursor + "', node='" + node + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantBarcodeEdge that = (ProductVariantBarcodeEdge) o;
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
     * The item at the end of ProductVariantBarcodeEdge.
     */
    private ProductVariantBarcode node;

    public ProductVariantBarcodeEdge build() {
      ProductVariantBarcodeEdge result = new ProductVariantBarcodeEdge();
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
     * The item at the end of ProductVariantBarcodeEdge.
     */
    public Builder node(ProductVariantBarcode node) {
      this.node = node;
      return this;
    }
  }
}
