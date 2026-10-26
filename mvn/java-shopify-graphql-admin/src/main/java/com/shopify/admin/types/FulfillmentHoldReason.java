package com.shopify.admin.types;

/**
 * The reason for a fulfillment hold.
 */
public enum FulfillmentHoldReason {
  /**
   * The fulfillment hold is applied because payment is pending.
   */
  AWAITING_PAYMENT,

  /**
   * The fulfillment hold is applied because of a high risk of fraud.
   */
  HIGH_RISK_OF_FRAUD,

  /**
   * The fulfillment hold is applied because of an incorrect address.
   */
  INCORRECT_ADDRESS,

  /**
   * The fulfillment hold is applied because inventory is out of stock.
   */
  INVENTORY_OUT_OF_STOCK,

  /**
   * The fulfillment hold is applied because of an unknown delivery date.
   */
  UNKNOWN_DELIVERY_DATE,

  /**
   * The fulfillment hold is applied because of a post purchase upsell offer.
   */
  ONLINE_STORE_POST_PURCHASE_CROSS_SELL,

  /**
   * The fulfillment hold is applied because of return items not yet received during an exchange.
   */
  AWAITING_RETURN_ITEMS,

  /**
   * The fulfillment hold is applied for another reason.
   */
  OTHER
}
