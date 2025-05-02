package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a discount for a Shop Pay payment request.
 */
public class ShopPayPaymentRequestDiscount {
  /**
   * The amount of the discount.
   */
  private MoneyV2 amount;

  /**
   * The label of the discount.
   */
  private String label;

  public ShopPayPaymentRequestDiscount() {
  }

  /**
   * The amount of the discount.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
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
    return "ShopPayPaymentRequestDiscount{amount='" + amount + "', label='" + label + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestDiscount that = (ShopPayPaymentRequestDiscount) o;
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
    private MoneyV2 amount;

    /**
     * The label of the discount.
     */
    private String label;

    public ShopPayPaymentRequestDiscount build() {
      ShopPayPaymentRequestDiscount result = new ShopPayPaymentRequestDiscount();
      result.amount = this.amount;
      result.label = this.label;
      return result;
    }

    /**
     * The amount of the discount.
     */
    public Builder amount(MoneyV2 amount) {
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
