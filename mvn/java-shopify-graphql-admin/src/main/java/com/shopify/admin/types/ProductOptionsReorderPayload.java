package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productOptionsReorder` mutation.
 */
public class ProductOptionsReorderPayload {
  /**
   * The updated product object.
   */
  private Product product;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ProductOptionsReorderUserError> userErrors;

  public ProductOptionsReorderPayload() {
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
  public List<ProductOptionsReorderUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductOptionsReorderUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductOptionsReorderPayload{product='" + product + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductOptionsReorderPayload that = (ProductOptionsReorderPayload) o;
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
     * The updated product object.
     */
    private Product product;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ProductOptionsReorderUserError> userErrors;

    public ProductOptionsReorderPayload build() {
      ProductOptionsReorderPayload result = new ProductOptionsReorderPayload();
      result.product = this.product;
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
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ProductOptionsReorderUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
