package com.shopify.admin.types;

/**
 * The possible order action types for a
 * [sales agreement](https://shopify.dev/api/admin-graphql/latest/interfaces/salesagreement).
 */
public enum OrderActionType {
  /**
   * An order with a purchase or charge.
   */
  ORDER,

  /**
   * An edit to the order.
   */
  ORDER_EDIT,

  /**
   * A refund on the order.
   */
  REFUND,

  /**
   * A return on the order.
   */
  RETURN,

  /**
   * An unknown agreement action. Represents new actions that may be added in future versions.
   */
  UNKNOWN
}
