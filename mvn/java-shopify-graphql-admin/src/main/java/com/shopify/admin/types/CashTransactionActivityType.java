package com.shopify.admin.types;

/**
 * The type of transaction activity.
 */
public enum CashTransactionActivityType {
  /**
   * A cash sale.
   */
  SALE,

  /**
   * A cash refund.
   */
  REFUND,

  /**
   * Change given to a customer.
   */
  CHANGE
}
