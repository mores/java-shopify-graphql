package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `paymentTermsUpdate` mutation.
 */
public class PaymentTermsUpdatePayload {
  /**
   * The updated payment terms.
   */
  private PaymentTerms paymentTerms;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PaymentTermsUpdateUserError> userErrors;

  public PaymentTermsUpdatePayload() {
  }

  /**
   * The updated payment terms.
   */
  public PaymentTerms getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(PaymentTerms paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<PaymentTermsUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PaymentTermsUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PaymentTermsUpdatePayload{paymentTerms='" + paymentTerms + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentTermsUpdatePayload that = (PaymentTermsUpdatePayload) o;
    return Objects.equals(paymentTerms, that.paymentTerms) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTerms, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated payment terms.
     */
    private PaymentTerms paymentTerms;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PaymentTermsUpdateUserError> userErrors;

    public PaymentTermsUpdatePayload build() {
      PaymentTermsUpdatePayload result = new PaymentTermsUpdatePayload();
      result.paymentTerms = this.paymentTerms;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated payment terms.
     */
    public Builder paymentTerms(PaymentTerms paymentTerms) {
      this.paymentTerms = paymentTerms;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<PaymentTermsUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
