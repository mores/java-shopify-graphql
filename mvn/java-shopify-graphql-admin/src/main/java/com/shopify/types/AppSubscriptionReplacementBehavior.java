package com.shopify.types;

/**
 * The replacement behavior when creating an app subscription for a merchant with an already existing app subscription.
 */
public enum AppSubscriptionReplacementBehavior {
  APPLY_IMMEDIATELY,

  APPLY_ON_NEXT_BILLING_CYCLE,

  STANDARD
}
