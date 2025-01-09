package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The record of when a customer consented to receive marketing material by email.
 */
public class CustomerEmailMarketingConsentState {
  /**
   * The date and time at which the customer consented to receive marketing material by email.
   * The customer's consent state reflects the consent record with the most recent `consent_updated_at` date.
   * If no date is provided, then the date and time at which the consent information was sent is used.
   */
  private OffsetDateTime consentUpdatedAt;

  /**
   * The marketing subscription opt-in level, as described by the M3AAWG best practices guidelines,
   * that the customer gave when they consented to receive marketing material by email.
   */
  private CustomerMarketingOptInLevel marketingOptInLevel;

  /**
   * The current email marketing state for the customer.
   */
  private CustomerEmailMarketingState marketingState;

  public CustomerEmailMarketingConsentState() {
  }

  /**
   * The date and time at which the customer consented to receive marketing material by email.
   * The customer's consent state reflects the consent record with the most recent `consent_updated_at` date.
   * If no date is provided, then the date and time at which the consent information was sent is used.
   */
  public OffsetDateTime getConsentUpdatedAt() {
    return consentUpdatedAt;
  }

  public void setConsentUpdatedAt(OffsetDateTime consentUpdatedAt) {
    this.consentUpdatedAt = consentUpdatedAt;
  }

  /**
   * The marketing subscription opt-in level, as described by the M3AAWG best practices guidelines,
   * that the customer gave when they consented to receive marketing material by email.
   */
  public CustomerMarketingOptInLevel getMarketingOptInLevel() {
    return marketingOptInLevel;
  }

  public void setMarketingOptInLevel(CustomerMarketingOptInLevel marketingOptInLevel) {
    this.marketingOptInLevel = marketingOptInLevel;
  }

  /**
   * The current email marketing state for the customer.
   */
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
    /**
     * The date and time at which the customer consented to receive marketing material by email.
     * The customer's consent state reflects the consent record with the most recent `consent_updated_at` date.
     * If no date is provided, then the date and time at which the consent information was sent is used.
     */
    private OffsetDateTime consentUpdatedAt;

    /**
     * The marketing subscription opt-in level, as described by the M3AAWG best practices guidelines,
     * that the customer gave when they consented to receive marketing material by email.
     */
    private CustomerMarketingOptInLevel marketingOptInLevel;

    /**
     * The current email marketing state for the customer.
     */
    private CustomerEmailMarketingState marketingState;

    public CustomerEmailMarketingConsentState build() {
      CustomerEmailMarketingConsentState result = new CustomerEmailMarketingConsentState();
      result.consentUpdatedAt = this.consentUpdatedAt;
      result.marketingOptInLevel = this.marketingOptInLevel;
      result.marketingState = this.marketingState;
      return result;
    }

    /**
     * The date and time at which the customer consented to receive marketing material by email.
     * The customer's consent state reflects the consent record with the most recent `consent_updated_at` date.
     * If no date is provided, then the date and time at which the consent information was sent is used.
     */
    public Builder consentUpdatedAt(OffsetDateTime consentUpdatedAt) {
      this.consentUpdatedAt = consentUpdatedAt;
      return this;
    }

    /**
     * The marketing subscription opt-in level, as described by the M3AAWG best practices guidelines,
     * that the customer gave when they consented to receive marketing material by email.
     */
    public Builder marketingOptInLevel(CustomerMarketingOptInLevel marketingOptInLevel) {
      this.marketingOptInLevel = marketingOptInLevel;
      return this;
    }

    /**
     * The current email marketing state for the customer.
     */
    public Builder marketingState(CustomerEmailMarketingState marketingState) {
      this.marketingState = marketingState;
      return this;
    }
  }
}
