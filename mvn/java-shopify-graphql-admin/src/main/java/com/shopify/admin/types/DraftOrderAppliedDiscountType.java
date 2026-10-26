package com.shopify.admin.types;

/**
 * The valid discount types that can be applied to a draft order.
 */
public enum DraftOrderAppliedDiscountType {
  /**
   * A fixed amount in the store's currency.
   */
  FIXED_AMOUNT,

  /**
   * A percentage of the order subtotal.
   */
  PERCENTAGE
}
