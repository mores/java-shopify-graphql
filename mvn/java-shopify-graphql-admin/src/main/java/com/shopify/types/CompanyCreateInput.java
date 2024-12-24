package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CompanyCreateInput {
  
  private CompanyInput company;

  
  private CompanyContactInput companyContact;

  
  private CompanyLocationInput companyLocation;

  public CompanyCreateInput() {
  }

  
  public CompanyInput getCompany() {
    return company;
  }

  public void setCompany(CompanyInput company) {
    this.company = company;
  }

  
  public CompanyContactInput getCompanyContact() {
    return companyContact;
  }

  public void setCompanyContact(CompanyContactInput companyContact) {
    this.companyContact = companyContact;
  }

  
  public CompanyLocationInput getCompanyLocation() {
    return companyLocation;
  }

  public void setCompanyLocation(CompanyLocationInput companyLocation) {
    this.companyLocation = companyLocation;
  }

  @Override
  public String toString() {
    return "CompanyCreateInput{company='" + company + "', companyContact='" + companyContact + "', companyLocation='" + companyLocation + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyCreateInput that = (CompanyCreateInput) o;
    return Objects.equals(company, that.company) &&
        Objects.equals(companyContact, that.companyContact) &&
        Objects.equals(companyLocation, that.companyLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, companyContact, companyLocation);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CompanyInput company;

    
    private CompanyContactInput companyContact;

    
    private CompanyLocationInput companyLocation;

    public CompanyCreateInput build() {
      CompanyCreateInput result = new CompanyCreateInput();
      result.company = this.company;
      result.companyContact = this.companyContact;
      result.companyLocation = this.companyLocation;
      return result;
    }

    
    public Builder company(CompanyInput company) {
      this.company = company;
      return this;
    }

    
    public Builder companyContact(CompanyContactInput companyContact) {
      this.companyContact = companyContact;
      return this;
    }

    
    public Builder companyLocation(CompanyLocationInput companyLocation) {
      this.companyLocation = companyLocation;
      return this;
    }
  }
}
