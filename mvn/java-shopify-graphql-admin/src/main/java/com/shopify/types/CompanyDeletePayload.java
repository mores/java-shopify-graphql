package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CompanyDeletePayload {
  
  private String deletedCompanyId;

  
  private List<BusinessCustomerUserError> userErrors;

  public CompanyDeletePayload() {
  }

  
  public String getDeletedCompanyId() {
    return deletedCompanyId;
  }

  public void setDeletedCompanyId(String deletedCompanyId) {
    this.deletedCompanyId = deletedCompanyId;
  }

  
  public List<BusinessCustomerUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BusinessCustomerUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CompanyDeletePayload{deletedCompanyId='" + deletedCompanyId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyDeletePayload that = (CompanyDeletePayload) o;
    return Objects.equals(deletedCompanyId, that.deletedCompanyId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedCompanyId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedCompanyId;

    
    private List<BusinessCustomerUserError> userErrors;

    public CompanyDeletePayload build() {
      CompanyDeletePayload result = new CompanyDeletePayload();
      result.deletedCompanyId = this.deletedCompanyId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedCompanyId(String deletedCompanyId) {
      this.deletedCompanyId = deletedCompanyId;
      return this;
    }

    
    public Builder userErrors(List<BusinessCustomerUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
