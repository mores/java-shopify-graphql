package com.shopify.admin.types;

/**
 * The field type that the condition will be applied to.
 */
public enum DeliveryConditionField {
  /**
   * The condition will check against the total weight of the order.
   */
  TOTAL_WEIGHT,

  /**
   * The condition will check against the total price of the order.
   */
  TOTAL_PRICE
}
