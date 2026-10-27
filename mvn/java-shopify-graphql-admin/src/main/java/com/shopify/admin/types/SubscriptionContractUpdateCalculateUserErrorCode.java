package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `SubscriptionContractUpdateCalculateUserError`.
 */
public enum SubscriptionContractUpdateCalculateUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The subscription contract is terminated and can't be updated.
   */
  CONTRACT_TERMINATED,

  /**
   * The subscription contract has a current or upcoming billing cycle contract edit and can't be updated.
   */
  CONTRACT_HAS_FUTURE_EDITS
}
