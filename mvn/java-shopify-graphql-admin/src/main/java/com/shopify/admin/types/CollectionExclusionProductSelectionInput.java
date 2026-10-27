package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for selecting specific products to exclude from a collection.
 */
public class CollectionExclusionProductSelectionInput {
  /**
   * The ID of the product to exclude from the collection.
   */
  private String productId;

  public CollectionExclusionProductSelectionInput() {
  }

  /**
   * The ID of the product to exclude from the collection.
   */
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  @Override
  public String toString() {
    return "CollectionExclusionProductSelectionInput{productId='" + productId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionExclusionProductSelectionInput that = (CollectionExclusionProductSelectionInput) o;
    return Objects.equals(productId, that.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the product to exclude from the collection.
     */
    private String productId;

    public CollectionExclusionProductSelectionInput build() {
      CollectionExclusionProductSelectionInput result = new CollectionExclusionProductSelectionInput();
      result.productId = this.productId;
      return result;
    }

    /**
     * The ID of the product to exclude from the collection.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }
  }
}
