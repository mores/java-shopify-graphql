package com.shopify.admin.types;

/**
 * The set of valid sort keys for the Order query.
 */
public enum OrderSortKeys {
  /**
   * Sorts by the date and time the order was created.
   */
  CREATED_AT,

  /**
   * Sorts by the current total price of an order in the shop currency, including any returns/refunds/removals.
   */
  CURRENT_TOTAL_PRICE,

  /**
   * Sorts by the customer's name.
   */
  CUSTOMER_NAME,

  /**
   * Sort by shipping address to analyze regional sales patterns or plan logistics.
   */
  DESTINATION,

  /**
   * Sorts by the financial status of the order.
   */
  FINANCIAL_STATUS,

  /**
   * Sorts by the order's fulfillment status.
   */
  FULFILLMENT_STATUS,

  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sorts by the order number.
   */
  ORDER_NUMBER,

  /**
   * Sort by the purchase order number to match external procurement systems or track recent orders.
   */
  PO_NUMBER,

  /**
   * Sorts by the date and time the order was processed.
   */
  PROCESSED_AT,

  /**
   * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
   * Don't use this sort key when no search query is specified.
   */
  RELEVANCE,

  /**
   * Sort by the total quantity of all line items to identify large purchases or analyze inventory demand patterns.
   */
  TOTAL_ITEMS_QUANTITY,

  /**
   * Sorts by the total sold price of an order in the shop currency, excluding any returns/refunds/removals.
   */
  TOTAL_PRICE,

  /**
   * Sorts by the date and time the order was last updated.
   */
  UPDATED_AT
}
