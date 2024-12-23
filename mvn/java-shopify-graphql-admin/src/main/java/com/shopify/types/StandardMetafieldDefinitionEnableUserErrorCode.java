package com.shopify.types;

/**
 * Possible error codes that can be returned by `StandardMetafieldDefinitionEnableUserError`.
 */
public enum StandardMetafieldDefinitionEnableUserErrorCode {
  INVALID,

  TAKEN,

  TEMPLATE_NOT_FOUND,

  LIMIT_EXCEEDED,

  UNSTRUCTURED_ALREADY_EXISTS,

  TYPE_NOT_ALLOWED_FOR_CONDITIONS,

  INVALID_INPUT_COMBINATION
}
