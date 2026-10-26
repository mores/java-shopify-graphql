package com.shopify.storefront.types;

/**
 * Defines what type of merchandise is in the delivery group.
 */
public enum CartDeliveryGroupType {
  /**
   * The delivery group only contains subscription merchandise.
   */
  SUBSCRIPTION,

  /**
   * The delivery group only contains merchandise that is either a one time purchase or a first delivery of
   * subscription merchandise.
   */
  ONE_TIME_PURCHASE
}
