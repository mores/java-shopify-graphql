package com.shopify.admin.types;

/**
 * The possible types for a dispute.
 */
public enum DisputeType {
  /**
   * The dispute has turned into a chargeback.
   */
  CHARGEBACK,

  /**
   * The dispute is in the inquiry phase.
   */
  INQUIRY
}
