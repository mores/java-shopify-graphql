package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryTransferCancelUserError`.
 */
public enum InventoryTransferCancelUserErrorCode {
  /**
   * Current transfer status does not support this operation.
   */
  INVALID_TRANSFER_STATUS,

  /**
   * Shipment already exists for the transfer.
   */
  SHIPMENT_EXISTS,

  /**
   * The transfer was not found.
   */
  TRANSFER_NOT_FOUND
}
