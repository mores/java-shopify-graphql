package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;

/**
 * The marketing consent information for a
 * [customer](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer)
 * on a specific marketing channel. Channel-specific types like [`CustomerWhatsAppMarketingConsent`](https://shopify.dev/docs/api/admin-graphql/latest/objects/CustomerWhatsAppMarketingConsent)
 * implement this interface.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CustomerSmsMarketingConsent.class, name = "CustomerSmsMarketingConsent"),
    @JsonSubTypes.Type(value = CustomerWhatsAppMarketingConsent.class, name = "CustomerWhatsAppMarketingConsent")
})
public interface CustomerMarketingConsent {
  /**
   * The [source](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerConsentCollectedFrom) from which the marketing consent was collected.
   */
  CustomerConsentCollectedFrom getCollectedFrom();

  /**
   * The [marketing subscription opt-in level](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingOptInLevel)
   * that was set when the customer's marketing consent was last updated. Follows
   * M3AAWG best practices guidelines.
   */
  CustomerMarketingOptInLevel getOptInLevel();

  /**
   * The [location](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location)
   * where the customer consented to receive marketing material.
   */
  Location getSourceLocation();

  /**
   * The customer's current [marketing consent state](https://shopify.dev/docs/api/admin-graphql/latest/enums/CustomerMarketingConsentState)
   * for this channel.
   */
  CustomerMarketingConsentState getState();

  /**
   * The date and time when the marketing consent was updated.
   *   
   * No date is provided if the customer has never updated their marketing consent for this channel.
   */
  OffsetDateTime getUpdatedAt();
}
