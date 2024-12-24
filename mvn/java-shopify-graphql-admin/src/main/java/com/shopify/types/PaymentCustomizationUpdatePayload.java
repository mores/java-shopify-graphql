package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class PaymentCustomizationUpdatePayload {
  
  private PaymentCustomization paymentCustomization;

  
  private List<PaymentCustomizationError> userErrors;

  public PaymentCustomizationUpdatePayload() {
  }

  
  public PaymentCustomization getPaymentCustomization() {
    return paymentCustomization;
  }

  public void setPaymentCustomization(PaymentCustomization paymentCustomization) {
    this.paymentCustomization = paymentCustomization;
  }

  
  public List<PaymentCustomizationError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PaymentCustomizationError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PaymentCustomizationUpdatePayload{paymentCustomization='" + paymentCustomization + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentCustomizationUpdatePayload that = (PaymentCustomizationUpdatePayload) o;
    return Objects.equals(paymentCustomization, that.paymentCustomization) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentCustomization, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private PaymentCustomization paymentCustomization;

    
    private List<PaymentCustomizationError> userErrors;

    public PaymentCustomizationUpdatePayload build() {
      PaymentCustomizationUpdatePayload result = new PaymentCustomizationUpdatePayload();
      result.paymentCustomization = this.paymentCustomization;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder paymentCustomization(PaymentCustomization paymentCustomization) {
      this.paymentCustomization = paymentCustomization;
      return this;
    }

    
    public Builder userErrors(List<PaymentCustomizationError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
