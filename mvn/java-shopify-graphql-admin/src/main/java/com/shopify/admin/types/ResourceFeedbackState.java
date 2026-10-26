package com.shopify.admin.types;

/**
 * The state of the resource feedback.
 */
public enum ResourceFeedbackState {
  /**
   * No action required from merchant.
   */
  ACCEPTED,

  /**
   * The merchant needs to resolve an issue with the resource.
   */
  REQUIRES_ACTION
}
