package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for resource association with a Selling Plan Group.
 */
public class SellingPlanGroupResourceInput {
  /**
   * The IDs of the Variants to add to the Selling Plan Group.
   */
  private List<String> productVariantIds;

  /**
   * The IDs of the Products to add to the Selling Plan Group.
   */
  private List<String> productIds;

  public SellingPlanGroupResourceInput() {
  }

  /**
   * The IDs of the Variants to add to the Selling Plan Group.
   */
  public List<String> getProductVariantIds() {
    return productVariantIds;
  }

  public void setProductVariantIds(List<String> productVariantIds) {
    this.productVariantIds = productVariantIds;
  }

  /**
   * The IDs of the Products to add to the Selling Plan Group.
   */
  public List<String> getProductIds() {
    return productIds;
  }

  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }

  @Override
  public String toString() {
    return "SellingPlanGroupResourceInput{productVariantIds='" + productVariantIds + "', productIds='" + productIds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanGroupResourceInput that = (SellingPlanGroupResourceInput) o;
    return Objects.equals(productVariantIds, that.productVariantIds) &&
        Objects.equals(productIds, that.productIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVariantIds, productIds);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The IDs of the Variants to add to the Selling Plan Group.
     */
    private List<String> productVariantIds;

    /**
     * The IDs of the Products to add to the Selling Plan Group.
     */
    private List<String> productIds;

    public SellingPlanGroupResourceInput build() {
      SellingPlanGroupResourceInput result = new SellingPlanGroupResourceInput();
      result.productVariantIds = this.productVariantIds;
      result.productIds = this.productIds;
      return result;
    }

    /**
     * The IDs of the Variants to add to the Selling Plan Group.
     */
    public Builder productVariantIds(List<String> productVariantIds) {
      this.productVariantIds = productVariantIds;
      return this;
    }

    /**
     * The IDs of the Products to add to the Selling Plan Group.
     */
    public Builder productIds(List<String> productIds) {
      this.productIds = productIds;
      return this;
    }
  }
}
