package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `TaxSummaryCreateUserError`.
 */
public enum TaxSummaryCreateUserErrorCode {
  /**
   * No order was not found.
   */
  ORDER_NOT_FOUND,

  /**
   * There was an error during enqueueing of the tax summary creation job(s).
   */
  GENERAL_ERROR
}
