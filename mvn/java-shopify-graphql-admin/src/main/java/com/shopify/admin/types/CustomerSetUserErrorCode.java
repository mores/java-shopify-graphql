package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CustomerSetUserError`.
 */
public enum CustomerSetUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value isn't included in the list.
   */
  INCLUSION,

  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The input value is too short.
   */
  TOO_SHORT,

  /**
   * The input value needs to be blank.
   */
  PRESENT,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The id field is not allowed if identifier is provided.
   */
  ID_NOT_ALLOWED,

  /**
   * The input field corresponding to the identifier is required.
   */
  MISSING_FIELD_REQUIRED,

  /**
   * The identifier value does not match the value of the corresponding field in the input.
   */
  INPUT_MISMATCH,

  /**
   * Resource matching the identifier was not found.
   */
  NOT_FOUND,

  /**
   * The input argument `metafields` (if present) must contain the `customId` value.
   */
  METAFIELD_MISMATCH
}
