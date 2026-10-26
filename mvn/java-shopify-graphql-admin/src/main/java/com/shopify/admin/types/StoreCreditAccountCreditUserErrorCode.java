package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `StoreCreditAccountCreditUserError`.
 */
public enum StoreCreditAccountCreditUserErrorCode {
  /**
   * The store credit account could not be found.
   */
  ACCOUNT_NOT_FOUND,

  /**
   * Owner does not exist.
   */
  OWNER_NOT_FOUND,

  /**
   * A positive amount must be used to credit a store credit account.
   */
  NEGATIVE_OR_ZERO_AMOUNT,

  /**
   * The currency provided does not match the currency of the store credit account.
   */
  MISMATCHING_CURRENCY,

  /**
   * The expiry date must be in the future.
   */
  EXPIRES_AT_IN_PAST,

  /**
   * The operation would cause the account's credit limit to be exceeded.
   */
  CREDIT_LIMIT_EXCEEDED,

  /**
   * The currency provided is not currently supported.
   */
  UNSUPPORTED_CURRENCY
}
