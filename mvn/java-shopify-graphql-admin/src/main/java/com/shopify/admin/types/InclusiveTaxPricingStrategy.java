package com.shopify.admin.types;

/**
 * Answers the question if prices include duties and / or taxes.
 */
public enum InclusiveTaxPricingStrategy {
  /**
   * Add taxes at checkout when configured to collect.
   */
  ADD_TAXES_AT_CHECKOUT,

  /**
   * Include taxes in price when configured to collect.
   */
  INCLUDES_TAXES_IN_PRICE,

  /**
   * Include taxes in price based on country when configured to collect.
   */
  INCLUDES_TAXES_IN_PRICE_BASED_ON_COUNTRY
}
