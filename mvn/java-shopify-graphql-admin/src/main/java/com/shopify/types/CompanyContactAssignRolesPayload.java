package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CompanyContactAssignRolesPayload {
  
  private List<CompanyContactRoleAssignment> roleAssignments;

  
  private List<BusinessCustomerUserError> userErrors;

  public CompanyContactAssignRolesPayload() {
  }

  
  public List<CompanyContactRoleAssignment> getRoleAssignments() {
    return roleAssignments;
  }

  public void setRoleAssignments(List<CompanyContactRoleAssignment> roleAssignments) {
    this.roleAssignments = roleAssignments;
  }

  
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
    
    private List<CompanyContactRoleAssignment> roleAssignments;

    
    private List<BusinessCustomerUserError> userErrors;

    public CompanyContactAssignRolesPayload build() {
      CompanyContactAssignRolesPayload result = new CompanyContactAssignRolesPayload();
      result.roleAssignments = this.roleAssignments;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder roleAssignments(List<CompanyContactRoleAssignment> roleAssignments) {
      this.roleAssignments = roleAssignments;
      return this;
    }

    
    public Builder userErrors(List<BusinessCustomerUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
