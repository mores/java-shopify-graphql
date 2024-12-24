package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CompanyCreatePayload {
  
  private Company company;

  
  private List<BusinessCustomerUserError> userErrors;

  public CompanyCreatePayload() {
  }

  
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  
  public List<BusinessCustomerUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BusinessCustomerUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CompanyCreatePayload{company='" + company + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyCreatePayload that = (CompanyCreatePayload) o;
    return Objects.equals(company, that.company) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Company company;

    
    private List<BusinessCustomerUserError> userErrors;

    public CompanyCreatePayload build() {
      CompanyCreatePayload result = new CompanyCreatePayload();
      result.company = this.company;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder company(Company company) {
      this.company = company;
      return this;
    }

    
    public Builder userErrors(List<BusinessCustomerUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
