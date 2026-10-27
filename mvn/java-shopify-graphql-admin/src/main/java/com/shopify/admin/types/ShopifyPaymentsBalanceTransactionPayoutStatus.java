package com.shopify.admin.types;

/**
 * The payout status of the balance transaction.
 */
public enum ShopifyPaymentsBalanceTransactionPayoutStatus {
  /**
   * The payout has been created and had transactions assigned to it, but
   * it has not yet been submitted to the bank.
   */
  SCHEDULED,

  /**
   * The payout has been submitted to the bank.
   */
  IN_TRANSIT,

  /**
   * The payout has been successfully deposited into the bank.
   */
  PAID,

  /**
   * The payout has been declined by the bank.
   */
  FAILED,

  /**
   * The payout has been canceled by Shopify.
   */
  CANCELED,

  /**
   * The transaction has not been assigned a payout yet.
   */
  PENDING,

  /**
   * The transaction requires action before it can be paid out.
   */
  ACTION_REQUIRED
}
