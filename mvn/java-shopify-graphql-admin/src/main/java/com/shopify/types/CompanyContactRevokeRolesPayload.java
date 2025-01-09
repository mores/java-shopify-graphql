package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `companyContactRevokeRoles` mutation.
 */
public class CompanyContactRevokeRolesPayload {
  /**
   * A list of role assignment IDs that were removed from the company contact.
   */
  private List<String> revokedRoleAssignmentIds;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BusinessCustomerUserError> userErrors;

  public CompanyContactRevokeRolesPayload() {
  }

  /**
   * A list of role assignment IDs that were removed from the company contact.
   */
  public List<String> getRevokedRoleAssignmentIds() {
    return revokedRoleAssignmentIds;
  }

  public void setRevokedRoleAssignmentIds(List<String> revokedRoleAssignmentIds) {
    this.revokedRoleAssignmentIds = revokedRoleAssignmentIds;
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
    return "CompanyContactRevokeRolesPayload{revokedRoleAssignmentIds='" + revokedRoleAssignmentIds + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyContactRevokeRolesPayload that = (CompanyContactRevokeRolesPayload) o;
    return Objects.equals(revokedRoleAssignmentIds, that.revokedRoleAssignmentIds) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revokedRoleAssignmentIds, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of role assignment IDs that were removed from the company contact.
     */
    private List<String> revokedRoleAssignmentIds;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BusinessCustomerUserError> userErrors;

    public CompanyContactRevokeRolesPayload build() {
      CompanyContactRevokeRolesPayload result = new CompanyContactRevokeRolesPayload();
      result.revokedRoleAssignmentIds = this.revokedRoleAssignmentIds;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * A list of role assignment IDs that were removed from the company contact.
     */
    public Builder revokedRoleAssignmentIds(List<String> revokedRoleAssignmentIds) {
      this.revokedRoleAssignmentIds = revokedRoleAssignmentIds;
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
