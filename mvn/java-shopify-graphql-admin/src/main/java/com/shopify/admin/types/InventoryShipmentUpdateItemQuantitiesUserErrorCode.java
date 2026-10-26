package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryShipmentUpdateItemQuantitiesUserError`.
 */
public enum InventoryShipmentUpdateItemQuantitiesUserErrorCode {
  /**
   * The location selected can't be found.
   */
  LOCATION_NOT_FOUND,

  /**
   * The shipment was not found.
   */
  SHIPMENT_NOT_FOUND,

  /**
   * The item was not found.
   */
  ITEM_NOT_FOUND,

  /**
   * The quantity is invalid.
   */
  INVALID_QUANTITY,

  /**
   * Current shipment status does not support this operation.
   */
  INVALID_SHIPMENT_STATUS,

  /**
   * The location selected is not active.
   */
  LOCATION_NOT_ACTIVE
}
