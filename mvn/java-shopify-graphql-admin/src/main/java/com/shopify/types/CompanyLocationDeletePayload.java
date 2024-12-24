package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CompanyLocationDeletePayload {
  
  private String deletedCompanyLocationId;

  
  private List<BusinessCustomerUserError> userErrors;

  public CompanyLocationDeletePayload() {
  }

  
  public String getDeletedCompanyLocationId() {
    return deletedCompanyLocationId;
  }

  public void setDeletedCompanyLocationId(String deletedCompanyLocationId) {
    this.deletedCompanyLocationId = deletedCompanyLocationId;
  }

  
  public List<BusinessCustomerUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BusinessCustomerUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CompanyLocationDeletePayload{deletedCompanyLocationId='" + deletedCompanyLocationId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationDeletePayload that = (CompanyLocationDeletePayload) o;
    return Objects.equals(deletedCompanyLocationId, that.deletedCompanyLocationId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedCompanyLocationId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedCompanyLocationId;

    
    private List<BusinessCustomerUserError> userErrors;

    public CompanyLocationDeletePayload build() {
      CompanyLocationDeletePayload result = new CompanyLocationDeletePayload();
      result.deletedCompanyLocationId = this.deletedCompanyLocationId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedCompanyLocationId(String deletedCompanyLocationId) {
      this.deletedCompanyLocationId = deletedCompanyLocationId;
      return this;
    }

    
    public Builder userErrors(List<BusinessCustomerUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
