package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `BusinessCustomerUserError`.
 */
public enum BusinessCustomerErrorCode {
  INTERNAL_ERROR,

  RESOURCE_NOT_FOUND,

  FAILED_TO_DELETE,

  REQUIRED,

  NO_INPUT,

  INVALID_INPUT,

  UNEXPECTED_TYPE,

  TOO_LONG,

  LIMIT_REACHED,

  INVALID,

  BLANK,

  TAKEN
}
