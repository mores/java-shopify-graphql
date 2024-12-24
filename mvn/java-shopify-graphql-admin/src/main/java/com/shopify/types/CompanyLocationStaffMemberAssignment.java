package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CompanyLocationStaffMemberAssignment implements com.shopify.types.Node {
  
  private CompanyLocation companyLocation;

  
  private String id;

  
  private StaffMember staffMember;

  public CompanyLocationStaffMemberAssignment() {
  }

  
  public CompanyLocation getCompanyLocation() {
    return companyLocation;
  }

  public void setCompanyLocation(CompanyLocation companyLocation) {
    this.companyLocation = companyLocation;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public StaffMember getStaffMember() {
    return staffMember;
  }

  public void setStaffMember(StaffMember staffMember) {
    this.staffMember = staffMember;
  }

  @Override
  public String toString() {
    return "CompanyLocationStaffMemberAssignment{companyLocation='" + companyLocation + "', id='" + id + "', staffMember='" + staffMember + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationStaffMemberAssignment that = (CompanyLocationStaffMemberAssignment) o;
    return Objects.equals(companyLocation, that.companyLocation) &&
        Objects.equals(id, that.id) &&
        Objects.equals(staffMember, that.staffMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyLocation, id, staffMember);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CompanyLocation companyLocation;

    
    private String id;

    
    private StaffMember staffMember;

    public CompanyLocationStaffMemberAssignment build() {
      CompanyLocationStaffMemberAssignment result = new CompanyLocationStaffMemberAssignment();
      result.companyLocation = this.companyLocation;
      result.id = this.id;
      result.staffMember = this.staffMember;
      return result;
    }

    
    public Builder companyLocation(CompanyLocation companyLocation) {
      this.companyLocation = companyLocation;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder staffMember(StaffMember staffMember) {
      this.staffMember = staffMember;
      return this;
    }
  }
}
