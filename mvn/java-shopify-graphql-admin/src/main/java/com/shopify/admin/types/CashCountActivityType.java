package com.shopify.admin.types;

/**
 * The type of count activity.
 */
public enum CashCountActivityType {
  /**
   * A count performed at the opening of a session.
   */
  OPENING,

  /**
   * A count performed at the closing of a session.
   */
  CLOSING,

  /**
   * A count performed during a session.
   */
  MID_SESSION
}
