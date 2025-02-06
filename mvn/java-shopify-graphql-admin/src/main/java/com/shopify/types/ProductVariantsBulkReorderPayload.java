package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productVariantsBulkReorder` mutation.
 */
public class ProductVariantsBulkReorderPayload {
  /**
   * The updated product.
   */
  private Product product;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ProductVariantsBulkReorderUserError> userErrors;

  public ProductVariantsBulkReorderPayload() {
  }

  /**
   * The updated product.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ProductVariantsBulkReorderUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductVariantsBulkReorderUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductVariantsBulkReorderPayload{product='" + product + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantsBulkReorderPayload that = (ProductVariantsBulkReorderPayload) o;
    return Objects.equals(product, that.product) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated product.
     */
    private Product product;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ProductVariantsBulkReorderUserError> userErrors;

    public ProductVariantsBulkReorderPayload build() {
      ProductVariantsBulkReorderPayload result = new ProductVariantsBulkReorderPayload();
      result.product = this.product;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated product.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ProductVariantsBulkReorderUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
