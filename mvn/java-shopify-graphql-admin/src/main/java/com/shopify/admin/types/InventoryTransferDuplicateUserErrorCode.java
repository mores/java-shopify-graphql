package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryTransferDuplicateUserError`.
 */
public enum InventoryTransferDuplicateUserErrorCode {
  /**
   * The transfer was not found.
   */
  TRANSFER_NOT_FOUND,

  /**
   * The quantity is invalid.
   */
  INVALID_QUANTITY,

  /**
   * This request is currently in progress, please try again.
   */
  IDEMPOTENCY_CONCURRENT_REQUEST,

  /**
   * A previous request with this idempotency key failed. Retry with a new idempotency key.
   */
  IDEMPOTENCY_PREVIOUS_ATTEMPT_FAILED,

  /**
   * The same idempotency key cannot be used with different operation parameters.
   */
  IDEMPOTENCY_KEY_PARAMETER_MISMATCH
}
