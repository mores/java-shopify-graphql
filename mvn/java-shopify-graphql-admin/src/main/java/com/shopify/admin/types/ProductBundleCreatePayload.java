package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productBundleCreate` mutation.
 */
public class ProductBundleCreatePayload {
  /**
   * The asynchronous ProductBundleOperation creating the componentized product.
   */
  private ProductBundleOperation productBundleOperation;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public ProductBundleCreatePayload() {
  }

  /**
   * The asynchronous ProductBundleOperation creating the componentized product.
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
    return "ProductBundleCreatePayload{productBundleOperation='" + productBundleOperation + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleCreatePayload that = (ProductBundleCreatePayload) o;
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
     * The asynchronous ProductBundleOperation creating the componentized product.
     */
    private ProductBundleOperation productBundleOperation;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public ProductBundleCreatePayload build() {
      ProductBundleCreatePayload result = new ProductBundleCreatePayload();
      result.productBundleOperation = this.productBundleOperation;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The asynchronous ProductBundleOperation creating the componentized product.
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
