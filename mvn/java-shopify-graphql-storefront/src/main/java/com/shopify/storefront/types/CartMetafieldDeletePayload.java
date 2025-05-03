package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `cartMetafieldDelete` mutation.
 */
public class CartMetafieldDeletePayload {
  /**
   * The ID of the deleted cart metafield.
   */
  private String deletedId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MetafieldDeleteUserError> userErrors;

  public CartMetafieldDeletePayload() {
  }

  /**
   * The ID of the deleted cart metafield.
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
  public List<MetafieldDeleteUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MetafieldDeleteUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CartMetafieldDeletePayload{deletedId='" + deletedId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartMetafieldDeletePayload that = (CartMetafieldDeletePayload) o;
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
     * The ID of the deleted cart metafield.
     */
    private String deletedId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MetafieldDeleteUserError> userErrors;

    public CartMetafieldDeletePayload build() {
      CartMetafieldDeletePayload result = new CartMetafieldDeletePayload();
      result.deletedId = this.deletedId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted cart metafield.
     */
    public Builder deletedId(String deletedId) {
      this.deletedId = deletedId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MetafieldDeleteUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
