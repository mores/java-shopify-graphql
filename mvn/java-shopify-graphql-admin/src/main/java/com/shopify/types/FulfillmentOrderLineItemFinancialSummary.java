package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The financial details of a fulfillment order line item.
 */
public class FulfillmentOrderLineItemFinancialSummary {
  /**
   * The approximate split price of a line item unit, in shop and presentment
   * currencies. This value doesn't include discounts applied to the entire
   * order.For the full picture of applied discounts, see discountAllocations.
   */
  private MoneyBag approximateDiscountedUnitPriceSet;

  /**
   * The discounts that have been allocated onto the line item by discount applications, not including order edits and refunds.
   */
  private List<FinancialSummaryDiscountAllocation> discountAllocations;

  /**
   * The variant unit price without discounts applied, in shop and presentment currencies.
   */
  private MoneyBag originalUnitPriceSet;

  /**
   * Number of line items that this financial summary applies to.
   */
  private int quantity;

  public FulfillmentOrderLineItemFinancialSummary() {
  }

  /**
   * The approximate split price of a line item unit, in shop and presentment
   * currencies. This value doesn't include discounts applied to the entire
   * order.For the full picture of applied discounts, see discountAllocations.
   */
  public MoneyBag getApproximateDiscountedUnitPriceSet() {
    return approximateDiscountedUnitPriceSet;
  }

  public void setApproximateDiscountedUnitPriceSet(MoneyBag approximateDiscountedUnitPriceSet) {
    this.approximateDiscountedUnitPriceSet = approximateDiscountedUnitPriceSet;
  }

  /**
   * The discounts that have been allocated onto the line item by discount applications, not including order edits and refunds.
   */
  public List<FinancialSummaryDiscountAllocation> getDiscountAllocations() {
    return discountAllocations;
  }

  public void setDiscountAllocations(List<FinancialSummaryDiscountAllocation> discountAllocations) {
    this.discountAllocations = discountAllocations;
  }

  /**
   * The variant unit price without discounts applied, in shop and presentment currencies.
   */
  public MoneyBag getOriginalUnitPriceSet() {
    return originalUnitPriceSet;
  }

  public void setOriginalUnitPriceSet(MoneyBag originalUnitPriceSet) {
    this.originalUnitPriceSet = originalUnitPriceSet;
  }

  /**
   * Number of line items that this financial summary applies to.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderLineItemFinancialSummary{approximateDiscountedUnitPriceSet='" + approximateDiscountedUnitPriceSet + "', discountAllocations='" + discountAllocations + "', originalUnitPriceSet='" + originalUnitPriceSet + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderLineItemFinancialSummary that = (FulfillmentOrderLineItemFinancialSummary) o;
    return Objects.equals(approximateDiscountedUnitPriceSet, that.approximateDiscountedUnitPriceSet) &&
        Objects.equals(discountAllocations, that.discountAllocations) &&
        Objects.equals(originalUnitPriceSet, that.originalUnitPriceSet) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(approximateDiscountedUnitPriceSet, discountAllocations, originalUnitPriceSet, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The approximate split price of a line item unit, in shop and presentment
     * currencies. This value doesn't include discounts applied to the entire
     * order.For the full picture of applied discounts, see discountAllocations.
     */
    private MoneyBag approximateDiscountedUnitPriceSet;

    /**
     * The discounts that have been allocated onto the line item by discount applications, not including order edits and refunds.
     */
    private List<FinancialSummaryDiscountAllocation> discountAllocations;

    /**
     * The variant unit price without discounts applied, in shop and presentment currencies.
     */
    private MoneyBag originalUnitPriceSet;

    /**
     * Number of line items that this financial summary applies to.
     */
    private int quantity;

    public FulfillmentOrderLineItemFinancialSummary build() {
      FulfillmentOrderLineItemFinancialSummary result = new FulfillmentOrderLineItemFinancialSummary();
      result.approximateDiscountedUnitPriceSet = this.approximateDiscountedUnitPriceSet;
      result.discountAllocations = this.discountAllocations;
      result.originalUnitPriceSet = this.originalUnitPriceSet;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The approximate split price of a line item unit, in shop and presentment
     * currencies. This value doesn't include discounts applied to the entire
     * order.For the full picture of applied discounts, see discountAllocations.
     */
    public Builder approximateDiscountedUnitPriceSet(MoneyBag approximateDiscountedUnitPriceSet) {
      this.approximateDiscountedUnitPriceSet = approximateDiscountedUnitPriceSet;
      return this;
    }

    /**
     * The discounts that have been allocated onto the line item by discount applications, not including order edits and refunds.
     */
    public Builder discountAllocations(
        List<FinancialSummaryDiscountAllocation> discountAllocations) {
      this.discountAllocations = discountAllocations;
      return this;
    }

    /**
     * The variant unit price without discounts applied, in shop and presentment currencies.
     */
    public Builder originalUnitPriceSet(MoneyBag originalUnitPriceSet) {
      this.originalUnitPriceSet = originalUnitPriceSet;
      return this;
    }

    /**
     * Number of line items that this financial summary applies to.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}
