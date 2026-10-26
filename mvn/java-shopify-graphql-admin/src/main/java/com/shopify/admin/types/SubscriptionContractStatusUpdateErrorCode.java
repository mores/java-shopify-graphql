package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `SubscriptionContractStatusUpdateUserError`.
 */
public enum SubscriptionContractStatusUpdateErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * Subscription contract status cannot be changed once terminated.
   */
  CONTRACT_TERMINATED
}
