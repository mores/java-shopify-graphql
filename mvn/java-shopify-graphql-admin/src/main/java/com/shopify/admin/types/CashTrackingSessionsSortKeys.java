package com.shopify.admin.types;

/**
 * The set of valid sort keys for the CashTrackingSessions query.
 */
public enum CashTrackingSessionsSortKeys {
  /**
   * Sort by the `closing_time_asc` value.
   */
  CLOSING_TIME_ASC,

  /**
   * Sort by the `closing_time_desc` value.
   */
  CLOSING_TIME_DESC,

  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by the `opening_time_asc` value.
   */
  OPENING_TIME_ASC,

  /**
   * Sort by the `opening_time_desc` value.
   */
  OPENING_TIME_DESC,

  /**
   * Sort by the `total_discrepancy_asc` value.
   */
  TOTAL_DISCREPANCY_ASC,

  /**
   * Sort by the `total_discrepancy_desc` value.
   */
  TOTAL_DISCREPANCY_DESC
}
