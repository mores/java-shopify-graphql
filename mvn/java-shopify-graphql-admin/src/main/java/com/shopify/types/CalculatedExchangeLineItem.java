package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A calculated exchange line item.
 */
public class CalculatedExchangeLineItem {
  /**
   * The discounts that have been allocated onto the line item by discount applications.
   */
  private List<CalculatedDiscountAllocation> calculatedDiscountAllocations;

  /**
   * The unit price of the exchange line item after discounts.
   */
  private MoneyBag discountedUnitPriceSet;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The original unit price of the exchange line item before discounts.
   */
  private MoneyBag originalUnitPriceSet;

  /**
   * The quantity being exchanged.
   */
  private int quantity;

  /**
   * The calculated subtotal set of the exchange line item, including discounts.
   */
  private MoneyBag subtotalSet;

  /**
   * The total tax of the exchange line item.
   */
  private MoneyBag totalTaxSet;

  /**
   * The variant being exchanged.
   */
  private ProductVariant variant;

  public CalculatedExchangeLineItem() {
  }

  /**
   * The discounts that have been allocated onto the line item by discount applications.
   */
  public List<CalculatedDiscountAllocation> getCalculatedDiscountAllocations() {
    return calculatedDiscountAllocations;
  }

  public void setCalculatedDiscountAllocations(
      List<CalculatedDiscountAllocation> calculatedDiscountAllocations) {
    this.calculatedDiscountAllocations = calculatedDiscountAllocations;
  }

  /**
   * The unit price of the exchange line item after discounts.
   */
  public MoneyBag getDiscountedUnitPriceSet() {
    return discountedUnitPriceSet;
  }

  public void setDiscountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
    this.discountedUnitPriceSet = discountedUnitPriceSet;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The original unit price of the exchange line item before discounts.
   */
  public MoneyBag getOriginalUnitPriceSet() {
    return originalUnitPriceSet;
  }

  public void setOriginalUnitPriceSet(MoneyBag originalUnitPriceSet) {
    this.originalUnitPriceSet = originalUnitPriceSet;
  }

  /**
   * The quantity being exchanged.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The calculated subtotal set of the exchange line item, including discounts.
   */
  public MoneyBag getSubtotalSet() {
    return subtotalSet;
  }

  public void setSubtotalSet(MoneyBag subtotalSet) {
    this.subtotalSet = subtotalSet;
  }

  /**
   * The total tax of the exchange line item.
   */
  public MoneyBag getTotalTaxSet() {
    return totalTaxSet;
  }

  public void setTotalTaxSet(MoneyBag totalTaxSet) {
    this.totalTaxSet = totalTaxSet;
  }

  /**
   * The variant being exchanged.
   */
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  @Override
  public String toString() {
    return "CalculatedExchangeLineItem{calculatedDiscountAllocations='" + calculatedDiscountAllocations + "', discountedUnitPriceSet='" + discountedUnitPriceSet + "', id='" + id + "', originalUnitPriceSet='" + originalUnitPriceSet + "', quantity='" + quantity + "', subtotalSet='" + subtotalSet + "', totalTaxSet='" + totalTaxSet + "', variant='" + variant + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedExchangeLineItem that = (CalculatedExchangeLineItem) o;
    return Objects.equals(calculatedDiscountAllocations, that.calculatedDiscountAllocations) &&
        Objects.equals(discountedUnitPriceSet, that.discountedUnitPriceSet) &&
        Objects.equals(id, that.id) &&
        Objects.equals(originalUnitPriceSet, that.originalUnitPriceSet) &&
        quantity == that.quantity &&
        Objects.equals(subtotalSet, that.subtotalSet) &&
        Objects.equals(totalTaxSet, that.totalTaxSet) &&
        Objects.equals(variant, that.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculatedDiscountAllocations, discountedUnitPriceSet, id, originalUnitPriceSet, quantity, subtotalSet, totalTaxSet, variant);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The discounts that have been allocated onto the line item by discount applications.
     */
    private List<CalculatedDiscountAllocation> calculatedDiscountAllocations;

    /**
     * The unit price of the exchange line item after discounts.
     */
    private MoneyBag discountedUnitPriceSet;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The original unit price of the exchange line item before discounts.
     */
    private MoneyBag originalUnitPriceSet;

    /**
     * The quantity being exchanged.
     */
    private int quantity;

    /**
     * The calculated subtotal set of the exchange line item, including discounts.
     */
    private MoneyBag subtotalSet;

    /**
     * The total tax of the exchange line item.
     */
    private MoneyBag totalTaxSet;

    /**
     * The variant being exchanged.
     */
    private ProductVariant variant;

    public CalculatedExchangeLineItem build() {
      CalculatedExchangeLineItem result = new CalculatedExchangeLineItem();
      result.calculatedDiscountAllocations = this.calculatedDiscountAllocations;
      result.discountedUnitPriceSet = this.discountedUnitPriceSet;
      result.id = this.id;
      result.originalUnitPriceSet = this.originalUnitPriceSet;
      result.quantity = this.quantity;
      result.subtotalSet = this.subtotalSet;
      result.totalTaxSet = this.totalTaxSet;
      result.variant = this.variant;
      return result;
    }

    /**
     * The discounts that have been allocated onto the line item by discount applications.
     */
    public Builder calculatedDiscountAllocations(
        List<CalculatedDiscountAllocation> calculatedDiscountAllocations) {
      this.calculatedDiscountAllocations = calculatedDiscountAllocations;
      return this;
    }

    /**
     * The unit price of the exchange line item after discounts.
     */
    public Builder discountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
      this.discountedUnitPriceSet = discountedUnitPriceSet;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The original unit price of the exchange line item before discounts.
     */
    public Builder originalUnitPriceSet(MoneyBag originalUnitPriceSet) {
      this.originalUnitPriceSet = originalUnitPriceSet;
      return this;
    }

    /**
     * The quantity being exchanged.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The calculated subtotal set of the exchange line item, including discounts.
     */
    public Builder subtotalSet(MoneyBag subtotalSet) {
      this.subtotalSet = subtotalSet;
      return this;
    }

    /**
     * The total tax of the exchange line item.
     */
    public Builder totalTaxSet(MoneyBag totalTaxSet) {
      this.totalTaxSet = totalTaxSet;
      return this;
    }

    /**
     * The variant being exchanged.
     */
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }
  }
}
