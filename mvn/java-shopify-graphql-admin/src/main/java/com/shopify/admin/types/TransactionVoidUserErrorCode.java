package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `TransactionVoidUserError`.
 */
public enum TransactionVoidUserErrorCode {
  /**
   * Transaction does not exist.
   */
  TRANSACTION_NOT_FOUND,

  /**
   * Transaction must be a successful authorization.
   */
  AUTH_NOT_SUCCESSFUL,

  /**
   * Transaction must be voidable.
   */
  AUTH_NOT_VOIDABLE,

  /**
   * A generic error occurred while attempting to void the transaction.
   */
  GENERIC_ERROR
}
