package com.shopify.admin.types;

/**
 * The valid SMS marketing states for a customer’s phone number.
 */
public enum CustomerSmsMarketingState {
  /**
   * The customer hasn't subscribed to SMS marketing.
   */
  NOT_SUBSCRIBED,

  /**
   * The customer is in the process of subscribing to SMS marketing.
   */
  PENDING,

  /**
   * The customer is subscribed to SMS marketing.
   */
  SUBSCRIBED,

  /**
   * The customer isn't currently subscribed to SMS marketing but was previously subscribed.
   */
  UNSUBSCRIBED,

  /**
   * The customer's personal data is erased. This value is internally-set and read-only.
   */
  REDACTED
}
