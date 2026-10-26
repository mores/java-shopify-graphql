package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ValidationUserError`.
 */
public enum ValidationUserErrorCode {
  /**
   * Validation not found.
   */
  NOT_FOUND,

  /**
   * Function not found.
   */
  FUNCTION_NOT_FOUND,

  /**
   * Shop must be on a Shopify Plus plan to activate functions from a custom app.
   */
  CUSTOM_APP_FUNCTION_NOT_ELIGIBLE,

  /**
   * Function does not implement the required interface for this cart & checkout validation.
   */
  FUNCTION_DOES_NOT_IMPLEMENT,

  /**
   * Only unlisted apps can be used for this cart & checkout validation.
   */
  PUBLIC_APP_NOT_ALLOWED,

  /**
   * Function is pending deletion.
   */
  FUNCTION_PENDING_DELETION,

  /**
   * Cannot have more than 25 active validation functions.
   */
  MAX_VALIDATIONS_ACTIVATED,

  /**
   * Either function_id or function_handle must be provided.
   */
  MISSING_FUNCTION_IDENTIFIER,

  /**
   * Only one of function_id or function_handle can be provided, not both.
   */
  MULTIPLE_FUNCTION_IDENTIFIERS,

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
   * The input value is invalid.
   */
  INVALID,

  /**
   * The metafield violates a capability restriction.
   */
  CAPABILITY_VIOLATION,

  /**
   * An internal error occurred.
   */
  INTERNAL_ERROR
}
