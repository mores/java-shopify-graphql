package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CompanyContactRevokeRolePayload {
  
  private String revokedCompanyContactRoleAssignmentId;

  
  private List<BusinessCustomerUserError> userErrors;

  public CompanyContactRevokeRolePayload() {
  }

  
  public String getRevokedCompanyContactRoleAssignmentId() {
    return revokedCompanyContactRoleAssignmentId;
  }

  public void setRevokedCompanyContactRoleAssignmentId(
      String revokedCompanyContactRoleAssignmentId) {
    this.revokedCompanyContactRoleAssignmentId = revokedCompanyContactRoleAssignmentId;
  }

  
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
    
    private String revokedCompanyContactRoleAssignmentId;

    
    private List<BusinessCustomerUserError> userErrors;

    public CompanyContactRevokeRolePayload build() {
      CompanyContactRevokeRolePayload result = new CompanyContactRevokeRolePayload();
      result.revokedCompanyContactRoleAssignmentId = this.revokedCompanyContactRoleAssignmentId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder revokedCompanyContactRoleAssignmentId(
        String revokedCompanyContactRoleAssignmentId) {
      this.revokedCompanyContactRoleAssignmentId = revokedCompanyContactRoleAssignmentId;
      return this;
    }

    
    public Builder userErrors(List<BusinessCustomerUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
