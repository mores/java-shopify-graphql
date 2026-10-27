package com.shopify.admin.types;

/**
 * Answers the question if prices include duties and / or taxes.
 */
public enum InclusiveDutiesPricingStrategy {
  /**
   * Add duties at checkout when configured to collect.
   */
  ADD_DUTIES_AT_CHECKOUT,

  /**
   * Include duties in price when configured to collect.
   */
  INCLUDE_DUTIES_IN_PRICE
}
