package com.shopify.admin.types;

/**
 * The intended audience for the order status page.
 */
public enum Audience {
  /**
   * Intended for customer notifications.
   */
  CUSTOMERVIEW,

  /**
   * Intended for merchant wanting to preview the order status page. Should be used immediately after querying.
   */
  MERCHANTVIEW
}
