package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `productVariantJoinSellingPlanGroups` mutation.
 */
public class ProductVariantJoinSellingPlanGroupsPayload {
  /**
   * The product variant object.
   */
  private ProductVariant productVariant;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SellingPlanGroupUserError> userErrors;

  public ProductVariantJoinSellingPlanGroupsPayload() {
  }

  /**
   * The product variant object.
   */
  public ProductVariant getProductVariant() {
    return productVariant;
  }

  public void setProductVariant(ProductVariant productVariant) {
    this.productVariant = productVariant;
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
    return "ProductVariantJoinSellingPlanGroupsPayload{productVariant='" + productVariant + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductVariantJoinSellingPlanGroupsPayload that = (ProductVariantJoinSellingPlanGroupsPayload) o;
    return Objects.equals(productVariant, that.productVariant) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVariant, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The product variant object.
     */
    private ProductVariant productVariant;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SellingPlanGroupUserError> userErrors;

    public ProductVariantJoinSellingPlanGroupsPayload build() {
      ProductVariantJoinSellingPlanGroupsPayload result = new ProductVariantJoinSellingPlanGroupsPayload();
      result.productVariant = this.productVariant;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The product variant object.
     */
    public Builder productVariant(ProductVariant productVariant) {
      this.productVariant = productVariant;
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
