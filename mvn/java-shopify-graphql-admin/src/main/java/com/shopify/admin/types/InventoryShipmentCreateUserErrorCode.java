package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryShipmentCreateUserError`.
 */
public enum InventoryShipmentCreateUserErrorCode {
  /**
   * This barcode is already assigned to another shipment.
   */
  BARCODE_DUPLICATE,

  /**
   * Barcode must be 255 characters or less.
   */
  BARCODE_TOO_LONG,

  /**
   * The shipment input cannot be empty.
   */
  EMPTY_SHIPMENT_INPUT,

  /**
   * The item was not found.
   */
  ITEM_NOT_FOUND,

  /**
   * The transfer was not found.
   */
  TRANSFER_NOT_FOUND,

  /**
   * Current transfer status does not support this operation.
   */
  INVALID_TRANSFER_STATUS,

  /**
   * Bundled items cannot be used for this operation.
   */
  BUNDLED_ITEM,

  /**
   * The quantity is invalid.
   */
  INVALID_QUANTITY,

  /**
   * The item does not track inventory.
   */
  UNTRACKED_ITEM,

  /**
   * A single item can't be listed twice.
   */
  DUPLICATE_ITEM,

  /**
   * The shipment input is invalid.
   */
  INVALID_SHIPMENT_INPUT,

  /**
   * One or more items are not valid.
   */
  INVALID_ITEM,

  /**
   * The URL is invalid.
   */
  INVALID_URL,

  /**
   * The location selected is not active.
   */
  LOCATION_NOT_ACTIVE,

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
  IDEMPOTENCY_KEY_PARAMETER_MISMATCH,

  /**
   * The idempotency record was found but the associated scheduled changes no longer exist.
   */
  IDEMPOTENCY_RECORD_NOT_FOUND
}
