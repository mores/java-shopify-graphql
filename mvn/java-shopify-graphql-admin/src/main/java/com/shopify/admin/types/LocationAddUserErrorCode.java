package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `LocationAddUserError`.
 */
public enum LocationAddUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The ZIP code is not a valid US ZIP code.
   */
  INVALID_US_ZIPCODE,

  /**
   * An error occurred while adding the location.
   */
  GENERIC_ERROR,

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
   * Unstructured reserved namespace.
   */
  UNSTRUCTURED_RESERVED_NAMESPACE,

  /**
   * Owner type can't be used in this mutation.
   */
  DISALLOWED_OWNER_TYPE,

  /**
   * The input value isn't included in the list.
   */
  INCLUSION,

  /**
   * The input value needs to be blank.
   */
  PRESENT,

  /**
   * The input value is too short.
   */
  TOO_SHORT,

  /**
   * The metafield violates a capability restriction.
   */
  CAPABILITY_VIOLATION,

  /**
   * An internal error occurred.
   */
  INTERNAL_ERROR
}
