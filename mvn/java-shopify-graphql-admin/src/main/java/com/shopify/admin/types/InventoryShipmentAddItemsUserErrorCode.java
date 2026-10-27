package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryShipmentAddItemsUserError`.
 */
public enum InventoryShipmentAddItemsUserErrorCode {
  /**
   * The location selected can't be found.
   */
  LOCATION_NOT_FOUND,

  /**
   * Current shipment status does not support this operation.
   */
  INVALID_SHIPMENT_STATUS,

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
   * The item is not stocked at the intended location.
   */
  INVENTORY_STATE_NOT_ACTIVE,

  /**
   * The item does not track inventory.
   */
  UNTRACKED_ITEM,

  /**
   * The shipment was not found.
   */
  SHIPMENT_NOT_FOUND,

  /**
   * The location selected is not active.
   */
  LOCATION_NOT_ACTIVE,

  /**
   * Failed to activate inventory at location.
   */
  ACTIVATION_FAILED,

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
