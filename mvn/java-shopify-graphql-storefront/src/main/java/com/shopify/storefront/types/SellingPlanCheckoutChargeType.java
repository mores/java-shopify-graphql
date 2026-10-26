package com.shopify.storefront.types;

/**
 * The checkout charge when the full amount isn't charged at checkout.
 */
public enum SellingPlanCheckoutChargeType {
  /**
   * The checkout charge is a percentage of the product or variant price.
   */
  PERCENTAGE,

  /**
   * The checkout charge is a fixed price amount.
   */
  PRICE
}
