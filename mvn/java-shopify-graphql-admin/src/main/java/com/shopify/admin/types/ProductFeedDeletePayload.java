package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productFeedDelete` mutation.
 */
public class ProductFeedDeletePayload {
  /**
   * The ID of the product feed that was deleted.
   */
  private String deletedId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ProductFeedDeleteUserError> userErrors;

  public ProductFeedDeletePayload() {
  }

  /**
   * The ID of the product feed that was deleted.
   */
  public String getDeletedId() {
    return deletedId;
  }

  public void setDeletedId(String deletedId) {
    this.deletedId = deletedId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ProductFeedDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductFeedDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductFeedDeletePayload{deletedId='" + deletedId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductFeedDeletePayload that = (ProductFeedDeletePayload) o;
    return Objects.equals(deletedId, that.deletedId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the product feed that was deleted.
     */
    private String deletedId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ProductFeedDeleteUserError> userErrors;

    public ProductFeedDeletePayload build() {
      ProductFeedDeletePayload result = new ProductFeedDeletePayload();
      result.deletedId = this.deletedId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the product feed that was deleted.
     */
    public Builder deletedId(String deletedId) {
      this.deletedId = deletedId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ProductFeedDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
