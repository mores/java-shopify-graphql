package com.shopify.admin.types;

/**
 * The presence of billing attempts on Billing Cycles.
 */
public enum SubscriptionBillingCycleBillingAttemptStatus {
  /**
   * Billing cycle has at least one billing attempt.
   */
  HAS_ATTEMPT,

  /**
   * Billing cycle has no billing attempts.
   */
  NO_ATTEMPT,

  /**
   * Billing cycle has any number of billing attempts.
   */
  ANY
}
