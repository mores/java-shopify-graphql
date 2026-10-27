package com.shopify.admin.types;

/**
 * Represents the state of this product operation.
 */
public enum ProductOperationStatus {
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
