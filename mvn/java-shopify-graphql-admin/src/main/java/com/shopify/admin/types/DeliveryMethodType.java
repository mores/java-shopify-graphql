package com.shopify.admin.types;

/**
 * Possible method types that a delivery method can have.
 */
public enum DeliveryMethodType {
  /**
   * The order is shipped.
   */
  SHIPPING,

  /**
   * The order is picked up by the customer.
   */
  PICK_UP,

  /**
   * Non-physical items, no delivery needed.
   */
  NONE,

  /**
   * In-store sale, no delivery needed.
   */
  RETAIL,

  /**
   * The order is delivered using a local delivery service.
   */
  LOCAL,

  /**
   * The order is delivered to a pickup point.
   */
  PICKUP_POINT
}
