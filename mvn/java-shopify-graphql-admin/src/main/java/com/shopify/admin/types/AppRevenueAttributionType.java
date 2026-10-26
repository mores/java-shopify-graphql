package com.shopify.admin.types;

/**
 * Represents the billing types of revenue attribution.
 */
public enum AppRevenueAttributionType {
  /**
   * App purchase related revenue collection.
   */
  APPLICATION_PURCHASE,

  /**
   * App subscription revenue collection.
   */
  APPLICATION_SUBSCRIPTION,

  /**
   * App usage-based revenue collection.
   */
  APPLICATION_USAGE,

  /**
   * Other app revenue collection type.
   */
  OTHER
}
