package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class CustomerSmsMarketingConsentState {
  
  private CustomerConsentCollectedFrom consentCollectedFrom;

  
  private OffsetDateTime consentUpdatedAt;

  
  private CustomerMarketingOptInLevel marketingOptInLevel;

  
  private CustomerSmsMarketingState marketingState;

  public CustomerSmsMarketingConsentState() {
  }

  
  public CustomerConsentCollectedFrom getConsentCollectedFrom() {
    return consentCollectedFrom;
  }

  public void setConsentCollectedFrom(CustomerConsentCollectedFrom consentCollectedFrom) {
    this.consentCollectedFrom = consentCollectedFrom;
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

  
  public CustomerSmsMarketingState getMarketingState() {
    return marketingState;
  }

  public void setMarketingState(CustomerSmsMarketingState marketingState) {
    this.marketingState = marketingState;
  }

  @Override
  public String toString() {
    return "CustomerSmsMarketingConsentState{consentCollectedFrom='" + consentCollectedFrom + "', consentUpdatedAt='" + consentUpdatedAt + "', marketingOptInLevel='" + marketingOptInLevel + "', marketingState='" + marketingState + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerSmsMarketingConsentState that = (CustomerSmsMarketingConsentState) o;
    return Objects.equals(consentCollectedFrom, that.consentCollectedFrom) &&
        Objects.equals(consentUpdatedAt, that.consentUpdatedAt) &&
        Objects.equals(marketingOptInLevel, that.marketingOptInLevel) &&
        Objects.equals(marketingState, that.marketingState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentCollectedFrom, consentUpdatedAt, marketingOptInLevel, marketingState);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CustomerConsentCollectedFrom consentCollectedFrom;

    
    private OffsetDateTime consentUpdatedAt;

    
    private CustomerMarketingOptInLevel marketingOptInLevel;

    
    private CustomerSmsMarketingState marketingState;

    public CustomerSmsMarketingConsentState build() {
      CustomerSmsMarketingConsentState result = new CustomerSmsMarketingConsentState();
      result.consentCollectedFrom = this.consentCollectedFrom;
      result.consentUpdatedAt = this.consentUpdatedAt;
      result.marketingOptInLevel = this.marketingOptInLevel;
      result.marketingState = this.marketingState;
      return result;
    }

    
    public Builder consentCollectedFrom(CustomerConsentCollectedFrom consentCollectedFrom) {
      this.consentCollectedFrom = consentCollectedFrom;
      return this;
    }

    
    public Builder consentUpdatedAt(OffsetDateTime consentUpdatedAt) {
      this.consentUpdatedAt = consentUpdatedAt;
      return this;
    }

    
    public Builder marketingOptInLevel(CustomerMarketingOptInLevel marketingOptInLevel) {
      this.marketingOptInLevel = marketingOptInLevel;
      return this;
    }

    
    public Builder marketingState(CustomerSmsMarketingState marketingState) {
      this.marketingState = marketingState;
      return this;
    }
  }
}
