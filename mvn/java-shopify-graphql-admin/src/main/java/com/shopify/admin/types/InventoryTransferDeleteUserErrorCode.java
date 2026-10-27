package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryTransferDeleteUserError`.
 */
public enum InventoryTransferDeleteUserErrorCode {
  /**
   * A resource was not in the correct state for the operation to succeed.
   */
  INVALID_STATE,

  /**
   * Current transfer status does not support this operation.
   */
  INVALID_TRANSFER_STATUS,

  /**
   * The transfer was not found.
   */
  TRANSFER_NOT_FOUND
}
