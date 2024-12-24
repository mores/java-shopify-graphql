package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CustomerPhoneNumber {
  
  private CustomerSmsMarketingState marketingState;

  
  private String phoneNumber;

  public CustomerPhoneNumber() {
  }

  
  public CustomerSmsMarketingState getMarketingState() {
    return marketingState;
  }

  public void setMarketingState(CustomerSmsMarketingState marketingState) {
    this.marketingState = marketingState;
  }

  
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "CustomerPhoneNumber{marketingState='" + marketingState + "', phoneNumber='" + phoneNumber + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPhoneNumber that = (CustomerPhoneNumber) o;
    return Objects.equals(marketingState, that.marketingState) &&
        Objects.equals(phoneNumber, that.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingState, phoneNumber);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CustomerSmsMarketingState marketingState;

    
    private String phoneNumber;

    public CustomerPhoneNumber build() {
      CustomerPhoneNumber result = new CustomerPhoneNumber();
      result.marketingState = this.marketingState;
      result.phoneNumber = this.phoneNumber;
      return result;
    }

    
    public Builder marketingState(CustomerSmsMarketingState marketingState) {
      this.marketingState = marketingState;
      return this;
    }

    
    public Builder phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }
  }
}
