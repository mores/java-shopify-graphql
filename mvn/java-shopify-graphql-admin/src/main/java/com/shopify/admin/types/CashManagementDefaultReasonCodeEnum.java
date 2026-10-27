package com.shopify.admin.types;

/**
 * Default reason codes for cash management.
 */
public enum CashManagementDefaultReasonCodeEnum {
  /**
   * Cash pickup.
   */
  CASH_PICKUP,

  /**
   * Cash count.
   */
  CASH_COUNT,

  /**
   * Change correction.
   */
  CHANGE_CORRECTION,

  /**
   * Petty cash.
   */
  PETTY_CASH,

  /**
   * Tip payout.
   */
  TIP_PAYOUT,

  /**
   * Cash payout.
   */
  CASH_PAYOUT,

  /**
   * Other.
   */
  OTHER,

  /**
   * Point of sale device payment session was automatically closed because a staff member logged out.
   */
  AUTO_END_SESSION_LOGOUT,

  /**
   * Point of sale device payment session was automatically closed because the device switched to a different location.
   */
  AUTO_END_SESSION_LOCATION_CHANGE,

  /**
   * Point of sale device payment session was automatically opened by a cash payment at checkout.
   */
  AUTO_START_SESSION_CHECKOUT
}
