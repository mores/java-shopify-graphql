package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Discount applications capture the intentions of a discount source at
 * the time of application on an order's line items or shipping lines.
 */
public class FinancialSummaryDiscountApplication {
  /**
   * The method by which the discount's value is applied to its entitled items.
   */
  private DiscountApplicationAllocationMethod allocationMethod;

  /**
   * How the discount amount is distributed on the discounted lines.
   */
  private DiscountApplicationTargetSelection targetSelection;

  /**
   * Whether the discount is applied on line items or shipping lines.
   */
  private DiscountApplicationTargetType targetType;

  public FinancialSummaryDiscountApplication() {
  }

  /**
   * The method by which the discount's value is applied to its entitled items.
   */
  public DiscountApplicationAllocationMethod getAllocationMethod() {
    return allocationMethod;
  }

  public void setAllocationMethod(DiscountApplicationAllocationMethod allocationMethod) {
    this.allocationMethod = allocationMethod;
  }

  /**
   * How the discount amount is distributed on the discounted lines.
   */
  public DiscountApplicationTargetSelection getTargetSelection() {
    return targetSelection;
  }

  public void setTargetSelection(DiscountApplicationTargetSelection targetSelection) {
    this.targetSelection = targetSelection;
  }

  /**
   * Whether the discount is applied on line items or shipping lines.
   */
  public DiscountApplicationTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(DiscountApplicationTargetType targetType) {
    this.targetType = targetType;
  }

  @Override
  public String toString() {
    return "FinancialSummaryDiscountApplication{allocationMethod='" + allocationMethod + "', targetSelection='" + targetSelection + "', targetType='" + targetType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FinancialSummaryDiscountApplication that = (FinancialSummaryDiscountApplication) o;
    return Objects.equals(allocationMethod, that.allocationMethod) &&
        Objects.equals(targetSelection, that.targetSelection) &&
        Objects.equals(targetType, that.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationMethod, targetSelection, targetType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The method by which the discount's value is applied to its entitled items.
     */
    private DiscountApplicationAllocationMethod allocationMethod;

    /**
     * How the discount amount is distributed on the discounted lines.
     */
    private DiscountApplicationTargetSelection targetSelection;

    /**
     * Whether the discount is applied on line items or shipping lines.
     */
    private DiscountApplicationTargetType targetType;

    public FinancialSummaryDiscountApplication build() {
      FinancialSummaryDiscountApplication result = new FinancialSummaryDiscountApplication();
      result.allocationMethod = this.allocationMethod;
      result.targetSelection = this.targetSelection;
      result.targetType = this.targetType;
      return result;
    }

    /**
     * The method by which the discount's value is applied to its entitled items.
     */
    public Builder allocationMethod(DiscountApplicationAllocationMethod allocationMethod) {
      this.allocationMethod = allocationMethod;
      return this;
    }

    /**
     * How the discount amount is distributed on the discounted lines.
     */
    public Builder targetSelection(DiscountApplicationTargetSelection targetSelection) {
      this.targetSelection = targetSelection;
      return this;
    }

    /**
     * Whether the discount is applied on line items or shipping lines.
     */
    public Builder targetType(DiscountApplicationTargetType targetType) {
      this.targetType = targetType;
      return this;
    }
  }
}
