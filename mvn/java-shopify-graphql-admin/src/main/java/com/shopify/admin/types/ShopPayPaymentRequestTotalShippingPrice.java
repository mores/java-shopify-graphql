package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a shipping total for a Shop Pay payment request.
 */
public class ShopPayPaymentRequestTotalShippingPrice {
  /**
   * The discounts for the shipping total.
   */
  private List<ShopPayPaymentRequestDiscount> discounts;

  /**
   * The final total for the shipping line.
   */
  private MoneyV2 finalTotal;

  /**
   * The original total for the shipping line.
   */
  private MoneyV2 originalTotal;

  public ShopPayPaymentRequestTotalShippingPrice() {
  }

  /**
   * The discounts for the shipping total.
   */
  public List<ShopPayPaymentRequestDiscount> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<ShopPayPaymentRequestDiscount> discounts) {
    this.discounts = discounts;
  }

  /**
   * The final total for the shipping line.
   */
  public MoneyV2 getFinalTotal() {
    return finalTotal;
  }

  public void setFinalTotal(MoneyV2 finalTotal) {
    this.finalTotal = finalTotal;
  }

  /**
   * The original total for the shipping line.
   */
  public MoneyV2 getOriginalTotal() {
    return originalTotal;
  }

  public void setOriginalTotal(MoneyV2 originalTotal) {
    this.originalTotal = originalTotal;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestTotalShippingPrice{discounts='" + discounts + "', finalTotal='" + finalTotal + "', originalTotal='" + originalTotal + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestTotalShippingPrice that = (ShopPayPaymentRequestTotalShippingPrice) o;
    return Objects.equals(discounts, that.discounts) &&
        Objects.equals(finalTotal, that.finalTotal) &&
        Objects.equals(originalTotal, that.originalTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discounts, finalTotal, originalTotal);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The discounts for the shipping total.
     */
    private List<ShopPayPaymentRequestDiscount> discounts;

    /**
     * The final total for the shipping line.
     */
    private MoneyV2 finalTotal;

    /**
     * The original total for the shipping line.
     */
    private MoneyV2 originalTotal;

    public ShopPayPaymentRequestTotalShippingPrice build() {
      ShopPayPaymentRequestTotalShippingPrice result = new ShopPayPaymentRequestTotalShippingPrice();
      result.discounts = this.discounts;
      result.finalTotal = this.finalTotal;
      result.originalTotal = this.originalTotal;
      return result;
    }

    /**
     * The discounts for the shipping total.
     */
    public Builder discounts(List<ShopPayPaymentRequestDiscount> discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The final total for the shipping line.
     */
    public Builder finalTotal(MoneyV2 finalTotal) {
      this.finalTotal = finalTotal;
      return this;
    }

    /**
     * The original total for the shipping line.
     */
    public Builder originalTotal(MoneyV2 originalTotal) {
      this.originalTotal = originalTotal;
      return this;
    }
  }
}
