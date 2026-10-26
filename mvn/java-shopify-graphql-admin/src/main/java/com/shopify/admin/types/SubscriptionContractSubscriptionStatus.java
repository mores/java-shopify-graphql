package com.shopify.admin.types;

/**
 * The possible status values of a subscription.
 */
public enum SubscriptionContractSubscriptionStatus {
  /**
   * The contract is active and continuing per its policies.
   */
  ACTIVE,

  /**
   * The contract is temporarily paused and is expected to resume in the future.
   */
  PAUSED,

  /**
   * The contract was ended by an unplanned customer action.
   */
  CANCELLED,

  /**
   * The contract has ended per the expected circumstances. All billing and deliverycycles of the subscriptions were executed.
   */
  EXPIRED,

  /**
   * The contract ended because billing failed and no further billing attempts are expected.
   */
  FAILED
}
