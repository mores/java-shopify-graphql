package com.shopify.admin.types;

/**
 * Actions that can be taken at the location when a client requests the deletion of the fulfillment service.
 */
public enum FulfillmentServiceDeleteInventoryAction {
  /**
   * Deactivate and delete the inventory and location.
   */
  DELETE,

  /**
   * Keep the inventory in place and convert the Fulfillment Service's location to be merchant managed.
   */
  KEEP,

  /**
   * Transfer the inventory and other dependencies to the provided location.
   */
  TRANSFER
}
