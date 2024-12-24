package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CustomerPaymentMethodGetUpdateUrlPayload {
  
  private String updatePaymentMethodUrl;

  
  private List<CustomerPaymentMethodGetUpdateUrlUserError> userErrors;

  public CustomerPaymentMethodGetUpdateUrlPayload() {
  }

  
  public String getUpdatePaymentMethodUrl() {
    return updatePaymentMethodUrl;
  }

  public void setUpdatePaymentMethodUrl(String updatePaymentMethodUrl) {
    this.updatePaymentMethodUrl = updatePaymentMethodUrl;
  }

  
  public List<CustomerPaymentMethodGetUpdateUrlUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CustomerPaymentMethodGetUpdateUrlUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerPaymentMethodGetUpdateUrlPayload{updatePaymentMethodUrl='" + updatePaymentMethodUrl + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPaymentMethodGetUpdateUrlPayload that = (CustomerPaymentMethodGetUpdateUrlPayload) o;
    return Objects.equals(updatePaymentMethodUrl, that.updatePaymentMethodUrl) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatePaymentMethodUrl, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String updatePaymentMethodUrl;

    
    private List<CustomerPaymentMethodGetUpdateUrlUserError> userErrors;

    public CustomerPaymentMethodGetUpdateUrlPayload build() {
      CustomerPaymentMethodGetUpdateUrlPayload result = new CustomerPaymentMethodGetUpdateUrlPayload();
      result.updatePaymentMethodUrl = this.updatePaymentMethodUrl;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder updatePaymentMethodUrl(String updatePaymentMethodUrl) {
      this.updatePaymentMethodUrl = updatePaymentMethodUrl;
      return this;
    }

    
    public Builder userErrors(List<CustomerPaymentMethodGetUpdateUrlUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
