package com.shopify.admin.types;

/**
 * The level at which the discount's value is applied.
 */
public enum DiscountApplicationLevel {
  /**
   * The discount is applied at the order level.
   * Order level discounts are not factored into the discountedUnitPriceSet on line items.
   */
  ORDER,

  /**
   * The discount is applied at the line level.
   * Line level discounts are factored into the discountedUnitPriceSet on line items.
   */
  LINE
}
