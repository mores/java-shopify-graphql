package com.shopify.admin.types;

/**
 * The replacement behavior when creating an app subscription for a merchant with an already existing app subscription.
 */
public enum AppSubscriptionReplacementBehavior {
  /**
   * Cancels the merchant's current app subscription immediately and replaces it with the newly created app subscription.
   */
  APPLY_IMMEDIATELY,

  /**
   * Defers canceling the merchant's current app subscription and applying the
   * newly created app subscription until the start of the next billing cycle. This
   * value is ignored if the new app subscription is using a different currency
   * than the current app subscription, in which case the new app subscription is
   * applied immediately.
   */
  APPLY_ON_NEXT_BILLING_CYCLE,

  /**
   * Cancels the merchant's current app subscription immediately and replaces it
   * with the newly created app subscription, with the exception of
   * the following scenarios where replacing the current app subscription will be
   * deferred until the start of the next billing cycle.
   * 1) The current app subscription is annual and the newly created app
   * subscription is annual, using the same currency, but is of a lesser value.
   * 2) The current app subscription is annual and the newly created app subscription is monthly and using the same currency.
   * 3) The current app subscription and the newly created app subscription are identical except for the `discount` value.
   */
  STANDARD
}
