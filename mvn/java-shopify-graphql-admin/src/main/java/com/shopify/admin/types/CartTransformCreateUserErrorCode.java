package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CartTransformCreateUserError`.
 */
public enum CartTransformCreateUserErrorCode {
  /**
   * Failed to create cart transform due to invalid input.
   */
  INPUT_INVALID,

  /**
   * No Shopify Function found for provided function_id.
   */
  FUNCTION_NOT_FOUND,

  /**
   * A cart transform function already exists for the provided function_id.
   */
  FUNCTION_ALREADY_REGISTERED,

  /**
   * Function does not implement the required interface for this cart_transform function.
   */
  FUNCTION_DOES_NOT_IMPLEMENT,

  /**
   * Shop must be on a Shopify Plus plan to activate functions from a custom app.
   */
  CUSTOM_APP_FUNCTION_NOT_ELIGIBLE,

  /**
   * Could not create or update metafields.
   */
  INVALID_METAFIELDS,

  /**
   * The maximum number of cart transforms per shop has been reached.
   */
  MAXIMUM_CART_TRANSFORMS,

  /**
   * Only one of function_id or function_handle can be provided, not both.
   */
  MULTIPLE_FUNCTION_IDENTIFIERS,

  /**
   * Either function_id or function_handle must be provided.
   */
  MISSING_FUNCTION_IDENTIFIER
}
