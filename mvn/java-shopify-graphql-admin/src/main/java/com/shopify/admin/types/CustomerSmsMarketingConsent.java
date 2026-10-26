package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The SMS marketing consent information for a [customer's phone number](https://shopify.dev/docs/api/admin-graphql/latest/objects/CustomerPhoneNumber). Implements the [`CustomerMarketingConsent`](https://shopify.dev/docs/api/admin-graphql/latest/interfaces/CustomerMarketingConsent)
 * interface. Use the [`customerSmsMarketingConsentUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/customerSmsMarketingConsentUpdate)
 * mutation to change it.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerSmsMarketingConsent implements com.shopify.admin.types.CustomerMarketingConsent {
  /**
   * The [source](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerConsentCollectedFrom) from which the marketing consent was collected.
   */
  private CustomerConsentCollectedFrom collectedFrom;

  /**
   * The [marketing subscription opt-in level](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingOptInLevel)
   * that was set when the customer's marketing consent was last updated. Follows
   * M3AAWG best practices guidelines.
   */
  private CustomerMarketingOptInLevel optInLevel;

  /**
   * The [location](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location)
   * where the customer consented to receive marketing material.
   */
  private Location sourceLocation;

  /**
   * The customer's current [marketing consent state](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingConsentState)
   * for this channel.
   */
  private CustomerMarketingConsentState state;

  /**
   * The date and time when the marketing consent was updated.
   *   
   * No date is provided if the customer has never updated their marketing consent for this channel.
   */
  private OffsetDateTime updatedAt;

  public CustomerSmsMarketingConsent() {
  }

  /**
   * The [source](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerConsentCollectedFrom) from which the marketing consent was collected.
   */
  public CustomerConsentCollectedFrom getCollectedFrom() {
    return collectedFrom;
  }

  public void setCollectedFrom(CustomerConsentCollectedFrom collectedFrom) {
    this.collectedFrom = collectedFrom;
  }

  /**
   * The [marketing subscription opt-in level](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingOptInLevel)
   * that was set when the customer's marketing consent was last updated. Follows
   * M3AAWG best practices guidelines.
   */
  public CustomerMarketingOptInLevel getOptInLevel() {
    return optInLevel;
  }

  public void setOptInLevel(CustomerMarketingOptInLevel optInLevel) {
    this.optInLevel = optInLevel;
  }

  /**
   * The [location](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location)
   * where the customer consented to receive marketing material.
   */
  public Location getSourceLocation() {
    return sourceLocation;
  }

  public void setSourceLocation(Location sourceLocation) {
    this.sourceLocation = sourceLocation;
  }

  /**
   * The customer's current [marketing consent state](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingConsentState)
   * for this channel.
   */
  public CustomerMarketingConsentState getState() {
    return state;
  }

  public void setState(CustomerMarketingConsentState state) {
    this.state = state;
  }

  /**
   * The date and time when the marketing consent was updated.
   *   
   * No date is provided if the customer has never updated their marketing consent for this channel.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "CustomerSmsMarketingConsent{collectedFrom='" + collectedFrom + "', optInLevel='" + optInLevel + "', sourceLocation='" + sourceLocation + "', state='" + state + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerSmsMarketingConsent that = (CustomerSmsMarketingConsent) o;
    return Objects.equals(collectedFrom, that.collectedFrom) &&
        Objects.equals(optInLevel, that.optInLevel) &&
        Objects.equals(sourceLocation, that.sourceLocation) &&
        Objects.equals(state, that.state) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectedFrom, optInLevel, sourceLocation, state, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The [source](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerConsentCollectedFrom) from which the marketing consent was collected.
     */
    private CustomerConsentCollectedFrom collectedFrom;

    /**
     * The [marketing subscription opt-in level](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingOptInLevel)
     * that was set when the customer's marketing consent was last updated. Follows
     * M3AAWG best practices guidelines.
     */
    private CustomerMarketingOptInLevel optInLevel;

    /**
     * The [location](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location)
     * where the customer consented to receive marketing material.
     */
    private Location sourceLocation;

    /**
     * The customer's current [marketing consent state](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingConsentState)
     * for this channel.
     */
    private CustomerMarketingConsentState state;

    /**
     * The date and time when the marketing consent was updated.
     *   
     * No date is provided if the customer has never updated their marketing consent for this channel.
     */
    private OffsetDateTime updatedAt;

    public CustomerSmsMarketingConsent build() {
      CustomerSmsMarketingConsent result = new CustomerSmsMarketingConsent();
      result.collectedFrom = this.collectedFrom;
      result.optInLevel = this.optInLevel;
      result.sourceLocation = this.sourceLocation;
      result.state = this.state;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The [source](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerConsentCollectedFrom) from which the marketing consent was collected.
     */
    public Builder collectedFrom(CustomerConsentCollectedFrom collectedFrom) {
      this.collectedFrom = collectedFrom;
      return this;
    }

    /**
     * The [marketing subscription opt-in level](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingOptInLevel)
     * that was set when the customer's marketing consent was last updated. Follows
     * M3AAWG best practices guidelines.
     */
    public Builder optInLevel(CustomerMarketingOptInLevel optInLevel) {
      this.optInLevel = optInLevel;
      return this;
    }

    /**
     * The [location](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location)
     * where the customer consented to receive marketing material.
     */
    public Builder sourceLocation(Location sourceLocation) {
      this.sourceLocation = sourceLocation;
      return this;
    }

    /**
     * The customer's current [marketing consent state](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingConsentState)
     * for this channel.
     */
    public Builder state(CustomerMarketingConsentState state) {
      this.state = state;
      return this;
    }

    /**
     * The date and time when the marketing consent was updated.
     *   
     * No date is provided if the customer has never updated their marketing consent for this channel.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
