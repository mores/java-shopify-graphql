package com.shopify.admin.types;

/**
 * The type of line (i.e. line item or shipping line) on an order that the discount is applicable towards.
 */
public enum DiscountApplicationTargetType {
  /**
   * The discount applies onto line items.
   */
  LINE_ITEM,

  /**
   * The discount applies onto shipping lines.
   */
  SHIPPING_LINE
}
