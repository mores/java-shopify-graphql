package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `StoreCreditAccountDebitUserError`.
 */
public enum StoreCreditAccountDebitUserErrorCode {
  ACCOUNT_NOT_FOUND,

  NEGATIVE_OR_ZERO_AMOUNT,

  INSUFFICIENT_FUNDS,

  MISMATCHING_CURRENCY
}
