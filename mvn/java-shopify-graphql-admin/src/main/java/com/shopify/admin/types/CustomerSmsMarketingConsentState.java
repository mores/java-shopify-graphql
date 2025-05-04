package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The record of when a customer consented to receive marketing material by SMS.
 *
 * The customer's consent state reflects the record with the most recent date when consent was updated.
 */
public class CustomerSmsMarketingConsentState {
  /**
   * The source from which the SMS marketing information for the customer was collected.
   */
  private CustomerConsentCollectedFrom consentCollectedFrom;

  /**
   * The date and time when the customer consented to receive marketing material by SMS.
   * If no date is provided, then the date and time when the consent information was sent is used.
   */
  private OffsetDateTime consentUpdatedAt;

  /**
   * The marketing subscription opt-in level that was set when the customer consented to receive marketing information.
   */
  private CustomerMarketingOptInLevel marketingOptInLevel;

  /**
   * The current SMS marketing state for the customer.
   */
  private CustomerSmsMarketingState marketingState;

  /**
   * The location where the customer consented to receive marketing material by SMS.
   */
  private Location sourceLocation;

  public CustomerSmsMarketingConsentState() {
  }

  /**
   * The source from which the SMS marketing information for the customer was collected.
   */
  public CustomerConsentCollectedFrom getConsentCollectedFrom() {
    return consentCollectedFrom;
  }

  public void setConsentCollectedFrom(CustomerConsentCollectedFrom consentCollectedFrom) {
    this.consentCollectedFrom = consentCollectedFrom;
  }

  /**
   * The date and time when the customer consented to receive marketing material by SMS.
   * If no date is provided, then the date and time when the consent information was sent is used.
   */
  public OffsetDateTime getConsentUpdatedAt() {
    return consentUpdatedAt;
  }

  public void setConsentUpdatedAt(OffsetDateTime consentUpdatedAt) {
    this.consentUpdatedAt = consentUpdatedAt;
  }

  /**
   * The marketing subscription opt-in level that was set when the customer consented to receive marketing information.
   */
  public CustomerMarketingOptInLevel getMarketingOptInLevel() {
    return marketingOptInLevel;
  }

  public void setMarketingOptInLevel(CustomerMarketingOptInLevel marketingOptInLevel) {
    this.marketingOptInLevel = marketingOptInLevel;
  }

  /**
   * The current SMS marketing state for the customer.
   */
  public CustomerSmsMarketingState getMarketingState() {
    return marketingState;
  }

  public void setMarketingState(CustomerSmsMarketingState marketingState) {
    this.marketingState = marketingState;
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
    return "CustomerSmsMarketingConsentState{consentCollectedFrom='" + consentCollectedFrom + "', consentUpdatedAt='" + consentUpdatedAt + "', marketingOptInLevel='" + marketingOptInLevel + "', marketingState='" + marketingState + "', sourceLocation='" + sourceLocation + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerSmsMarketingConsentState that = (CustomerSmsMarketingConsentState) o;
    return Objects.equals(consentCollectedFrom, that.consentCollectedFrom) &&
        Objects.equals(consentUpdatedAt, that.consentUpdatedAt) &&
        Objects.equals(marketingOptInLevel, that.marketingOptInLevel) &&
        Objects.equals(marketingState, that.marketingState) &&
        Objects.equals(sourceLocation, that.sourceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentCollectedFrom, consentUpdatedAt, marketingOptInLevel, marketingState, sourceLocation);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The source from which the SMS marketing information for the customer was collected.
     */
    private CustomerConsentCollectedFrom consentCollectedFrom;

    /**
     * The date and time when the customer consented to receive marketing material by SMS.
     * If no date is provided, then the date and time when the consent information was sent is used.
     */
    private OffsetDateTime consentUpdatedAt;

    /**
     * The marketing subscription opt-in level that was set when the customer consented to receive marketing information.
     */
    private CustomerMarketingOptInLevel marketingOptInLevel;

    /**
     * The current SMS marketing state for the customer.
     */
    private CustomerSmsMarketingState marketingState;

    /**
     * The location where the customer consented to receive marketing material by SMS.
     */
    private Location sourceLocation;

    public CustomerSmsMarketingConsentState build() {
      CustomerSmsMarketingConsentState result = new CustomerSmsMarketingConsentState();
      result.consentCollectedFrom = this.consentCollectedFrom;
      result.consentUpdatedAt = this.consentUpdatedAt;
      result.marketingOptInLevel = this.marketingOptInLevel;
      result.marketingState = this.marketingState;
      result.sourceLocation = this.sourceLocation;
      return result;
    }

    /**
     * The source from which the SMS marketing information for the customer was collected.
     */
    public Builder consentCollectedFrom(CustomerConsentCollectedFrom consentCollectedFrom) {
      this.consentCollectedFrom = consentCollectedFrom;
      return this;
    }

    /**
     * The date and time when the customer consented to receive marketing material by SMS.
     * If no date is provided, then the date and time when the consent information was sent is used.
     */
    public Builder consentUpdatedAt(OffsetDateTime consentUpdatedAt) {
      this.consentUpdatedAt = consentUpdatedAt;
      return this;
    }

    /**
     * The marketing subscription opt-in level that was set when the customer consented to receive marketing information.
     */
    public Builder marketingOptInLevel(CustomerMarketingOptInLevel marketingOptInLevel) {
      this.marketingOptInLevel = marketingOptInLevel;
      return this;
    }

    /**
     * The current SMS marketing state for the customer.
     */
    public Builder marketingState(CustomerSmsMarketingState marketingState) {
      this.marketingState = marketingState;
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
