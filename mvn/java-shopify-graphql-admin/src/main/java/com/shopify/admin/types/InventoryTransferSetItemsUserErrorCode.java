package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryTransferSetItemsUserError`.
 */
public enum InventoryTransferSetItemsUserErrorCode {
  TRANSFER_NOT_FOUND,

  INVALID_TRANSFER_STATUS,

  LOCATION_NOT_FOUND,

  LOCATION_NOT_ACTIVE,

  IDEMPOTENCY_CONCURRENT_REQUEST,

  IDEMPOTENCY_KEY_PARAMETER_MISMATCH,

  BUNDLED_ITEM,

  UNTRACKED_ITEM,

  ITEM_NOT_FOUND,

  INVALID_QUANTITY,

  DUPLICATE_ITEM,

  INVENTORY_STATE_NOT_ACTIVE
}
