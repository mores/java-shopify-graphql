package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for subscription lines used for contract calculation.
 * This is a oneOf input: one, and only one, field can be provided.
 */
public class SubscriptionContractCalculationLineInput {
  /**
   * Input for a product variant line.
   */
  private SubscriptionContractCalculationProductVariantLineInput productVariantLine;

  /**
   * Input for a custom line.
   */
  private SubscriptionContractCalculationCustomLineInput customLine;

  /**
   * Input for a product variant bundle parent line.
   */
  private SubscriptionContractCalculationProductVariantParentLineInput productVariantParentLine;

  public SubscriptionContractCalculationLineInput() {
  }

  /**
   * Input for a product variant line.
   */
  public SubscriptionContractCalculationProductVariantLineInput getProductVariantLine() {
    return productVariantLine;
  }

  public void setProductVariantLine(
      SubscriptionContractCalculationProductVariantLineInput productVariantLine) {
    this.productVariantLine = productVariantLine;
  }

  /**
   * Input for a custom line.
   */
  public SubscriptionContractCalculationCustomLineInput getCustomLine() {
    return customLine;
  }

  public void setCustomLine(SubscriptionContractCalculationCustomLineInput customLine) {
    this.customLine = customLine;
  }

  /**
   * Input for a product variant bundle parent line.
   */
  public SubscriptionContractCalculationProductVariantParentLineInput getProductVariantParentLine(
      ) {
    return productVariantParentLine;
  }

  public void setProductVariantParentLine(
      SubscriptionContractCalculationProductVariantParentLineInput productVariantParentLine) {
    this.productVariantParentLine = productVariantParentLine;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationLineInput{productVariantLine='" + productVariantLine + "', customLine='" + customLine + "', productVariantParentLine='" + productVariantParentLine + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationLineInput that = (SubscriptionContractCalculationLineInput) o;
    return Objects.equals(productVariantLine, that.productVariantLine) &&
        Objects.equals(customLine, that.customLine) &&
        Objects.equals(productVariantParentLine, that.productVariantParentLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVariantLine, customLine, productVariantParentLine);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Input for a product variant line.
     */
    private SubscriptionContractCalculationProductVariantLineInput productVariantLine;

    /**
     * Input for a custom line.
     */
    private SubscriptionContractCalculationCustomLineInput customLine;

    /**
     * Input for a product variant bundle parent line.
     */
    private SubscriptionContractCalculationProductVariantParentLineInput productVariantParentLine;

    public SubscriptionContractCalculationLineInput build() {
      SubscriptionContractCalculationLineInput result = new SubscriptionContractCalculationLineInput();
      result.productVariantLine = this.productVariantLine;
      result.customLine = this.customLine;
      result.productVariantParentLine = this.productVariantParentLine;
      return result;
    }

    /**
     * Input for a product variant line.
     */
    public Builder productVariantLine(
        SubscriptionContractCalculationProductVariantLineInput productVariantLine) {
      this.productVariantLine = productVariantLine;
      return this;
    }

    /**
     * Input for a custom line.
     */
    public Builder customLine(SubscriptionContractCalculationCustomLineInput customLine) {
      this.customLine = customLine;
      return this;
    }

    /**
     * Input for a product variant bundle parent line.
     */
    public Builder productVariantParentLine(
        SubscriptionContractCalculationProductVariantParentLineInput productVariantParentLine) {
      this.productVariantParentLine = productVariantParentLine;
      return this;
    }
  }
}
