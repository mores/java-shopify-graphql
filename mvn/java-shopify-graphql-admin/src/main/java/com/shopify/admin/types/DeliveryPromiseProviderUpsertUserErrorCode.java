package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `DeliveryPromiseProviderUpsertUserError`.
 */
public enum DeliveryPromiseProviderUpsertUserErrorCode {
  /**
   * The record with the ID used as the input value couldn't be found.
   */
  NOT_FOUND,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The location doesn't belong to the app.
   */
  MUST_BELONG_TO_APP,

  /**
   * The time zone is invalid.
   */
  INVALID_TIME_ZONE
}
