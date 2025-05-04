package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Information that describes when a customer consented to
 *         receiving marketing material by email.
 */
public class CustomerEmailMarketingConsentInput {
  /**
   * The customer opt-in level at the time of subscribing to marketing material.
   */
  private CustomerMarketingOptInLevel marketingOptInLevel;

  /**
   * The current marketing state associated with the customer's email.
   *           If the customer doesn't have an email, then this field is `null`.
   */
  private CustomerEmailMarketingState marketingState;

  /**
   * The latest date and time when the customer consented or objected to
   *           receiving marketing material by email.
   */
  private OffsetDateTime consentUpdatedAt;

  /**
   * Identifies the location where the customer consented to receiving marketing material by email.
   */
  private String sourceLocationId;

  public CustomerEmailMarketingConsentInput() {
  }

  /**
   * The customer opt-in level at the time of subscribing to marketing material.
   */
  public CustomerMarketingOptInLevel getMarketingOptInLevel() {
    return marketingOptInLevel;
  }

  public void setMarketingOptInLevel(CustomerMarketingOptInLevel marketingOptInLevel) {
    this.marketingOptInLevel = marketingOptInLevel;
  }

  /**
   * The current marketing state associated with the customer's email.
   *           If the customer doesn't have an email, then this field is `null`.
   */
  public CustomerEmailMarketingState getMarketingState() {
    return marketingState;
  }

  public void setMarketingState(CustomerEmailMarketingState marketingState) {
    this.marketingState = marketingState;
  }

  /**
   * The latest date and time when the customer consented or objected to
   *           receiving marketing material by email.
   */
  public OffsetDateTime getConsentUpdatedAt() {
    return consentUpdatedAt;
  }

  public void setConsentUpdatedAt(OffsetDateTime consentUpdatedAt) {
    this.consentUpdatedAt = consentUpdatedAt;
  }

  /**
   * Identifies the location where the customer consented to receiving marketing material by email.
   */
  public String getSourceLocationId() {
    return sourceLocationId;
  }

  public void setSourceLocationId(String sourceLocationId) {
    this.sourceLocationId = sourceLocationId;
  }

  @Override
  public String toString() {
    return "CustomerEmailMarketingConsentInput{marketingOptInLevel='" + marketingOptInLevel + "', marketingState='" + marketingState + "', consentUpdatedAt='" + consentUpdatedAt + "', sourceLocationId='" + sourceLocationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerEmailMarketingConsentInput that = (CustomerEmailMarketingConsentInput) o;
    return Objects.equals(marketingOptInLevel, that.marketingOptInLevel) &&
        Objects.equals(marketingState, that.marketingState) &&
        Objects.equals(consentUpdatedAt, that.consentUpdatedAt) &&
        Objects.equals(sourceLocationId, that.sourceLocationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingOptInLevel, marketingState, consentUpdatedAt, sourceLocationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The customer opt-in level at the time of subscribing to marketing material.
     */
    private CustomerMarketingOptInLevel marketingOptInLevel;

    /**
     * The current marketing state associated with the customer's email.
     *           If the customer doesn't have an email, then this field is `null`.
     */
    private CustomerEmailMarketingState marketingState;

    /**
     * The latest date and time when the customer consented or objected to
     *           receiving marketing material by email.
     */
    private OffsetDateTime consentUpdatedAt;

    /**
     * Identifies the location where the customer consented to receiving marketing material by email.
     */
    private String sourceLocationId;

    public CustomerEmailMarketingConsentInput build() {
      CustomerEmailMarketingConsentInput result = new CustomerEmailMarketingConsentInput();
      result.marketingOptInLevel = this.marketingOptInLevel;
      result.marketingState = this.marketingState;
      result.consentUpdatedAt = this.consentUpdatedAt;
      result.sourceLocationId = this.sourceLocationId;
      return result;
    }

    /**
     * The customer opt-in level at the time of subscribing to marketing material.
     */
    public Builder marketingOptInLevel(CustomerMarketingOptInLevel marketingOptInLevel) {
      this.marketingOptInLevel = marketingOptInLevel;
      return this;
    }

    /**
     * The current marketing state associated with the customer's email.
     *           If the customer doesn't have an email, then this field is `null`.
     */
    public Builder marketingState(CustomerEmailMarketingState marketingState) {
      this.marketingState = marketingState;
      return this;
    }

    /**
     * The latest date and time when the customer consented or objected to
     *           receiving marketing material by email.
     */
    public Builder consentUpdatedAt(OffsetDateTime consentUpdatedAt) {
      this.consentUpdatedAt = consentUpdatedAt;
      return this;
    }

    /**
     * Identifies the location where the customer consented to receiving marketing material by email.
     */
    public Builder sourceLocationId(String sourceLocationId) {
      this.sourceLocationId = sourceLocationId;
      return this;
    }
  }
}
