package com.shopify.admin.types;

/**
 * Answers the question if prices include duties and / or taxes.
 */
public enum InclusiveDutiesPricingStrategy {
  ADD_DUTIES_AT_CHECKOUT,

  INCLUDE_DUTIES_IN_PRICE
}
