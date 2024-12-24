package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PaymentTermsUpdateInput {
  
  private String paymentTermsId;

  
  private PaymentTermsInput paymentTermsAttributes;

  public PaymentTermsUpdateInput() {
  }

  
  public String getPaymentTermsId() {
    return paymentTermsId;
  }

  public void setPaymentTermsId(String paymentTermsId) {
    this.paymentTermsId = paymentTermsId;
  }

  
  public PaymentTermsInput getPaymentTermsAttributes() {
    return paymentTermsAttributes;
  }

  public void setPaymentTermsAttributes(PaymentTermsInput paymentTermsAttributes) {
    this.paymentTermsAttributes = paymentTermsAttributes;
  }

  @Override
  public String toString() {
    return "PaymentTermsUpdateInput{paymentTermsId='" + paymentTermsId + "', paymentTermsAttributes='" + paymentTermsAttributes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentTermsUpdateInput that = (PaymentTermsUpdateInput) o;
    return Objects.equals(paymentTermsId, that.paymentTermsId) &&
        Objects.equals(paymentTermsAttributes, that.paymentTermsAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTermsId, paymentTermsAttributes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String paymentTermsId;

    
    private PaymentTermsInput paymentTermsAttributes;

    public PaymentTermsUpdateInput build() {
      PaymentTermsUpdateInput result = new PaymentTermsUpdateInput();
      result.paymentTermsId = this.paymentTermsId;
      result.paymentTermsAttributes = this.paymentTermsAttributes;
      return result;
    }

    
    public Builder paymentTermsId(String paymentTermsId) {
      this.paymentTermsId = paymentTermsId;
      return this;
    }

    
    public Builder paymentTermsAttributes(PaymentTermsInput paymentTermsAttributes) {
      this.paymentTermsAttributes = paymentTermsAttributes;
      return this;
    }
  }
}
