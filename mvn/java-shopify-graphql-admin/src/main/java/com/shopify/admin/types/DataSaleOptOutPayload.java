package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `dataSaleOptOut` mutation.
 */
public class DataSaleOptOutPayload {
  /**
   * The ID of the customer whose email address has been opted out of data sale.
   */
  private String customerId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<DataSaleOptOutUserError> userErrors;

  public DataSaleOptOutPayload() {
  }

  /**
   * The ID of the customer whose email address has been opted out of data sale.
   */
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<DataSaleOptOutUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DataSaleOptOutUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DataSaleOptOutPayload{customerId='" + customerId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DataSaleOptOutPayload that = (DataSaleOptOutPayload) o;
    return Objects.equals(customerId, that.customerId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the customer whose email address has been opted out of data sale.
     */
    private String customerId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<DataSaleOptOutUserError> userErrors;

    public DataSaleOptOutPayload build() {
      DataSaleOptOutPayload result = new DataSaleOptOutPayload();
      result.customerId = this.customerId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the customer whose email address has been opted out of data sale.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<DataSaleOptOutUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
