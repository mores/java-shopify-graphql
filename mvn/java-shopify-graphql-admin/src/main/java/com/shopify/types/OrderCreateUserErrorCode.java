package com.shopify.types;

/**
 * Possible error codes that can be returned by `OrderCreateUserError`.
 */
public enum OrderCreateUserErrorCode {
  INVALID,

  FULFILLMENT_SERVICE_INVALID,

  INVENTORY_CLAIM_FAILED,

  PROCESSED_AT_INVALID,

  TAX_LINE_RATE_MISSING,

  REDUNDANT_CUSTOMER_FIELDS,

  SHOP_DORMANT
}
