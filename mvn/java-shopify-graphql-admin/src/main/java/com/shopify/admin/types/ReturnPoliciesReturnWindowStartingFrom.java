package com.shopify.admin.types;

/**
 * The starting point for calculating a return window.
 */
public enum ReturnPoliciesReturnWindowStartingFrom {
  /**
   * The return window starts from the delivery date.
   */
  ITEM_DELIVERY_DATE,

  /**
   * The return window starts from the delivery date of the last item.
   */
  LAST_ITEM_DELIVERY_DATE
}
