package com.shopify.admin.types;

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

  INVALID_CAPABILITY,

  CAPABILITY_CANNOT_BE_DISABLED,

  UNSUPPORTED_PINNING,

  ADMIN_ACCESS_INPUT_NOT_ALLOWED,

  INVALID_INPUT_COMBINATION
}
