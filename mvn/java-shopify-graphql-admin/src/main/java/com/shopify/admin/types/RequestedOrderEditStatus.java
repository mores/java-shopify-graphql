package com.shopify.admin.types;

/**
 * The status of a buyer-initiated requested order edit.
 */
public enum RequestedOrderEditStatus {
  /**
   * The requested order edit is pending merchant action.
   */
  REQUESTED,

  /**
   * The requested order edit has been resolved by the merchant.
   */
  RESOLVED,

  /**
   * The requested order edit was declined by the merchant.
   */
  DECLINED
}
