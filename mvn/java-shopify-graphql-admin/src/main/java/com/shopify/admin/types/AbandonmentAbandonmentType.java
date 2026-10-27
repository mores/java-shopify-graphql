package com.shopify.admin.types;

/**
 * Specifies the abandonment type.
 */
public enum AbandonmentAbandonmentType {
  /**
   * The abandonment event is an abandoned browse.
   */
  BROWSE,

  /**
   * The abandonment event is an abandoned cart.
   */
  CART,

  /**
   * The abandonment event is an abandoned checkout.
   */
  CHECKOUT
}
