package com.shopify.admin.types;

/**
 * Describes what triggers fulfillment.
 */
public enum SellingPlanFulfillmentTrigger {
  /**
   * Use the anchor values to calculate fulfillment date.
   */
  ANCHOR,

  /**
   * As soon as possible.
   */
  ASAP,

  /**
   * At an exact time defined by the fulfillment_exact_time field.
   */
  EXACT_TIME,

  /**
   * Unknown. Usually to be determined in the future.
   */
  UNKNOWN
}
