package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryShipmentMarkInTransitUserError`.
 */
public enum InventoryShipmentMarkInTransitUserErrorCode {
  /**
   * The shipment was not found.
   */
  SHIPMENT_NOT_FOUND,

  /**
   * Current shipment status does not support this operation.
   */
  INVALID_SHIPMENT_STATUS,

  /**
   * The item was not found.
   */
  ITEM_NOT_FOUND,

  /**
   * The item is not stocked at the intended location.
   */
  INVENTORY_STATE_NOT_ACTIVE,

  /**
   * The item does not track inventory.
   */
  UNTRACKED_ITEM,

  /**
   * The quantity is invalid.
   */
  INVALID_QUANTITY,

  /**
   * The list of line items is empty.
   */
  ITEMS_EMPTY,

  /**
   * The location selected is not active.
   */
  LOCATION_NOT_ACTIVE,

  /**
   * Failed to activate inventory at location.
   */
  ACTIVATION_FAILED
}
