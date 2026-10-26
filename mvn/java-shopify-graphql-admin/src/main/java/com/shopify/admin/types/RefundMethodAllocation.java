package com.shopify.admin.types;

/**
 * The different methods that a refund amount can be allocated to.
 */
public enum RefundMethodAllocation {
  /**
   * The refund is to original payment methods.
   */
  ORIGINAL_PAYMENT_METHODS,

  /**
   * The refund is to store credit.
   */
  STORE_CREDIT
}
