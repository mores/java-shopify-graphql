package com.shopify.admin.types;

/**
 * The order's aggregated return status that's used for display purposes.
 * An order might have multiple returns, so this field communicates the prioritized return status.
 * The `OrderReturnStatus` enum is a supported filter parameter in the [`orders` query](https://shopify.dev/api/admin-graphql/latest/queries/orders#:~:text=reference_location_id-,return_status,-risk_level).
 */
public enum OrderReturnStatus {
  /**
   * Some items in the order are being returned.
   */
  IN_PROGRESS,

  /**
   * All return shipments from a return in this order were inspected.
   */
  INSPECTION_COMPLETE,

  /**
   * No items in the order were returned.
   */
  NO_RETURN,

  /**
   * Some items in the order were returned.
   */
  RETURNED,

  /**
   * Some returns in the order were not completed successfully.
   */
  RETURN_FAILED,

  /**
   * A return was requested for some items in the order.
   */
  RETURN_REQUESTED
}
