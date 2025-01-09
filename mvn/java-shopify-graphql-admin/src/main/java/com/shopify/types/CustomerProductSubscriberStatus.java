package com.shopify.types;

/**
 * The possible product subscription states for a customer, as defined by the customer's subscription contracts.
 */
public enum CustomerProductSubscriberStatus {
  ACTIVE,

  CANCELLED,

  EXPIRED,

  FAILED,

  NEVER_SUBSCRIBED,

  PAUSED
}
