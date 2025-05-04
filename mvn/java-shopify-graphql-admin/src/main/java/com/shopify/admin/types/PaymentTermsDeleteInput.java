package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to delete the payment terms.
 */
public class PaymentTermsDeleteInput {
  /**
   * The ID of the payment terms being deleted.
   */
  private String paymentTermsId;

  public PaymentTermsDeleteInput() {
  }

  /**
   * The ID of the payment terms being deleted.
   */
  public String getPaymentTermsId() {
    return paymentTermsId;
  }

  public void setPaymentTermsId(String paymentTermsId) {
    this.paymentTermsId = paymentTermsId;
  }

  @Override
  public String toString() {
    return "PaymentTermsDeleteInput{paymentTermsId='" + paymentTermsId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentTermsDeleteInput that = (PaymentTermsDeleteInput) o;
    return Objects.equals(paymentTermsId, that.paymentTermsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTermsId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the payment terms being deleted.
     */
    private String paymentTermsId;

    public PaymentTermsDeleteInput build() {
      PaymentTermsDeleteInput result = new PaymentTermsDeleteInput();
      result.paymentTermsId = this.paymentTermsId;
      return result;
    }

    /**
     * The ID of the payment terms being deleted.
     */
    public Builder paymentTermsId(String paymentTermsId) {
      this.paymentTermsId = paymentTermsId;
      return this;
    }
  }
}
