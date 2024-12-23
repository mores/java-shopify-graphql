package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `companyLocationAssignAddress` mutation.
 */
public class CompanyLocationAssignAddressPayload {
  /**
   * The list of updated addresses on the company location.
   */
  private List<CompanyAddress> addresses;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BusinessCustomerUserError> userErrors;

  public CompanyLocationAssignAddressPayload() {
  }

  /**
   * The list of updated addresses on the company location.
   */
  public List<CompanyAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<CompanyAddress> addresses) {
    this.addresses = addresses;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<BusinessCustomerUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BusinessCustomerUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CompanyLocationAssignAddressPayload{addresses='" + addresses + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationAssignAddressPayload that = (CompanyLocationAssignAddressPayload) o;
    return Objects.equals(addresses, that.addresses) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of updated addresses on the company location.
     */
    private List<CompanyAddress> addresses;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BusinessCustomerUserError> userErrors;

    public CompanyLocationAssignAddressPayload build() {
      CompanyLocationAssignAddressPayload result = new CompanyLocationAssignAddressPayload();
      result.addresses = this.addresses;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The list of updated addresses on the company location.
     */
    public Builder addresses(List<CompanyAddress> addresses) {
      this.addresses = addresses;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<BusinessCustomerUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
