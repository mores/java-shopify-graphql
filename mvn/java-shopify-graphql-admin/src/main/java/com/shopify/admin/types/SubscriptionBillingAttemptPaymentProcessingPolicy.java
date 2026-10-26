package com.shopify.admin.types;

/**
 * The payment processing policy for a billing attempt.
 */
public enum SubscriptionBillingAttemptPaymentProcessingPolicy {
  /**
   * Attempt to process payment on the billing attempt and fail the billing attempt if
   *         the payment method is not valid or if a payment method does not exist.
   */
  FAIL_UNLESS_VALID_PAYMENT_METHOD,

  /**
   * Skip payment processing on the billing attempt and create an unpaid order.
   */
  SKIP_PAYMENT_AND_CREATE_UNPAID_ORDER
}
