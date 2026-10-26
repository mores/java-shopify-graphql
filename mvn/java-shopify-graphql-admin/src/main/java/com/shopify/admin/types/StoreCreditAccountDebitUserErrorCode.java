package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `StoreCreditAccountDebitUserError`.
 */
public enum StoreCreditAccountDebitUserErrorCode {
  /**
   * The store credit account could not be found.
   */
  ACCOUNT_NOT_FOUND,

  /**
   * A positive amount must be used to debit a store credit account.
   */
  NEGATIVE_OR_ZERO_AMOUNT,

  /**
   * The store credit account does not have sufficient funds to satisfy the request.
   */
  INSUFFICIENT_FUNDS,

  /**
   * The currency provided does not match the currency of the store credit account.
   */
  MISMATCHING_CURRENCY
}
