package com.shopify.admin.types;

/**
 * The condition types for the condition set.
 */
public enum MarketConditionType {
  /**
   * The condition checks the visitor's region.
   */
  REGION,

  /**
   * The condition checks the location that the visitor is shopping from.
   */
  LOCATION,

  /**
   * The condition checks the company location that the visitor is purchasing for.
   */
  COMPANY_LOCATION,

  /**
   * The condition checks the channel that the visitor is shopping from.
   */
  CHANNEL
}
