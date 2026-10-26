package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `giftCardProductSet` mutation.
 */
public class GiftCardProductSetPayload {
  /**
   * The gift card product object.
   */
  private Product product;

  /**
   * The product set operation, returned when run in asynchronous mode.
   */
  private ProductSetOperation productSetOperation;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<GiftCardProductSetUserError> userErrors;

  public GiftCardProductSetPayload() {
  }

  /**
   * The gift card product object.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * The product set operation, returned when run in asynchronous mode.
   */
  public ProductSetOperation getProductSetOperation() {
    return productSetOperation;
  }

  public void setProductSetOperation(ProductSetOperation productSetOperation) {
    this.productSetOperation = productSetOperation;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<GiftCardProductSetUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<GiftCardProductSetUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "GiftCardProductSetPayload{product='" + product + "', productSetOperation='" + productSetOperation + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardProductSetPayload that = (GiftCardProductSetPayload) o;
    return Objects.equals(product, that.product) &&
        Objects.equals(productSetOperation, that.productSetOperation) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, productSetOperation, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The gift card product object.
     */
    private Product product;

    /**
     * The product set operation, returned when run in asynchronous mode.
     */
    private ProductSetOperation productSetOperation;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<GiftCardProductSetUserError> userErrors;

    public GiftCardProductSetPayload build() {
      GiftCardProductSetPayload result = new GiftCardProductSetPayload();
      result.product = this.product;
      result.productSetOperation = this.productSetOperation;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The gift card product object.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The product set operation, returned when run in asynchronous mode.
     */
    public Builder productSetOperation(ProductSetOperation productSetOperation) {
      this.productSetOperation = productSetOperation;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<GiftCardProductSetUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
