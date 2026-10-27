package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a product that has been manually selected for inclusion in a collection.
 */
public class CollectionInclusionProductSelection {
  /**
   * The product that's manually included in the collection.
   */
  private Product product;

  /**
   * The IDs of variants of this product that have been manually included
   * in the collection. Null when no variant-level manual selections exist
   * for this product; non-empty when one or more variants have been
   * manually included.
   */
  private List<String> variantIds;

  public CollectionInclusionProductSelection() {
  }

  /**
   * The product that's manually included in the collection.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * The IDs of variants of this product that have been manually included
   * in the collection. Null when no variant-level manual selections exist
   * for this product; non-empty when one or more variants have been
   * manually included.
   */
  public List<String> getVariantIds() {
    return variantIds;
  }

  public void setVariantIds(List<String> variantIds) {
    this.variantIds = variantIds;
  }

  @Override
  public String toString() {
    return "CollectionInclusionProductSelection{product='" + product + "', variantIds='" + variantIds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionInclusionProductSelection that = (CollectionInclusionProductSelection) o;
    return Objects.equals(product, that.product) &&
        Objects.equals(variantIds, that.variantIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, variantIds);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The product that's manually included in the collection.
     */
    private Product product;

    /**
     * The IDs of variants of this product that have been manually included
     * in the collection. Null when no variant-level manual selections exist
     * for this product; non-empty when one or more variants have been
     * manually included.
     */
    private List<String> variantIds;

    public CollectionInclusionProductSelection build() {
      CollectionInclusionProductSelection result = new CollectionInclusionProductSelection();
      result.product = this.product;
      result.variantIds = this.variantIds;
      return result;
    }

    /**
     * The product that's manually included in the collection.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The IDs of variants of this product that have been manually included
     * in the collection. Null when no variant-level manual selections exist
     * for this product; non-empty when one or more variants have been
     * manually included.
     */
    public Builder variantIds(List<String> variantIds) {
      this.variantIds = variantIds;
      return this;
    }
  }
}
