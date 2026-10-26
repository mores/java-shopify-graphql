package com.shopify.admin.types;

/**
 * The set of valid sort keys for the AbandonedCheckout query.
 */
public enum AbandonedCheckoutSortKeys {
  /**
   * Sort by the `checkout_id` value.
   */
  CHECKOUT_ID,

  /**
   * Sort by the `created_at` value.
   */
  CREATED_AT,

  /**
   * Sort by the `customer_name` value.
   */
  CUSTOMER_NAME,

  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
   * Don't use this sort key when no search query is specified.
   */
  RELEVANCE,

  /**
   * Sort by the `total_price` value.
   */
  TOTAL_PRICE
}
