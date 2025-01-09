package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The error blocking a customer merge.
 */
public class CustomerMergeError {
  /**
   * The list of fields preventing the customer from being merged.
   */
  private List<CustomerMergeErrorFieldType> errorFields;

  /**
   * The customer merge error message.
   */
  private String message;

  public CustomerMergeError() {
  }

  /**
   * The list of fields preventing the customer from being merged.
   */
  public List<CustomerMergeErrorFieldType> getErrorFields() {
    return errorFields;
  }

  public void setErrorFields(List<CustomerMergeErrorFieldType> errorFields) {
    this.errorFields = errorFields;
  }

  /**
   * The customer merge error message.
   */
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
    /**
     * The list of fields preventing the customer from being merged.
     */
    private List<CustomerMergeErrorFieldType> errorFields;

    /**
     * The customer merge error message.
     */
    private String message;

    public CustomerMergeError build() {
      CustomerMergeError result = new CustomerMergeError();
      result.errorFields = this.errorFields;
      result.message = this.message;
      return result;
    }

    /**
     * The list of fields preventing the customer from being merged.
     */
    public Builder errorFields(List<CustomerMergeErrorFieldType> errorFields) {
      this.errorFields = errorFields;
      return this;
    }

    /**
     * The customer merge error message.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
