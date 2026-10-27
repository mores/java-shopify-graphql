package com.shopify.admin.types;

/**
 * Specifies the email state.
 */
public enum AbandonmentEmailState {
  /**
   * The email has not yet been sent.
   */
  NOT_SENT,

  /**
   * The email has been sent.
   */
  SENT,

  /**
   * The email has been scheduled for later delivery.
   */
  SCHEDULED
}
