package com.shopify.admin.types;

/**
 * When to reserve inventory for a selling plan.
 */
public enum SellingPlanReserve {
  /**
   * Reserve inventory when order is fulfilled.
   */
  ON_FULFILLMENT,

  /**
   * Reserve inventory at time of sale.
   */
  ON_SALE
}
