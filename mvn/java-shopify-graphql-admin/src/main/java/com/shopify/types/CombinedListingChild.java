package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A child of a combined listing.
 */
public class CombinedListingChild {
  /**
   * The parent variant.
   */
  private ProductVariant parentVariant;

  /**
   * The child product.
   */
  private Product product;

  public CombinedListingChild() {
  }

  /**
   * The parent variant.
   */
  public ProductVariant getParentVariant() {
    return parentVariant;
  }

  public void setParentVariant(ProductVariant parentVariant) {
    this.parentVariant = parentVariant;
  }

  /**
   * The child product.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  @Override
  public String toString() {
    return "CombinedListingChild{parentVariant='" + parentVariant + "', product='" + product + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CombinedListingChild that = (CombinedListingChild) o;
    return Objects.equals(parentVariant, that.parentVariant) &&
        Objects.equals(product, that.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentVariant, product);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The parent variant.
     */
    private ProductVariant parentVariant;

    /**
     * The child product.
     */
    private Product product;

    public CombinedListingChild build() {
      CombinedListingChild result = new CombinedListingChild();
      result.parentVariant = this.parentVariant;
      result.product = this.product;
      return result;
    }

    /**
     * The parent variant.
     */
    public Builder parentVariant(ProductVariant parentVariant) {
      this.parentVariant = parentVariant;
      return this;
    }

    /**
     * The child product.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }
  }
}
