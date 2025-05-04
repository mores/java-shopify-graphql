package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A phone number.
 */
public class CustomerPhoneNumber {
  /**
   * The source from which the SMS marketing information for the customer was collected.
   */
  private CustomerConsentCollectedFrom marketingCollectedFrom;

  /**
   * The marketing subscription opt-in level, as described by the M3AAWG best practices guidelines,
   * received when the marketing consent was updated.
   */
  private CustomerMarketingOptInLevel marketingOptInLevel;

  /**
   * Whether the customer has subscribed to SMS marketing material.
   */
  private CustomerSmsMarketingState marketingState;

  /**
   * The date and time at which the marketing consent was updated.
   *   
   * No date is provided if the email address never updated its marketing consent.
   */
  private OffsetDateTime marketingUpdatedAt;

  /**
   * A customer's phone number.
   */
  private String phoneNumber;

  /**
   * The location where the customer consented to receive marketing material by SMS.
   */
  private Location sourceLocation;

  public CustomerPhoneNumber() {
  }

  /**
   * The source from which the SMS marketing information for the customer was collected.
   */
  public CustomerConsentCollectedFrom getMarketingCollectedFrom() {
    return marketingCollectedFrom;
  }

  public void setMarketingCollectedFrom(CustomerConsentCollectedFrom marketingCollectedFrom) {
    this.marketingCollectedFrom = marketingCollectedFrom;
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
   * Whether the customer has subscribed to SMS marketing material.
   */
  public CustomerSmsMarketingState getMarketingState() {
    return marketingState;
  }

  public void setMarketingState(CustomerSmsMarketingState marketingState) {
    this.marketingState = marketingState;
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
   * A customer's phone number.
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * The location where the customer consented to receive marketing material by SMS.
   */
  public Location getSourceLocation() {
    return sourceLocation;
  }

  public void setSourceLocation(Location sourceLocation) {
    this.sourceLocation = sourceLocation;
  }

  @Override
  public String toString() {
    return "CustomerPhoneNumber{marketingCollectedFrom='" + marketingCollectedFrom + "', marketingOptInLevel='" + marketingOptInLevel + "', marketingState='" + marketingState + "', marketingUpdatedAt='" + marketingUpdatedAt + "', phoneNumber='" + phoneNumber + "', sourceLocation='" + sourceLocation + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPhoneNumber that = (CustomerPhoneNumber) o;
    return Objects.equals(marketingCollectedFrom, that.marketingCollectedFrom) &&
        Objects.equals(marketingOptInLevel, that.marketingOptInLevel) &&
        Objects.equals(marketingState, that.marketingState) &&
        Objects.equals(marketingUpdatedAt, that.marketingUpdatedAt) &&
        Objects.equals(phoneNumber, that.phoneNumber) &&
        Objects.equals(sourceLocation, that.sourceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingCollectedFrom, marketingOptInLevel, marketingState, marketingUpdatedAt, phoneNumber, sourceLocation);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The source from which the SMS marketing information for the customer was collected.
     */
    private CustomerConsentCollectedFrom marketingCollectedFrom;

    /**
     * The marketing subscription opt-in level, as described by the M3AAWG best practices guidelines,
     * received when the marketing consent was updated.
     */
    private CustomerMarketingOptInLevel marketingOptInLevel;

    /**
     * Whether the customer has subscribed to SMS marketing material.
     */
    private CustomerSmsMarketingState marketingState;

    /**
     * The date and time at which the marketing consent was updated.
     *   
     * No date is provided if the email address never updated its marketing consent.
     */
    private OffsetDateTime marketingUpdatedAt;

    /**
     * A customer's phone number.
     */
    private String phoneNumber;

    /**
     * The location where the customer consented to receive marketing material by SMS.
     */
    private Location sourceLocation;

    public CustomerPhoneNumber build() {
      CustomerPhoneNumber result = new CustomerPhoneNumber();
      result.marketingCollectedFrom = this.marketingCollectedFrom;
      result.marketingOptInLevel = this.marketingOptInLevel;
      result.marketingState = this.marketingState;
      result.marketingUpdatedAt = this.marketingUpdatedAt;
      result.phoneNumber = this.phoneNumber;
      result.sourceLocation = this.sourceLocation;
      return result;
    }

    /**
     * The source from which the SMS marketing information for the customer was collected.
     */
    public Builder marketingCollectedFrom(CustomerConsentCollectedFrom marketingCollectedFrom) {
      this.marketingCollectedFrom = marketingCollectedFrom;
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
     * Whether the customer has subscribed to SMS marketing material.
     */
    public Builder marketingState(CustomerSmsMarketingState marketingState) {
      this.marketingState = marketingState;
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
     * A customer's phone number.
     */
    public Builder phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    /**
     * The location where the customer consented to receive marketing material by SMS.
     */
    public Builder sourceLocation(Location sourceLocation) {
      this.sourceLocation = sourceLocation;
      return this;
    }
  }
}
