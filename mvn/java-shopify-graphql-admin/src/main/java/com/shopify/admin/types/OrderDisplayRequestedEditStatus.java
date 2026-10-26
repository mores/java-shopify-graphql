package com.shopify.admin.types;

/**
 * The order's aggregated requested order edit status that's used for display purposes.
 * An order might have multiple requested order edits, so this field communicates the prioritized status.
 * The `OrderDisplayRequestedEditStatus` enum is a supported filter parameter in the
 * [`orders` query](https://shopify.dev/api/admin-graphql/latest/queries/orders).
 */
public enum OrderDisplayRequestedEditStatus {
  /**
   * No edits were requested for the order.
   */
  NONE,

  /**
   * At least one requested order edit on the order is pending merchant action.
   */
  REQUESTED,

  /**
   * All requested order edits on the order are closed and the most recent was resolved by the merchant.
   */
  RESOLVED,

  /**
   * All requested order edits on the order are closed and the most recent was declined by the merchant.
   */
  DECLINED
}
