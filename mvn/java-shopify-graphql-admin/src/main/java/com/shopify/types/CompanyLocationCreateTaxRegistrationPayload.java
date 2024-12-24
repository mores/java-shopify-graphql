package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CompanyLocationCreateTaxRegistrationPayload {
  
  private CompanyLocation companyLocation;

  
  private List<BusinessCustomerUserError> userErrors;

  public CompanyLocationCreateTaxRegistrationPayload() {
  }

  
  public CompanyLocation getCompanyLocation() {
    return companyLocation;
  }

  public void setCompanyLocation(CompanyLocation companyLocation) {
    this.companyLocation = companyLocation;
  }

  
  public List<BusinessCustomerUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BusinessCustomerUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CompanyLocationCreateTaxRegistrationPayload{companyLocation='" + companyLocation + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationCreateTaxRegistrationPayload that = (CompanyLocationCreateTaxRegistrationPayload) o;
    return Objects.equals(companyLocation, that.companyLocation) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyLocation, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CompanyLocation companyLocation;

    
    private List<BusinessCustomerUserError> userErrors;

    public CompanyLocationCreateTaxRegistrationPayload build() {
      CompanyLocationCreateTaxRegistrationPayload result = new CompanyLocationCreateTaxRegistrationPayload();
      result.companyLocation = this.companyLocation;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder companyLocation(CompanyLocation companyLocation) {
      this.companyLocation = companyLocation;
      return this;
    }

    
    public Builder userErrors(List<BusinessCustomerUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
