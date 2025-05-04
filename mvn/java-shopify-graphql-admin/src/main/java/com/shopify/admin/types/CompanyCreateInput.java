package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields and values for creating a company and its associated resources.
 */
public class CompanyCreateInput {
  /**
   * The attributes for the company.
   */
  private CompanyInput company;

  /**
   * The attributes for the company contact.
   */
  private CompanyContactInput companyContact;

  /**
   * The attributes for the company location.
   */
  private CompanyLocationInput companyLocation;

  public CompanyCreateInput() {
  }

  /**
   * The attributes for the company.
   */
  public CompanyInput getCompany() {
    return company;
  }

  public void setCompany(CompanyInput company) {
    this.company = company;
  }

  /**
   * The attributes for the company contact.
   */
  public CompanyContactInput getCompanyContact() {
    return companyContact;
  }

  public void setCompanyContact(CompanyContactInput companyContact) {
    this.companyContact = companyContact;
  }

  /**
   * The attributes for the company location.
   */
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
    /**
     * The attributes for the company.
     */
    private CompanyInput company;

    /**
     * The attributes for the company contact.
     */
    private CompanyContactInput companyContact;

    /**
     * The attributes for the company location.
     */
    private CompanyLocationInput companyLocation;

    public CompanyCreateInput build() {
      CompanyCreateInput result = new CompanyCreateInput();
      result.company = this.company;
      result.companyContact = this.companyContact;
      result.companyLocation = this.companyLocation;
      return result;
    }

    /**
     * The attributes for the company.
     */
    public Builder company(CompanyInput company) {
      this.company = company;
      return this;
    }

    /**
     * The attributes for the company contact.
     */
    public Builder companyContact(CompanyContactInput companyContact) {
      this.companyContact = companyContact;
      return this;
    }

    /**
     * The attributes for the company location.
     */
    public Builder companyLocation(CompanyLocationInput companyLocation) {
      this.companyLocation = companyLocation;
      return this;
    }
  }
}
