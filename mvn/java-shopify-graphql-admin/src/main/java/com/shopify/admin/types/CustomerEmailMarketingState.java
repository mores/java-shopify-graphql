package com.shopify.admin.types;

/**
 * The possible email marketing states for a customer.
 */
public enum CustomerEmailMarketingState {
  /**
   * Default state for customers who have never subscribed to email marketing.
   * This value cannot be set via the mutation; use UNSUBSCRIBED instead to indicate
   * a customer has opted out.
   */
  NOT_SUBSCRIBED,

  /**
   * The customer is in the process of subscribing to email marketing.
   */
  PENDING,

  /**
   * The customer is subscribed to email marketing.
   */
  SUBSCRIBED,

  /**
   * The customer isn't currently subscribed to email marketing but was previously subscribed.
   */
  UNSUBSCRIBED,

  /**
   * The customer's personal data is erased. This value is internally-set and read-only.
   */
  REDACTED,

  /**
   * This value is internally-set and read-only.
   */
  INVALID
}
