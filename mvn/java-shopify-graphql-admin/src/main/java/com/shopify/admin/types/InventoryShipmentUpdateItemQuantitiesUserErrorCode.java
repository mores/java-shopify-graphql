package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryShipmentUpdateItemQuantitiesUserError`.
 */
public enum InventoryShipmentUpdateItemQuantitiesUserErrorCode {
  SHIPMENT_NOT_FOUND,

  ITEM_NOT_FOUND,

  INVALID_QUANTITY,

  INVALID_SHIPMENT_STATUS,

  LOCATION_NOT_FOUND,

  LOCATION_NOT_ACTIVE
}
