package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to create a shipping total for a Shop Pay payment request.
 */
public class ShopPayPaymentRequestTotalShippingPriceInput {
  /**
   * The discounts for the shipping total.
   *   
   * The input must not contain more than `250` values.
   */
  private List<ShopPayPaymentRequestDiscountInput> discounts;

  /**
   * The original total for the shipping total.
   */
  private MoneyInput originalTotal;

  /**
   * The final total for the shipping total.
   */
  private MoneyInput finalTotal;

  public ShopPayPaymentRequestTotalShippingPriceInput() {
  }

  /**
   * The discounts for the shipping total.
   *   
   * The input must not contain more than `250` values.
   */
  public List<ShopPayPaymentRequestDiscountInput> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<ShopPayPaymentRequestDiscountInput> discounts) {
    this.discounts = discounts;
  }

  /**
   * The original total for the shipping total.
   */
  public MoneyInput getOriginalTotal() {
    return originalTotal;
  }

  public void setOriginalTotal(MoneyInput originalTotal) {
    this.originalTotal = originalTotal;
  }

  /**
   * The final total for the shipping total.
   */
  public MoneyInput getFinalTotal() {
    return finalTotal;
  }

  public void setFinalTotal(MoneyInput finalTotal) {
    this.finalTotal = finalTotal;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestTotalShippingPriceInput{discounts='" + discounts + "', originalTotal='" + originalTotal + "', finalTotal='" + finalTotal + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestTotalShippingPriceInput that = (ShopPayPaymentRequestTotalShippingPriceInput) o;
    return Objects.equals(discounts, that.discounts) &&
        Objects.equals(originalTotal, that.originalTotal) &&
        Objects.equals(finalTotal, that.finalTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discounts, originalTotal, finalTotal);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The discounts for the shipping total.
     *   
     * The input must not contain more than `250` values.
     */
    private List<ShopPayPaymentRequestDiscountInput> discounts;

    /**
     * The original total for the shipping total.
     */
    private MoneyInput originalTotal;

    /**
     * The final total for the shipping total.
     */
    private MoneyInput finalTotal;

    public ShopPayPaymentRequestTotalShippingPriceInput build() {
      ShopPayPaymentRequestTotalShippingPriceInput result = new ShopPayPaymentRequestTotalShippingPriceInput();
      result.discounts = this.discounts;
      result.originalTotal = this.originalTotal;
      result.finalTotal = this.finalTotal;
      return result;
    }

    /**
     * The discounts for the shipping total.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder discounts(List<ShopPayPaymentRequestDiscountInput> discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The original total for the shipping total.
     */
    public Builder originalTotal(MoneyInput originalTotal) {
      this.originalTotal = originalTotal;
      return this;
    }

    /**
     * The final total for the shipping total.
     */
    public Builder finalTotal(MoneyInput finalTotal) {
      this.finalTotal = finalTotal;
      return this;
    }
  }
}
