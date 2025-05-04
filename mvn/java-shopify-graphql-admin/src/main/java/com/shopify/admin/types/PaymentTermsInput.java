package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to create payment terms. Payment terms set the date that payment is due.
 */
public class PaymentTermsInput {
  /**
   * Specifies the ID of the payment terms template.
   *         Payment terms templates provide preset configurations to create common payment terms.
   *         Refer to the
   *         [PaymentTermsTemplate](https://shopify.dev/api/admin-graphql/latest/objects/paymenttermstemplate)
   *         object for more details.
   */
  private String paymentTermsTemplateId;

  /**
   * Specifies the payment schedules for the payment terms.
   */
  private List<PaymentScheduleInput> paymentSchedules;

  public PaymentTermsInput() {
  }

  /**
   * Specifies the ID of the payment terms template.
   *         Payment terms templates provide preset configurations to create common payment terms.
   *         Refer to the
   *         [PaymentTermsTemplate](https://shopify.dev/api/admin-graphql/latest/objects/paymenttermstemplate)
   *         object for more details.
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
    /**
     * Specifies the ID of the payment terms template.
     *         Payment terms templates provide preset configurations to create common payment terms.
     *         Refer to the
     *         [PaymentTermsTemplate](https://shopify.dev/api/admin-graphql/latest/objects/paymenttermstemplate)
     *         object for more details.
     */
    private String paymentTermsTemplateId;

    /**
     * Specifies the payment schedules for the payment terms.
     */
    private List<PaymentScheduleInput> paymentSchedules;

    public PaymentTermsInput build() {
      PaymentTermsInput result = new PaymentTermsInput();
      result.paymentTermsTemplateId = this.paymentTermsTemplateId;
      result.paymentSchedules = this.paymentSchedules;
      return result;
    }

    /**
     * Specifies the ID of the payment terms template.
     *         Payment terms templates provide preset configurations to create common payment terms.
     *         Refer to the
     *         [PaymentTermsTemplate](https://shopify.dev/api/admin-graphql/latest/objects/paymenttermstemplate)
     *         object for more details.
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
