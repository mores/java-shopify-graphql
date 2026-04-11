package com.shopify.admin.types;

/**
 * The payment processing policy for a billing attempt.
 */
public enum SubscriptionBillingAttemptPaymentProcessingPolicy {
  FAIL_UNLESS_VALID_PAYMENT_METHOD,

  SKIP_PAYMENT_AND_CREATE_UNPAID_ORDER
}
