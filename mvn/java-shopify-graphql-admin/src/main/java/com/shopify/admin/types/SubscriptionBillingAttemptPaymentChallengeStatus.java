package com.shopify.admin.types;

/**
 * The status of the billing attempt authentication process.
 */
public enum SubscriptionBillingAttemptPaymentChallengeStatus {
  /**
   * The billing attempt is rejected because the customer action was required. The
   * customer has not yet attempted to complete the challenge.
   */
  OFF_SESSION_REJECTED,

  /**
   * The customer was brought on session and challenged.
   */
  ON_SESSION_CHALLENGED
}
