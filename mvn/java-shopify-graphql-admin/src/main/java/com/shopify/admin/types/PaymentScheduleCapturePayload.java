package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `paymentScheduleCapture` mutation.
 */
public class PaymentScheduleCapturePayload {
  /**
   * The async job used for charging the payment.
   */
  private Job job;

  /**
   * The job result for tracking the status of the payment capture.
   */
  private OrderCreateMandatePaymentJobResult jobResult;

  /**
   * The unique ID for the created payment.
   */
  private String paymentReferenceId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PaymentScheduleCaptureUserError> userErrors;

  public PaymentScheduleCapturePayload() {
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
   * The job result for tracking the status of the payment capture.
   */
  public OrderCreateMandatePaymentJobResult getJobResult() {
    return jobResult;
  }

  public void setJobResult(OrderCreateMandatePaymentJobResult jobResult) {
    this.jobResult = jobResult;
  }

  /**
   * The unique ID for the created payment.
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
  public List<PaymentScheduleCaptureUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PaymentScheduleCaptureUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PaymentScheduleCapturePayload{job='" + job + "', jobResult='" + jobResult + "', paymentReferenceId='" + paymentReferenceId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentScheduleCapturePayload that = (PaymentScheduleCapturePayload) o;
    return Objects.equals(job, that.job) &&
        Objects.equals(jobResult, that.jobResult) &&
        Objects.equals(paymentReferenceId, that.paymentReferenceId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, jobResult, paymentReferenceId, userErrors);
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
     * The job result for tracking the status of the payment capture.
     */
    private OrderCreateMandatePaymentJobResult jobResult;

    /**
     * The unique ID for the created payment.
     */
    private String paymentReferenceId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PaymentScheduleCaptureUserError> userErrors;

    public PaymentScheduleCapturePayload build() {
      PaymentScheduleCapturePayload result = new PaymentScheduleCapturePayload();
      result.job = this.job;
      result.jobResult = this.jobResult;
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
     * The job result for tracking the status of the payment capture.
     */
    public Builder jobResult(OrderCreateMandatePaymentJobResult jobResult) {
      this.jobResult = jobResult;
      return this;
    }

    /**
     * The unique ID for the created payment.
     */
    public Builder paymentReferenceId(String paymentReferenceId) {
      this.paymentReferenceId = paymentReferenceId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<PaymentScheduleCaptureUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
