package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerSegmentMembersQueryCreate` mutation.
 */
public class CustomerSegmentMembersQueryCreatePayload {
  /**
   * The newly created customer segment members query.
   */
  private CustomerSegmentMembersQuery customerSegmentMembersQuery;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CustomerSegmentMembersQueryUserError> userErrors;

  public CustomerSegmentMembersQueryCreatePayload() {
  }

  /**
   * The newly created customer segment members query.
   */
  public CustomerSegmentMembersQuery getCustomerSegmentMembersQuery() {
    return customerSegmentMembersQuery;
  }

  public void setCustomerSegmentMembersQuery(
      CustomerSegmentMembersQuery customerSegmentMembersQuery) {
    this.customerSegmentMembersQuery = customerSegmentMembersQuery;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CustomerSegmentMembersQueryUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CustomerSegmentMembersQueryUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerSegmentMembersQueryCreatePayload{customerSegmentMembersQuery='" + customerSegmentMembersQuery + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerSegmentMembersQueryCreatePayload that = (CustomerSegmentMembersQueryCreatePayload) o;
    return Objects.equals(customerSegmentMembersQuery, that.customerSegmentMembersQuery) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerSegmentMembersQuery, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The newly created customer segment members query.
     */
    private CustomerSegmentMembersQuery customerSegmentMembersQuery;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CustomerSegmentMembersQueryUserError> userErrors;

    public CustomerSegmentMembersQueryCreatePayload build() {
      CustomerSegmentMembersQueryCreatePayload result = new CustomerSegmentMembersQueryCreatePayload();
      result.customerSegmentMembersQuery = this.customerSegmentMembersQuery;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The newly created customer segment members query.
     */
    public Builder customerSegmentMembersQuery(
        CustomerSegmentMembersQuery customerSegmentMembersQuery) {
      this.customerSegmentMembersQuery = customerSegmentMembersQuery;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CustomerSegmentMembersQueryUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
