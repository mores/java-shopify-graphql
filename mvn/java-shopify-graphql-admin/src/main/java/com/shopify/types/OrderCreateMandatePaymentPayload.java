package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `orderCreateMandatePayment` mutation.
 */
public class OrderCreateMandatePaymentPayload {
  /**
   * The async job used for charging the payment.
   */
  private Job job;

  /**
   * The Unique ID for the created payment.
   */
  private String paymentReferenceId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<OrderCreateMandatePaymentUserError> userErrors;

  public OrderCreateMandatePaymentPayload() {
  }

  /**
   * The async job used for charging the payment.
   */
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  /**
   * The Unique ID for the created payment.
   */
  public String getPaymentReferenceId() {
    return paymentReferenceId;
  }

  public void setPaymentReferenceId(String paymentReferenceId) {
    this.paymentReferenceId = paymentReferenceId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<OrderCreateMandatePaymentUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OrderCreateMandatePaymentUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderCreateMandatePaymentPayload{job='" + job + "', paymentReferenceId='" + paymentReferenceId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateMandatePaymentPayload that = (OrderCreateMandatePaymentPayload) o;
    return Objects.equals(job, that.job) &&
        Objects.equals(paymentReferenceId, that.paymentReferenceId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, paymentReferenceId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The async job used for charging the payment.
     */
    private Job job;

    /**
     * The Unique ID for the created payment.
     */
    private String paymentReferenceId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<OrderCreateMandatePaymentUserError> userErrors;

    public OrderCreateMandatePaymentPayload build() {
      OrderCreateMandatePaymentPayload result = new OrderCreateMandatePaymentPayload();
      result.job = this.job;
      result.paymentReferenceId = this.paymentReferenceId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The async job used for charging the payment.
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    /**
     * The Unique ID for the created payment.
     */
    public Builder paymentReferenceId(String paymentReferenceId) {
      this.paymentReferenceId = paymentReferenceId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<OrderCreateMandatePaymentUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
