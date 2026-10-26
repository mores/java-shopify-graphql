package com.shopify.admin.types;

/**
 * The possible transaction types for a payout.
 */
public enum ShopifyPaymentsPayoutTransactionType {
  /**
   * The payout is a deposit.
   */
  DEPOSIT,

  /**
   * The payout is a withdrawal.
   */
  WITHDRAWAL
}
