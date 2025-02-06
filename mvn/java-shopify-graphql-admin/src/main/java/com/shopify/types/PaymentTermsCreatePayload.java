package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `paymentTermsCreate` mutation.
 */
public class PaymentTermsCreatePayload {
  /**
   * The created payment terms.
   */
  private PaymentTerms paymentTerms;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PaymentTermsCreateUserError> userErrors;

  public PaymentTermsCreatePayload() {
  }

  /**
   * The created payment terms.
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
  public List<PaymentTermsCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PaymentTermsCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PaymentTermsCreatePayload{paymentTerms='" + paymentTerms + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentTermsCreatePayload that = (PaymentTermsCreatePayload) o;
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
     * The created payment terms.
     */
    private PaymentTerms paymentTerms;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PaymentTermsCreateUserError> userErrors;

    public PaymentTermsCreatePayload build() {
      PaymentTermsCreatePayload result = new PaymentTermsCreatePayload();
      result.paymentTerms = this.paymentTerms;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created payment terms.
     */
    public Builder paymentTerms(PaymentTerms paymentTerms) {
      this.paymentTerms = paymentTerms;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<PaymentTermsCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
