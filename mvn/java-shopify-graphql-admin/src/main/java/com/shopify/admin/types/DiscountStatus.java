package com.shopify.admin.types;

/**
 * The status of the discount that describes its availability,
 * expiration, or pending activation.
 */
public enum DiscountStatus {
  /**
   * The discount is currently available for use.
   */
  ACTIVE,

  /**
   * The discount has reached its end date and is no longer valid.
   */
  EXPIRED,

  /**
   * The discount is set to become active at a future date.
   */
  SCHEDULED
}
