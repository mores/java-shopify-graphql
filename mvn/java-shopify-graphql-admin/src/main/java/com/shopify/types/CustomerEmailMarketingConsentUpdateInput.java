package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CustomerEmailMarketingConsentUpdateInput {
  
  private String customerId;

  
  private CustomerEmailMarketingConsentInput emailMarketingConsent;

  public CustomerEmailMarketingConsentUpdateInput() {
  }

  
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  
  public CustomerEmailMarketingConsentInput getEmailMarketingConsent() {
    return emailMarketingConsent;
  }

  public void setEmailMarketingConsent(CustomerEmailMarketingConsentInput emailMarketingConsent) {
    this.emailMarketingConsent = emailMarketingConsent;
  }

  @Override
  public String toString() {
    return "CustomerEmailMarketingConsentUpdateInput{customerId='" + customerId + "', emailMarketingConsent='" + emailMarketingConsent + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerEmailMarketingConsentUpdateInput that = (CustomerEmailMarketingConsentUpdateInput) o;
    return Objects.equals(customerId, that.customerId) &&
        Objects.equals(emailMarketingConsent, that.emailMarketingConsent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, emailMarketingConsent);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String customerId;

    
    private CustomerEmailMarketingConsentInput emailMarketingConsent;

    public CustomerEmailMarketingConsentUpdateInput build() {
      CustomerEmailMarketingConsentUpdateInput result = new CustomerEmailMarketingConsentUpdateInput();
      result.customerId = this.customerId;
      result.emailMarketingConsent = this.emailMarketingConsent;
      return result;
    }

    
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    
    public Builder emailMarketingConsent(CustomerEmailMarketingConsentInput emailMarketingConsent) {
      this.emailMarketingConsent = emailMarketingConsent;
      return this;
    }
  }
}
