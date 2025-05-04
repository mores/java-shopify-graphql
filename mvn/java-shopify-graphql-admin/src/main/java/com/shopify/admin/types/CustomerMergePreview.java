package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A preview of the results of a customer merge request.
 */
public class CustomerMergePreview {
  /**
   * The fields that can be used to override the default fields.
   */
  private CustomerMergePreviewAlternateFields alternateFields;

  /**
   * The fields that will block the merge if the two customers are merged.
   */
  private CustomerMergePreviewBlockingFields blockingFields;

  /**
   * The errors blocking the customer merge.
   */
  private List<CustomerMergeError> customerMergeErrors;

  /**
   * The fields that will be kept if the two customers are merged.
   */
  private CustomerMergePreviewDefaultFields defaultFields;

  /**
   * The resulting customer ID if the two customers are merged.
   */
  private String resultingCustomerId;

  public CustomerMergePreview() {
  }

  /**
   * The fields that can be used to override the default fields.
   */
  public CustomerMergePreviewAlternateFields getAlternateFields() {
    return alternateFields;
  }

  public void setAlternateFields(CustomerMergePreviewAlternateFields alternateFields) {
    this.alternateFields = alternateFields;
  }

  /**
   * The fields that will block the merge if the two customers are merged.
   */
  public CustomerMergePreviewBlockingFields getBlockingFields() {
    return blockingFields;
  }

  public void setBlockingFields(CustomerMergePreviewBlockingFields blockingFields) {
    this.blockingFields = blockingFields;
  }

  /**
   * The errors blocking the customer merge.
   */
  public List<CustomerMergeError> getCustomerMergeErrors() {
    return customerMergeErrors;
  }

  public void setCustomerMergeErrors(List<CustomerMergeError> customerMergeErrors) {
    this.customerMergeErrors = customerMergeErrors;
  }

  /**
   * The fields that will be kept if the two customers are merged.
   */
  public CustomerMergePreviewDefaultFields getDefaultFields() {
    return defaultFields;
  }

  public void setDefaultFields(CustomerMergePreviewDefaultFields defaultFields) {
    this.defaultFields = defaultFields;
  }

  /**
   * The resulting customer ID if the two customers are merged.
   */
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
    /**
     * The fields that can be used to override the default fields.
     */
    private CustomerMergePreviewAlternateFields alternateFields;

    /**
     * The fields that will block the merge if the two customers are merged.
     */
    private CustomerMergePreviewBlockingFields blockingFields;

    /**
     * The errors blocking the customer merge.
     */
    private List<CustomerMergeError> customerMergeErrors;

    /**
     * The fields that will be kept if the two customers are merged.
     */
    private CustomerMergePreviewDefaultFields defaultFields;

    /**
     * The resulting customer ID if the two customers are merged.
     */
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

    /**
     * The fields that can be used to override the default fields.
     */
    public Builder alternateFields(CustomerMergePreviewAlternateFields alternateFields) {
      this.alternateFields = alternateFields;
      return this;
    }

    /**
     * The fields that will block the merge if the two customers are merged.
     */
    public Builder blockingFields(CustomerMergePreviewBlockingFields blockingFields) {
      this.blockingFields = blockingFields;
      return this;
    }

    /**
     * The errors blocking the customer merge.
     */
    public Builder customerMergeErrors(List<CustomerMergeError> customerMergeErrors) {
      this.customerMergeErrors = customerMergeErrors;
      return this;
    }

    /**
     * The fields that will be kept if the two customers are merged.
     */
    public Builder defaultFields(CustomerMergePreviewDefaultFields defaultFields) {
      this.defaultFields = defaultFields;
      return this;
    }

    /**
     * The resulting customer ID if the two customers are merged.
     */
    public Builder resultingCustomerId(String resultingCustomerId) {
      this.resultingCustomerId = resultingCustomerId;
      return this;
    }
  }
}
