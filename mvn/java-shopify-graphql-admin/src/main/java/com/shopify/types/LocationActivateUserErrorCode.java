package com.shopify.types;

/**
 * Possible error codes that can be returned by `LocationActivateUserError`.
 */
public enum LocationActivateUserErrorCode {
  GENERIC_ERROR,

  LOCATION_LIMIT,

  HAS_ONGOING_RELOCATION,

  LOCATION_NOT_FOUND,

  HAS_NON_UNIQUE_NAME
}
