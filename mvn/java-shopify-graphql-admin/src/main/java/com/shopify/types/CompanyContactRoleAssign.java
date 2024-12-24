package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CompanyContactRoleAssign {
  
  private String companyContactRoleId;

  
  private String companyLocationId;

  public CompanyContactRoleAssign() {
  }

  
  public String getCompanyContactRoleId() {
    return companyContactRoleId;
  }

  public void setCompanyContactRoleId(String companyContactRoleId) {
    this.companyContactRoleId = companyContactRoleId;
  }

  
  public String getCompanyLocationId() {
    return companyLocationId;
  }

  public void setCompanyLocationId(String companyLocationId) {
    this.companyLocationId = companyLocationId;
  }

  @Override
  public String toString() {
    return "CompanyContactRoleAssign{companyContactRoleId='" + companyContactRoleId + "', companyLocationId='" + companyLocationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyContactRoleAssign that = (CompanyContactRoleAssign) o;
    return Objects.equals(companyContactRoleId, that.companyContactRoleId) &&
        Objects.equals(companyLocationId, that.companyLocationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyContactRoleId, companyLocationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String companyContactRoleId;

    
    private String companyLocationId;

    public CompanyContactRoleAssign build() {
      CompanyContactRoleAssign result = new CompanyContactRoleAssign();
      result.companyContactRoleId = this.companyContactRoleId;
      result.companyLocationId = this.companyLocationId;
      return result;
    }

    
    public Builder companyContactRoleId(String companyContactRoleId) {
      this.companyContactRoleId = companyContactRoleId;
      return this;
    }

    
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      return this;
    }
  }
}
