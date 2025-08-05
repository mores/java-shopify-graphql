package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryTransferRemoveItemsUserError`.
 */
public enum InventoryTransferRemoveItemsUserErrorCode {
  TRANSFER_NOT_FOUND,

  CANT_REMOVE_ALL_ITEMS_FROM_READY_TO_SHIP_TRANSFER,

  ITEM_NOT_FOUND,

  ALL_QUANTITY_SHIPPED,

  ITEM_PRESENT_ON_DRAFT_SHIPMENT_WITH_ZERO_QUANTITY,

  INVALID_TRANSFER_STATUS,

  LOCATION_NOT_FOUND
}
