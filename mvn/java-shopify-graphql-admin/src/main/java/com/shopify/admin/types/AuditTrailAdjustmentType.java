package com.shopify.admin.types;

/**
 * The possible types of an adjustment applied to determine a price.
 */
public enum AuditTrailAdjustmentType {
  /**
   * The adjustment value is added to the old price to get the new price.
   */
  ADDITION,

  /**
   * The adjustment value is multiplied by the old price to get the new price.
   */
  MULTIPLICATION,

  /**
   * The adjustment value replaces the old price.
   */
  REPLACEMENT
}
