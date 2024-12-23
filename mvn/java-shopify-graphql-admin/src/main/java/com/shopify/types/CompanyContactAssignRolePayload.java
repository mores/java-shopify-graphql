package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `companyContactAssignRole` mutation.
 */
public class CompanyContactAssignRolePayload {
  /**
   * The company contact role assignment.
   */
  private CompanyContactRoleAssignment companyContactRoleAssignment;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BusinessCustomerUserError> userErrors;

  public CompanyContactAssignRolePayload() {
  }

  /**
   * The company contact role assignment.
   */
  public CompanyContactRoleAssignment getCompanyContactRoleAssignment() {
    return companyContactRoleAssignment;
  }

  public void setCompanyContactRoleAssignment(
      CompanyContactRoleAssignment companyContactRoleAssignment) {
    this.companyContactRoleAssignment = companyContactRoleAssignment;
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
    return "CompanyContactAssignRolePayload{companyContactRoleAssignment='" + companyContactRoleAssignment + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyContactAssignRolePayload that = (CompanyContactAssignRolePayload) o;
    return Objects.equals(companyContactRoleAssignment, that.companyContactRoleAssignment) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyContactRoleAssignment, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The company contact role assignment.
     */
    private CompanyContactRoleAssignment companyContactRoleAssignment;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BusinessCustomerUserError> userErrors;

    public CompanyContactAssignRolePayload build() {
      CompanyContactAssignRolePayload result = new CompanyContactAssignRolePayload();
      result.companyContactRoleAssignment = this.companyContactRoleAssignment;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The company contact role assignment.
     */
    public Builder companyContactRoleAssignment(
        CompanyContactRoleAssignment companyContactRoleAssignment) {
      this.companyContactRoleAssignment = companyContactRoleAssignment;
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
