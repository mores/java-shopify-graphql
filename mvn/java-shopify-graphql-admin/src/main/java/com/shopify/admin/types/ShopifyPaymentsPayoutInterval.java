package com.shopify.admin.types;

/**
 * The interval at which payouts are sent to the connected bank account.
 */
public enum ShopifyPaymentsPayoutInterval {
  /**
   * Each business day.
   */
  DAILY,

  /**
   * Each week, on the day of week specified by weeklyAnchor.
   */
  WEEKLY,

  /**
   * Each month, on the day of month specified by monthlyAnchor.
   */
  MONTHLY,

  /**
   * Payouts will not be automatically made.
   */
  MANUAL
}
