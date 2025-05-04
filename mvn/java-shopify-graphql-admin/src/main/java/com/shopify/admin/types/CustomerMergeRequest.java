package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A merge request for merging two customers.
 */
public class CustomerMergeRequest {
  /**
   * The merge errors that occurred during the customer merge request.
   */
  private List<CustomerMergeError> customerMergeErrors;

  /**
   * The UUID of the merge job.
   */
  private String jobId;

  /**
   * The ID of the customer resulting from the merge.
   */
  private String resultingCustomerId;

  /**
   * The status of the customer merge request.
   */
  private CustomerMergeRequestStatus status;

  public CustomerMergeRequest() {
  }

  /**
   * The merge errors that occurred during the customer merge request.
   */
  public List<CustomerMergeError> getCustomerMergeErrors() {
    return customerMergeErrors;
  }

  public void setCustomerMergeErrors(List<CustomerMergeError> customerMergeErrors) {
    this.customerMergeErrors = customerMergeErrors;
  }

  /**
   * The UUID of the merge job.
   */
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
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
   * The status of the customer merge request.
   */
  public CustomerMergeRequestStatus getStatus() {
    return status;
  }

  public void setStatus(CustomerMergeRequestStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "CustomerMergeRequest{customerMergeErrors='" + customerMergeErrors + "', jobId='" + jobId + "', resultingCustomerId='" + resultingCustomerId + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerMergeRequest that = (CustomerMergeRequest) o;
    return Objects.equals(customerMergeErrors, that.customerMergeErrors) &&
        Objects.equals(jobId, that.jobId) &&
        Objects.equals(resultingCustomerId, that.resultingCustomerId) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerMergeErrors, jobId, resultingCustomerId, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The merge errors that occurred during the customer merge request.
     */
    private List<CustomerMergeError> customerMergeErrors;

    /**
     * The UUID of the merge job.
     */
    private String jobId;

    /**
     * The ID of the customer resulting from the merge.
     */
    private String resultingCustomerId;

    /**
     * The status of the customer merge request.
     */
    private CustomerMergeRequestStatus status;

    public CustomerMergeRequest build() {
      CustomerMergeRequest result = new CustomerMergeRequest();
      result.customerMergeErrors = this.customerMergeErrors;
      result.jobId = this.jobId;
      result.resultingCustomerId = this.resultingCustomerId;
      result.status = this.status;
      return result;
    }

    /**
     * The merge errors that occurred during the customer merge request.
     */
    public Builder customerMergeErrors(List<CustomerMergeError> customerMergeErrors) {
      this.customerMergeErrors = customerMergeErrors;
      return this;
    }

    /**
     * The UUID of the merge job.
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
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
     * The status of the customer merge request.
     */
    public Builder status(CustomerMergeRequestStatus status) {
      this.status = status;
      return this;
    }
  }
}
