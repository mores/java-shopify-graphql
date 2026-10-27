package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `BusinessCustomerUserError`.
 */
public enum BusinessCustomerErrorCode {
  /**
   * An internal error occurred.
   */
  INTERNAL_ERROR,

  /**
   * The resource wasn't found.
   */
  RESOURCE_NOT_FOUND,

  /**
   * Deleting the resource failed.
   */
  FAILED_TO_DELETE,

  /**
   * Missing a required field.
   */
  REQUIRED,

  /**
   * The input is empty.
   */
  NO_INPUT,

  /**
   * The input is invalid.
   */
  INVALID_INPUT,

  /**
   * Unexpected type.
   */
  UNEXPECTED_TYPE,

  /**
   * The field value is too long.
   */
  TOO_LONG,

  /**
   * The number of resources exceeded the limit.
   */
  LIMIT_REACHED,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value is already taken.
   */
  TAKEN
}
