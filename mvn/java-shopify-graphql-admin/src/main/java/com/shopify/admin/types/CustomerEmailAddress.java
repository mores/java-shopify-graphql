package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
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
   * The marketing subscription opt-in level, as described by the M3AAWG best practices guidelines,
   * received when the marketing consent was updated.
   */
  private CustomerMarketingOptInLevel marketingOptInLevel;

  /**
   * Whether the customer has subscribed to email marketing.
   */
  private CustomerEmailAddressMarketingState marketingState;

  /**
   * The URL to unsubscribe a member from all mailing lists.
   */
  private String marketingUnsubscribeUrl;

  /**
   * The date and time at which the marketing consent was updated.
   *   
   * No date is provided if the email address never updated its marketing consent.
   */
  private OffsetDateTime marketingUpdatedAt;

  /**
   * Whether the customer has opted in to having their opened emails tracked.
   */
  private CustomerEmailAddressOpenTrackingLevel openTrackingLevel;

  /**
   * The URL that can be used to opt a customer in or out of email open tracking.
   */
  private String openTrackingUrl;

  /**
   * The location where the customer consented to receive marketing material by email.
   */
  private Location sourceLocation;

  /**
   * Whether the email address is formatted correctly.
   *   
   * Returns `true` when the email is formatted correctly. This doesn't guarantee that the email address
   * actually exists.
   */
  private boolean validFormat;

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
   * The marketing subscription opt-in level, as described by the M3AAWG best practices guidelines,
   * received when the marketing consent was updated.
   */
  public CustomerMarketingOptInLevel getMarketingOptInLevel() {
    return marketingOptInLevel;
  }

  public void setMarketingOptInLevel(CustomerMarketingOptInLevel marketingOptInLevel) {
    this.marketingOptInLevel = marketingOptInLevel;
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
   * The date and time at which the marketing consent was updated.
   *   
   * No date is provided if the email address never updated its marketing consent.
   */
  public OffsetDateTime getMarketingUpdatedAt() {
    return marketingUpdatedAt;
  }

  public void setMarketingUpdatedAt(OffsetDateTime marketingUpdatedAt) {
    this.marketingUpdatedAt = marketingUpdatedAt;
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

  /**
   * The location where the customer consented to receive marketing material by email.
   */
  public Location getSourceLocation() {
    return sourceLocation;
  }

  public void setSourceLocation(Location sourceLocation) {
    this.sourceLocation = sourceLocation;
  }

  /**
   * Whether the email address is formatted correctly.
   *   
   * Returns `true` when the email is formatted correctly. This doesn't guarantee that the email address
   * actually exists.
   */
  public boolean getValidFormat() {
    return validFormat;
  }

  public void setValidFormat(boolean validFormat) {
    this.validFormat = validFormat;
  }

  @Override
  public String toString() {
    return "CustomerEmailAddress{emailAddress='" + emailAddress + "', marketingOptInLevel='" + marketingOptInLevel + "', marketingState='" + marketingState + "', marketingUnsubscribeUrl='" + marketingUnsubscribeUrl + "', marketingUpdatedAt='" + marketingUpdatedAt + "', openTrackingLevel='" + openTrackingLevel + "', openTrackingUrl='" + openTrackingUrl + "', sourceLocation='" + sourceLocation + "', validFormat='" + validFormat + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerEmailAddress that = (CustomerEmailAddress) o;
    return Objects.equals(emailAddress, that.emailAddress) &&
        Objects.equals(marketingOptInLevel, that.marketingOptInLevel) &&
        Objects.equals(marketingState, that.marketingState) &&
        Objects.equals(marketingUnsubscribeUrl, that.marketingUnsubscribeUrl) &&
        Objects.equals(marketingUpdatedAt, that.marketingUpdatedAt) &&
        Objects.equals(openTrackingLevel, that.openTrackingLevel) &&
        Objects.equals(openTrackingUrl, that.openTrackingUrl) &&
        Objects.equals(sourceLocation, that.sourceLocation) &&
        validFormat == that.validFormat;
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, marketingOptInLevel, marketingState, marketingUnsubscribeUrl, marketingUpdatedAt, openTrackingLevel, openTrackingUrl, sourceLocation, validFormat);
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
     * The marketing subscription opt-in level, as described by the M3AAWG best practices guidelines,
     * received when the marketing consent was updated.
     */
    private CustomerMarketingOptInLevel marketingOptInLevel;

    /**
     * Whether the customer has subscribed to email marketing.
     */
    private CustomerEmailAddressMarketingState marketingState;

    /**
     * The URL to unsubscribe a member from all mailing lists.
     */
    private String marketingUnsubscribeUrl;

    /**
     * The date and time at which the marketing consent was updated.
     *   
     * No date is provided if the email address never updated its marketing consent.
     */
    private OffsetDateTime marketingUpdatedAt;

    /**
     * Whether the customer has opted in to having their opened emails tracked.
     */
    private CustomerEmailAddressOpenTrackingLevel openTrackingLevel;

    /**
     * The URL that can be used to opt a customer in or out of email open tracking.
     */
    private String openTrackingUrl;

    /**
     * The location where the customer consented to receive marketing material by email.
     */
    private Location sourceLocation;

    /**
     * Whether the email address is formatted correctly.
     *   
     * Returns `true` when the email is formatted correctly. This doesn't guarantee that the email address
     * actually exists.
     */
    private boolean validFormat;

    public CustomerEmailAddress build() {
      CustomerEmailAddress result = new CustomerEmailAddress();
      result.emailAddress = this.emailAddress;
      result.marketingOptInLevel = this.marketingOptInLevel;
      result.marketingState = this.marketingState;
      result.marketingUnsubscribeUrl = this.marketingUnsubscribeUrl;
      result.marketingUpdatedAt = this.marketingUpdatedAt;
      result.openTrackingLevel = this.openTrackingLevel;
      result.openTrackingUrl = this.openTrackingUrl;
      result.sourceLocation = this.sourceLocation;
      result.validFormat = this.validFormat;
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
     * The marketing subscription opt-in level, as described by the M3AAWG best practices guidelines,
     * received when the marketing consent was updated.
     */
    public Builder marketingOptInLevel(CustomerMarketingOptInLevel marketingOptInLevel) {
      this.marketingOptInLevel = marketingOptInLevel;
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
     * The date and time at which the marketing consent was updated.
     *   
     * No date is provided if the email address never updated its marketing consent.
     */
    public Builder marketingUpdatedAt(OffsetDateTime marketingUpdatedAt) {
      this.marketingUpdatedAt = marketingUpdatedAt;
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

    /**
     * The location where the customer consented to receive marketing material by email.
     */
    public Builder sourceLocation(Location sourceLocation) {
      this.sourceLocation = sourceLocation;
      return this;
    }

    /**
     * Whether the email address is formatted correctly.
     *   
     * Returns `true` when the email is formatted correctly. This doesn't guarantee that the email address
     * actually exists.
     */
    public Builder validFormat(boolean validFormat) {
      this.validFormat = validFormat;
      return this;
    }
  }
}
