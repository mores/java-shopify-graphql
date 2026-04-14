package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryShipmentSetBarcodeUserError`.
 */
public enum InventoryShipmentSetBarcodeUserErrorCode {
  SHIPMENT_NOT_FOUND,

  BARCODE_DUPLICATE,

  BARCODE_TOO_LONG
}
