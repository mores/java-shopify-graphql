package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryTransferEditUserError`.
 */
public enum InventoryTransferEditUserErrorCode {
  INTERNAL_ERROR,

  TRANSFER_NOT_FOUND,

  TRANSFER_LOCATION_IMMUTABLE,

  TRANSFER_ORIGIN_CANNOT_BE_THE_SAME_AS_DESTINATION,

  LOCATION_NOT_ACTIVE,

  LOCATION_NOT_FOUND,

  INVENTORY_STATE_NOT_ACTIVE
}
