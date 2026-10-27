package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryShipmentSetBarcodeUserError`.
 */
public enum InventoryShipmentSetBarcodeUserErrorCode {
  /**
   * The shipment was not found.
   */
  SHIPMENT_NOT_FOUND,

  /**
   * This barcode is already assigned to another shipment.
   */
  BARCODE_DUPLICATE,

  /**
   * Barcode must be 255 characters or less.
   */
  BARCODE_TOO_LONG
}
