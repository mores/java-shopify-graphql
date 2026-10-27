package com.shopify.admin.types;

/**
 * The status that describes a fulfillment or delivery event.
 */
public enum FulfillmentEventStatus {
  /**
   * A shipping label has been purchased.
   */
  LABEL_PURCHASED,

  /**
   * A purchased shipping label has been printed.
   */
  LABEL_PRINTED,

  /**
   * The fulfillment is ready to be picked up.
   */
  READY_FOR_PICKUP,

  /**
   * The fulfillment is confirmed. This is the default value when no other information is available.
   */
  CONFIRMED,

  /**
   * The fulfillment is in transit.
   */
  IN_TRANSIT,

  /**
   * The fulfillment is out for delivery.
   */
  OUT_FOR_DELIVERY,

  /**
   * A delivery was attempted.
   */
  ATTEMPTED_DELIVERY,

  /**
   * The fulfillment is delayed.
   */
  DELAYED,

  /**
   * The fulfillment was successfully delivered.
   */
  DELIVERED,

  /**
   * The fulfillment request failed.
   */
  FAILURE,

  /**
   * The fulfillment has been picked up by the carrier.
   */
  CARRIER_PICKED_UP
}
