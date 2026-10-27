package com.shopify.admin.types;

/**
 * The RFM (Recency, Frequency, Monetary) group for a customer.
 */
public enum CustomerRfmGroup {
  /**
   * Customers with very recent purchases, many orders, and the most spend.
   */
  CHAMPIONS,

  /**
   * Customers with recent purchases, many orders, and the most spend.
   */
  LOYAL,

  /**
   * Customers with recent purchases, some orders, and moderate spend.
   */
  ACTIVE,

  /**
   * Customers with very recent purchases, few orders, and low spend.
   */
  NEW,

  /**
   * Customers with recent purchases, few orders, and low spend.
   */
  PROMISING,

  /**
   * Customers with recent purchases, some orders, and moderate spend.
   */
  NEEDS_ATTENTION,

  /**
   * Customers without recent purchases, fewer orders, and with lower spend.
   */
  ALMOST_LOST,

  /**
   * Customers without recent purchases, but with a very strong history of orders and spend.
   */
  PREVIOUSLY_LOYAL,

  /**
   * Customers without recent purchases, but with a strong history of orders and spend.
   */
  AT_RISK,

  /**
   * Customers without recent orders, with infrequent orders, and with low spend.
   */
  DORMANT,

  /**
   * Customers with no orders yet.
   */
  PROSPECTS
}
