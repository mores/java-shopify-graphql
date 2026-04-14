package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryTransferMarkAsReadyToShipUserError`.
 */
public enum InventoryTransferMarkAsReadyToShipUserErrorCode {
  TRANSFER_NOT_FOUND,

  ITEMS_EMPTY,

  INVALID_TRANSFER_STATUS,

  LOCATION_REQUIRED,

  INVALID_ITEM,

  LOCATION_NOT_ACTIVE,

  LOCATION_NOT_FOUND
}
