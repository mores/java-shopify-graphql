package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `sellingPlanGroupDelete` mutation.
 */
public class SellingPlanGroupDeletePayload {
  /**
   * The ID of the deleted selling plan group object.
   */
  private String deletedSellingPlanGroupId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SellingPlanGroupUserError> userErrors;

  public SellingPlanGroupDeletePayload() {
  }

  /**
   * The ID of the deleted selling plan group object.
   */
  public String getDeletedSellingPlanGroupId() {
    return deletedSellingPlanGroupId;
  }

  public void setDeletedSellingPlanGroupId(String deletedSellingPlanGroupId) {
    this.deletedSellingPlanGroupId = deletedSellingPlanGroupId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<SellingPlanGroupUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SellingPlanGroupUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SellingPlanGroupDeletePayload{deletedSellingPlanGroupId='" + deletedSellingPlanGroupId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanGroupDeletePayload that = (SellingPlanGroupDeletePayload) o;
    return Objects.equals(deletedSellingPlanGroupId, that.deletedSellingPlanGroupId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedSellingPlanGroupId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the deleted selling plan group object.
     */
    private String deletedSellingPlanGroupId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SellingPlanGroupUserError> userErrors;

    public SellingPlanGroupDeletePayload build() {
      SellingPlanGroupDeletePayload result = new SellingPlanGroupDeletePayload();
      result.deletedSellingPlanGroupId = this.deletedSellingPlanGroupId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted selling plan group object.
     */
    public Builder deletedSellingPlanGroupId(String deletedSellingPlanGroupId) {
      this.deletedSellingPlanGroupId = deletedSellingPlanGroupId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<SellingPlanGroupUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
