package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `LocationActivateUserError`.
 */
public enum LocationActivateUserErrorCode {
  /**
   * An error occurred while activating the location.
   */
  GENERIC_ERROR,

  /**
   * Shop has reached its location limit.
   */
  LOCATION_LIMIT,

  /**
   * This location currently cannot be activated as inventory, pending orders or
   * transfers are being relocated from this location.
   */
  HAS_ONGOING_RELOCATION,

  /**
   * Location not found.
   */
  LOCATION_NOT_FOUND,

  /**
   * There is already an active location with this name.
   */
  HAS_NON_UNIQUE_NAME,

  /**
   * This request is currently in progress, please try again.
   */
  IDEMPOTENCY_CONCURRENT_REQUEST,

  /**
   * The same idempotency key cannot be used with different operation parameters.
   */
  IDEMPOTENCY_KEY_PARAMETER_MISMATCH
}
