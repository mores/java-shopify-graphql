package com.shopify.types;

/**
 * Possible error codes that can be returned by `StoreCreditAccountCreditUserError`.
 */
public enum StoreCreditAccountCreditUserErrorCode {
  ACCOUNT_NOT_FOUND,

  OWNER_NOT_FOUND,

  NEGATIVE_OR_ZERO_AMOUNT,

  MISMATCHING_CURRENCY,

  EXPIRES_AT_IN_PAST,

  CREDIT_LIMIT_EXCEEDED,

  UNSUPPORTED_CURRENCY
}
