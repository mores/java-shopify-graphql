package com.shopify.admin.types;

/**
 * Possible marketing states for the customer’s email address.
 */
public enum CustomerEmailAddressMarketingState {
  /**
   * The customer’s email address marketing state is invalid.
   */
  INVALID,

  /**
   * The customer is not subscribed to email marketing.
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
   * The customer is not subscribed to email marketing but was previously subscribed.
   */
  UNSUBSCRIBED
}
