package com.shopify.admin.types;

/**
 * Error codes for other billing attempt failures.
 */
public enum SubscriptionBillingAttemptGeneralErrorCode {
  /**
   * Non-test order limit reached.
   */
  NON_TEST_ORDER_LIMIT_REACHED,

  /**
   * Free gift cards are not allowed.
   */
  FREE_GIFT_CARD_NOT_ALLOWED,

  /**
   * Customer was not found.
   */
  CUSTOMER_NOT_FOUND,

  /**
   * Customer is invalid.
   */
  CUSTOMER_INVALID,

  /**
   * Billing address is invalid.
   */
  INVALID_BILLING_ADDRESS,

  /**
   * Merchant account error.
   */
  MERCHANT_ACCOUNT_ERROR,

  /**
   * Payment method was not found.
   */
  PAYMENT_METHOD_NOT_FOUND,

  /**
   * Payment method not specified.
   */
  PAYMENT_METHOD_NOT_SPECIFIED,

  /**
   * Payment method test mode incompatible with gateway.
   */
  PAYMENT_METHOD_INCOMPATIBLE_WITH_GATEWAY_CONFIG,

  /**
   * Payment provider is not enabled.
   */
  PAYMENT_PROVIDER_IS_NOT_ENABLED
}
