package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `metafieldStorefrontVisibilityDelete` mutation.
 */
public class MetafieldStorefrontVisibilityDeletePayload {
  /**
   * The ID of the deleted `MetafieldStorefrontVisibility` record.
   */
  private String deletedMetafieldStorefrontVisibilityId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public MetafieldStorefrontVisibilityDeletePayload() {
  }

  /**
   * The ID of the deleted `MetafieldStorefrontVisibility` record.
   */
  public String getDeletedMetafieldStorefrontVisibilityId() {
    return deletedMetafieldStorefrontVisibilityId;
  }

  public void setDeletedMetafieldStorefrontVisibilityId(
      String deletedMetafieldStorefrontVisibilityId) {
    this.deletedMetafieldStorefrontVisibilityId = deletedMetafieldStorefrontVisibilityId;
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
    return "MetafieldStorefrontVisibilityDeletePayload{deletedMetafieldStorefrontVisibilityId='" + deletedMetafieldStorefrontVisibilityId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldStorefrontVisibilityDeletePayload that = (MetafieldStorefrontVisibilityDeletePayload) o;
    return Objects.equals(deletedMetafieldStorefrontVisibilityId, that.deletedMetafieldStorefrontVisibilityId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedMetafieldStorefrontVisibilityId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the deleted `MetafieldStorefrontVisibility` record.
     */
    private String deletedMetafieldStorefrontVisibilityId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public MetafieldStorefrontVisibilityDeletePayload build() {
      MetafieldStorefrontVisibilityDeletePayload result = new MetafieldStorefrontVisibilityDeletePayload();
      result.deletedMetafieldStorefrontVisibilityId = this.deletedMetafieldStorefrontVisibilityId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted `MetafieldStorefrontVisibility` record.
     */
    public Builder deletedMetafieldStorefrontVisibilityId(
        String deletedMetafieldStorefrontVisibilityId) {
      this.deletedMetafieldStorefrontVisibilityId = deletedMetafieldStorefrontVisibilityId;
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
