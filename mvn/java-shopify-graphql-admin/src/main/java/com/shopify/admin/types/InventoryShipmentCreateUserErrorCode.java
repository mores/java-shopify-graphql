package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryShipmentCreateUserError`.
 */
public enum InventoryShipmentCreateUserErrorCode {
  EMPTY_SHIPMENT_INPUT,

  ITEM_NOT_FOUND,

  TRANSFER_NOT_FOUND,

  INVALID_TRANSFER_STATUS,

  BUNDLED_ITEM,

  INVALID_QUANTITY,

  UNTRACKED_ITEM,

  DUPLICATE_ITEM,

  INVALID_SHIPMENT_INPUT,

  INVALID_ITEM,

  INVALID_URL,

  LOCATION_NOT_ACTIVE
}
