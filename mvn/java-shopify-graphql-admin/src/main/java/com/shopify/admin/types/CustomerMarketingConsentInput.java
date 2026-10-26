package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields for marketing consent information when a
 * [customer](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer)
 * consents to receive marketing material on a specific channel. Channel-specific
 * consent mutations like [`customerWhatsAppMarketingConsentUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/customerWhatsAppMarketingConsentUpdate)
 * use this input.
 */
public class CustomerMarketingConsentInput {
  /**
   * The [marketing consent state](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingConsentState)
   * to set for the customer on this channel.
   */
  private CustomerMarketingConsentState state;

  /**
   * The [marketing subscription opt-in level](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingOptInLevel)
   * that was set when the customer consented to receive marketing information.
   */
  private CustomerMarketingOptInLevel optInLevel;

  /**
   * The date and time when the customer consented to receive marketing material.
   * If no date is provided, then the date and time when the consent information was sent is used.
   */
  private OffsetDateTime updatedAt;

  /**
   * Identifies the [location](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location)
   * where the customer consented to receiving marketing material.
   */
  private String sourceLocationId;

  public CustomerMarketingConsentInput() {
  }

  /**
   * The [marketing consent state](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingConsentState)
   * to set for the customer on this channel.
   */
  public CustomerMarketingConsentState getState() {
    return state;
  }

  public void setState(CustomerMarketingConsentState state) {
    this.state = state;
  }

  /**
   * The [marketing subscription opt-in level](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingOptInLevel)
   * that was set when the customer consented to receive marketing information.
   */
  public CustomerMarketingOptInLevel getOptInLevel() {
    return optInLevel;
  }

  public void setOptInLevel(CustomerMarketingOptInLevel optInLevel) {
    this.optInLevel = optInLevel;
  }

  /**
   * The date and time when the customer consented to receive marketing material.
   * If no date is provided, then the date and time when the consent information was sent is used.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Identifies the [location](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location)
   * where the customer consented to receiving marketing material.
   */
  public String getSourceLocationId() {
    return sourceLocationId;
  }

  public void setSourceLocationId(String sourceLocationId) {
    this.sourceLocationId = sourceLocationId;
  }

  @Override
  public String toString() {
    return "CustomerMarketingConsentInput{state='" + state + "', optInLevel='" + optInLevel + "', updatedAt='" + updatedAt + "', sourceLocationId='" + sourceLocationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerMarketingConsentInput that = (CustomerMarketingConsentInput) o;
    return Objects.equals(state, that.state) &&
        Objects.equals(optInLevel, that.optInLevel) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(sourceLocationId, that.sourceLocationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, optInLevel, updatedAt, sourceLocationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The [marketing consent state](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingConsentState)
     * to set for the customer on this channel.
     */
    private CustomerMarketingConsentState state;

    /**
     * The [marketing subscription opt-in level](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingOptInLevel)
     * that was set when the customer consented to receive marketing information.
     */
    private CustomerMarketingOptInLevel optInLevel;

    /**
     * The date and time when the customer consented to receive marketing material.
     * If no date is provided, then the date and time when the consent information was sent is used.
     */
    private OffsetDateTime updatedAt;

    /**
     * Identifies the [location](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location)
     * where the customer consented to receiving marketing material.
     */
    private String sourceLocationId;

    public CustomerMarketingConsentInput build() {
      CustomerMarketingConsentInput result = new CustomerMarketingConsentInput();
      result.state = this.state;
      result.optInLevel = this.optInLevel;
      result.updatedAt = this.updatedAt;
      result.sourceLocationId = this.sourceLocationId;
      return result;
    }

    /**
     * The [marketing consent state](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingConsentState)
     * to set for the customer on this channel.
     */
    public Builder state(CustomerMarketingConsentState state) {
      this.state = state;
      return this;
    }

    /**
     * The [marketing subscription opt-in level](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingOptInLevel)
     * that was set when the customer consented to receive marketing information.
     */
    public Builder optInLevel(CustomerMarketingOptInLevel optInLevel) {
      this.optInLevel = optInLevel;
      return this;
    }

    /**
     * The date and time when the customer consented to receive marketing material.
     * If no date is provided, then the date and time when the consent information was sent is used.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * Identifies the [location](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location)
     * where the customer consented to receiving marketing material.
     */
    public Builder sourceLocationId(String sourceLocationId) {
      this.sourceLocationId = sourceLocationId;
      return this;
    }
  }
}
