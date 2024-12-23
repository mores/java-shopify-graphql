package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents an email address.
 */
public class CustomerEmailAddress {
  /**
   * The customer's default email address.
   */
  private String emailAddress;

  /**
   * Whether the customer has subscribed to email marketing.
   */
  private CustomerEmailAddressMarketingState marketingState;

  /**
   * The URL to unsubscribe a member from all mailing lists.
   */
  private String marketingUnsubscribeUrl;

  /**
   * Whether the customer has opted in to having their opened emails tracked.
   */
  private CustomerEmailAddressOpenTrackingLevel openTrackingLevel;

  /**
   * The URL that can be used to opt a customer in or out of email open tracking.
   */
  private String openTrackingUrl;

  public CustomerEmailAddress() {
  }

  /**
   * The customer's default email address.
   */
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  /**
   * Whether the customer has subscribed to email marketing.
   */
  public CustomerEmailAddressMarketingState getMarketingState() {
    return marketingState;
  }

  public void setMarketingState(CustomerEmailAddressMarketingState marketingState) {
    this.marketingState = marketingState;
  }

  /**
   * The URL to unsubscribe a member from all mailing lists.
   */
  public String getMarketingUnsubscribeUrl() {
    return marketingUnsubscribeUrl;
  }

  public void setMarketingUnsubscribeUrl(String marketingUnsubscribeUrl) {
    this.marketingUnsubscribeUrl = marketingUnsubscribeUrl;
  }

  /**
   * Whether the customer has opted in to having their opened emails tracked.
   */
  public CustomerEmailAddressOpenTrackingLevel getOpenTrackingLevel() {
    return openTrackingLevel;
  }

  public void setOpenTrackingLevel(CustomerEmailAddressOpenTrackingLevel openTrackingLevel) {
    this.openTrackingLevel = openTrackingLevel;
  }

  /**
   * The URL that can be used to opt a customer in or out of email open tracking.
   */
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
    /**
     * The customer's default email address.
     */
    private String emailAddress;

    /**
     * Whether the customer has subscribed to email marketing.
     */
    private CustomerEmailAddressMarketingState marketingState;

    /**
     * The URL to unsubscribe a member from all mailing lists.
     */
    private String marketingUnsubscribeUrl;

    /**
     * Whether the customer has opted in to having their opened emails tracked.
     */
    private CustomerEmailAddressOpenTrackingLevel openTrackingLevel;

    /**
     * The URL that can be used to opt a customer in or out of email open tracking.
     */
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

    /**
     * The customer's default email address.
     */
    public Builder emailAddress(String emailAddress) {
      this.emailAddress = emailAddress;
      return this;
    }

    /**
     * Whether the customer has subscribed to email marketing.
     */
    public Builder marketingState(CustomerEmailAddressMarketingState marketingState) {
      this.marketingState = marketingState;
      return this;
    }

    /**
     * The URL to unsubscribe a member from all mailing lists.
     */
    public Builder marketingUnsubscribeUrl(String marketingUnsubscribeUrl) {
      this.marketingUnsubscribeUrl = marketingUnsubscribeUrl;
      return this;
    }

    /**
     * Whether the customer has opted in to having their opened emails tracked.
     */
    public Builder openTrackingLevel(CustomerEmailAddressOpenTrackingLevel openTrackingLevel) {
      this.openTrackingLevel = openTrackingLevel;
      return this;
    }

    /**
     * The URL that can be used to opt a customer in or out of email open tracking.
     */
    public Builder openTrackingUrl(String openTrackingUrl) {
      this.openTrackingUrl = openTrackingUrl;
      return this;
    }
  }
}
