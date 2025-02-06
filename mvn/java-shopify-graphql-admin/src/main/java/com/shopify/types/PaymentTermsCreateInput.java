package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields used to create a payment terms.
 */
public class PaymentTermsCreateInput {
  /**
   * Specifies the payment terms template ID used to generate payment terms.
   */
  private String paymentTermsTemplateId;

  /**
   * Specifies the payment schedules for the payment terms.
   */
  private List<PaymentScheduleInput> paymentSchedules;

  public PaymentTermsCreateInput() {
  }

  /**
   * Specifies the payment terms template ID used to generate payment terms.
   */
  public String getPaymentTermsTemplateId() {
    return paymentTermsTemplateId;
  }

  public void setPaymentTermsTemplateId(String paymentTermsTemplateId) {
    this.paymentTermsTemplateId = paymentTermsTemplateId;
  }

  /**
   * Specifies the payment schedules for the payment terms.
   */
  public List<PaymentScheduleInput> getPaymentSchedules() {
    return paymentSchedules;
  }

  public void setPaymentSchedules(List<PaymentScheduleInput> paymentSchedules) {
    this.paymentSchedules = paymentSchedules;
  }

  @Override
  public String toString() {
    return "PaymentTermsCreateInput{paymentTermsTemplateId='" + paymentTermsTemplateId + "', paymentSchedules='" + paymentSchedules + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentTermsCreateInput that = (PaymentTermsCreateInput) o;
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
    /**
     * Specifies the payment terms template ID used to generate payment terms.
     */
    private String paymentTermsTemplateId;

    /**
     * Specifies the payment schedules for the payment terms.
     */
    private List<PaymentScheduleInput> paymentSchedules;

    public PaymentTermsCreateInput build() {
      PaymentTermsCreateInput result = new PaymentTermsCreateInput();
      result.paymentTermsTemplateId = this.paymentTermsTemplateId;
      result.paymentSchedules = this.paymentSchedules;
      return result;
    }

    /**
     * Specifies the payment terms template ID used to generate payment terms.
     */
    public Builder paymentTermsTemplateId(String paymentTermsTemplateId) {
      this.paymentTermsTemplateId = paymentTermsTemplateId;
      return this;
    }

    /**
     * Specifies the payment schedules for the payment terms.
     */
    public Builder paymentSchedules(List<PaymentScheduleInput> paymentSchedules) {
      this.paymentSchedules = paymentSchedules;
      return this;
    }
  }
}
