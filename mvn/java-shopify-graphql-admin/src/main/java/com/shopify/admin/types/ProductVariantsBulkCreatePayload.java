package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productVariantsBulkCreate` mutation.
 */
public class ProductVariantsBulkCreatePayload {
  /**
   * The updated product object.
   */
  private Product product;

  /**
   * The newly created variants.
   */
  private List<ProductVariant> productVariants;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ProductVariantsBulkCreateUserError> userErrors;

  public ProductVariantsBulkCreatePayload() {
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
   * The newly created variants.
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
  public List<ProductVariantsBulkCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductVariantsBulkCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductVariantsBulkCreatePayload{product='" + product + "', productVariants='" + productVariants + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantsBulkCreatePayload that = (ProductVariantsBulkCreatePayload) o;
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
     * The newly created variants.
     */
    private List<ProductVariant> productVariants;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ProductVariantsBulkCreateUserError> userErrors;

    public ProductVariantsBulkCreatePayload build() {
      ProductVariantsBulkCreatePayload result = new ProductVariantsBulkCreatePayload();
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
     * The newly created variants.
     */
    public Builder productVariants(List<ProductVariant> productVariants) {
      this.productVariants = productVariants;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ProductVariantsBulkCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
