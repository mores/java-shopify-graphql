package com.shopify.admin.types;

/**
 * Possible pickup time values that a location enabled for local pickup can have.
 */
public enum DeliveryLocalPickupTime {
  /**
   * Usually ready in 1 hour.
   */
  ONE_HOUR,

  /**
   * Usually ready in 2 hours.
   */
  TWO_HOURS,

  /**
   * Usually ready in 4 hours.
   */
  FOUR_HOURS,

  /**
   * Usually ready in 24 hours.
   */
  TWENTY_FOUR_HOURS,

  /**
   * Usually ready in 2-4 days.
   */
  TWO_TO_FOUR_DAYS,

  /**
   * Usually ready in 5+ days.
   */
  FIVE_OR_MORE_DAYS,

  /**
   * Custom pickup time. Unrecognized pickup time enum value.
   */
  CUSTOM
}
