package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CustomerMergeable {
  
  private List<CustomerMergeErrorFieldType> errorFields;

  
  private boolean isMergeable;

  
  private CustomerMergeRequest mergeInProgress;

  
  private String reason;

  public CustomerMergeable() {
  }

  
  public List<CustomerMergeErrorFieldType> getErrorFields() {
    return errorFields;
  }

  public void setErrorFields(List<CustomerMergeErrorFieldType> errorFields) {
    this.errorFields = errorFields;
  }

  
  public boolean getIsMergeable() {
    return isMergeable;
  }

  public void setIsMergeable(boolean isMergeable) {
    this.isMergeable = isMergeable;
  }

  
  public CustomerMergeRequest getMergeInProgress() {
    return mergeInProgress;
  }

  public void setMergeInProgress(CustomerMergeRequest mergeInProgress) {
    this.mergeInProgress = mergeInProgress;
  }

  
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public String toString() {
    return "CustomerMergeable{errorFields='" + errorFields + "', isMergeable='" + isMergeable + "', mergeInProgress='" + mergeInProgress + "', reason='" + reason + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerMergeable that = (CustomerMergeable) o;
    return Objects.equals(errorFields, that.errorFields) &&
        isMergeable == that.isMergeable &&
        Objects.equals(mergeInProgress, that.mergeInProgress) &&
        Objects.equals(reason, that.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorFields, isMergeable, mergeInProgress, reason);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<CustomerMergeErrorFieldType> errorFields;

    
    private boolean isMergeable;

    
    private CustomerMergeRequest mergeInProgress;

    
    private String reason;

    public CustomerMergeable build() {
      CustomerMergeable result = new CustomerMergeable();
      result.errorFields = this.errorFields;
      result.isMergeable = this.isMergeable;
      result.mergeInProgress = this.mergeInProgress;
      result.reason = this.reason;
      return result;
    }

    
    public Builder errorFields(List<CustomerMergeErrorFieldType> errorFields) {
      this.errorFields = errorFields;
      return this;
    }

    
    public Builder isMergeable(boolean isMergeable) {
      this.isMergeable = isMergeable;
      return this;
    }

    
    public Builder mergeInProgress(CustomerMergeRequest mergeInProgress) {
      this.mergeInProgress = mergeInProgress;
      return this;
    }

    
    public Builder reason(String reason) {
      this.reason = reason;
      return this;
    }
  }
}
