package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `DeliveryPromiseProviderUpsertUserError`.
 */
public enum DeliveryPromiseProviderUpsertUserErrorCode {
  NOT_FOUND,

  TOO_LONG,

  MUST_BELONG_TO_APP,

  INVALID_TIME_ZONE
}
