package com.shopify.types;

/**
 * Possible error codes that can be returned by `TransactionVoidUserError`.
 */
public enum TransactionVoidUserErrorCode {
  TRANSACTION_NOT_FOUND,

  AUTH_NOT_SUCCESSFUL,

  AUTH_NOT_VOIDABLE,

  GENERIC_ERROR
}
