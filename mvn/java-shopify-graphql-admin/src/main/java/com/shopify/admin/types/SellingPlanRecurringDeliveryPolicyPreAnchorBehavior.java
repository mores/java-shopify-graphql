package com.shopify.admin.types;

/**
 * The fulfillment or delivery behaviors of the first fulfillment when the orderis placed before the anchor.
 */
public enum SellingPlanRecurringDeliveryPolicyPreAnchorBehavior {
  /**
   * The orders placed can be fulfilled or delivered immediately. The orders placed
   * inside a cutoff can be fulfilled or delivered at the next anchor.
   */
  ASAP,

  /**
   * The orders placed can be fulfilled or delivered at the next anchor date.
   * The orders placed inside a cutoff will skip the next anchor and can be fulfilled or
   * delivered at the following anchor.
   */
  NEXT
}
