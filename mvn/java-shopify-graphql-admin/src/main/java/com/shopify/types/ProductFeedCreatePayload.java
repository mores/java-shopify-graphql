package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productFeedCreate` mutation.
 */
public class ProductFeedCreatePayload {
  /**
   * The newly created product feed.
   */
  private ProductFeed productFeed;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ProductFeedCreateUserError> userErrors;

  public ProductFeedCreatePayload() {
  }

  /**
   * The newly created product feed.
   */
  public ProductFeed getProductFeed() {
    return productFeed;
  }

  public void setProductFeed(ProductFeed productFeed) {
    this.productFeed = productFeed;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ProductFeedCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductFeedCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductFeedCreatePayload{productFeed='" + productFeed + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductFeedCreatePayload that = (ProductFeedCreatePayload) o;
    return Objects.equals(productFeed, that.productFeed) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productFeed, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The newly created product feed.
     */
    private ProductFeed productFeed;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ProductFeedCreateUserError> userErrors;

    public ProductFeedCreatePayload build() {
      ProductFeedCreatePayload result = new ProductFeedCreatePayload();
      result.productFeed = this.productFeed;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The newly created product feed.
     */
    public Builder productFeed(ProductFeed productFeed) {
      this.productFeed = productFeed;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ProductFeedCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
