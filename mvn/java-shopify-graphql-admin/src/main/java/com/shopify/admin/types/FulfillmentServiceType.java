package com.shopify.admin.types;

/**
 * The type of a fulfillment service.
 */
public enum FulfillmentServiceType {
  /**
   * Fulfillment by gift card.
   */
  GIFT_CARD,

  /**
   * Manual fulfillment by the merchant.
   */
  MANUAL,

  /**
   * Fullfillment by a third-party fulfillment service.
   */
  THIRD_PARTY
}
