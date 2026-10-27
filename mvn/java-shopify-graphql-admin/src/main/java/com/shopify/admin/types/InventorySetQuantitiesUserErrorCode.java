package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventorySetQuantitiesUserError`.
 */
public enum InventorySetQuantitiesUserErrorCode {
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
   * The total quantity can't be higher than 1,000,000,000.
   */
  INVALID_QUANTITY_TOO_HIGH,

  /**
   * The total quantity can't be lower than -1,000,000,000.
   */
  INVALID_QUANTITY_TOO_LOW,

  /**
   * The compareQuantity argument must be given to each quantity or ignored using ignoreCompareQuantity.
   */
  COMPARE_QUANTITY_REQUIRED,

  /**
   * The compareQuantity value does not match persisted value.
   */
  COMPARE_QUANTITY_STALE,

  /**
   * The changeFromQuantity value does not match persisted value.
   */
  CHANGE_FROM_QUANTITY_STALE,

  /**
   * The quantity name must be either 'available' or 'on_hand'.
   */
  INVALID_NAME,

  /**
   * The combination of inventoryItemId and locationId must be unique.
   */
  NO_DUPLICATE_INVENTORY_ITEM_ID_GROUP_ID_PAIR,

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
