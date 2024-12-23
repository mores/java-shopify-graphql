package com.shopify.types;

/**
 * Possible error codes that can be returned by `CartTransformCreateUserError`.
 */
public enum CartTransformCreateUserErrorCode {
  INPUT_INVALID,

  FUNCTION_NOT_FOUND,

  FUNCTION_ALREADY_REGISTERED,

  FUNCTION_DOES_NOT_IMPLEMENT,

  INVALID_METAFIELDS
}
