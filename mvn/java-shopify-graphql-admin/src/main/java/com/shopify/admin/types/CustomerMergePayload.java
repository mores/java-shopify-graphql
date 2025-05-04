package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerMerge` mutation.
 */
public class CustomerMergePayload {
  /**
   * The asynchronous job for merging the customers.
   */
  private Job job;

  /**
   * The ID of the customer resulting from the merge.
   */
  private String resultingCustomerId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CustomerMergeUserError> userErrors;

  public CustomerMergePayload() {
  }

  /**
   * The asynchronous job for merging the customers.
   */
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  /**
   * The ID of the customer resulting from the merge.
   */
  public String getResultingCustomerId() {
    return resultingCustomerId;
  }

  public void setResultingCustomerId(String resultingCustomerId) {
    this.resultingCustomerId = resultingCustomerId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CustomerMergeUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CustomerMergeUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerMergePayload{job='" + job + "', resultingCustomerId='" + resultingCustomerId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerMergePayload that = (CustomerMergePayload) o;
    return Objects.equals(job, that.job) &&
        Objects.equals(resultingCustomerId, that.resultingCustomerId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, resultingCustomerId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The asynchronous job for merging the customers.
     */
    private Job job;

    /**
     * The ID of the customer resulting from the merge.
     */
    private String resultingCustomerId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CustomerMergeUserError> userErrors;

    public CustomerMergePayload build() {
      CustomerMergePayload result = new CustomerMergePayload();
      result.job = this.job;
      result.resultingCustomerId = this.resultingCustomerId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The asynchronous job for merging the customers.
     */
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    /**
     * The ID of the customer resulting from the merge.
     */
    public Builder resultingCustomerId(String resultingCustomerId) {
      this.resultingCustomerId = resultingCustomerId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CustomerMergeUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
