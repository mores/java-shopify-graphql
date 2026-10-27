package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryTransferRemoveItemsUserError`.
 */
public enum InventoryTransferRemoveItemsUserErrorCode {
  /**
   * The transfer was not found.
   */
  TRANSFER_NOT_FOUND,

  /**
   * A `READY_TO_SHIP` transfer must have at least one line item; you cannot remove
   * every line item from one. To empty a `READY_TO_SHIP` transfer, cancel it instead.
   */
  CANT_REMOVE_ALL_ITEMS_FROM_READY_TO_SHIP_TRANSFER,

  /**
   * The item was not found.
   */
  ITEM_NOT_FOUND,

  /**
   * The item cannot be removed because all of its quantity is fully allocated to
   * one or more shipments (including draft shipments where the item has been
   * picked). The error name refers to the underlying allocation check; it triggers
   * regardless of whether the shipments have actually shipped.
   */
  ALL_QUANTITY_SHIPPED,

  /**
   * The line item cannot be removed because it appears on a draft shipment with quantity `0`.
   */
  ITEM_PRESENT_ON_DRAFT_SHIPMENT_WITH_ZERO_QUANTITY,

  /**
   * Current transfer status does not support this operation.
   */
  INVALID_TRANSFER_STATUS,

  /**
   * The location selected can't be found.
   */
  LOCATION_NOT_FOUND
}
