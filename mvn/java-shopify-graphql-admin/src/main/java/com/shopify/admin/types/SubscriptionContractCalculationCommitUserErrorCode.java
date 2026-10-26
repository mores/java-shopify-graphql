package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `SubscriptionContractCalculationCommitUserError`.
 */
public enum SubscriptionContractCalculationCommitUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The calculation is not in a succeeded state and cannot be committed yet.
   */
  NOT_READY_TO_COMMIT,

  /**
   * The calculation only discovered delivery options and can't be committed.
   * Create a new calculation with the chosen delivery method, then commit it.
   */
  DISCOVERY_CALCULATION_NOT_COMMITTABLE,

  /**
   * The subscription contract calculation could not be found.
   */
  CALCULATION_NOT_FOUND,

  /**
   * The subscription contract was modified since the calculation was created.
   */
  STALE_CONTRACT,

  /**
   * The first billing date must be in the future.
   */
  INVALID_BILLING_DATE,

  /**
   * The subscription contract is terminated and the calculation can't be committed.
   */
  CONTRACT_TERMINATED
}
