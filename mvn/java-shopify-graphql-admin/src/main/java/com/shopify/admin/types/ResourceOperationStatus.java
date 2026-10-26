package com.shopify.admin.types;

/**
 * Represents the state of this catalog operation.
 */
public enum ResourceOperationStatus {
  /**
   * Operation has been created.
   */
  CREATED,

  /**
   * Operation is currently running.
   */
  ACTIVE,

  /**
   * Operation is complete.
   */
  COMPLETE
}
