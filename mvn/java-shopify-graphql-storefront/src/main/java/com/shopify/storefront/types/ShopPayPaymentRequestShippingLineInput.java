package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to create a shipping line for a Shop Pay payment request.
 */
public class ShopPayPaymentRequestShippingLineInput {
  /**
   * The code of the shipping line.
   */
  private String code;

  /**
   * The label of the shipping line.
   */
  private String label;

  /**
   * The amount for the shipping line.
   */
  private MoneyInput amount;

  public ShopPayPaymentRequestShippingLineInput() {
  }

  /**
   * The code of the shipping line.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The label of the shipping line.
   */
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * The amount for the shipping line.
   */
  public MoneyInput getAmount() {
    return amount;
  }

  public void setAmount(MoneyInput amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestShippingLineInput{code='" + code + "', label='" + label + "', amount='" + amount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestShippingLineInput that = (ShopPayPaymentRequestShippingLineInput) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(label, that.label) &&
        Objects.equals(amount, that.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, label, amount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The code of the shipping line.
     */
    private String code;

    /**
     * The label of the shipping line.
     */
    private String label;

    /**
     * The amount for the shipping line.
     */
    private MoneyInput amount;

    public ShopPayPaymentRequestShippingLineInput build() {
      ShopPayPaymentRequestShippingLineInput result = new ShopPayPaymentRequestShippingLineInput();
      result.code = this.code;
      result.label = this.label;
      result.amount = this.amount;
      return result;
    }

    /**
     * The code of the shipping line.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The label of the shipping line.
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * The amount for the shipping line.
     */
    public Builder amount(MoneyInput amount) {
      this.amount = amount;
      return this;
    }
  }
}
