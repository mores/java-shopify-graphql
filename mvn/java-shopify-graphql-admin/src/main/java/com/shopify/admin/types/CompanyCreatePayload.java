package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `companyCreate` mutation.
 */
public class CompanyCreatePayload {
  /**
   * The created company.
   */
  private Company company;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BusinessCustomerUserError> userErrors;

  public CompanyCreatePayload() {
  }

  /**
   * The created company.
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
    return "CompanyCreatePayload{company='" + company + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyCreatePayload that = (CompanyCreatePayload) o;
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
     * The created company.
     */
    private Company company;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BusinessCustomerUserError> userErrors;

    public CompanyCreatePayload build() {
      CompanyCreatePayload result = new CompanyCreatePayload();
      result.company = this.company;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created company.
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
