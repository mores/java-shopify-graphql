package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class PaymentTermsCreatePayload {
  
  private PaymentTerms paymentTerms;

  
  private List<PaymentTermsCreateUserError> userErrors;

  public PaymentTermsCreatePayload() {
  }

  
  public PaymentTerms getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(PaymentTerms paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  
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
    
    private PaymentTerms paymentTerms;

    
    private List<PaymentTermsCreateUserError> userErrors;

    public PaymentTermsCreatePayload build() {
      PaymentTermsCreatePayload result = new PaymentTermsCreatePayload();
      result.paymentTerms = this.paymentTerms;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder paymentTerms(PaymentTerms paymentTerms) {
      this.paymentTerms = paymentTerms;
      return this;
    }

    
    public Builder userErrors(List<PaymentTermsCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
