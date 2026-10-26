package com.shopify.admin.types;

/**
 * The type of line (line item or shipping line) on an order that the subscription discount is applicable towards.
 */
public enum DiscountTargetType {
  /**
   * The discount applies onto line items.
   */
  LINE_ITEM,

  /**
   * The discount applies onto shipping lines.
   */
  SHIPPING_LINE
}
