package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `companyAssignMainContact` mutation.
 */
public class CompanyAssignMainContactPayload {
  /**
   * The company for which the main contact is assigned.
   */
  private Company company;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BusinessCustomerUserError> userErrors;

  public CompanyAssignMainContactPayload() {
  }

  /**
   * The company for which the main contact is assigned.
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
    return "CompanyAssignMainContactPayload{company='" + company + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyAssignMainContactPayload that = (CompanyAssignMainContactPayload) o;
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
     * The company for which the main contact is assigned.
     */
    private Company company;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BusinessCustomerUserError> userErrors;

    public CompanyAssignMainContactPayload build() {
      CompanyAssignMainContactPayload result = new CompanyAssignMainContactPayload();
      result.company = this.company;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The company for which the main contact is assigned.
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
