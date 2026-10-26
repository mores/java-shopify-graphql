package com.shopify.admin.types;

/**
 * The possible statuses of a dispute.
 */
public enum DisputeStatus {
  ACCEPTED,

  LOST,

  NEEDS_RESPONSE,

  /**
   * A dispute that was prevented from becoming a formal chargeback.
   */
  PREVENTED,

  UNDER_REVIEW,

  WON,

  /**
   * Status previously used by Stripe to indicate that a dispute led to a refund.
   */
  CHARGE_REFUNDED
}
