package com.shopify.admin.types;

/**
 * The valid marketing consent states for a customer on a specific marketing channel. The [`CustomerMarketingConsent`](https://shopify.dev/docs/api/admin-graphql/latest/interfaces/CustomerMarketingConsent)
 * interface and channel-specific consent mutations use these values.
 */
public enum CustomerMarketingConsentState {
  /**
   * The customer has never subscribed to marketing on this channel. This is the
   * default state for any channel the customer hasn't interacted with. Read-only:
   * can't be set as an input.
   */
  NEVER_SUBSCRIBED,

  /**
   * The customer is in the process of subscribing to marketing on this channel, for example, pending an opt-in confirmation.
   */
  PENDING,

  /**
   * The customer is subscribed to marketing on this channel.
   */
  SUBSCRIBED,

  /**
   * The customer isn't currently subscribed to marketing on this channel but was previously subscribed.
   */
  UNSUBSCRIBED,

  /**
   * The customer's personal data is erased. This value is internally-set and read-only.
   */
  REDACTED
}
