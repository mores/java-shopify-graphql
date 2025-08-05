package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryShipmentMarkInTransitUserError`.
 */
public enum InventoryShipmentMarkInTransitUserErrorCode {
  SHIPMENT_NOT_FOUND,

  INVALID_SHIPMENT_STATUS,

  ITEM_NOT_FOUND,

  INVENTORY_STATE_NOT_ACTIVE,

  UNTRACKED_ITEM,

  INVALID_QUANTITY,

  ITEMS_EMPTY,

  LOCATION_NOT_ACTIVE
}
