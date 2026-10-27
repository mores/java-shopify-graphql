package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for selecting specific products to include in a collection.
 */
public class CollectionInclusionProductSelectionInput {
  /**
   * The ID of the product to include in the collection.
   */
  private String productId;

  /**
   * The IDs of the product variants to include in the collection.
   */
  private List<String> variantIds;

  public CollectionInclusionProductSelectionInput() {
  }

  /**
   * The ID of the product to include in the collection.
   */
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  /**
   * The IDs of the product variants to include in the collection.
   */
  public List<String> getVariantIds() {
    return variantIds;
  }

  public void setVariantIds(List<String> variantIds) {
    this.variantIds = variantIds;
  }

  @Override
  public String toString() {
    return "CollectionInclusionProductSelectionInput{productId='" + productId + "', variantIds='" + variantIds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionInclusionProductSelectionInput that = (CollectionInclusionProductSelectionInput) o;
    return Objects.equals(productId, that.productId) &&
        Objects.equals(variantIds, that.variantIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, variantIds);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the product to include in the collection.
     */
    private String productId;

    /**
     * The IDs of the product variants to include in the collection.
     */
    private List<String> variantIds;

    public CollectionInclusionProductSelectionInput build() {
      CollectionInclusionProductSelectionInput result = new CollectionInclusionProductSelectionInput();
      result.productId = this.productId;
      result.variantIds = this.variantIds;
      return result;
    }

    /**
     * The ID of the product to include in the collection.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    /**
     * The IDs of the product variants to include in the collection.
     */
    public Builder variantIds(List<String> variantIds) {
      this.variantIds = variantIds;
      return this;
    }
  }
}
