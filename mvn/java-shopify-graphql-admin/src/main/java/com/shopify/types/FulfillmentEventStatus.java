package com.shopify.types;

/**
 * The status that describes a fulfillment or delivery event.
 */
public enum FulfillmentEventStatus {
  LABEL_PURCHASED,

  LABEL_PRINTED,

  READY_FOR_PICKUP,

  CONFIRMED,

  IN_TRANSIT,

  OUT_FOR_DELIVERY,

  ATTEMPTED_DELIVERY,

  DELAYED,

  DELIVERED,

  FAILURE
}
