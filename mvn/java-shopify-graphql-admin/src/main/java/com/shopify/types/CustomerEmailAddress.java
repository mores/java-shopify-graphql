package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CustomerEmailAddress {
  
  private String emailAddress;

  
  private CustomerEmailAddressMarketingState marketingState;

  
  private String marketingUnsubscribeUrl;

  
  private CustomerEmailAddressOpenTrackingLevel openTrackingLevel;

  
  private String openTrackingUrl;

  public CustomerEmailAddress() {
  }

  
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  
  public CustomerEmailAddressMarketingState getMarketingState() {
    return marketingState;
  }

  public void setMarketingState(CustomerEmailAddressMarketingState marketingState) {
    this.marketingState = marketingState;
  }

  
  public String getMarketingUnsubscribeUrl() {
    return marketingUnsubscribeUrl;
  }

  public void setMarketingUnsubscribeUrl(String marketingUnsubscribeUrl) {
    this.marketingUnsubscribeUrl = marketingUnsubscribeUrl;
  }

  
  public CustomerEmailAddressOpenTrackingLevel getOpenTrackingLevel() {
    return openTrackingLevel;
  }

  public void setOpenTrackingLevel(CustomerEmailAddressOpenTrackingLevel openTrackingLevel) {
    this.openTrackingLevel = openTrackingLevel;
  }

  
  public String getOpenTrackingUrl() {
    return openTrackingUrl;
  }

  public void setOpenTrackingUrl(String openTrackingUrl) {
    this.openTrackingUrl = openTrackingUrl;
  }

  @Override
  public String toString() {
    return "CustomerEmailAddress{emailAddress='" + emailAddress + "', marketingState='" + marketingState + "', marketingUnsubscribeUrl='" + marketingUnsubscribeUrl + "', openTrackingLevel='" + openTrackingLevel + "', openTrackingUrl='" + openTrackingUrl + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerEmailAddress that = (CustomerEmailAddress) o;
    return Objects.equals(emailAddress, that.emailAddress) &&
        Objects.equals(marketingState, that.marketingState) &&
        Objects.equals(marketingUnsubscribeUrl, that.marketingUnsubscribeUrl) &&
        Objects.equals(openTrackingLevel, that.openTrackingLevel) &&
        Objects.equals(openTrackingUrl, that.openTrackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, marketingState, marketingUnsubscribeUrl, openTrackingLevel, openTrackingUrl);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String emailAddress;

    
    private CustomerEmailAddressMarketingState marketingState;

    
    private String marketingUnsubscribeUrl;

    
    private CustomerEmailAddressOpenTrackingLevel openTrackingLevel;

    
    private String openTrackingUrl;

    public CustomerEmailAddress build() {
      CustomerEmailAddress result = new CustomerEmailAddress();
      result.emailAddress = this.emailAddress;
      result.marketingState = this.marketingState;
      result.marketingUnsubscribeUrl = this.marketingUnsubscribeUrl;
      result.openTrackingLevel = this.openTrackingLevel;
      result.openTrackingUrl = this.openTrackingUrl;
      return result;
    }

    
    public Builder emailAddress(String emailAddress) {
      this.emailAddress = emailAddress;
      return this;
    }

    
    public Builder marketingState(CustomerEmailAddressMarketingState marketingState) {
      this.marketingState = marketingState;
      return this;
    }

    
    public Builder marketingUnsubscribeUrl(String marketingUnsubscribeUrl) {
      this.marketingUnsubscribeUrl = marketingUnsubscribeUrl;
      return this;
    }

    
    public Builder openTrackingLevel(CustomerEmailAddressOpenTrackingLevel openTrackingLevel) {
      this.openTrackingLevel = openTrackingLevel;
      return this;
    }

    
    public Builder openTrackingUrl(String openTrackingUrl) {
      this.openTrackingUrl = openTrackingUrl;
      return this;
    }
  }
}
