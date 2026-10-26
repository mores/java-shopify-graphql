package com.shopify.admin.types;

/**
 * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
 * that's used to control how discounts can be combined.
 */
public enum MerchandiseDiscountClass {
  /**
   * The discount is combined with a
   * [product discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * class.
   */
  PRODUCT,

  /**
   * The discount is combined with an
   * [order discount](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * class.
   */
  ORDER
}
