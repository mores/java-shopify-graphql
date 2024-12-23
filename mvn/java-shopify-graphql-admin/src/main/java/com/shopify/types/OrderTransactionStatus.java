package com.shopify.types;

/**
 * The different states that an `OrderTransaction` can have.
 */
public enum OrderTransactionStatus {
  SUCCESS,

  FAILURE,

  PENDING,

  ERROR,

  AWAITING_RESPONSE,

  UNKNOWN
}
