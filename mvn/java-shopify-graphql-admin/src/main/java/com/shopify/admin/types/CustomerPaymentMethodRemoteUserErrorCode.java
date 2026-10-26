package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CustomerPaymentMethodRemoteUserError`.
 */
public enum CustomerPaymentMethodRemoteUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value needs to be blank.
   */
  PRESENT,

  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * Exactly one remote reference is required.
   */
  EXACTLY_ONE_REMOTE_REFERENCE_REQUIRED,

  /**
   * Authorize.net is not enabled for subscriptions.
   */
  AUTHORIZE_NET_NOT_ENABLED_FOR_SUBSCRIPTIONS,

  /**
   * Braintree is not enabled for subscriptions.
   */
  BRAINTREE_NOT_ENABLED_FOR_SUBSCRIPTIONS
}
