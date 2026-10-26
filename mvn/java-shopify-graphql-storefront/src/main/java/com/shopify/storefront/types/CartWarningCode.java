package com.shopify.storefront.types;

/**
 * The code for the cart warning.
 */
public enum CartWarningCode {
  /**
   * The merchandise does not have enough stock.
   */
  MERCHANDISE_NOT_ENOUGH_STOCK,

  /**
   * The merchandise is out of stock.
   */
  MERCHANDISE_OUT_OF_STOCK,

  /**
   * Gift cards are not available as a payment method.
   */
  PAYMENTS_GIFT_CARDS_UNAVAILABLE,

  /**
   * A delivery address with the same details already exists on this cart.
   */
  DUPLICATE_DELIVERY_ADDRESS,

  /**
   * The discount code cannot be honored.
   */
  DISCOUNT_CODE_NOT_HONOURED,

  /**
   * The discount was not found.
   */
  DISCOUNT_NOT_FOUND,

  /**
   * The discount is currently inactive.
   */
  DISCOUNT_CURRENTLY_INACTIVE,

  /**
   * The discount usage limit has been reached.
   */
  DISCOUNT_USAGE_LIMIT_REACHED,

  /**
   * The customer's discount usage limit has been reached.
   */
  DISCOUNT_CUSTOMER_USAGE_LIMIT_REACHED,

  /**
   * The customer is not eligible for this discount.
   */
  DISCOUNT_CUSTOMER_NOT_ELIGIBLE,

  /**
   * An eligible customer is missing for this discount.
   */
  DISCOUNT_ELIGIBLE_CUSTOMER_MISSING,

  /**
   * The quantity is not in range for this discount.
   */
  DISCOUNT_QUANTITY_NOT_IN_RANGE,

  /**
   * The purchase is not in range for this discount.
   */
  DISCOUNT_PURCHASE_NOT_IN_RANGE,

  /**
   * There are no entitled line items for this discount.
   */
  DISCOUNT_NO_ENTITLED_LINE_ITEMS,

  /**
   * There are no entitled shipping lines for this discount.
   */
  DISCOUNT_NO_ENTITLED_SHIPPING_LINES,

  /**
   * The purchase type is incompatible with this discount.
   */
  DISCOUNT_INCOMPATIBLE_PURCHASE_TYPE,

  /**
   * Only one-time purchase is available for B2B orders.
   */
  MERCHANDISE_SELLING_PLAN_NOT_APPLICABLE_ON_COMPANY_LOCATION,

  /**
   * The product is unavailable in the current buyer location.
   */
  PRODUCT_UNAVAILABLE_IN_BUYER_LOCATION
}
