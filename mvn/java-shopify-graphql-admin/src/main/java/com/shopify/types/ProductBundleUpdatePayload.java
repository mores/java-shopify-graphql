package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productBundleUpdate` mutation.
 */
public class ProductBundleUpdatePayload {
  /**
   * The asynchronous ProductBundleOperation updating the componentized product.
   */
  private ProductBundleOperation productBundleOperation;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ProductBundleUpdatePayload() {
  }

  /**
   * The asynchronous ProductBundleOperation updating the componentized product.
   */
  public ProductBundleOperation getProductBundleOperation() {
    return productBundleOperation;
  }

  public void setProductBundleOperation(ProductBundleOperation productBundleOperation) {
    this.productBundleOperation = productBundleOperation;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductBundleUpdatePayload{productBundleOperation='" + productBundleOperation + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleUpdatePayload that = (ProductBundleUpdatePayload) o;
    return Objects.equals(productBundleOperation, that.productBundleOperation) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productBundleOperation, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The asynchronous ProductBundleOperation updating the componentized product.
     */
    private ProductBundleOperation productBundleOperation;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ProductBundleUpdatePayload build() {
      ProductBundleUpdatePayload result = new ProductBundleUpdatePayload();
      result.productBundleOperation = this.productBundleOperation;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The asynchronous ProductBundleOperation updating the componentized product.
     */
    public Builder productBundleOperation(ProductBundleOperation productBundleOperation) {
      this.productBundleOperation = productBundleOperation;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
