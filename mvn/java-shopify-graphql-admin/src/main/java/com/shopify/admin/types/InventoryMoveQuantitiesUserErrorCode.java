package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryMoveQuantitiesUserError`.
 */
public enum InventoryMoveQuantitiesUserErrorCode {
  /**
   * Internal (gid://shopify/) ledger documents are not allowed to be adjusted via API.
   */
  INTERNAL_LEDGER_DOCUMENT,

  /**
   * A ledger document URI is not allowed when adjusting available.
   */
  INVALID_AVAILABLE_DOCUMENT,

  /**
   * The specified inventory item could not be found.
   */
  INVALID_INVENTORY_ITEM,

  /**
   * The specified ledger document is invalid.
   */
  INVALID_LEDGER_DOCUMENT,

  /**
   * The specified location could not be found.
   */
  INVALID_LOCATION,

  /**
   * A ledger document URI is required except when adjusting available.
   */
  INVALID_QUANTITY_DOCUMENT,

  /**
   * The specified quantity name is invalid.
   */
  INVALID_QUANTITY_NAME,

  /**
   * The quantity can't be negative.
   */
  INVALID_QUANTITY_NEGATIVE,

  /**
   * The quantity can't be higher than 2,000,000,000.
   */
  INVALID_QUANTITY_TOO_HIGH,

  /**
   * The specified reason is invalid.
   */
  INVALID_REASON,

  /**
   * The specified reference document is invalid.
   */
  INVALID_REFERENCE_DOCUMENT,

  /**
   * The service is temporarily unavailable. Try again later.
   */
  SERVICE_UNAVAILABLE,

  /**
   * The changeFromQuantity argument no longer matches the persisted quantity.
   */
  CHANGE_FROM_QUANTITY_STALE,

  /**
   * The quantities couldn't be moved. Try again.
   */
  MOVE_QUANTITIES_FAILED,

  /**
   * The quantities can't be moved between different locations.
   */
  DIFFERENT_LOCATIONS,

  /**
   * The quantity names for each change can't be the same.
   */
  SAME_QUANTITY_NAME,

  /**
   * Only a maximum of 2 ledger document URIs across all changes is allowed.
   */
  MAXIMUM_LEDGER_DOCUMENT_URIS,

  /**
   * The specified inventory item is not allowed to be adjusted via API. Example: if the inventory item is a parent bundle.
   */
  NON_MUTABLE_INVENTORY_ITEM,

  /**
   * This request is currently in progress, please try again.
   */
  IDEMPOTENCY_CONCURRENT_REQUEST,

  /**
   * The same idempotency key cannot be used with different operation parameters.
   */
  IDEMPOTENCY_KEY_PARAMETER_MISMATCH,

  /**
   * A previous request with this idempotency key failed. Retry with a new idempotency key.
   */
  IDEMPOTENCY_PREVIOUS_ATTEMPT_FAILED
}
