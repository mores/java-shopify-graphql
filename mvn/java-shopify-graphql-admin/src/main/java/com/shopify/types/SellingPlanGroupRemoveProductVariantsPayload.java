package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SellingPlanGroupRemoveProductVariantsPayload {
  
  private List<String> removedProductVariantIds;

  
  private List<SellingPlanGroupUserError> userErrors;

  public SellingPlanGroupRemoveProductVariantsPayload() {
  }

  
  public List<String> getRemovedProductVariantIds() {
    return removedProductVariantIds;
  }

  public void setRemovedProductVariantIds(List<String> removedProductVariantIds) {
    this.removedProductVariantIds = removedProductVariantIds;
  }

  
  public List<SellingPlanGroupUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SellingPlanGroupUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SellingPlanGroupRemoveProductVariantsPayload{removedProductVariantIds='" + removedProductVariantIds + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanGroupRemoveProductVariantsPayload that = (SellingPlanGroupRemoveProductVariantsPayload) o;
    return Objects.equals(removedProductVariantIds, that.removedProductVariantIds) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removedProductVariantIds, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> removedProductVariantIds;

    
    private List<SellingPlanGroupUserError> userErrors;

    public SellingPlanGroupRemoveProductVariantsPayload build() {
      SellingPlanGroupRemoveProductVariantsPayload result = new SellingPlanGroupRemoveProductVariantsPayload();
      result.removedProductVariantIds = this.removedProductVariantIds;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder removedProductVariantIds(List<String> removedProductVariantIds) {
      this.removedProductVariantIds = removedProductVariantIds;
      return this;
    }

    
    public Builder userErrors(List<SellingPlanGroupUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
