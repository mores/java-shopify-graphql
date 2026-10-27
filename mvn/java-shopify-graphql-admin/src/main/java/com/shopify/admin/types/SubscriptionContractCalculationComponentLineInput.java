package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a single component of a parent line in the calculate API.
 * This is a oneOf input: one, and only one, field can be provided.
 */
public class SubscriptionContractCalculationComponentLineInput {
  /**
   * Input for a product variant component.
   */
  private SubscriptionContractCalculationProductVariantLineInput productVariantLine;

  public SubscriptionContractCalculationComponentLineInput() {
  }

  /**
   * Input for a product variant component.
   */
  public SubscriptionContractCalculationProductVariantLineInput getProductVariantLine() {
    return productVariantLine;
  }

  public void setProductVariantLine(
      SubscriptionContractCalculationProductVariantLineInput productVariantLine) {
    this.productVariantLine = productVariantLine;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationComponentLineInput{productVariantLine='" + productVariantLine + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationComponentLineInput that = (SubscriptionContractCalculationComponentLineInput) o;
    return Objects.equals(productVariantLine, that.productVariantLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVariantLine);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Input for a product variant component.
     */
    private SubscriptionContractCalculationProductVariantLineInput productVariantLine;

    public SubscriptionContractCalculationComponentLineInput build() {
      SubscriptionContractCalculationComponentLineInput result = new SubscriptionContractCalculationComponentLineInput();
      result.productVariantLine = this.productVariantLine;
      return result;
    }

    /**
     * Input for a product variant component.
     */
    public Builder productVariantLine(
        SubscriptionContractCalculationProductVariantLineInput productVariantLine) {
      this.productVariantLine = productVariantLine;
      return this;
    }
  }
}
