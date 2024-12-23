package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productOptionsDelete` mutation.
 */
public class ProductOptionsDeletePayload {
  /**
   * IDs of the options deleted.
   */
  private List<String> deletedOptionsIds;

  /**
   * The updated product object.
   */
  private Product product;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ProductOptionsDeleteUserError> userErrors;

  public ProductOptionsDeletePayload() {
  }

  /**
   * IDs of the options deleted.
   */
  public List<String> getDeletedOptionsIds() {
    return deletedOptionsIds;
  }

  public void setDeletedOptionsIds(List<String> deletedOptionsIds) {
    this.deletedOptionsIds = deletedOptionsIds;
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
   * The list of errors that occurred from executing the mutation.
   */
  public List<ProductOptionsDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductOptionsDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductOptionsDeletePayload{deletedOptionsIds='" + deletedOptionsIds + "', product='" + product + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductOptionsDeletePayload that = (ProductOptionsDeletePayload) o;
    return Objects.equals(deletedOptionsIds, that.deletedOptionsIds) &&
        Objects.equals(product, that.product) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedOptionsIds, product, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * IDs of the options deleted.
     */
    private List<String> deletedOptionsIds;

    /**
     * The updated product object.
     */
    private Product product;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ProductOptionsDeleteUserError> userErrors;

    public ProductOptionsDeletePayload build() {
      ProductOptionsDeletePayload result = new ProductOptionsDeletePayload();
      result.deletedOptionsIds = this.deletedOptionsIds;
      result.product = this.product;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * IDs of the options deleted.
     */
    public Builder deletedOptionsIds(List<String> deletedOptionsIds) {
      this.deletedOptionsIds = deletedOptionsIds;
      return this;
    }

    /**
     * The updated product object.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ProductOptionsDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
