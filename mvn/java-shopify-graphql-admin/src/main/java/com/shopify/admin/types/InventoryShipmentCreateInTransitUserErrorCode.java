package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryShipmentCreateInTransitUserError`.
 */
public enum InventoryShipmentCreateInTransitUserErrorCode {
  /**
   * This barcode is already assigned to another shipment.
   */
  BARCODE_DUPLICATE,

  /**
   * Barcode must be 255 characters or less.
   */
  BARCODE_TOO_LONG,

  /**
   * A single item can't be listed twice.
   */
  DUPLICATE_ITEM,

  /**
   * The quantity is invalid.
   */
  INVALID_QUANTITY,

  /**
   * The item was not found.
   */
  ITEM_NOT_FOUND,

  /**
   * Current transfer status does not support this operation.
   */
  INVALID_TRANSFER_STATUS,

  /**
   * The item does not track inventory.
   */
  UNTRACKED_ITEM,

  /**
   * The shipment input cannot be empty.
   */
  EMPTY_SHIPMENT_INPUT,

  /**
   * The list of line items is empty.
   */
  ITEMS_EMPTY,

  /**
   * The transfer was not found.
   */
  TRANSFER_NOT_FOUND,

  /**
   * The URL is invalid.
   */
  INVALID_URL,

  /**
   * The shipment input is invalid.
   */
  INVALID_SHIPMENT_INPUT,

  /**
   * One or more items are not valid.
   */
  INVALID_ITEM,

  /**
   * The item is not stocked at the intended location.
   */
  INVENTORY_STATE_NOT_ACTIVE,

  /**
   * The location selected is not active.
   */
  LOCATION_NOT_ACTIVE,

  /**
   * The shipment was not found.
   */
  SHIPMENT_NOT_FOUND,

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
