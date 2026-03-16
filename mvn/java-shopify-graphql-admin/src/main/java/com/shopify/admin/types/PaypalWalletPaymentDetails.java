package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * PayPal Wallet payment details related to a transaction.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PaypalWalletPaymentDetails implements PaymentDetails, com.shopify.admin.types.BasePaymentDetails {
  /**
   * The name of payment method used by the buyer.
   */
  private String paymentMethodName;

  public PaypalWalletPaymentDetails() {
  }

  /**
   * The name of payment method used by the buyer.
   */
  public String getPaymentMethodName() {
    return paymentMethodName;
  }

  public void setPaymentMethodName(String paymentMethodName) {
    this.paymentMethodName = paymentMethodName;
  }

  @Override
  public String toString() {
    return "PaypalWalletPaymentDetails{paymentMethodName='" + paymentMethodName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaypalWalletPaymentDetails that = (PaypalWalletPaymentDetails) o;
    return Objects.equals(paymentMethodName, that.paymentMethodName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of payment method used by the buyer.
     */
    private String paymentMethodName;

    public PaypalWalletPaymentDetails build() {
      PaypalWalletPaymentDetails result = new PaypalWalletPaymentDetails();
      result.paymentMethodName = this.paymentMethodName;
      return result;
    }

    /**
     * The name of payment method used by the buyer.
     */
    public Builder paymentMethodName(String paymentMethodName) {
      this.paymentMethodName = paymentMethodName;
      return this;
    }
  }
}
