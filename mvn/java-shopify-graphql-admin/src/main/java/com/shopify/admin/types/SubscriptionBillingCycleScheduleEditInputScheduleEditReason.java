package com.shopify.admin.types;

/**
 * The input fields for possible reasons for editing the billing cycle's schedule.
 */
public enum SubscriptionBillingCycleScheduleEditInputScheduleEditReason {
  /**
   * Buyer initiated the schedule edit.
   */
  BUYER_INITIATED,

  /**
   * Merchant initiated the schedule edit.
   */
  MERCHANT_INITIATED,

  /**
   * Developer initiated the schedule edit.
   */
  DEV_INITIATED
}
