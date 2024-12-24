package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CustomerMergePreview {
  
  private CustomerMergePreviewAlternateFields alternateFields;

  
  private CustomerMergePreviewBlockingFields blockingFields;

  
  private List<CustomerMergeError> customerMergeErrors;

  
  private CustomerMergePreviewDefaultFields defaultFields;

  
  private String resultingCustomerId;

  public CustomerMergePreview() {
  }

  
  public CustomerMergePreviewAlternateFields getAlternateFields() {
    return alternateFields;
  }

  public void setAlternateFields(CustomerMergePreviewAlternateFields alternateFields) {
    this.alternateFields = alternateFields;
  }

  
  public CustomerMergePreviewBlockingFields getBlockingFields() {
    return blockingFields;
  }

  public void setBlockingFields(CustomerMergePreviewBlockingFields blockingFields) {
    this.blockingFields = blockingFields;
  }

  
  public List<CustomerMergeError> getCustomerMergeErrors() {
    return customerMergeErrors;
  }

  public void setCustomerMergeErrors(List<CustomerMergeError> customerMergeErrors) {
    this.customerMergeErrors = customerMergeErrors;
  }

  
  public CustomerMergePreviewDefaultFields getDefaultFields() {
    return defaultFields;
  }

  public void setDefaultFields(CustomerMergePreviewDefaultFields defaultFields) {
    this.defaultFields = defaultFields;
  }

  
  public String getResultingCustomerId() {
    return resultingCustomerId;
  }

  public void setResultingCustomerId(String resultingCustomerId) {
    this.resultingCustomerId = resultingCustomerId;
  }

  @Override
  public String toString() {
    return "CustomerMergePreview{alternateFields='" + alternateFields + "', blockingFields='" + blockingFields + "', customerMergeErrors='" + customerMergeErrors + "', defaultFields='" + defaultFields + "', resultingCustomerId='" + resultingCustomerId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerMergePreview that = (CustomerMergePreview) o;
    return Objects.equals(alternateFields, that.alternateFields) &&
        Objects.equals(blockingFields, that.blockingFields) &&
        Objects.equals(customerMergeErrors, that.customerMergeErrors) &&
        Objects.equals(defaultFields, that.defaultFields) &&
        Objects.equals(resultingCustomerId, that.resultingCustomerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateFields, blockingFields, customerMergeErrors, defaultFields, resultingCustomerId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CustomerMergePreviewAlternateFields alternateFields;

    
    private CustomerMergePreviewBlockingFields blockingFields;

    
    private List<CustomerMergeError> customerMergeErrors;

    
    private CustomerMergePreviewDefaultFields defaultFields;

    
    private String resultingCustomerId;

    public CustomerMergePreview build() {
      CustomerMergePreview result = new CustomerMergePreview();
      result.alternateFields = this.alternateFields;
      result.blockingFields = this.blockingFields;
      result.customerMergeErrors = this.customerMergeErrors;
      result.defaultFields = this.defaultFields;
      result.resultingCustomerId = this.resultingCustomerId;
      return result;
    }

    
    public Builder alternateFields(CustomerMergePreviewAlternateFields alternateFields) {
      this.alternateFields = alternateFields;
      return this;
    }

    
    public Builder blockingFields(CustomerMergePreviewBlockingFields blockingFields) {
      this.blockingFields = blockingFields;
      return this;
    }

    
    public Builder customerMergeErrors(List<CustomerMergeError> customerMergeErrors) {
      this.customerMergeErrors = customerMergeErrors;
      return this;
    }

    
    public Builder defaultFields(CustomerMergePreviewDefaultFields defaultFields) {
      this.defaultFields = defaultFields;
      return this;
    }

    
    public Builder resultingCustomerId(String resultingCustomerId) {
      this.resultingCustomerId = resultingCustomerId;
      return this;
    }
  }
}
