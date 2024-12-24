package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CustomerMergeError {
  
  private List<CustomerMergeErrorFieldType> errorFields;

  
  private String message;

  public CustomerMergeError() {
  }

  
  public List<CustomerMergeErrorFieldType> getErrorFields() {
    return errorFields;
  }

  public void setErrorFields(List<CustomerMergeErrorFieldType> errorFields) {
    this.errorFields = errorFields;
  }

  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "CustomerMergeError{errorFields='" + errorFields + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerMergeError that = (CustomerMergeError) o;
    return Objects.equals(errorFields, that.errorFields) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorFields, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<CustomerMergeErrorFieldType> errorFields;

    
    private String message;

    public CustomerMergeError build() {
      CustomerMergeError result = new CustomerMergeError();
      result.errorFields = this.errorFields;
      result.message = this.message;
      return result;
    }

    
    public Builder errorFields(List<CustomerMergeErrorFieldType> errorFields) {
      this.errorFields = errorFields;
      return this;
    }

    
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
