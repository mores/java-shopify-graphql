package com.shopify.types;

/**
 * The type of line (i.e. line item or shipping line) on an order that the discount is applicable towards.
 */
public enum DiscountApplicationTargetType {
  LINE_ITEM,

  SHIPPING_LINE
}
