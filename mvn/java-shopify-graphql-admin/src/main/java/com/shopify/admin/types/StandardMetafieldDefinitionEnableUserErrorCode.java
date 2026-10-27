package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `StandardMetafieldDefinitionEnableUserError`.
 */
public enum StandardMetafieldDefinitionEnableUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * The standard metafield definition template was not found.
   */
  TEMPLATE_NOT_FOUND,

  /**
   * The maximum number of definitions per owner type has been exceeded.
   */
  LIMIT_EXCEEDED,

  /**
   * The namespace and key is already in use for a set of your metafields.
   */
  UNSTRUCTURED_ALREADY_EXISTS,

  /**
   * The definition type is not eligible to be used as collection condition.
   */
  TYPE_NOT_ALLOWED_FOR_CONDITIONS,

  /**
   * The metafield definition capability is invalid.
   */
  INVALID_CAPABILITY,

  /**
   * The metafield definition capability cannot be disabled.
   */
  CAPABILITY_CANNOT_BE_DISABLED,

  /**
   * You have reached the maximum allowed definitions to be used as admin filters.
   */
  OWNER_TYPE_LIMIT_EXCEEDED_FOR_USE_AS_ADMIN_FILTERS,

  /**
   * The associated standard metaobject definition template is not valid for the
   * metafield definition and prevented enabling it.
   */
  INVALID_STANDARD_METAOBJECT,

  /**
   * The metafield definition does not support pinning.
   */
  UNSUPPORTED_PINNING,

  /**
   * Admin access can only be specified for app-owned metafield definitions.
   */
  ADMIN_ACCESS_INPUT_NOT_ALLOWED,

  /**
   * The input combination is invalid.
   */
  INVALID_INPUT_COMBINATION
}
