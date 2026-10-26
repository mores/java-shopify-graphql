package com.shopify.admin.types;

/**
 * The actor who initiated a subscription action.
 */
public enum SubscriptionActor {
  /**
   * The subscription action was initiated by a customer.
   */
  CUSTOMER,

  /**
   * The subscription action was initiated by a merchant.
   */
  MERCHANT,

  /**
   * The subscription action was initiated by a partner.
   */
  PARTNER
}
