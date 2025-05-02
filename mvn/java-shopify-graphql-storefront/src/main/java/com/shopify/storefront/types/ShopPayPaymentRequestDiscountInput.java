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
   * The amount of the discount.
   */
  private MoneyInput amount;

  /**
   * The label of the discount.
   */
  private String label;

  public ShopPayPaymentRequestDiscountInput() {
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

  /**
   * The label of the discount.
   */
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestDiscountInput{amount='" + amount + "', label='" + label + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestDiscountInput that = (ShopPayPaymentRequestDiscountInput) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(label, that.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, label);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount of the discount.
     */
    private MoneyInput amount;

    /**
     * The label of the discount.
     */
    private String label;

    public ShopPayPaymentRequestDiscountInput build() {
      ShopPayPaymentRequestDiscountInput result = new ShopPayPaymentRequestDiscountInput();
      result.amount = this.amount;
      result.label = this.label;
      return result;
    }

    /**
     * The amount of the discount.
     */
    public Builder amount(MoneyInput amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The label of the discount.
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }
  }
}
