package com.shopify.types;

/**
 * The transfer status of the payout.
 */
public enum ShopifyPaymentsPayoutStatus {
  SCHEDULED,

  IN_TRANSIT,

  PAID,

  FAILED,

  CANCELED
}