package com.shopify.types;

/**
 * Possible error codes that can be returned by `CustomerPaymentMethodRemoteUserError`.
 */
public enum CustomerPaymentMethodRemoteUserErrorCode {
  INVALID,

  PRESENT,

  TAKEN,

  EXACTLY_ONE_REMOTE_REFERENCE_REQUIRED,

  AUTHORIZE_NET_NOT_ENABLED_FOR_SUBSCRIPTIONS,

  BRAINTREE_NOT_ENABLED_FOR_SUBSCRIPTIONS
}
