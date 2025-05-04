package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productVariantRelationshipBulkUpdate` mutation.
 */
public class ProductVariantRelationshipBulkUpdatePayload {
  /**
   * The product variants with successfully updated product variant relationships.
   */
  private List<ProductVariant> parentProductVariants;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ProductVariantRelationshipBulkUpdateUserError> userErrors;

  public ProductVariantRelationshipBulkUpdatePayload() {
  }

  /**
   * The product variants with successfully updated product variant relationships.
   */
  public List<ProductVariant> getParentProductVariants() {
    return parentProductVariants;
  }

  public void setParentProductVariants(List<ProductVariant> parentProductVariants) {
    this.parentProductVariants = parentProductVariants;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
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
    /**
     * The product variants with successfully updated product variant relationships.
     */
    private List<ProductVariant> parentProductVariants;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ProductVariantRelationshipBulkUpdateUserError> userErrors;

    public ProductVariantRelationshipBulkUpdatePayload build() {
      ProductVariantRelationshipBulkUpdatePayload result = new ProductVariantRelationshipBulkUpdatePayload();
      result.parentProductVariants = this.parentProductVariants;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The product variants with successfully updated product variant relationships.
     */
    public Builder parentProductVariants(List<ProductVariant> parentProductVariants) {
      this.parentProductVariants = parentProductVariants;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<ProductVariantRelationshipBulkUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
