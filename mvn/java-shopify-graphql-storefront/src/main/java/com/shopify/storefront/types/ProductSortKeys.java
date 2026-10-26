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
  /**
   * Sort by the `title` value.
   */
  TITLE,

  /**
   * Sort by the `product_type` value.
   */
  PRODUCT_TYPE,

  /**
   * Sort by the `vendor` value.
   */
  VENDOR,

  /**
   * Sort by the `updated_at` value.
   */
  UPDATED_AT,

  /**
   * Sort by the `created_at` value.
   */
  CREATED_AT,

  /**
   * Sort by the `best_selling` value.
   */
  BEST_SELLING,

  /**
   * Sort by the `price` value.
   */
  PRICE,

  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
   * Don't use this sort key when no search query is specified.
   */
  RELEVANCE
}
