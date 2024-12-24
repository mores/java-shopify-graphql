package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CompanyAddressDeletePayload {
  
  private String deletedAddressId;

  
  private List<BusinessCustomerUserError> userErrors;

  public CompanyAddressDeletePayload() {
  }

  
  public String getDeletedAddressId() {
    return deletedAddressId;
  }

  public void setDeletedAddressId(String deletedAddressId) {
    this.deletedAddressId = deletedAddressId;
  }

  
  public List<BusinessCustomerUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<BusinessCustomerUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CompanyAddressDeletePayload{deletedAddressId='" + deletedAddressId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyAddressDeletePayload that = (CompanyAddressDeletePayload) o;
    return Objects.equals(deletedAddressId, that.deletedAddressId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedAddressId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String deletedAddressId;

    
    private List<BusinessCustomerUserError> userErrors;

    public CompanyAddressDeletePayload build() {
      CompanyAddressDeletePayload result = new CompanyAddressDeletePayload();
      result.deletedAddressId = this.deletedAddressId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder deletedAddressId(String deletedAddressId) {
      this.deletedAddressId = deletedAddressId;
      return this;
    }

    
    public Builder userErrors(List<BusinessCustomerUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
