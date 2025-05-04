package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `companyRevokeMainContact` mutation.
 */
public class CompanyRevokeMainContactPayload {
  /**
   * The company from which the main contact is revoked.
   */
  private Company company;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BusinessCustomerUserError> userErrors;

  public CompanyRevokeMainContactPayload() {
  }

  /**
   * The company from which the main contact is revoked.
   */
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
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
    return "CompanyRevokeMainContactPayload{company='" + company + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyRevokeMainContactPayload that = (CompanyRevokeMainContactPayload) o;
    return Objects.equals(company, that.company) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The company from which the main contact is revoked.
     */
    private Company company;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BusinessCustomerUserError> userErrors;

    public CompanyRevokeMainContactPayload build() {
      CompanyRevokeMainContactPayload result = new CompanyRevokeMainContactPayload();
      result.company = this.company;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The company from which the main contact is revoked.
     */
    public Builder company(Company company) {
      this.company = company;
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
