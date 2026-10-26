package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryShipmentDeleteUserError`.
 */
public enum InventoryShipmentDeleteUserErrorCode {
  /**
   * The shipment was not found.
   */
  SHIPMENT_NOT_FOUND,

  /**
   * Current shipment status does not support this operation.
   */
  INVALID_SHIPMENT_STATUS
}
