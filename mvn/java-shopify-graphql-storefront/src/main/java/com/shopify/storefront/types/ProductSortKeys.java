package com.shopify.storefront.types;

/**
 * Sorting options for the
 * [`products`](https://shopify.dev/docs/api/storefront/current/queries/products)
 * query. Supports sorting products by criteria such as best-selling and price, and
 * by product attributes such as type, and vendor. 
 *
 * > Note: Use the [`RELEVANCE`](https://shopify.dev/docs/api/storefront/current/enums/ProductSortKeys#enums-RELEVANCE)
 * key only when a search query is specified.
 */
public enum ProductSortKeys {
  TITLE,

  PRODUCT_TYPE,

  VENDOR,

  UPDATED_AT,

  CREATED_AT,

  BEST_SELLING,

  PRICE,

  ID,

  RELEVANCE
}
