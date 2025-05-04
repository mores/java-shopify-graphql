package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `companyContactAssignRoles` mutation.
 */
public class CompanyContactAssignRolesPayload {
  /**
   * A list of newly created assignments of company contacts to a company location.
   */
  private List<CompanyContactRoleAssignment> roleAssignments;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BusinessCustomerUserError> userErrors;

  public CompanyContactAssignRolesPayload() {
  }

  /**
   * A list of newly created assignments of company contacts to a company location.
   */
  public List<CompanyContactRoleAssignment> getRoleAssignments() {
    return roleAssignments;
  }

  public void setRoleAssignments(List<CompanyContactRoleAssignment> roleAssignments) {
    this.roleAssignments = roleAssignments;
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
    return "CompanyContactAssignRolesPayload{roleAssignments='" + roleAssignments + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyContactAssignRolesPayload that = (CompanyContactAssignRolesPayload) o;
    return Objects.equals(roleAssignments, that.roleAssignments) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleAssignments, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of newly created assignments of company contacts to a company location.
     */
    private List<CompanyContactRoleAssignment> roleAssignments;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BusinessCustomerUserError> userErrors;

    public CompanyContactAssignRolesPayload build() {
      CompanyContactAssignRolesPayload result = new CompanyContactAssignRolesPayload();
      result.roleAssignments = this.roleAssignments;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * A list of newly created assignments of company contacts to a company location.
     */
    public Builder roleAssignments(List<CompanyContactRoleAssignment> roleAssignments) {
      this.roleAssignments = roleAssignments;
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
