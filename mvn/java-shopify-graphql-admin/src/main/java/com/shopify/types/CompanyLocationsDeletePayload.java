package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CompanyLocationsDeletePayload {
  
  private List<String> deletedCompanyLocationIds;

  
  private List<BusinessCustomerUserError> userErrors;

  public CompanyLocationsDeletePayload() {
  }

  
  public List<String> getDeletedCompanyLocationIds() {
    return deletedCompanyLocationIds;
  }

  public void setDeletedCompanyLocationIds(List<String> deletedCompanyLocationIds) {
    this.deletedCompanyLocationIds = deletedCompanyLocationIds;
  }

  
  public List<BusinessCustomerUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BusinessCustomerUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CompanyLocationsDeletePayload{deletedCompanyLocationIds='" + deletedCompanyLocationIds + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationsDeletePayload that = (CompanyLocationsDeletePayload) o;
    return Objects.equals(deletedCompanyLocationIds, that.deletedCompanyLocationIds) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedCompanyLocationIds, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> deletedCompanyLocationIds;

    
    private List<BusinessCustomerUserError> userErrors;

    public CompanyLocationsDeletePayload build() {
      CompanyLocationsDeletePayload result = new CompanyLocationsDeletePayload();
      result.deletedCompanyLocationIds = this.deletedCompanyLocationIds;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedCompanyLocationIds(List<String> deletedCompanyLocationIds) {
      this.deletedCompanyLocationIds = deletedCompanyLocationIds;
      return this;
    }

    
    public Builder userErrors(List<BusinessCustomerUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
