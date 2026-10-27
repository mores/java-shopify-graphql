package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ShopifyPaymentsPayoutAlternateCurrencyCreateUserError`.
 */
public enum ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorCode {
  /**
   * No Stripe provider account was found.
   */
  MISSING_PROVIDER_ACCOUNT,

  /**
   * Failed to create payout due to an error from Stripe.
   */
  ALTERNATE_CURRENCY_PAYOUT_FAILED_STRIPE_ERROR,

  /**
   * Failed to create payout due to an error from Shopify Core.
   */
  UNKNOWN_CORE_ERROR,

  /**
   * Failed to create payout, there is no eligible balance in this currency.
   */
  ALTERNATE_CURRENCY_PAYOUT_FAILED_NO_ELIGIBLE_BALANCE
}
