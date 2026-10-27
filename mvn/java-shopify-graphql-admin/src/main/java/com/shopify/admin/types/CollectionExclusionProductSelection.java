package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a product that has been manually selected for exclusion from a collection.
 */
public class CollectionExclusionProductSelection {
  /**
   * The product that's manually excluded from the collection.
   */
  private Product product;

  public CollectionExclusionProductSelection() {
  }

  /**
   * The product that's manually excluded from the collection.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  @Override
  public String toString() {
    return "CollectionExclusionProductSelection{product='" + product + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionExclusionProductSelection that = (CollectionExclusionProductSelection) o;
    return Objects.equals(product, that.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The product that's manually excluded from the collection.
     */
    private Product product;

    public CollectionExclusionProductSelection build() {
      CollectionExclusionProductSelection result = new CollectionExclusionProductSelection();
      result.product = this.product;
      return result;
    }

    /**
     * The product that's manually excluded from the collection.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }
  }
}
