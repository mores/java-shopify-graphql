package com.shopify.admin.types;

/**
 * The possible status values of the last payment on a subscription contract.
 */
public enum SubscriptionContractLastPaymentStatus {
  /**
   * Successful subscription billing attempt.
   */
  SUCCEEDED,

  /**
   * Failed subscription billing attempt.
   */
  FAILED
}
