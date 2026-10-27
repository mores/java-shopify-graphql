package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `OrderCreateUserError`.
 */
public enum OrderCreateUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * Indicates that the line item fulfillment service handle is invalid.
   */
  FULFILLMENT_SERVICE_INVALID,

  /**
   * Indicates that the inventory claim failed during order creation.
   */
  INVENTORY_CLAIM_FAILED,

  /**
   * Indicates that the processed_at field is invalid, such as when it references a future date.
   */
  PROCESSED_AT_INVALID,

  /**
   * Indicates that the tax line rate is missing - only enforced for LineItem or ShippingLine-level tax lines.
   */
  TAX_LINE_RATE_MISSING,

  /**
   * Indicates that both customer_id and customer were provided - only one is permitted.
   */
  REDUNDANT_CUSTOMER_FIELDS,

  /**
   * Indicates that the shop is dormant and cannot create orders.
   */
  SHOP_DORMANT
}
