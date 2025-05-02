package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a shipping line for a Shop Pay payment request.
 */
public class ShopPayPaymentRequestShippingLine {
  /**
   * The amount for the shipping line.
   */
  private MoneyV2 amount;

  /**
   * The code of the shipping line.
   */
  private String code;

  /**
   * The label of the shipping line.
   */
  private String label;

  public ShopPayPaymentRequestShippingLine() {
  }

  /**
   * The amount for the shipping line.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
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

  @Override
  public String toString() {
    return "ShopPayPaymentRequestShippingLine{amount='" + amount + "', code='" + code + "', label='" + label + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestShippingLine that = (ShopPayPaymentRequestShippingLine) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(code, that.code) &&
        Objects.equals(label, that.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, code, label);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount for the shipping line.
     */
    private MoneyV2 amount;

    /**
     * The code of the shipping line.
     */
    private String code;

    /**
     * The label of the shipping line.
     */
    private String label;

    public ShopPayPaymentRequestShippingLine build() {
      ShopPayPaymentRequestShippingLine result = new ShopPayPaymentRequestShippingLine();
      result.amount = this.amount;
      result.code = this.code;
      result.label = this.label;
      return result;
    }

    /**
     * The amount for the shipping line.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
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
  }
}
