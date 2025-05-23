package com.shopify.admin.types;

/**
 * The revocation reason types for a customer payment method.
 */
public enum CustomerPaymentMethodRevocationReason {
  AUTHORIZE_NET_GATEWAY_NOT_ENABLED,

  AUTHORIZE_NET_RETURNED_NO_PAYMENT_METHOD,

  FAILED_TO_UPDATE_CREDIT_CARD,

  STRIPE_API_AUTHENTICATION_ERROR,

  STRIPE_API_INVALID_REQUEST_ERROR,

  STRIPE_GATEWAY_NOT_ENABLED,

  STRIPE_RETURNED_NO_PAYMENT_METHOD,

  STRIPE_PAYMENT_METHOD_NOT_CARD,

  BRAINTREE_API_AUTHENTICATION_ERROR,

  BRAINTREE_GATEWAY_NOT_ENABLED,

  BRAINTREE_RETURNED_NO_PAYMENT_METHOD,

  BRAINTREE_PAYMENT_METHOD_NOT_CARD,

  PAYMENT_METHOD_VERIFICATION_FAILED,

  THREE_D_SECURE_FLOW_IN_VERIFICATION_NOT_IMPLEMENTED,

  MANUALLY_REVOKED,

  FAILED_TO_RETRIEVE_BILLING_ADDRESS,

  MERGED,

  CUSTOMER_REDACTED,

  TOO_MANY_CONSECUTIVE_FAILURES,

  CVV_ATTEMPTS_LIMIT_EXCEEDED
}
