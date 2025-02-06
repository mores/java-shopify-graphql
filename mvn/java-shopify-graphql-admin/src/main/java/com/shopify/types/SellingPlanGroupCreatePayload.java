package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `sellingPlanGroupCreate` mutation.
 */
public class SellingPlanGroupCreatePayload {
  /**
   * The created selling plan group object.
   */
  private SellingPlanGroup sellingPlanGroup;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SellingPlanGroupUserError> userErrors;

  public SellingPlanGroupCreatePayload() {
  }

  /**
   * The created selling plan group object.
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
    return "SellingPlanGroupCreatePayload{sellingPlanGroup='" + sellingPlanGroup + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanGroupCreatePayload that = (SellingPlanGroupCreatePayload) o;
    return Objects.equals(sellingPlanGroup, that.sellingPlanGroup) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellingPlanGroup, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The created selling plan group object.
     */
    private SellingPlanGroup sellingPlanGroup;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SellingPlanGroupUserError> userErrors;

    public SellingPlanGroupCreatePayload build() {
      SellingPlanGroupCreatePayload result = new SellingPlanGroupCreatePayload();
      result.sellingPlanGroup = this.sellingPlanGroup;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created selling plan group object.
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
