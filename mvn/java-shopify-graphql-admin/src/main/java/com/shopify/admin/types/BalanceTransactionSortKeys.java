package com.shopify.admin.types;

/**
 * The set of valid sort keys for the BalanceTransaction query.
 */
public enum BalanceTransactionSortKeys {
  /**
   * Sort by the `amount` value.
   */
  AMOUNT,

  /**
   * Sort by the `fee` value.
   */
  FEE,

  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by the `net` value.
   */
  NET,

  /**
   * Sort by the `order_name` value.
   */
  ORDER_NAME,

  /**
   * Sort by the `payment_method_name` value.
   */
  PAYMENT_METHOD_NAME,

  /**
   * Sort by the `payout_date` value.
   */
  PAYOUT_DATE,

  /**
   * Sort by the `payout_status` value.
   */
  PAYOUT_STATUS,

  /**
   * Sort by the `processed_at` value.
   */
  PROCESSED_AT,

  /**
   * Sort by the `transaction_type` value.
   */
  TRANSACTION_TYPE
}
