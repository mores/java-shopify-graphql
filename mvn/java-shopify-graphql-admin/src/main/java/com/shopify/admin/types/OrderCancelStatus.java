package com.shopify.admin.types;

/**
 * Represents the status of the order's cancellation request.
 */
public enum OrderCancelStatus {
  /**
   * The order cancellation has been initiated.
   */
  STARTED,

  /**
   * The order cancellation has been completed successfully.
   */
  SUCCEEDED,

  /**
   * The order cancellation has failed.
   */
  FAILED
}
