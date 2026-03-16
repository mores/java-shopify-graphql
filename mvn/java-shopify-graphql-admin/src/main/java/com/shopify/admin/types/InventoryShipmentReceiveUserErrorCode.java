package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryShipmentReceiveUserError`.
 */
public enum InventoryShipmentReceiveUserErrorCode {
  LOCATION_NOT_FOUND,

  IDEMPOTENCY_CONCURRENT_REQUEST,

  IDEMPOTENCY_KEY_PARAMETER_MISMATCH,

  INTERNAL_ERROR,

  INVALID_SHIPMENT_STATUS,

  INVENTORY_STATE_NOT_ACTIVE,

  SHIPMENT_NOT_FOUND,

  INVALID_QUANTITY,

  ITEM_NOT_FOUND,

  LOCATION_NOT_ACTIVE
}
