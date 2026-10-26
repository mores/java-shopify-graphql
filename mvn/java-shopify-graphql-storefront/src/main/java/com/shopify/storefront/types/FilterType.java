package com.shopify.storefront.types;

/**
 * The type of data that the filter group represents.
 *
 * For more information, refer to [Filter products in a collection with the Storefront API]
 * (https://shopify.dev/docs/storefronts/headless/building-with-the-storefront-api/products-collections/filter-products).
 */
public enum FilterType {
  /**
   * A list of selectable values.
   */
  LIST,

  /**
   * A range of prices.
   */
  PRICE_RANGE,

  /**
   * A boolean value.
   */
  BOOLEAN
}
