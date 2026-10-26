package com.shopify.admin.types;

/**
 * The bank account status.
 */
public enum ShopifyPaymentsBankAccountStatus {
  /**
   * A bank account that hasn't had any activity and that's not validated.
   */
  NEW,

  /**
   * It was determined that the bank account exists.
   */
  VALIDATED,

  /**
   * Bank account validation was successful.
   */
  VERIFIED,

  /**
   * A payout to the bank account failed.
   */
  ERRORED
}
