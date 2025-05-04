package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ShopifyPaymentsPayoutAlternateCurrencyCreateUserError`.
 */
public enum ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorCode {
  MISSING_PROVIDER_ACCOUNT,

  ALTERNATE_CURRENCY_PAYOUT_FAILED_STRIPE_ERROR,

  UNKNOWN_CORE_ERROR,

  ALTERNATE_CURRENCY_PAYOUT_FAILED_NO_ELIGIBLE_BALANCE
}
