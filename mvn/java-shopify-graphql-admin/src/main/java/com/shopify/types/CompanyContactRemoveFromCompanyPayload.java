package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CompanyContactRemoveFromCompanyPayload {
  
  private String removedCompanyContactId;

  
  private List<BusinessCustomerUserError> userErrors;

  public CompanyContactRemoveFromCompanyPayload() {
  }

  
  public String getRemovedCompanyContactId() {
    return removedCompanyContactId;
  }

  public void setRemovedCompanyContactId(String removedCompanyContactId) {
    this.removedCompanyContactId = removedCompanyContactId;
  }

  
  public List<BusinessCustomerUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BusinessCustomerUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CompanyContactRemoveFromCompanyPayload{removedCompanyContactId='" + removedCompanyContactId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyContactRemoveFromCompanyPayload that = (CompanyContactRemoveFromCompanyPayload) o;
    return Objects.equals(removedCompanyContactId, that.removedCompanyContactId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removedCompanyContactId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String removedCompanyContactId;

    
    private List<BusinessCustomerUserError> userErrors;

    public CompanyContactRemoveFromCompanyPayload build() {
      CompanyContactRemoveFromCompanyPayload result = new CompanyContactRemoveFromCompanyPayload();
      result.removedCompanyContactId = this.removedCompanyContactId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder removedCompanyContactId(String removedCompanyContactId) {
      this.removedCompanyContactId = removedCompanyContactId;
      return this;
    }

    
    public Builder userErrors(List<BusinessCustomerUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
