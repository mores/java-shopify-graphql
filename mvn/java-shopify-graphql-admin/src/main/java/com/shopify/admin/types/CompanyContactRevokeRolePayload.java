package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `companyContactRevokeRole` mutation.
 */
public class CompanyContactRevokeRolePayload {
  /**
   * The role assignment that was revoked.
   */
  private String revokedCompanyContactRoleAssignmentId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<BusinessCustomerUserError> userErrors;

  public CompanyContactRevokeRolePayload() {
  }

  /**
   * The role assignment that was revoked.
   */
  public String getRevokedCompanyContactRoleAssignmentId() {
    return revokedCompanyContactRoleAssignmentId;
  }

  public void setRevokedCompanyContactRoleAssignmentId(
      String revokedCompanyContactRoleAssignmentId) {
    this.revokedCompanyContactRoleAssignmentId = revokedCompanyContactRoleAssignmentId;
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
    return "CompanyContactRevokeRolePayload{revokedCompanyContactRoleAssignmentId='" + revokedCompanyContactRoleAssignmentId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyContactRevokeRolePayload that = (CompanyContactRevokeRolePayload) o;
    return Objects.equals(revokedCompanyContactRoleAssignmentId, that.revokedCompanyContactRoleAssignmentId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revokedCompanyContactRoleAssignmentId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The role assignment that was revoked.
     */
    private String revokedCompanyContactRoleAssignmentId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<BusinessCustomerUserError> userErrors;

    public CompanyContactRevokeRolePayload build() {
      CompanyContactRevokeRolePayload result = new CompanyContactRevokeRolePayload();
      result.revokedCompanyContactRoleAssignmentId = this.revokedCompanyContactRoleAssignmentId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The role assignment that was revoked.
     */
    public Builder revokedCompanyContactRoleAssignmentId(
        String revokedCompanyContactRoleAssignmentId) {
      this.revokedCompanyContactRoleAssignmentId = revokedCompanyContactRoleAssignmentId;
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
