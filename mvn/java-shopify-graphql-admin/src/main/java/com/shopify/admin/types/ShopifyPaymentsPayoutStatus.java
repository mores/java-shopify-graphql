package com.shopify.admin.types;

/**
 * The transfer status of the payout.
 */
public enum ShopifyPaymentsPayoutStatus {
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
  CANCELED
}
