package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `DeliveryLocationLocalPickupSettingsError`.
 */
public enum DeliveryLocationLocalPickupSettingsErrorCode {
  /**
   * Provided locationId is not for an active location belonging to this store.
   */
  ACTIVE_LOCATION_NOT_FOUND,

  /**
   * Custom pickup time is not allowed for local pickup settings.
   */
  CUSTOM_PICKUP_TIME_NOT_ALLOWED,

  /**
   * An error occurred while changing the local pickup settings.
   */
  GENERIC_ERROR
}
