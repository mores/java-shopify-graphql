package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An object that represents whether a customer can be merged with another customer.
 */
public class CustomerMergeable {
  /**
   * The list of fields preventing the customer from being merged.
   */
  private List<CustomerMergeErrorFieldType> errorFields;

  /**
   * Whether the customer can be merged with another customer.
   */
  private boolean isMergeable;

  /**
   * The merge request if one is currently in progress.
   */
  private CustomerMergeRequest mergeInProgress;

  /**
   * The reason why the customer can't be merged with another customer.
   */
  private String reason;

  public CustomerMergeable() {
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
   * Whether the customer can be merged with another customer.
   */
  public boolean getIsMergeable() {
    return isMergeable;
  }

  public void setIsMergeable(boolean isMergeable) {
    this.isMergeable = isMergeable;
  }

  /**
   * The merge request if one is currently in progress.
   */
  public CustomerMergeRequest getMergeInProgress() {
    return mergeInProgress;
  }

  public void setMergeInProgress(CustomerMergeRequest mergeInProgress) {
    this.mergeInProgress = mergeInProgress;
  }

  /**
   * The reason why the customer can't be merged with another customer.
   */
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
    /**
     * The list of fields preventing the customer from being merged.
     */
    private List<CustomerMergeErrorFieldType> errorFields;

    /**
     * Whether the customer can be merged with another customer.
     */
    private boolean isMergeable;

    /**
     * The merge request if one is currently in progress.
     */
    private CustomerMergeRequest mergeInProgress;

    /**
     * The reason why the customer can't be merged with another customer.
     */
    private String reason;

    public CustomerMergeable build() {
      CustomerMergeable result = new CustomerMergeable();
      result.errorFields = this.errorFields;
      result.isMergeable = this.isMergeable;
      result.mergeInProgress = this.mergeInProgress;
      result.reason = this.reason;
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
     * Whether the customer can be merged with another customer.
     */
    public Builder isMergeable(boolean isMergeable) {
      this.isMergeable = isMergeable;
      return this;
    }

    /**
     * The merge request if one is currently in progress.
     */
    public Builder mergeInProgress(CustomerMergeRequest mergeInProgress) {
      this.mergeInProgress = mergeInProgress;
      return this;
    }

    /**
     * The reason why the customer can't be merged with another customer.
     */
    public Builder reason(String reason) {
      this.reason = reason;
      return this;
    }
  }
}
