package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryTransferCancelUserError`.
 */
public enum InventoryTransferCancelUserErrorCode {
  TRANSFER_NOT_FOUND,

  INVALID_TRANSFER_STATUS,

  SHIPMENT_EXISTS
}
