package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The costs that the buyer will pay at checkout.
 * The cart cost uses [`CartBuyerIdentity`](https://shopify.dev/api/storefront/reference/cart/cartbuyeridentity) to determine
 * [international pricing](https://shopify.dev/custom-storefronts/internationalization/international-pricing).
 */
public class CartCost {
  /**
   * The estimated amount, before taxes and discounts, for the customer to pay at
   * checkout. The checkout charge amount doesn't include any deferred payments
   * that'll be paid at a later date. If the cart has no deferred payments, then
   * the checkout charge amount is equivalent to `subtotalAmount`.
   */
  private MoneyV2 checkoutChargeAmount;

  /**
   * The amount, before taxes and cart-level discounts, for the customer to pay.
   */
  private MoneyV2 subtotalAmount;

  /**
   * Whether the subtotal amount is estimated.
   */
  private boolean subtotalAmountEstimated;

  /**
   * The total amount for the customer to pay.
   */
  private MoneyV2 totalAmount;

  /**
   * Whether the total amount is estimated.
   */
  private boolean totalAmountEstimated;

  /**
   * The duty amount for the customer to pay at checkout.
   */
  private MoneyV2 totalDutyAmount;

  /**
   * Whether the total duty amount is estimated.
   */
  private boolean totalDutyAmountEstimated;

  /**
   * The tax amount for the customer to pay at checkout.
   */
  private MoneyV2 totalTaxAmount;

  /**
   * Whether the total tax amount is estimated.
   */
  private boolean totalTaxAmountEstimated;

  public CartCost() {
  }

  /**
   * The estimated amount, before taxes and discounts, for the customer to pay at
   * checkout. The checkout charge amount doesn't include any deferred payments
   * that'll be paid at a later date. If the cart has no deferred payments, then
   * the checkout charge amount is equivalent to `subtotalAmount`.
   */
  public MoneyV2 getCheckoutChargeAmount() {
    return checkoutChargeAmount;
  }

  public void setCheckoutChargeAmount(MoneyV2 checkoutChargeAmount) {
    this.checkoutChargeAmount = checkoutChargeAmount;
  }

  /**
   * The amount, before taxes and cart-level discounts, for the customer to pay.
   */
  public MoneyV2 getSubtotalAmount() {
    return subtotalAmount;
  }

  public void setSubtotalAmount(MoneyV2 subtotalAmount) {
    this.subtotalAmount = subtotalAmount;
  }

  /**
   * Whether the subtotal amount is estimated.
   */
  public boolean getSubtotalAmountEstimated() {
    return subtotalAmountEstimated;
  }

  public void setSubtotalAmountEstimated(boolean subtotalAmountEstimated) {
    this.subtotalAmountEstimated = subtotalAmountEstimated;
  }

  /**
   * The total amount for the customer to pay.
   */
  public MoneyV2 getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(MoneyV2 totalAmount) {
    this.totalAmount = totalAmount;
  }

  /**
   * Whether the total amount is estimated.
   */
  public boolean getTotalAmountEstimated() {
    return totalAmountEstimated;
  }

  public void setTotalAmountEstimated(boolean totalAmountEstimated) {
    this.totalAmountEstimated = totalAmountEstimated;
  }

  /**
   * The duty amount for the customer to pay at checkout.
   */
  public MoneyV2 getTotalDutyAmount() {
    return totalDutyAmount;
  }

  public void setTotalDutyAmount(MoneyV2 totalDutyAmount) {
    this.totalDutyAmount = totalDutyAmount;
  }

  /**
   * Whether the total duty amount is estimated.
   */
  public boolean getTotalDutyAmountEstimated() {
    return totalDutyAmountEstimated;
  }

  public void setTotalDutyAmountEstimated(boolean totalDutyAmountEstimated) {
    this.totalDutyAmountEstimated = totalDutyAmountEstimated;
  }

  /**
   * The tax amount for the customer to pay at checkout.
   */
  public MoneyV2 getTotalTaxAmount() {
    return totalTaxAmount;
  }

  public void setTotalTaxAmount(MoneyV2 totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }

  /**
   * Whether the total tax amount is estimated.
   */
  public boolean getTotalTaxAmountEstimated() {
    return totalTaxAmountEstimated;
  }

  public void setTotalTaxAmountEstimated(boolean totalTaxAmountEstimated) {
    this.totalTaxAmountEstimated = totalTaxAmountEstimated;
  }

  @Override
  public String toString() {
    return "CartCost{checkoutChargeAmount='" + checkoutChargeAmount + "', subtotalAmount='" + subtotalAmount + "', subtotalAmountEstimated='" + subtotalAmountEstimated + "', totalAmount='" + totalAmount + "', totalAmountEstimated='" + totalAmountEstimated + "', totalDutyAmount='" + totalDutyAmount + "', totalDutyAmountEstimated='" + totalDutyAmountEstimated + "', totalTaxAmount='" + totalTaxAmount + "', totalTaxAmountEstimated='" + totalTaxAmountEstimated + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartCost that = (CartCost) o;
    return Objects.equals(checkoutChargeAmount, that.checkoutChargeAmount) &&
        Objects.equals(subtotalAmount, that.subtotalAmount) &&
        subtotalAmountEstimated == that.subtotalAmountEstimated &&
        Objects.equals(totalAmount, that.totalAmount) &&
        totalAmountEstimated == that.totalAmountEstimated &&
        Objects.equals(totalDutyAmount, that.totalDutyAmount) &&
        totalDutyAmountEstimated == that.totalDutyAmountEstimated &&
        Objects.equals(totalTaxAmount, that.totalTaxAmount) &&
        totalTaxAmountEstimated == that.totalTaxAmountEstimated;
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutChargeAmount, subtotalAmount, subtotalAmountEstimated, totalAmount, totalAmountEstimated, totalDutyAmount, totalDutyAmountEstimated, totalTaxAmount, totalTaxAmountEstimated);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The estimated amount, before taxes and discounts, for the customer to pay at
     * checkout. The checkout charge amount doesn't include any deferred payments
     * that'll be paid at a later date. If the cart has no deferred payments, then
     * the checkout charge amount is equivalent to `subtotalAmount`.
     */
    private MoneyV2 checkoutChargeAmount;

    /**
     * The amount, before taxes and cart-level discounts, for the customer to pay.
     */
    private MoneyV2 subtotalAmount;

    /**
     * Whether the subtotal amount is estimated.
     */
    private boolean subtotalAmountEstimated;

    /**
     * The total amount for the customer to pay.
     */
    private MoneyV2 totalAmount;

    /**
     * Whether the total amount is estimated.
     */
    private boolean totalAmountEstimated;

    /**
     * The duty amount for the customer to pay at checkout.
     */
    private MoneyV2 totalDutyAmount;

    /**
     * Whether the total duty amount is estimated.
     */
    private boolean totalDutyAmountEstimated;

    /**
     * The tax amount for the customer to pay at checkout.
     */
    private MoneyV2 totalTaxAmount;

    /**
     * Whether the total tax amount is estimated.
     */
    private boolean totalTaxAmountEstimated;

    public CartCost build() {
      CartCost result = new CartCost();
      result.checkoutChargeAmount = this.checkoutChargeAmount;
      result.subtotalAmount = this.subtotalAmount;
      result.subtotalAmountEstimated = this.subtotalAmountEstimated;
      result.totalAmount = this.totalAmount;
      result.totalAmountEstimated = this.totalAmountEstimated;
      result.totalDutyAmount = this.totalDutyAmount;
      result.totalDutyAmountEstimated = this.totalDutyAmountEstimated;
      result.totalTaxAmount = this.totalTaxAmount;
      result.totalTaxAmountEstimated = this.totalTaxAmountEstimated;
      return result;
    }

    /**
     * The estimated amount, before taxes and discounts, for the customer to pay at
     * checkout. The checkout charge amount doesn't include any deferred payments
     * that'll be paid at a later date. If the cart has no deferred payments, then
     * the checkout charge amount is equivalent to `subtotalAmount`.
     */
    public Builder checkoutChargeAmount(MoneyV2 checkoutChargeAmount) {
      this.checkoutChargeAmount = checkoutChargeAmount;
      return this;
    }

    /**
     * The amount, before taxes and cart-level discounts, for the customer to pay.
     */
    public Builder subtotalAmount(MoneyV2 subtotalAmount) {
      this.subtotalAmount = subtotalAmount;
      return this;
    }

    /**
     * Whether the subtotal amount is estimated.
     */
    public Builder subtotalAmountEstimated(boolean subtotalAmountEstimated) {
      this.subtotalAmountEstimated = subtotalAmountEstimated;
      return this;
    }

    /**
     * The total amount for the customer to pay.
     */
    public Builder totalAmount(MoneyV2 totalAmount) {
      this.totalAmount = totalAmount;
      return this;
    }

    /**
     * Whether the total amount is estimated.
     */
    public Builder totalAmountEstimated(boolean totalAmountEstimated) {
      this.totalAmountEstimated = totalAmountEstimated;
      return this;
    }

    /**
     * The duty amount for the customer to pay at checkout.
     */
    public Builder totalDutyAmount(MoneyV2 totalDutyAmount) {
      this.totalDutyAmount = totalDutyAmount;
      return this;
    }

    /**
     * Whether the total duty amount is estimated.
     */
    public Builder totalDutyAmountEstimated(boolean totalDutyAmountEstimated) {
      this.totalDutyAmountEstimated = totalDutyAmountEstimated;
      return this;
    }

    /**
     * The tax amount for the customer to pay at checkout.
     */
    public Builder totalTaxAmount(MoneyV2 totalTaxAmount) {
      this.totalTaxAmount = totalTaxAmount;
      return this;
    }

    /**
     * Whether the total tax amount is estimated.
     */
    public Builder totalTaxAmountEstimated(boolean totalTaxAmountEstimated) {
      this.totalTaxAmountEstimated = totalTaxAmountEstimated;
      return this;
    }
  }
}
