package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `storefrontAccessTokenDelete` mutation.
 */
public class StorefrontAccessTokenDeletePayload {
  /**
   * The ID of the deleted storefront access token.
   */
  private String deletedStorefrontAccessTokenId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public StorefrontAccessTokenDeletePayload() {
  }

  /**
   * The ID of the deleted storefront access token.
   */
  public String getDeletedStorefrontAccessTokenId() {
    return deletedStorefrontAccessTokenId;
  }

  public void setDeletedStorefrontAccessTokenId(String deletedStorefrontAccessTokenId) {
    this.deletedStorefrontAccessTokenId = deletedStorefrontAccessTokenId;
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
    return "StorefrontAccessTokenDeletePayload{deletedStorefrontAccessTokenId='" + deletedStorefrontAccessTokenId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StorefrontAccessTokenDeletePayload that = (StorefrontAccessTokenDeletePayload) o;
    return Objects.equals(deletedStorefrontAccessTokenId, that.deletedStorefrontAccessTokenId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedStorefrontAccessTokenId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the deleted storefront access token.
     */
    private String deletedStorefrontAccessTokenId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public StorefrontAccessTokenDeletePayload build() {
      StorefrontAccessTokenDeletePayload result = new StorefrontAccessTokenDeletePayload();
      result.deletedStorefrontAccessTokenId = this.deletedStorefrontAccessTokenId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted storefront access token.
     */
    public Builder deletedStorefrontAccessTokenId(String deletedStorefrontAccessTokenId) {
      this.deletedStorefrontAccessTokenId = deletedStorefrontAccessTokenId;
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
