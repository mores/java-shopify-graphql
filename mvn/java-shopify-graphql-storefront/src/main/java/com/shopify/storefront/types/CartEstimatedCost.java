package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The estimated costs that the buyer will pay at checkout. The estimated cost uses [`CartBuyerIdentity`](https://shopify.dev/api/storefront/reference/cart/cartbuyeridentity)
 * to determine [international pricing](https://shopify.dev/custom-storefronts/internationalization/international-pricing).
 */
public class CartEstimatedCost {
  /**
   * The estimated amount, before taxes and discounts, for the customer to pay at
   * checkout. The checkout charge amount doesn't include any deferred payments
   * that'll be paid at a later date. If the cart has no deferred payments, then
   * the checkout charge amount is equivalent to`subtotal_amount`.
   */
  private MoneyV2 checkoutChargeAmount;

  /**
   * The estimated amount, before taxes and discounts, for the customer to pay.
   */
  private MoneyV2 subtotalAmount;

  /**
   * The estimated total amount for the customer to pay.
   */
  private MoneyV2 totalAmount;

  /**
   * The estimated duty amount for the customer to pay at checkout.
   */
  private MoneyV2 totalDutyAmount;

  /**
   * The estimated tax amount for the customer to pay at checkout.
   */
  private MoneyV2 totalTaxAmount;

  public CartEstimatedCost() {
  }

  /**
   * The estimated amount, before taxes and discounts, for the customer to pay at
   * checkout. The checkout charge amount doesn't include any deferred payments
   * that'll be paid at a later date. If the cart has no deferred payments, then
   * the checkout charge amount is equivalent to`subtotal_amount`.
   */
  public MoneyV2 getCheckoutChargeAmount() {
    return checkoutChargeAmount;
  }

  public void setCheckoutChargeAmount(MoneyV2 checkoutChargeAmount) {
    this.checkoutChargeAmount = checkoutChargeAmount;
  }

  /**
   * The estimated amount, before taxes and discounts, for the customer to pay.
   */
  public MoneyV2 getSubtotalAmount() {
    return subtotalAmount;
  }

  public void setSubtotalAmount(MoneyV2 subtotalAmount) {
    this.subtotalAmount = subtotalAmount;
  }

  /**
   * The estimated total amount for the customer to pay.
   */
  public MoneyV2 getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(MoneyV2 totalAmount) {
    this.totalAmount = totalAmount;
  }

  /**
   * The estimated duty amount for the customer to pay at checkout.
   */
  public MoneyV2 getTotalDutyAmount() {
    return totalDutyAmount;
  }

  public void setTotalDutyAmount(MoneyV2 totalDutyAmount) {
    this.totalDutyAmount = totalDutyAmount;
  }

  /**
   * The estimated tax amount for the customer to pay at checkout.
   */
  public MoneyV2 getTotalTaxAmount() {
    return totalTaxAmount;
  }

  public void setTotalTaxAmount(MoneyV2 totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }

  @Override
  public String toString() {
    return "CartEstimatedCost{checkoutChargeAmount='" + checkoutChargeAmount + "', subtotalAmount='" + subtotalAmount + "', totalAmount='" + totalAmount + "', totalDutyAmount='" + totalDutyAmount + "', totalTaxAmount='" + totalTaxAmount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartEstimatedCost that = (CartEstimatedCost) o;
    return Objects.equals(checkoutChargeAmount, that.checkoutChargeAmount) &&
        Objects.equals(subtotalAmount, that.subtotalAmount) &&
        Objects.equals(totalAmount, that.totalAmount) &&
        Objects.equals(totalDutyAmount, that.totalDutyAmount) &&
        Objects.equals(totalTaxAmount, that.totalTaxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutChargeAmount, subtotalAmount, totalAmount, totalDutyAmount, totalTaxAmount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The estimated amount, before taxes and discounts, for the customer to pay at
     * checkout. The checkout charge amount doesn't include any deferred payments
     * that'll be paid at a later date. If the cart has no deferred payments, then
     * the checkout charge amount is equivalent to`subtotal_amount`.
     */
    private MoneyV2 checkoutChargeAmount;

    /**
     * The estimated amount, before taxes and discounts, for the customer to pay.
     */
    private MoneyV2 subtotalAmount;

    /**
     * The estimated total amount for the customer to pay.
     */
    private MoneyV2 totalAmount;

    /**
     * The estimated duty amount for the customer to pay at checkout.
     */
    private MoneyV2 totalDutyAmount;

    /**
     * The estimated tax amount for the customer to pay at checkout.
     */
    private MoneyV2 totalTaxAmount;

    public CartEstimatedCost build() {
      CartEstimatedCost result = new CartEstimatedCost();
      result.checkoutChargeAmount = this.checkoutChargeAmount;
      result.subtotalAmount = this.subtotalAmount;
      result.totalAmount = this.totalAmount;
      result.totalDutyAmount = this.totalDutyAmount;
      result.totalTaxAmount = this.totalTaxAmount;
      return result;
    }

    /**
     * The estimated amount, before taxes and discounts, for the customer to pay at
     * checkout. The checkout charge amount doesn't include any deferred payments
     * that'll be paid at a later date. If the cart has no deferred payments, then
     * the checkout charge amount is equivalent to`subtotal_amount`.
     */
    public Builder checkoutChargeAmount(MoneyV2 checkoutChargeAmount) {
      this.checkoutChargeAmount = checkoutChargeAmount;
      return this;
    }

    /**
     * The estimated amount, before taxes and discounts, for the customer to pay.
     */
    public Builder subtotalAmount(MoneyV2 subtotalAmount) {
      this.subtotalAmount = subtotalAmount;
      return this;
    }

    /**
     * The estimated total amount for the customer to pay.
     */
    public Builder totalAmount(MoneyV2 totalAmount) {
      this.totalAmount = totalAmount;
      return this;
    }

    /**
     * The estimated duty amount for the customer to pay at checkout.
     */
    public Builder totalDutyAmount(MoneyV2 totalDutyAmount) {
      this.totalDutyAmount = totalDutyAmount;
      return this;
    }

    /**
     * The estimated tax amount for the customer to pay at checkout.
     */
    public Builder totalTaxAmount(MoneyV2 totalTaxAmount) {
      this.totalTaxAmount = totalTaxAmount;
      return this;
    }
  }
}
