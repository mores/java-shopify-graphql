package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `MetafieldsSetUserError`.
 */
public enum MetafieldsSetUserErrorCode {
  /**
   * The metafield violates a capability restriction.
   */
  CAPABILITY_VIOLATION,

  /**
   * The metafield has been modified since it was loaded.
   */
  STALE_OBJECT,

  /**
   * The compareDigest is invalid.
   */
  INVALID_COMPARE_DIGEST,

  /**
   * The type is invalid.
   */
  INVALID_TYPE,

  /**
   * The value is invalid for the metafield type or for the definition options.
   */
  INVALID_VALUE,

  /**
   * ApiPermission metafields can only be created or updated by the app owner.
   */
  APP_NOT_AUTHORIZED,

  /**
   * The input value isn't included in the list.
   */
  INCLUSION,

  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * The input value needs to be blank.
   */
  PRESENT,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The input value is too short.
   */
  TOO_SHORT,

  /**
   * The input value should be less than or equal to the maximum value allowed.
   */
  LESS_THAN_OR_EQUAL_TO,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * An internal error occurred.
   */
  INTERNAL_ERROR
}
