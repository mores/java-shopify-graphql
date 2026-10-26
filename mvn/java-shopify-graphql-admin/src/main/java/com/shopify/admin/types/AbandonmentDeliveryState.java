package com.shopify.admin.types;

/**
 * Specifies the delivery state of a marketing activity.
 */
public enum AbandonmentDeliveryState {
  /**
   * The marketing activity action has not yet been sent.
   */
  NOT_SENT,

  /**
   * The marketing activity action has been sent.
   */
  SENT,

  /**
   * The marketing activity action has been scheduled for later delivery.
   */
  SCHEDULED
}
