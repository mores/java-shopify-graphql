package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `sellingPlanGroupAddProducts` mutation.
 */
public class SellingPlanGroupAddProductsPayload {
  /**
   * The updated selling plan group.
   */
  private SellingPlanGroup sellingPlanGroup;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SellingPlanGroupUserError> userErrors;

  public SellingPlanGroupAddProductsPayload() {
  }

  /**
   * The updated selling plan group.
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
    return "SellingPlanGroupAddProductsPayload{sellingPlanGroup='" + sellingPlanGroup + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanGroupAddProductsPayload that = (SellingPlanGroupAddProductsPayload) o;
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
     * The updated selling plan group.
     */
    private SellingPlanGroup sellingPlanGroup;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SellingPlanGroupUserError> userErrors;

    public SellingPlanGroupAddProductsPayload build() {
      SellingPlanGroupAddProductsPayload result = new SellingPlanGroupAddProductsPayload();
      result.sellingPlanGroup = this.sellingPlanGroup;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated selling plan group.
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
