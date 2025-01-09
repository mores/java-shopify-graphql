package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A phone number.
 */
public class CustomerPhoneNumber {
  /**
   * Whether the customer has subscribed to SMS marketing material.
   */
  private CustomerSmsMarketingState marketingState;

  /**
   * A customer's phone number.
   */
  private String phoneNumber;

  public CustomerPhoneNumber() {
  }

  /**
   * Whether the customer has subscribed to SMS marketing material.
   */
  public CustomerSmsMarketingState getMarketingState() {
    return marketingState;
  }

  public void setMarketingState(CustomerSmsMarketingState marketingState) {
    this.marketingState = marketingState;
  }

  /**
   * A customer's phone number.
   */
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
    /**
     * Whether the customer has subscribed to SMS marketing material.
     */
    private CustomerSmsMarketingState marketingState;

    /**
     * A customer's phone number.
     */
    private String phoneNumber;

    public CustomerPhoneNumber build() {
      CustomerPhoneNumber result = new CustomerPhoneNumber();
      result.marketingState = this.marketingState;
      result.phoneNumber = this.phoneNumber;
      return result;
    }

    /**
     * Whether the customer has subscribed to SMS marketing material.
     */
    public Builder marketingState(CustomerSmsMarketingState marketingState) {
      this.marketingState = marketingState;
      return this;
    }

    /**
     * A customer's phone number.
     */
    public Builder phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }
  }
}
