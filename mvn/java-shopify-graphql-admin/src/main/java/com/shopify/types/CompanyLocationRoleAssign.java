package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CompanyLocationRoleAssign {
  
  private String companyContactRoleId;

  
  private String companyContactId;

  public CompanyLocationRoleAssign() {
  }

  
  public String getCompanyContactRoleId() {
    return companyContactRoleId;
  }

  public void setCompanyContactRoleId(String companyContactRoleId) {
    this.companyContactRoleId = companyContactRoleId;
  }

  
  public String getCompanyContactId() {
    return companyContactId;
  }

  public void setCompanyContactId(String companyContactId) {
    this.companyContactId = companyContactId;
  }

  @Override
  public String toString() {
    return "CompanyLocationRoleAssign{companyContactRoleId='" + companyContactRoleId + "', companyContactId='" + companyContactId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationRoleAssign that = (CompanyLocationRoleAssign) o;
    return Objects.equals(companyContactRoleId, that.companyContactRoleId) &&
        Objects.equals(companyContactId, that.companyContactId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyContactRoleId, companyContactId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String companyContactRoleId;

    
    private String companyContactId;

    public CompanyLocationRoleAssign build() {
      CompanyLocationRoleAssign result = new CompanyLocationRoleAssign();
      result.companyContactRoleId = this.companyContactRoleId;
      result.companyContactId = this.companyContactId;
      return result;
    }

    
    public Builder companyContactRoleId(String companyContactRoleId) {
      this.companyContactRoleId = companyContactRoleId;
      return this;
    }

    
    public Builder companyContactId(String companyContactId) {
      this.companyContactId = companyContactId;
      return this;
    }
  }
}
