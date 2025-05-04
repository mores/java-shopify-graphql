package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventorySetOnHandQuantitiesUserError`.
 */
public enum InventorySetOnHandQuantitiesUserErrorCode {
  INVALID_INVENTORY_ITEM,

  INVALID_LOCATION,

  INVALID_QUANTITY_NEGATIVE,

  INVALID_REASON,

  INVALID_REFERENCE_DOCUMENT,

  SET_ON_HAND_QUANTITIES_FAILED,

  ITEM_NOT_STOCKED_AT_LOCATION,

  NON_MUTABLE_INVENTORY_ITEM,

  INVALID_QUANTITY_TOO_HIGH
}
