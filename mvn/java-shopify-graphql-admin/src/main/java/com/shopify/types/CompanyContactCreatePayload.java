package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CompanyContactCreatePayload {
  
  private CompanyContact companyContact;

  
  private List<BusinessCustomerUserError> userErrors;

  public CompanyContactCreatePayload() {
  }

  
  public CompanyContact getCompanyContact() {
    return companyContact;
  }

  public void setCompanyContact(CompanyContact companyContact) {
    this.companyContact = companyContact;
  }

  
  public List<BusinessCustomerUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BusinessCustomerUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CompanyContactCreatePayload{companyContact='" + companyContact + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyContactCreatePayload that = (CompanyContactCreatePayload) o;
    return Objects.equals(companyContact, that.companyContact) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyContact, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CompanyContact companyContact;

    
    private List<BusinessCustomerUserError> userErrors;

    public CompanyContactCreatePayload build() {
      CompanyContactCreatePayload result = new CompanyContactCreatePayload();
      result.companyContact = this.companyContact;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder companyContact(CompanyContact companyContact) {
      this.companyContact = companyContact;
      return this;
    }

    
    public Builder userErrors(List<BusinessCustomerUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
