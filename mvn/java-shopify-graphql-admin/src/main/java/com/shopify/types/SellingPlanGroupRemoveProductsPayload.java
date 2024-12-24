package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SellingPlanGroupRemoveProductsPayload {
  
  private List<String> removedProductIds;

  
  private List<SellingPlanGroupUserError> userErrors;

  public SellingPlanGroupRemoveProductsPayload() {
  }

  
  public List<String> getRemovedProductIds() {
    return removedProductIds;
  }

  public void setRemovedProductIds(List<String> removedProductIds) {
    this.removedProductIds = removedProductIds;
  }

  
  public List<SellingPlanGroupUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SellingPlanGroupUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SellingPlanGroupRemoveProductsPayload{removedProductIds='" + removedProductIds + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanGroupRemoveProductsPayload that = (SellingPlanGroupRemoveProductsPayload) o;
    return Objects.equals(removedProductIds, that.removedProductIds) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removedProductIds, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> removedProductIds;

    
    private List<SellingPlanGroupUserError> userErrors;

    public SellingPlanGroupRemoveProductsPayload build() {
      SellingPlanGroupRemoveProductsPayload result = new SellingPlanGroupRemoveProductsPayload();
      result.removedProductIds = this.removedProductIds;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder removedProductIds(List<String> removedProductIds) {
      this.removedProductIds = removedProductIds;
      return this;
    }

    
    public Builder userErrors(List<SellingPlanGroupUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
