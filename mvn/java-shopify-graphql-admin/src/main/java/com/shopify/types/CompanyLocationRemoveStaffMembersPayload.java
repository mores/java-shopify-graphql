package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CompanyLocationRemoveStaffMembersPayload {
  
  private List<String> deletedCompanyLocationStaffMemberAssignmentIds;

  
  private List<BusinessCustomerUserError> userErrors;

  public CompanyLocationRemoveStaffMembersPayload() {
  }

  
  public List<String> getDeletedCompanyLocationStaffMemberAssignmentIds() {
    return deletedCompanyLocationStaffMemberAssignmentIds;
  }

  public void setDeletedCompanyLocationStaffMemberAssignmentIds(
      List<String> deletedCompanyLocationStaffMemberAssignmentIds) {
    this.deletedCompanyLocationStaffMemberAssignmentIds = deletedCompanyLocationStaffMemberAssignmentIds;
  }

  
  public List<BusinessCustomerUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BusinessCustomerUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CompanyLocationRemoveStaffMembersPayload{deletedCompanyLocationStaffMemberAssignmentIds='" + deletedCompanyLocationStaffMemberAssignmentIds + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationRemoveStaffMembersPayload that = (CompanyLocationRemoveStaffMembersPayload) o;
    return Objects.equals(deletedCompanyLocationStaffMemberAssignmentIds, that.deletedCompanyLocationStaffMemberAssignmentIds) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedCompanyLocationStaffMemberAssignmentIds, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> deletedCompanyLocationStaffMemberAssignmentIds;

    
    private List<BusinessCustomerUserError> userErrors;

    public CompanyLocationRemoveStaffMembersPayload build() {
      CompanyLocationRemoveStaffMembersPayload result = new CompanyLocationRemoveStaffMembersPayload();
      result.deletedCompanyLocationStaffMemberAssignmentIds = this.deletedCompanyLocationStaffMemberAssignmentIds;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedCompanyLocationStaffMemberAssignmentIds(
        List<String> deletedCompanyLocationStaffMemberAssignmentIds) {
      this.deletedCompanyLocationStaffMemberAssignmentIds = deletedCompanyLocationStaffMemberAssignmentIds;
      return this;
    }

    
    public Builder userErrors(List<BusinessCustomerUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
