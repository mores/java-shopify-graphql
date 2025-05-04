package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productVariantsBulkUpdate` mutation.
 */
public class ProductVariantsBulkUpdatePayload {
  /**
   * The updated product object.
   */
  private Product product;

  /**
   * The updated variants.
   */
  private List<ProductVariant> productVariants;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ProductVariantsBulkUpdateUserError> userErrors;

  public ProductVariantsBulkUpdatePayload() {
  }

  /**
   * The updated product object.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * The updated variants.
   */
  public List<ProductVariant> getProductVariants() {
    return productVariants;
  }

  public void setProductVariants(List<ProductVariant> productVariants) {
    this.productVariants = productVariants;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ProductVariantsBulkUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductVariantsBulkUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductVariantsBulkUpdatePayload{product='" + product + "', productVariants='" + productVariants + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantsBulkUpdatePayload that = (ProductVariantsBulkUpdatePayload) o;
    return Objects.equals(product, that.product) &&
        Objects.equals(productVariants, that.productVariants) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, productVariants, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated product object.
     */
    private Product product;

    /**
     * The updated variants.
     */
    private List<ProductVariant> productVariants;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ProductVariantsBulkUpdateUserError> userErrors;

    public ProductVariantsBulkUpdatePayload build() {
      ProductVariantsBulkUpdatePayload result = new ProductVariantsBulkUpdatePayload();
      result.product = this.product;
      result.productVariants = this.productVariants;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated product object.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The updated variants.
     */
    public Builder productVariants(List<ProductVariant> productVariants) {
      this.productVariants = productVariants;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ProductVariantsBulkUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
