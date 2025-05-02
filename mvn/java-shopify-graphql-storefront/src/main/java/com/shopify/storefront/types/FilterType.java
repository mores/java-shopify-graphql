package com.shopify.storefront.types;

/**
 * The type of data that the filter group represents.
 *
 * For more information, refer to [Filter products in a collection with the Storefront API]
 * (https://shopify.dev/custom-storefronts/products-collections/filter-products).
 */
public enum FilterType {
  BOOLEAN,

  LIST,

  PRICE_RANGE
}
