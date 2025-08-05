package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryShipmentRemoveItemsUserError`.
 */
public enum InventoryShipmentRemoveItemsUserErrorCode {
  INTERNAL_ERROR,

  SHIPMENT_NOT_FOUND,

  ITEM_NOT_FOUND,

  INVALID_SHIPMENT_STATUS,

  LOCATION_NOT_FOUND
}
