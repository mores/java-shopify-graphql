package com.shopify.admin.types;

/**
 * Answers the question if prices include duties and / or taxes.
 */
public enum InclusiveTaxPricingStrategy {
  ADD_TAXES_AT_CHECKOUT,

  INCLUDES_TAXES_IN_PRICE,

  INCLUDES_TAXES_IN_PRICE_BASED_ON_COUNTRY
}
