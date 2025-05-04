package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `LocationDeleteUserError`.
 */
public enum LocationDeleteUserErrorCode {
  LOCATION_NOT_FOUND,

  LOCATION_IS_ACTIVE,

  GENERIC_ERROR,

  LOCATION_HAS_INVENTORY,

  LOCATION_HAS_PENDING_ORDERS,

  LOCATION_HAS_ACTIVE_RETAIL_SUBSCRIPTION
}
