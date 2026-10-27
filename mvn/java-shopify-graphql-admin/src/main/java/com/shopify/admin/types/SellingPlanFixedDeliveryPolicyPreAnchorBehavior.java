package com.shopify.admin.types;

/**
 * The fulfillment or delivery behavior of the first fulfillment when the orderis placed before the anchor.
 */
public enum SellingPlanFixedDeliveryPolicyPreAnchorBehavior {
  /**
   * Orders placed can be fulfilled / delivered immediately. Orders placed inside a
   * cutoff can be fulfilled / delivered at the next anchor.
   */
  ASAP,

  /**
   * Orders placed can be fulfilled / delivered at the next anchor date.
   * Orders placed inside a cutoff will skip the next anchor and can be fulfilled /
   * delivered at the following anchor.
   */
  NEXT
}
