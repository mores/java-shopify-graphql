package com.shopify.admin.types;

/**
 * Possible recommendations for an order.
 */
public enum OrderRiskRecommendationResult {
  /**
   * Recommends cancelling the order.
   */
  CANCEL,

  /**
   * Recommends investigating the order by contacting buyers.
   */
  INVESTIGATE,

  /**
   * Recommends fulfilling the order.
   */
  ACCEPT,

  /**
   * There is no recommended action for the order.
   */
  NONE
}
