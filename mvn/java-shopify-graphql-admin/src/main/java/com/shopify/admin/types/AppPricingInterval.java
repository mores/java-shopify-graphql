package com.shopify.admin.types;

/**
 * The frequency at which the shop is billed for an app subscription.
 */
public enum AppPricingInterval {
  /**
   * The app subscription bills the shop annually.
   */
  ANNUAL,

  /**
   * The app subscription bills the shop every 30 days.
   */
  EVERY_30_DAYS
}
