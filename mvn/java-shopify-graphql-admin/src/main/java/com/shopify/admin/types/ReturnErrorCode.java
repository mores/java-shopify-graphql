package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ReturnUserError`.
 */
public enum ReturnErrorCode {
  /**
   * Unexpected internal error happened.
   */
  INTERNAL_ERROR,

  /**
   * Too many arguments provided.
   */
  TOO_MANY_ARGUMENTS,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value should be equal to the value allowed.
   */
  EQUAL_TO,

  /**
   * The input value should be greater than the minimum allowed value.
   */
  GREATER_THAN,

  /**
   * The input value should be greater than or equal to the minimum value allowed.
   */
  GREATER_THAN_OR_EQUAL_TO,

  /**
   * The input value isn't included in the list.
   */
  INCLUSION,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value should be less than the maximum value allowed.
   */
  LESS_THAN,

  /**
   * The input value should be less than or equal to the maximum value allowed.
   */
  LESS_THAN_OR_EQUAL_TO,

  /**
   * The input value is not a number.
   */
  NOT_A_NUMBER,

  /**
   * The input value needs to be blank.
   */
  PRESENT,

  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * The input value is too big.
   */
  TOO_BIG,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The input value is too short.
   */
  TOO_SHORT,

  /**
   * The input value is the wrong length.
   */
  WRONG_LENGTH,

  /**
   * The requested resource already exists.
   */
  ALREADY_EXISTS,

  /**
   * A requested resource could not be created.
   */
  CREATION_FAILED,

  /**
   * A required feature is not enabled.
   */
  FEATURE_NOT_ENABLED,

  /**
   * The requested configuration cannot be applied to this standard return policy
   * which is managed for you in compliance with relevant regulations.
   */
  INCOMPATIBLE_WITH_STANDARD_POLICY,

  /**
   * A resource was not in the correct state for the operation to succeed.
   */
  INVALID_STATE,

  /**
   * The user does not have permission to perform the operation.
   */
  MISSING_PERMISSION,

  /**
   * A requested notification could not be sent.
   */
  NOTIFICATION_FAILED,

  /**
   * A requested item is not editable.
   */
  NOT_EDITABLE,

  /**
   * A requested item could not be found.
   */
  NOT_FOUND
}
