package com.shopify.storefront.types;

/**
 * Possible error codes that can be returned by `MetafieldsSetUserError`.
 */
public enum MetafieldsSetUserErrorCode {
  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value isn't included in the list.
   */
  INCLUSION,

  /**
   * The input value should be less than or equal to the maximum value allowed.
   */
  LESS_THAN_OR_EQUAL_TO,

  /**
   * The input value needs to be blank.
   */
  PRESENT,

  /**
   * The input value is too short.
   */
  TOO_SHORT,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The owner ID is invalid.
   */
  INVALID_OWNER,

  /**
   * The value is invalid for metafield type or for definition options.
   */
  INVALID_VALUE,

  /**
   * The type is invalid.
   */
  INVALID_TYPE,

  /**
   * The current app is not authorized to perform this action.
   */
  APP_NOT_AUTHORIZED
}
