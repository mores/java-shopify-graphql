package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventorySetOnHandQuantitiesUserError`.
 */
public enum InventorySetOnHandQuantitiesUserErrorCode {
  /**
   * The specified inventory item could not be found.
   */
  INVALID_INVENTORY_ITEM,

  /**
   * The specified location could not be found.
   */
  INVALID_LOCATION,

  /**
   * The quantity can't be negative.
   */
  INVALID_QUANTITY_NEGATIVE,

  /**
   * The specified reason is invalid.
   */
  INVALID_REASON,

  /**
   * The specified reference document is invalid.
   */
  INVALID_REFERENCE_DOCUMENT,

  /**
   * The changeFromQuantity argument no longer matches the persisted quantity.
   */
  CHANGE_FROM_QUANTITY_STALE,

  /**
   * The on-hand quantities couldn't be set. Try again.
   */
  SET_ON_HAND_QUANTITIES_FAILED,

  /**
   * The specified inventory item is not allowed to be adjusted via API. Example: if the inventory item is a parent bundle.
   */
  NON_MUTABLE_INVENTORY_ITEM,

  /**
   * The total quantity can't be higher than 1,000,000,000.
   */
  INVALID_QUANTITY_TOO_HIGH,

  /**
   * The compareQuantity value does not match persisted value.
   */
  COMPARE_QUANTITY_STALE,

  /**
   * The service is temporarily unavailable. Try again later.
   */
  SERVICE_UNAVAILABLE,

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
