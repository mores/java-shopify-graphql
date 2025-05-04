package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `companyLocationRevokeTaxExemptions` mutation.
 */
public class CompanyLocationRevokeTaxExemptionsPayload {
  /**
   * The updated company location.
   */
  private CompanyLocation companyLocation;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BusinessCustomerUserError> userErrors;

  public CompanyLocationRevokeTaxExemptionsPayload() {
  }

  /**
   * The updated company location.
   */
  public CompanyLocation getCompanyLocation() {
    return companyLocation;
  }

  public void setCompanyLocation(CompanyLocation companyLocation) {
    this.companyLocation = companyLocation;
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
    return "CompanyLocationRevokeTaxExemptionsPayload{companyLocation='" + companyLocation + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationRevokeTaxExemptionsPayload that = (CompanyLocationRevokeTaxExemptionsPayload) o;
    return Objects.equals(companyLocation, that.companyLocation) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyLocation, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated company location.
     */
    private CompanyLocation companyLocation;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BusinessCustomerUserError> userErrors;

    public CompanyLocationRevokeTaxExemptionsPayload build() {
      CompanyLocationRevokeTaxExemptionsPayload result = new CompanyLocationRevokeTaxExemptionsPayload();
      result.companyLocation = this.companyLocation;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated company location.
     */
    public Builder companyLocation(CompanyLocation companyLocation) {
      this.companyLocation = companyLocation;
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
