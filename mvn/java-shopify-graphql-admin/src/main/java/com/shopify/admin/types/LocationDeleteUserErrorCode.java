package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `LocationDeleteUserError`.
 */
public enum LocationDeleteUserErrorCode {
  /**
   * Location not found.
   */
  LOCATION_NOT_FOUND,

  /**
   * The location cannot be deleted while it is active.
   */
  LOCATION_IS_ACTIVE,

  /**
   * An error occurred while deleting the location.
   */
  GENERIC_ERROR,

  /**
   * The location cannot be deleted while it has inventory.
   */
  LOCATION_HAS_INVENTORY,

  /**
   * The location cannot be deleted while it has pending orders.
   */
  LOCATION_HAS_PENDING_ORDERS,

  /**
   * The location cannot be deleted while it has any active Retail subscriptions in the Point of Sale channel.
   */
  LOCATION_HAS_ACTIVE_RETAIL_SUBSCRIPTION
}
