package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CustomerGenerateAccountActivationUrlPayload {
  
  private String accountActivationUrl;

  
  private List<UserError> userErrors;

  public CustomerGenerateAccountActivationUrlPayload() {
  }

  
  public String getAccountActivationUrl() {
    return accountActivationUrl;
  }

  public void setAccountActivationUrl(String accountActivationUrl) {
    this.accountActivationUrl = accountActivationUrl;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerGenerateAccountActivationUrlPayload{accountActivationUrl='" + accountActivationUrl + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerGenerateAccountActivationUrlPayload that = (CustomerGenerateAccountActivationUrlPayload) o;
    return Objects.equals(accountActivationUrl, that.accountActivationUrl) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountActivationUrl, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String accountActivationUrl;

    
    private List<UserError> userErrors;

    public CustomerGenerateAccountActivationUrlPayload build() {
      CustomerGenerateAccountActivationUrlPayload result = new CustomerGenerateAccountActivationUrlPayload();
      result.accountActivationUrl = this.accountActivationUrl;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder accountActivationUrl(String accountActivationUrl) {
      this.accountActivationUrl = accountActivationUrl;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
