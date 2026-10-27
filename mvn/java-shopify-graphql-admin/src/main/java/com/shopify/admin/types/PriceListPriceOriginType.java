package com.shopify.admin.types;

/**
 * Represents the origin of a price, either fixed (defined on the price list) or
 * relative (calculated using a price list adjustment configuration). For examples, refer to [PriceList](https://shopify.dev/api/admin-graphql/latest/queries/priceList#section-examples).
 */
public enum PriceListPriceOriginType {
  /**
   * The price is defined on the price list.
   */
  FIXED,

  /**
   * The price is relative to the adjustment type and value.
   */
  RELATIVE
}
