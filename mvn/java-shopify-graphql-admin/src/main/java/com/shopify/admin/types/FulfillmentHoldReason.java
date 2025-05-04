package com.shopify.admin.types;

/**
 * The reason for a fulfillment hold.
 */
public enum FulfillmentHoldReason {
  AWAITING_PAYMENT,

  HIGH_RISK_OF_FRAUD,

  INCORRECT_ADDRESS,

  INVENTORY_OUT_OF_STOCK,

  UNKNOWN_DELIVERY_DATE,

  ONLINE_STORE_POST_PURCHASE_CROSS_SELL,

  AWAITING_RETURN_ITEMS,

  OTHER
}
