package com.shopify.admin.types;

/**
 * The valid SMS marketing states for a customer’s phone number.
 */
public enum CustomerSmsMarketingState {
  NOT_SUBSCRIBED,

  PENDING,

  SUBSCRIBED,

  UNSUBSCRIBED,

  REDACTED
}
