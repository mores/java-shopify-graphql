package com.shopify.admin.types;

/**
 * The set of valid sort keys for the Product query.
 */
public enum ProductSortKeys {
  /**
   * Sort by the `created_at` value.
   */
  CREATED_AT,

  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by the `inventory_total` value.
   */
  INVENTORY_TOTAL,

  /**
   * Sort by the `product_type` value.
   */
  PRODUCT_TYPE,

  /**
   * Sort by the `published_at` value.
   */
  PUBLISHED_AT,

  /**
   * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
   * Don't use this sort key when no search query is specified.
   */
  RELEVANCE,

  /**
   * Sort by the `title` value.
   */
  TITLE,

  /**
   * Sort by the `updated_at` value.
   */
  UPDATED_AT,

  /**
   * Sort by the `vendor` value.
   */
  VENDOR
}
