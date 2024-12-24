package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductLeaveSellingPlanGroupsPayload {
  
  private Product product;

  
  private List<SellingPlanGroupUserError> userErrors;

  public ProductLeaveSellingPlanGroupsPayload() {
  }

  
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  
  public List<SellingPlanGroupUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SellingPlanGroupUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductLeaveSellingPlanGroupsPayload{product='" + product + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductLeaveSellingPlanGroupsPayload that = (ProductLeaveSellingPlanGroupsPayload) o;
    return Objects.equals(product, that.product) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Product product;

    
    private List<SellingPlanGroupUserError> userErrors;

    public ProductLeaveSellingPlanGroupsPayload build() {
      ProductLeaveSellingPlanGroupsPayload result = new ProductLeaveSellingPlanGroupsPayload();
      result.product = this.product;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    
    public Builder userErrors(List<SellingPlanGroupUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
