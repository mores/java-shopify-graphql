package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `metafieldsDelete` mutation.
 */
public class MetafieldsDeletePayload {
  /**
   * List of metafield identifiers that were deleted, null if the corresponding metafield isn't found.
   */
  private List<MetafieldIdentifier> deletedMetafields;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public MetafieldsDeletePayload() {
  }

  /**
   * List of metafield identifiers that were deleted, null if the corresponding metafield isn't found.
   */
  public List<MetafieldIdentifier> getDeletedMetafields() {
    return deletedMetafields;
  }

  public void setDeletedMetafields(List<MetafieldIdentifier> deletedMetafields) {
    this.deletedMetafields = deletedMetafields;
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
    return "MetafieldsDeletePayload{deletedMetafields='" + deletedMetafields + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldsDeletePayload that = (MetafieldsDeletePayload) o;
    return Objects.equals(deletedMetafields, that.deletedMetafields) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedMetafields, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * List of metafield identifiers that were deleted, null if the corresponding metafield isn't found.
     */
    private List<MetafieldIdentifier> deletedMetafields;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public MetafieldsDeletePayload build() {
      MetafieldsDeletePayload result = new MetafieldsDeletePayload();
      result.deletedMetafields = this.deletedMetafields;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * List of metafield identifiers that were deleted, null if the corresponding metafield isn't found.
     */
    public Builder deletedMetafields(List<MetafieldIdentifier> deletedMetafields) {
      this.deletedMetafields = deletedMetafields;
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
