package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class CustomerEmailMarketingConsentState {
  
  private OffsetDateTime consentUpdatedAt;

  
  private CustomerMarketingOptInLevel marketingOptInLevel;

  
  private CustomerEmailMarketingState marketingState;

  public CustomerEmailMarketingConsentState() {
  }

  
  public OffsetDateTime getConsentUpdatedAt() {
    return consentUpdatedAt;
  }

  public void setConsentUpdatedAt(OffsetDateTime consentUpdatedAt) {
    this.consentUpdatedAt = consentUpdatedAt;
  }

  
  public CustomerMarketingOptInLevel getMarketingOptInLevel() {
    return marketingOptInLevel;
  }

  public void setMarketingOptInLevel(CustomerMarketingOptInLevel marketingOptInLevel) {
    this.marketingOptInLevel = marketingOptInLevel;
  }

  
  public CustomerEmailMarketingState getMarketingState() {
    return marketingState;
  }

  public void setMarketingState(CustomerEmailMarketingState marketingState) {
    this.marketingState = marketingState;
  }

  @Override
  public String toString() {
    return "CustomerEmailMarketingConsentState{consentUpdatedAt='" + consentUpdatedAt + "', marketingOptInLevel='" + marketingOptInLevel + "', marketingState='" + marketingState + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerEmailMarketingConsentState that = (CustomerEmailMarketingConsentState) o;
    return Objects.equals(consentUpdatedAt, that.consentUpdatedAt) &&
        Objects.equals(marketingOptInLevel, that.marketingOptInLevel) &&
        Objects.equals(marketingState, that.marketingState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentUpdatedAt, marketingOptInLevel, marketingState);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime consentUpdatedAt;

    
    private CustomerMarketingOptInLevel marketingOptInLevel;

    
    private CustomerEmailMarketingState marketingState;

    public CustomerEmailMarketingConsentState build() {
      CustomerEmailMarketingConsentState result = new CustomerEmailMarketingConsentState();
      result.consentUpdatedAt = this.consentUpdatedAt;
      result.marketingOptInLevel = this.marketingOptInLevel;
      result.marketingState = this.marketingState;
      return result;
    }

    
    public Builder consentUpdatedAt(OffsetDateTime consentUpdatedAt) {
      this.consentUpdatedAt = consentUpdatedAt;
      return this;
    }

    
    public Builder marketingOptInLevel(CustomerMarketingOptInLevel marketingOptInLevel) {
      this.marketingOptInLevel = marketingOptInLevel;
      return this;
    }

    
    public Builder marketingState(CustomerEmailMarketingState marketingState) {
      this.marketingState = marketingState;
      return this;
    }
  }
}
