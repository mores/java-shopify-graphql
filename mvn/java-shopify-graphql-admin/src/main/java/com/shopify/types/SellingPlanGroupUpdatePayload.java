package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `sellingPlanGroupUpdate` mutation.
 */
public class SellingPlanGroupUpdatePayload {
  /**
   * The IDs of the deleted Subscription Plans.
   */
  private List<String> deletedSellingPlanIds;

  /**
   * The updated Selling Plan Group.
   */
  private SellingPlanGroup sellingPlanGroup;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SellingPlanGroupUserError> userErrors;

  public SellingPlanGroupUpdatePayload() {
  }

  /**
   * The IDs of the deleted Subscription Plans.
   */
  public List<String> getDeletedSellingPlanIds() {
    return deletedSellingPlanIds;
  }

  public void setDeletedSellingPlanIds(List<String> deletedSellingPlanIds) {
    this.deletedSellingPlanIds = deletedSellingPlanIds;
  }

  /**
   * The updated Selling Plan Group.
   */
  public SellingPlanGroup getSellingPlanGroup() {
    return sellingPlanGroup;
  }

  public void setSellingPlanGroup(SellingPlanGroup sellingPlanGroup) {
    this.sellingPlanGroup = sellingPlanGroup;
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
    return "SellingPlanGroupUpdatePayload{deletedSellingPlanIds='" + deletedSellingPlanIds + "', sellingPlanGroup='" + sellingPlanGroup + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanGroupUpdatePayload that = (SellingPlanGroupUpdatePayload) o;
    return Objects.equals(deletedSellingPlanIds, that.deletedSellingPlanIds) &&
        Objects.equals(sellingPlanGroup, that.sellingPlanGroup) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedSellingPlanIds, sellingPlanGroup, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The IDs of the deleted Subscription Plans.
     */
    private List<String> deletedSellingPlanIds;

    /**
     * The updated Selling Plan Group.
     */
    private SellingPlanGroup sellingPlanGroup;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SellingPlanGroupUserError> userErrors;

    public SellingPlanGroupUpdatePayload build() {
      SellingPlanGroupUpdatePayload result = new SellingPlanGroupUpdatePayload();
      result.deletedSellingPlanIds = this.deletedSellingPlanIds;
      result.sellingPlanGroup = this.sellingPlanGroup;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The IDs of the deleted Subscription Plans.
     */
    public Builder deletedSellingPlanIds(List<String> deletedSellingPlanIds) {
      this.deletedSellingPlanIds = deletedSellingPlanIds;
      return this;
    }

    /**
     * The updated Selling Plan Group.
     */
    public Builder sellingPlanGroup(SellingPlanGroup sellingPlanGroup) {
      this.sellingPlanGroup = sellingPlanGroup;
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
