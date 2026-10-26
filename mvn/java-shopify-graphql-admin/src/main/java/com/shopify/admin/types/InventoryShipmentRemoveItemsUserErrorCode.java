package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryShipmentRemoveItemsUserError`.
 */
public enum InventoryShipmentRemoveItemsUserErrorCode {
  /**
   * The location selected can't be found.
   */
  LOCATION_NOT_FOUND,

  /**
   * Unexpected internal error happened.
   */
  INTERNAL_ERROR,

  /**
   * The shipment was not found.
   */
  SHIPMENT_NOT_FOUND,

  /**
   * The item was not found.
   */
  ITEM_NOT_FOUND,

  /**
   * Current shipment status does not support this operation.
   */
  INVALID_SHIPMENT_STATUS,

  /**
   * The location selected is not active.
   */
  LOCATION_NOT_ACTIVE
}
