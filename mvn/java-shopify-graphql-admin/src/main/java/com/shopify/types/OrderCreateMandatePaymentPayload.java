package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OrderCreateMandatePaymentPayload {
  
  private Job job;

  
  private String paymentReferenceId;

  
  private List<OrderCreateMandatePaymentUserError> userErrors;

  public OrderCreateMandatePaymentPayload() {
  }

  
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  
  public String getPaymentReferenceId() {
    return paymentReferenceId;
  }

  public void setPaymentReferenceId(String paymentReferenceId) {
    this.paymentReferenceId = paymentReferenceId;
  }

  
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
    
    private Job job;

    
    private String paymentReferenceId;

    
    private List<OrderCreateMandatePaymentUserError> userErrors;

    public OrderCreateMandatePaymentPayload build() {
      OrderCreateMandatePaymentPayload result = new OrderCreateMandatePaymentPayload();
      result.job = this.job;
      result.paymentReferenceId = this.paymentReferenceId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    
    public Builder paymentReferenceId(String paymentReferenceId) {
      this.paymentReferenceId = paymentReferenceId;
      return this;
    }

    
    public Builder userErrors(List<OrderCreateMandatePaymentUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
