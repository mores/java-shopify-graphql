package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `combinedListingUpdate` mutation.
 */
public class CombinedListingUpdatePayload {
  /**
   * The parent product.
   */
  private Product product;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CombinedListingUpdateUserError> userErrors;

  public CombinedListingUpdatePayload() {
  }

  /**
   * The parent product.
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
  public List<CombinedListingUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CombinedListingUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CombinedListingUpdatePayload{product='" + product + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CombinedListingUpdatePayload that = (CombinedListingUpdatePayload) o;
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
     * The parent product.
     */
    private Product product;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CombinedListingUpdateUserError> userErrors;

    public CombinedListingUpdatePayload build() {
      CombinedListingUpdatePayload result = new CombinedListingUpdatePayload();
      result.product = this.product;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The parent product.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CombinedListingUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
