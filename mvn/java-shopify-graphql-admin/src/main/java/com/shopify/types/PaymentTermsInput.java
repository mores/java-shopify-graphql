package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class PaymentTermsInput {
  
  private String paymentTermsTemplateId;

  
  private List<PaymentScheduleInput> paymentSchedules;

  public PaymentTermsInput() {
  }

  
  public String getPaymentTermsTemplateId() {
    return paymentTermsTemplateId;
  }

  public void setPaymentTermsTemplateId(String paymentTermsTemplateId) {
    this.paymentTermsTemplateId = paymentTermsTemplateId;
  }

  
  public List<PaymentScheduleInput> getPaymentSchedules() {
    return paymentSchedules;
  }

  public void setPaymentSchedules(List<PaymentScheduleInput> paymentSchedules) {
    this.paymentSchedules = paymentSchedules;
  }

  @Override
  public String toString() {
    return "PaymentTermsInput{paymentTermsTemplateId='" + paymentTermsTemplateId + "', paymentSchedules='" + paymentSchedules + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentTermsInput that = (PaymentTermsInput) o;
    return Objects.equals(paymentTermsTemplateId, that.paymentTermsTemplateId) &&
        Objects.equals(paymentSchedules, that.paymentSchedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTermsTemplateId, paymentSchedules);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String paymentTermsTemplateId;

    
    private List<PaymentScheduleInput> paymentSchedules;

    public PaymentTermsInput build() {
      PaymentTermsInput result = new PaymentTermsInput();
      result.paymentTermsTemplateId = this.paymentTermsTemplateId;
      result.paymentSchedules = this.paymentSchedules;
      return result;
    }

    
    public Builder paymentTermsTemplateId(String paymentTermsTemplateId) {
      this.paymentTermsTemplateId = paymentTermsTemplateId;
      return this;
    }

    
    public Builder paymentSchedules(List<PaymentScheduleInput> paymentSchedules) {
      this.paymentSchedules = paymentSchedules;
      return this;
    }
  }
}
