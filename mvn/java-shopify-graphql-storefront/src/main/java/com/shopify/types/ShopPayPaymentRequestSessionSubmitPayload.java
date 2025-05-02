package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `shopPayPaymentRequestSessionSubmit` mutation.
 */
public class ShopPayPaymentRequestSessionSubmitPayload {
  /**
   * The checkout on which the payment was applied.
   */
  private ShopPayPaymentRequestReceipt paymentRequestReceipt;

  /**
   * Error codes for failed Shop Pay payment request session mutations.
   */
  private List<UserErrorsShopPayPaymentRequestSessionUserErrors> userErrors;

  public ShopPayPaymentRequestSessionSubmitPayload() {
  }

  /**
   * The checkout on which the payment was applied.
   */
  public ShopPayPaymentRequestReceipt getPaymentRequestReceipt() {
    return paymentRequestReceipt;
  }

  public void setPaymentRequestReceipt(ShopPayPaymentRequestReceipt paymentRequestReceipt) {
    this.paymentRequestReceipt = paymentRequestReceipt;
  }

  /**
   * Error codes for failed Shop Pay payment request session mutations.
   */
  public List<UserErrorsShopPayPaymentRequestSessionUserErrors> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserErrorsShopPayPaymentRequestSessionUserErrors> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestSessionSubmitPayload{paymentRequestReceipt='" + paymentRequestReceipt + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestSessionSubmitPayload that = (ShopPayPaymentRequestSessionSubmitPayload) o;
    return Objects.equals(paymentRequestReceipt, that.paymentRequestReceipt) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentRequestReceipt, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The checkout on which the payment was applied.
     */
    private ShopPayPaymentRequestReceipt paymentRequestReceipt;

    /**
     * Error codes for failed Shop Pay payment request session mutations.
     */
    private List<UserErrorsShopPayPaymentRequestSessionUserErrors> userErrors;

    public ShopPayPaymentRequestSessionSubmitPayload build() {
      ShopPayPaymentRequestSessionSubmitPayload result = new ShopPayPaymentRequestSessionSubmitPayload();
      result.paymentRequestReceipt = this.paymentRequestReceipt;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The checkout on which the payment was applied.
     */
    public Builder paymentRequestReceipt(ShopPayPaymentRequestReceipt paymentRequestReceipt) {
      this.paymentRequestReceipt = paymentRequestReceipt;
      return this;
    }

    /**
     * Error codes for failed Shop Pay payment request session mutations.
     */
    public Builder userErrors(List<UserErrorsShopPayPaymentRequestSessionUserErrors> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
