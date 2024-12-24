package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CompanyLocationAssignStaffMembersPayload {
  
  private List<CompanyLocationStaffMemberAssignment> companyLocationStaffMemberAssignments;

  
  private List<BusinessCustomerUserError> userErrors;

  public CompanyLocationAssignStaffMembersPayload() {
  }

  
  public List<CompanyLocationStaffMemberAssignment> getCompanyLocationStaffMemberAssignments() {
    return companyLocationStaffMemberAssignments;
  }

  public void setCompanyLocationStaffMemberAssignments(
      List<CompanyLocationStaffMemberAssignment> companyLocationStaffMemberAssignments) {
    this.companyLocationStaffMemberAssignments = companyLocationStaffMemberAssignments;
  }

  
  public List<BusinessCustomerUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BusinessCustomerUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CompanyLocationAssignStaffMembersPayload{companyLocationStaffMemberAssignments='" + companyLocationStaffMemberAssignments + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationAssignStaffMembersPayload that = (CompanyLocationAssignStaffMembersPayload) o;
    return Objects.equals(companyLocationStaffMemberAssignments, that.companyLocationStaffMemberAssignments) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyLocationStaffMemberAssignments, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<CompanyLocationStaffMemberAssignment> companyLocationStaffMemberAssignments;

    
    private List<BusinessCustomerUserError> userErrors;

    public CompanyLocationAssignStaffMembersPayload build() {
      CompanyLocationAssignStaffMembersPayload result = new CompanyLocationAssignStaffMembersPayload();
      result.companyLocationStaffMemberAssignments = this.companyLocationStaffMemberAssignments;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder companyLocationStaffMemberAssignments(
        List<CompanyLocationStaffMemberAssignment> companyLocationStaffMemberAssignments) {
      this.companyLocationStaffMemberAssignments = companyLocationStaffMemberAssignments;
      return this;
    }

    
    public Builder userErrors(List<BusinessCustomerUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
