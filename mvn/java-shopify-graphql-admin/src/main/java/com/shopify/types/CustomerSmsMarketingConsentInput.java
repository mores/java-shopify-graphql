package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class CustomerSmsMarketingConsentInput {
  
  private CustomerMarketingOptInLevel marketingOptInLevel;

  
  private CustomerSmsMarketingState marketingState;

  
  private OffsetDateTime consentUpdatedAt;

  public CustomerSmsMarketingConsentInput() {
  }

  
  public CustomerMarketingOptInLevel getMarketingOptInLevel() {
    return marketingOptInLevel;
  }

  public void setMarketingOptInLevel(CustomerMarketingOptInLevel marketingOptInLevel) {
    this.marketingOptInLevel = marketingOptInLevel;
  }

  
  public CustomerSmsMarketingState getMarketingState() {
    return marketingState;
  }

  public void setMarketingState(CustomerSmsMarketingState marketingState) {
    this.marketingState = marketingState;
  }

  
  public OffsetDateTime getConsentUpdatedAt() {
    return consentUpdatedAt;
  }

  public void setConsentUpdatedAt(OffsetDateTime consentUpdatedAt) {
    this.consentUpdatedAt = consentUpdatedAt;
  }

  @Override
  public String toString() {
    return "CustomerSmsMarketingConsentInput{marketingOptInLevel='" + marketingOptInLevel + "', marketingState='" + marketingState + "', consentUpdatedAt='" + consentUpdatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerSmsMarketingConsentInput that = (CustomerSmsMarketingConsentInput) o;
    return Objects.equals(marketingOptInLevel, that.marketingOptInLevel) &&
        Objects.equals(marketingState, that.marketingState) &&
        Objects.equals(consentUpdatedAt, that.consentUpdatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingOptInLevel, marketingState, consentUpdatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CustomerMarketingOptInLevel marketingOptInLevel;

    
    private CustomerSmsMarketingState marketingState;

    
    private OffsetDateTime consentUpdatedAt;

    public CustomerSmsMarketingConsentInput build() {
      CustomerSmsMarketingConsentInput result = new CustomerSmsMarketingConsentInput();
      result.marketingOptInLevel = this.marketingOptInLevel;
      result.marketingState = this.marketingState;
      result.consentUpdatedAt = this.consentUpdatedAt;
      return result;
    }

    
    public Builder marketingOptInLevel(CustomerMarketingOptInLevel marketingOptInLevel) {
      this.marketingOptInLevel = marketingOptInLevel;
      return this;
    }

    
    public Builder marketingState(CustomerSmsMarketingState marketingState) {
      this.marketingState = marketingState;
      return this;
    }

    
    public Builder consentUpdatedAt(OffsetDateTime consentUpdatedAt) {
      this.consentUpdatedAt = consentUpdatedAt;
      return this;
    }
  }
}
