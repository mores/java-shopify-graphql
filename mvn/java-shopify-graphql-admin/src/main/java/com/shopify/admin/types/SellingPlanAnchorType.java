package com.shopify.admin.types;

/**
 * Represents the anchor type.
 */
public enum SellingPlanAnchorType {
  /**
   * Which day of the week, between 1-7.
   */
  WEEKDAY,

  /**
   * Which day of the month, between 1-31.
   */
  MONTHDAY,

  /**
   * Which days of the month and year, month between 1-12, and day between 1-31.
   */
  YEARDAY
}
