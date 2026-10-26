package com.shopify.admin.types;

/**
 * The revocation reason types for a customer payment method.
 */
public enum CustomerPaymentMethodRevocationReason {
  /**
   * The Authorize.net payment gateway is not enabled.
   */
  AUTHORIZE_NET_GATEWAY_NOT_ENABLED,

  /**
   * Authorize.net did not return any payment methods. Make sure that the correct Authorize.net account is linked.
   */
  AUTHORIZE_NET_RETURNED_NO_PAYMENT_METHOD,

  /**
   * The credit card failed to update.
   */
  FAILED_TO_UPDATE_CREDIT_CARD,

  /**
   * Failed to contact the Stripe API.
   */
  STRIPE_API_AUTHENTICATION_ERROR,

  /**
   * Invalid request. Failed to retrieve payment method from Stripe.
   */
  STRIPE_API_INVALID_REQUEST_ERROR,

  /**
   * The Stripe payment gateway is not enabled.
   */
  STRIPE_GATEWAY_NOT_ENABLED,

  /**
   * Stripe did not return any payment methods. Make sure that the correct Stripe account is linked.
   */
  STRIPE_RETURNED_NO_PAYMENT_METHOD,

  /**
   * The Stripe payment method type should be card.
   */
  STRIPE_PAYMENT_METHOD_NOT_CARD,

  /**
   * Failed to contact Braintree API.
   */
  BRAINTREE_API_AUTHENTICATION_ERROR,

  /**
   * The Braintree payment gateway is not enabled.
   */
  BRAINTREE_GATEWAY_NOT_ENABLED,

  /**
   * Braintree returned no payment methods. Make sure the correct Braintree account is linked.
   */
  BRAINTREE_RETURNED_NO_PAYMENT_METHOD,

  /**
   * The Braintree payment method type should be a credit card or Apple Pay card.
   */
  BRAINTREE_PAYMENT_METHOD_NOT_CARD,

  /**
   * Verification of payment method failed.
   */
  PAYMENT_METHOD_VERIFICATION_FAILED,

  /**
   * Verification of the payment method failed due to 3DS not being supported.
   */
  THREE_D_SECURE_FLOW_IN_VERIFICATION_NOT_IMPLEMENTED,

  /**
   * The payment method was manually revoked.
   */
  MANUALLY_REVOKED,

  /**
   * The billing address failed to retrieve.
   */
  FAILED_TO_RETRIEVE_BILLING_ADDRESS,

  /**
   * The payment method was replaced with an existing payment method. The
   * associated contracts have been migrated to the other payment method.
   */
  MERGED,

  /**
   * The customer redacted their payment method.
   */
  CUSTOMER_REDACTED,

  /**
   * Too many consecutive failed attempts.
   */
  TOO_MANY_CONSECUTIVE_FAILURES,

  /**
   * CVV attempts limit exceeded.
   */
  CVV_ATTEMPTS_LIMIT_EXCEEDED
}
