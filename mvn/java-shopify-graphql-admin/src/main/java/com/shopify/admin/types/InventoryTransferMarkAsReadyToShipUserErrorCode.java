package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryTransferMarkAsReadyToShipUserError`.
 */
public enum InventoryTransferMarkAsReadyToShipUserErrorCode {
  /**
   * The transfer was not found.
   */
  TRANSFER_NOT_FOUND,

  /**
   * The list of line items is empty.
   */
  ITEMS_EMPTY,

  /**
   * Current transfer status does not support this operation.
   */
  INVALID_TRANSFER_STATUS,

  /**
   * A location is required for this operation.
   */
  LOCATION_REQUIRED,

  /**
   * One or more items are not valid.
   */
  INVALID_ITEM,

  /**
   * The location selected is not active.
   */
  LOCATION_NOT_ACTIVE,

  /**
   * The location selected can't be found.
   */
  LOCATION_NOT_FOUND
}
