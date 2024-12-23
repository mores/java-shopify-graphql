package com.shopify.types;

/**
 * The reason for a fulfillment order rejection.
 */
public enum FulfillmentOrderRejectionReason {
  INCORRECT_ADDRESS,

  INVENTORY_OUT_OF_STOCK,

  INELIGIBLE_PRODUCT,

  UNDELIVERABLE_DESTINATION,

  OTHER
}
