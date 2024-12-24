package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ProductVariantRelationshipBulkUpdatePayload {
  
  private List<ProductVariant> parentProductVariants;

  
  private List<ProductVariantRelationshipBulkUpdateUserError> userErrors;

  public ProductVariantRelationshipBulkUpdatePayload() {
  }

  
  public List<ProductVariant> getParentProductVariants() {
    return parentProductVariants;
  }

  public void setParentProductVariants(List<ProductVariant> parentProductVariants) {
    this.parentProductVariants = parentProductVariants;
  }

  
  public List<ProductVariantRelationshipBulkUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductVariantRelationshipBulkUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductVariantRelationshipBulkUpdatePayload{parentProductVariants='" + parentProductVariants + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantRelationshipBulkUpdatePayload that = (ProductVariantRelationshipBulkUpdatePayload) o;
    return Objects.equals(parentProductVariants, that.parentProductVariants) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentProductVariants, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<ProductVariant> parentProductVariants;

    
    private List<ProductVariantRelationshipBulkUpdateUserError> userErrors;

    public ProductVariantRelationshipBulkUpdatePayload build() {
      ProductVariantRelationshipBulkUpdatePayload result = new ProductVariantRelationshipBulkUpdatePayload();
      result.parentProductVariants = this.parentProductVariants;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder parentProductVariants(List<ProductVariant> parentProductVariants) {
      this.parentProductVariants = parentProductVariants;
      return this;
    }

    
    public Builder userErrors(List<ProductVariantRelationshipBulkUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
