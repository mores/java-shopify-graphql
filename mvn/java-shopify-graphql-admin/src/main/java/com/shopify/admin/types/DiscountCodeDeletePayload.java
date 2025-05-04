package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `discountCodeDelete` mutation.
 */
public class DiscountCodeDeletePayload {
  /**
   * The ID of the code discount that was deleted.
   */
  private String deletedCodeDiscountId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<DiscountUserError> userErrors;

  public DiscountCodeDeletePayload() {
  }

  /**
   * The ID of the code discount that was deleted.
   */
  public String getDeletedCodeDiscountId() {
    return deletedCodeDiscountId;
  }

  public void setDeletedCodeDiscountId(String deletedCodeDiscountId) {
    this.deletedCodeDiscountId = deletedCodeDiscountId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<DiscountUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DiscountUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DiscountCodeDeletePayload{deletedCodeDiscountId='" + deletedCodeDiscountId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeDeletePayload that = (DiscountCodeDeletePayload) o;
    return Objects.equals(deletedCodeDiscountId, that.deletedCodeDiscountId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedCodeDiscountId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the code discount that was deleted.
     */
    private String deletedCodeDiscountId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<DiscountUserError> userErrors;

    public DiscountCodeDeletePayload build() {
      DiscountCodeDeletePayload result = new DiscountCodeDeletePayload();
      result.deletedCodeDiscountId = this.deletedCodeDiscountId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the code discount that was deleted.
     */
    public Builder deletedCodeDiscountId(String deletedCodeDiscountId) {
      this.deletedCodeDiscountId = deletedCodeDiscountId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<DiscountUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
