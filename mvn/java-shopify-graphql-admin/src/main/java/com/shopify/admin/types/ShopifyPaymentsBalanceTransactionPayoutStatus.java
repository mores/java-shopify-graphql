package com.shopify.admin.types;

/**
 * The payout status of the balance transaction.
 */
public enum ShopifyPaymentsBalanceTransactionPayoutStatus {
  SCHEDULED,

  IN_TRANSIT,

  PAID,

  FAILED,

  CANCELED,

  PENDING,

  ACTION_REQUIRED
}
