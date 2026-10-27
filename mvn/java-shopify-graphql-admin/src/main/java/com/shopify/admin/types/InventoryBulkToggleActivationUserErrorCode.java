package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `InventoryBulkToggleActivationUserError`.
 */
public enum InventoryBulkToggleActivationUserErrorCode {
  /**
   * An error occurred while setting the activation status.
   */
  GENERIC_ERROR,

  /**
   * Cannot unstock an inventory item from the only location at which it is stocked.
   */
  CANNOT_DEACTIVATE_FROM_ONLY_LOCATION,

  /**
   * Cannot unstock this inventory item from this location because it has committed and incoming quantities.
   */
  COMMITTED_AND_INCOMING_INVENTORY_AT_LOCATION,

  /**
   * Cannot unstock this inventory item from this location because it has incoming quantities.
   */
  INCOMING_INVENTORY_AT_LOCATION,

  /**
   * Cannot unstock this inventory item from this location because it has committed quantities.
   */
  COMMITTED_INVENTORY_AT_LOCATION,

  /**
   * Cannot unstock this inventory item from this location because it has unavailable quantities.
   */
  RESERVED_INVENTORY_AT_LOCATION,

  /**
   * Failed to unstock this inventory item from this location.
   */
  FAILED_TO_UNSTOCK_FROM_LOCATION,

  /**
   * Cannot stock this inventory item at this location because it is managed by a third-party fulfillment service.
   */
  INVENTORY_MANAGED_BY_3RD_PARTY,

  /**
   * Cannot stock this inventory item at this location because it is managed by Shopify.
   */
  INVENTORY_MANAGED_BY_SHOPIFY,

  /**
   * Failed to stock this inventory item at this location.
   */
  FAILED_TO_STOCK_AT_LOCATION,

  /**
   * Cannot stock this inventory item at this location because the variant is missing a SKU.
   */
  MISSING_SKU,

  /**
   * The location was not found.
   */
  LOCATION_NOT_FOUND,

  /**
   * The inventory item was not found.
   */
  INVENTORY_ITEM_NOT_FOUND
}
