package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The marketing consent information when the customer consented to
 *         receiving marketing material by SMS.
 */
public class CustomerSmsMarketingConsentInput {
  /**
   * The marketing subscription opt-in level that was set when the customer consented to receive marketing information.
   */
  private CustomerMarketingOptInLevel marketingOptInLevel;

  /**
   * The current SMS marketing state for the customer.
   */
  private CustomerSmsMarketingState marketingState;

  /**
   * The date and time when the customer consented to receive marketing material by SMS.
   * If no date is provided, then the date and time when the consent information was sent is used.
   */
  private OffsetDateTime consentUpdatedAt;

  public CustomerSmsMarketingConsentInput() {
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
   * The date and time when the customer consented to receive marketing material by SMS.
   * If no date is provided, then the date and time when the consent information was sent is used.
   */
  public OffsetDateTime getConsentUpdatedAt() {
    return consentUpdatedAt;
  }

  public void setConsentUpdatedAt(OffsetDateTime consentUpdatedAt) {
    this.consentUpdatedAt = consentUpdatedAt;
  }

  @Override
  public String toString() {
    return "CustomerSmsMarketingConsentInput{marketingOptInLevel='" + marketingOptInLevel + "', marketingState='" + marketingState + "', consentUpdatedAt='" + consentUpdatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerSmsMarketingConsentInput that = (CustomerSmsMarketingConsentInput) o;
    return Objects.equals(marketingOptInLevel, that.marketingOptInLevel) &&
        Objects.equals(marketingState, that.marketingState) &&
        Objects.equals(consentUpdatedAt, that.consentUpdatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingOptInLevel, marketingState, consentUpdatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The marketing subscription opt-in level that was set when the customer consented to receive marketing information.
     */
    private CustomerMarketingOptInLevel marketingOptInLevel;

    /**
     * The current SMS marketing state for the customer.
     */
    private CustomerSmsMarketingState marketingState;

    /**
     * The date and time when the customer consented to receive marketing material by SMS.
     * If no date is provided, then the date and time when the consent information was sent is used.
     */
    private OffsetDateTime consentUpdatedAt;

    public CustomerSmsMarketingConsentInput build() {
      CustomerSmsMarketingConsentInput result = new CustomerSmsMarketingConsentInput();
      result.marketingOptInLevel = this.marketingOptInLevel;
      result.marketingState = this.marketingState;
      result.consentUpdatedAt = this.consentUpdatedAt;
      return result;
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
     * The date and time when the customer consented to receive marketing material by SMS.
     * If no date is provided, then the date and time when the consent information was sent is used.
     */
    public Builder consentUpdatedAt(OffsetDateTime consentUpdatedAt) {
      this.consentUpdatedAt = consentUpdatedAt;
      return this;
    }
  }
}
