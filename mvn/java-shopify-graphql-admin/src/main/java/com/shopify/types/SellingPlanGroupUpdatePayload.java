package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SellingPlanGroupUpdatePayload {
  
  private List<String> deletedSellingPlanIds;

  
  private SellingPlanGroup sellingPlanGroup;

  
  private List<SellingPlanGroupUserError> userErrors;

  public SellingPlanGroupUpdatePayload() {
  }

  
  public List<String> getDeletedSellingPlanIds() {
    return deletedSellingPlanIds;
  }

  public void setDeletedSellingPlanIds(List<String> deletedSellingPlanIds) {
    this.deletedSellingPlanIds = deletedSellingPlanIds;
  }

  
  public SellingPlanGroup getSellingPlanGroup() {
    return sellingPlanGroup;
  }

  public void setSellingPlanGroup(SellingPlanGroup sellingPlanGroup) {
    this.sellingPlanGroup = sellingPlanGroup;
  }

  
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
    
    private List<String> deletedSellingPlanIds;

    
    private SellingPlanGroup sellingPlanGroup;

    
    private List<SellingPlanGroupUserError> userErrors;

    public SellingPlanGroupUpdatePayload build() {
      SellingPlanGroupUpdatePayload result = new SellingPlanGroupUpdatePayload();
      result.deletedSellingPlanIds = this.deletedSellingPlanIds;
      result.sellingPlanGroup = this.sellingPlanGroup;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedSellingPlanIds(List<String> deletedSellingPlanIds) {
      this.deletedSellingPlanIds = deletedSellingPlanIds;
      return this;
    }

    
    public Builder sellingPlanGroup(SellingPlanGroup sellingPlanGroup) {
      this.sellingPlanGroup = sellingPlanGroup;
      return this;
    }

    
    public Builder userErrors(List<SellingPlanGroupUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
