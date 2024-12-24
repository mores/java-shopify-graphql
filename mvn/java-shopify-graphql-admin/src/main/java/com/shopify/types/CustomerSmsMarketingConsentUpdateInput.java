package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CustomerSmsMarketingConsentUpdateInput {
  
  private String customerId;

  
  private CustomerSmsMarketingConsentInput smsMarketingConsent;

  public CustomerSmsMarketingConsentUpdateInput() {
  }

  
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  
  public CustomerSmsMarketingConsentInput getSmsMarketingConsent() {
    return smsMarketingConsent;
  }

  public void setSmsMarketingConsent(CustomerSmsMarketingConsentInput smsMarketingConsent) {
    this.smsMarketingConsent = smsMarketingConsent;
  }

  @Override
  public String toString() {
    return "CustomerSmsMarketingConsentUpdateInput{customerId='" + customerId + "', smsMarketingConsent='" + smsMarketingConsent + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerSmsMarketingConsentUpdateInput that = (CustomerSmsMarketingConsentUpdateInput) o;
    return Objects.equals(customerId, that.customerId) &&
        Objects.equals(smsMarketingConsent, that.smsMarketingConsent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, smsMarketingConsent);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String customerId;

    
    private CustomerSmsMarketingConsentInput smsMarketingConsent;

    public CustomerSmsMarketingConsentUpdateInput build() {
      CustomerSmsMarketingConsentUpdateInput result = new CustomerSmsMarketingConsentUpdateInput();
      result.customerId = this.customerId;
      result.smsMarketingConsent = this.smsMarketingConsent;
      return result;
    }

    
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    
    public Builder smsMarketingConsent(CustomerSmsMarketingConsentInput smsMarketingConsent) {
      this.smsMarketingConsent = smsMarketingConsent;
      return this;
    }
  }
}
