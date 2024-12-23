package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `privateMetafieldDelete` mutation.
 */
public class PrivateMetafieldDeletePayload {
  /**
   * The ID of private metafield that was deleted.
   */
  private String deletedPrivateMetafieldId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public PrivateMetafieldDeletePayload() {
  }

  /**
   * The ID of private metafield that was deleted.
   */
  public String getDeletedPrivateMetafieldId() {
    return deletedPrivateMetafieldId;
  }

  public void setDeletedPrivateMetafieldId(String deletedPrivateMetafieldId) {
    this.deletedPrivateMetafieldId = deletedPrivateMetafieldId;
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
    return "PrivateMetafieldDeletePayload{deletedPrivateMetafieldId='" + deletedPrivateMetafieldId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateMetafieldDeletePayload that = (PrivateMetafieldDeletePayload) o;
    return Objects.equals(deletedPrivateMetafieldId, that.deletedPrivateMetafieldId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedPrivateMetafieldId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of private metafield that was deleted.
     */
    private String deletedPrivateMetafieldId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public PrivateMetafieldDeletePayload build() {
      PrivateMetafieldDeletePayload result = new PrivateMetafieldDeletePayload();
      result.deletedPrivateMetafieldId = this.deletedPrivateMetafieldId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of private metafield that was deleted.
     */
    public Builder deletedPrivateMetafieldId(String deletedPrivateMetafieldId) {
      this.deletedPrivateMetafieldId = deletedPrivateMetafieldId;
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
