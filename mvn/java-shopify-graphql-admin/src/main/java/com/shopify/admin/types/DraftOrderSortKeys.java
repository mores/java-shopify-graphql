package com.shopify.admin.types;

/**
 * The set of valid sort keys for the DraftOrder query.
 */
public enum DraftOrderSortKeys {
  /**
   * Sort by the `customer_name` value.
   */
  CUSTOMER_NAME,

  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by the `number` value.
   */
  NUMBER,

  /**
   * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
   * Don't use this sort key when no search query is specified.
   */
  RELEVANCE,

  /**
   * Sort by the `status` value.
   */
  STATUS,

  /**
   * Sort by the `total_price` value.
   */
  TOTAL_PRICE,

  /**
   * Sort by the `updated_at` value.
   */
  UPDATED_AT
}
