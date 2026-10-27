package com.shopify.admin.types;

/**
 * The reason a discount on a subscription draft was rejected.
 */
public enum SubscriptionDiscountRejectionReason {
  /**
   * Discount code is not found.
   */
  NOT_FOUND,

  /**
   * Discount does not apply to any of the given line items.
   */
  NO_ENTITLED_LINE_ITEMS,

  /**
   * Quantity of items does not qualify for the discount.
   */
  QUANTITY_NOT_IN_RANGE,

  /**
   * Purchase amount of items does not qualify for the discount.
   */
  PURCHASE_NOT_IN_RANGE,

  /**
   * Given customer does not qualify for the discount.
   */
  CUSTOMER_NOT_ELIGIBLE,

  /**
   * Discount usage limit has been reached.
   */
  USAGE_LIMIT_REACHED,

  /**
   * Customer usage limit has been reached.
   */
  CUSTOMER_USAGE_LIMIT_REACHED,

  /**
   * Discount is inactive.
   */
  CURRENTLY_INACTIVE,

  /**
   * No applicable shipping lines.
   */
  NO_ENTITLED_SHIPPING_LINES,

  /**
   * Purchase type does not qualify for the discount.
   */
  INCOMPATIBLE_PURCHASE_TYPE,

  /**
   * Internal error during discount code validation.
   */
  INTERNAL_ERROR
}
