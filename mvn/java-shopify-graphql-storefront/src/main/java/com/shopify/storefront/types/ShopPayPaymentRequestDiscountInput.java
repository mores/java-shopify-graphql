package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to create a discount for a Shop Pay payment request.
 */
public class ShopPayPaymentRequestDiscountInput {
  /**
   * The label of the discount.
   */
  private String label;

  /**
   * The amount of the discount.
   */
  private MoneyInput amount;

  public ShopPayPaymentRequestDiscountInput() {
  }

  /**
   * The label of the discount.
   */
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * The amount of the discount.
   */
  public MoneyInput getAmount() {
    return amount;
  }

  public void setAmount(MoneyInput amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestDiscountInput{label='" + label + "', amount='" + amount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestDiscountInput that = (ShopPayPaymentRequestDiscountInput) o;
    return Objects.equals(label, that.label) &&
        Objects.equals(amount, that.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, amount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The label of the discount.
     */
    private String label;

    /**
     * The amount of the discount.
     */
    private MoneyInput amount;

    public ShopPayPaymentRequestDiscountInput build() {
      ShopPayPaymentRequestDiscountInput result = new ShopPayPaymentRequestDiscountInput();
      result.label = this.label;
      result.amount = this.amount;
      return result;
    }

    /**
     * The label of the discount.
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * The amount of the discount.
     */
    public Builder amount(MoneyInput amount) {
      this.amount = amount;
      return this;
    }
  }
}
