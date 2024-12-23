package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for exchange line items on a calculated return.
 */
public class CalculateExchangeLineItemInput {
  /**
   * The ID of the product variant to be added to the order as part of an exchange.
   */
  private String variantId;

  /**
   * The quantity of the item to be added.
   */
  private int quantity;

  /**
   * The discount to be applied to the exchange line item.
   */
  private ExchangeLineItemAppliedDiscountInput appliedDiscount;

  public CalculateExchangeLineItemInput() {
  }

  /**
   * The ID of the product variant to be added to the order as part of an exchange.
   */
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  /**
   * The quantity of the item to be added.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The discount to be applied to the exchange line item.
   */
  public ExchangeLineItemAppliedDiscountInput getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(ExchangeLineItemAppliedDiscountInput appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
  }

  @Override
  public String toString() {
    return "CalculateExchangeLineItemInput{variantId='" + variantId + "', quantity='" + quantity + "', appliedDiscount='" + appliedDiscount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculateExchangeLineItemInput that = (CalculateExchangeLineItemInput) o;
    return Objects.equals(variantId, that.variantId) &&
        quantity == that.quantity &&
        Objects.equals(appliedDiscount, that.appliedDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variantId, quantity, appliedDiscount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the product variant to be added to the order as part of an exchange.
     */
    private String variantId;

    /**
     * The quantity of the item to be added.
     */
    private int quantity;

    /**
     * The discount to be applied to the exchange line item.
     */
    private ExchangeLineItemAppliedDiscountInput appliedDiscount;

    public CalculateExchangeLineItemInput build() {
      CalculateExchangeLineItemInput result = new CalculateExchangeLineItemInput();
      result.variantId = this.variantId;
      result.quantity = this.quantity;
      result.appliedDiscount = this.appliedDiscount;
      return result;
    }

    /**
     * The ID of the product variant to be added to the order as part of an exchange.
     */
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    /**
     * The quantity of the item to be added.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The discount to be applied to the exchange line item.
     */
    public Builder appliedDiscount(ExchangeLineItemAppliedDiscountInput appliedDiscount) {
      this.appliedDiscount = appliedDiscount;
      return this;
    }
  }
}
