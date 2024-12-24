package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CustomerMergeRequest {
  
  private List<CustomerMergeError> customerMergeErrors;

  
  private String jobId;

  
  private String resultingCustomerId;

  
  private CustomerMergeRequestStatus status;

  public CustomerMergeRequest() {
  }

  
  public List<CustomerMergeError> getCustomerMergeErrors() {
    return customerMergeErrors;
  }

  public void setCustomerMergeErrors(List<CustomerMergeError> customerMergeErrors) {
    this.customerMergeErrors = customerMergeErrors;
  }

  
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  
  public String getResultingCustomerId() {
    return resultingCustomerId;
  }

  public void setResultingCustomerId(String resultingCustomerId) {
    this.resultingCustomerId = resultingCustomerId;
  }

  
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
    
    private List<CustomerMergeError> customerMergeErrors;

    
    private String jobId;

    
    private String resultingCustomerId;

    
    private CustomerMergeRequestStatus status;

    public CustomerMergeRequest build() {
      CustomerMergeRequest result = new CustomerMergeRequest();
      result.customerMergeErrors = this.customerMergeErrors;
      result.jobId = this.jobId;
      result.resultingCustomerId = this.resultingCustomerId;
      result.status = this.status;
      return result;
    }

    
    public Builder customerMergeErrors(List<CustomerMergeError> customerMergeErrors) {
      this.customerMergeErrors = customerMergeErrors;
      return this;
    }

    
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    
    public Builder resultingCustomerId(String resultingCustomerId) {
      this.resultingCustomerId = resultingCustomerId;
      return this;
    }

    
    public Builder status(CustomerMergeRequestStatus status) {
      this.status = status;
      return this;
    }
  }
}
