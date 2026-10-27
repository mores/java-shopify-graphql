package com.shopify.admin.types;

/**
 * The different states that an `OrderTransaction` can have.
 */
public enum OrderTransactionStatus {
  /**
   * The transaction succeeded.
   */
  SUCCESS,

  /**
   * The transaction failed.
   */
  FAILURE,

  /**
   * The transaction is pending.
   */
  PENDING,

  /**
   * There was an error while processing the transaction.
   */
  ERROR,

  /**
   * Awaiting a response.
   */
  AWAITING_RESPONSE,

  /**
   * The transaction status is unknown.
   */
  UNKNOWN
}
