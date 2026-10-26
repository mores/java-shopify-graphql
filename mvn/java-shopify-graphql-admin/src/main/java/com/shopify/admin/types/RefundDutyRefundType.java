package com.shopify.admin.types;

/**
 * The type of refund to perform for a particular refund duty.
 */
public enum RefundDutyRefundType {
  /**
   * The duty is proportionally refunded based on the quantity of the refunded line item.
   */
  PROPORTIONAL,

  /**
   * The duty is fully refunded.
   */
  FULL
}
