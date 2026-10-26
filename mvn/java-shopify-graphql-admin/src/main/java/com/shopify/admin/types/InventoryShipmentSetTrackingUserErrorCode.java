package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryShipmentSetTrackingUserError`.
 */
public enum InventoryShipmentSetTrackingUserErrorCode {
  /**
   * The shipment was not found.
   */
  SHIPMENT_NOT_FOUND,

  /**
   * The URL is invalid.
   */
  INVALID_URL
}
