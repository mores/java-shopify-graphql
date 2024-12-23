package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `subscriptionBillingCycleBulkCharge` mutation.
 */
public class SubscriptionBillingCycleBulkChargePayload {
  /**
   * The asynchronous job that performs the action on the targeted billing cycles.
   */
  private Job job;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<SubscriptionBillingCycleBulkUserError> userErrors;

  public SubscriptionBillingCycleBulkChargePayload() {
  }

  /**
   * The asynchronous job that performs the action on the targeted billing cycles.
   */
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<SubscriptionBillingCycleBulkUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<SubscriptionBillingCycleBulkUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingCycleBulkChargePayload{job='" + job + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCycleBulkChargePayload that = (SubscriptionBillingCycleBulkChargePayload) o;
    return Objects.equals(job, that.job) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The asynchronous job that performs the action on the targeted billing cycles.
     */
    private Job job;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<SubscriptionBillingCycleBulkUserError> userErrors;

    public SubscriptionBillingCycleBulkChargePayload build() {
      SubscriptionBillingCycleBulkChargePayload result = new SubscriptionBillingCycleBulkChargePayload();
      result.job = this.job;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The asynchronous job that performs the action on the targeted billing cycles.
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<SubscriptionBillingCycleBulkUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
