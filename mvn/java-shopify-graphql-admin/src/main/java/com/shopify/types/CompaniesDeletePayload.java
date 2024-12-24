package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CompaniesDeletePayload {
  
  private List<String> deletedCompanyIds;

  
  private List<BusinessCustomerUserError> userErrors;

  public CompaniesDeletePayload() {
  }

  
  public List<String> getDeletedCompanyIds() {
    return deletedCompanyIds;
  }

  public void setDeletedCompanyIds(List<String> deletedCompanyIds) {
    this.deletedCompanyIds = deletedCompanyIds;
  }

  
  public List<BusinessCustomerUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BusinessCustomerUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CompaniesDeletePayload{deletedCompanyIds='" + deletedCompanyIds + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompaniesDeletePayload that = (CompaniesDeletePayload) o;
    return Objects.equals(deletedCompanyIds, that.deletedCompanyIds) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedCompanyIds, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> deletedCompanyIds;

    
    private List<BusinessCustomerUserError> userErrors;

    public CompaniesDeletePayload build() {
      CompaniesDeletePayload result = new CompaniesDeletePayload();
      result.deletedCompanyIds = this.deletedCompanyIds;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedCompanyIds(List<String> deletedCompanyIds) {
      this.deletedCompanyIds = deletedCompanyIds;
      return this;
    }

    
    public Builder userErrors(List<BusinessCustomerUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
