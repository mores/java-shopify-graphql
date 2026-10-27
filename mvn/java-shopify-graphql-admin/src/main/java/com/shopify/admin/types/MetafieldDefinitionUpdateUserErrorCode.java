package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `MetafieldDefinitionUpdateUserError`.
 */
public enum MetafieldDefinitionUpdateUserErrorCode {
  /**
   * The input value needs to be blank.
   */
  PRESENT,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The metafield definition wasn't found.
   */
  NOT_FOUND,

  /**
   * An invalid input.
   */
  INVALID_INPUT,

  /**
   * A capability is required for the definition type but is disabled.
   */
  CAPABILITY_REQUIRED_BUT_DISABLED,

  /**
   * The pinned limit has been reached for the owner type.
   */
  PINNED_LIMIT_REACHED,

  /**
   * An internal error occurred.
   */
  INTERNAL_ERROR,

  /**
   * The metafield definition does not support pinning.
   */
  UNSUPPORTED_PINNING,

  /**
   * An invalid option.
   */
  INVALID_OPTION,

  /**
   * A duplicate option.
   */
  DUPLICATE_OPTION,

  /**
   * The definition type is not eligible to be used as collection condition.
   */
  TYPE_NOT_ALLOWED_FOR_CONDITIONS,

  /**
   * Action cannot proceed. Definition is currently in use.
   */
  METAFIELD_DEFINITION_IN_USE,

  /**
   * You have reached the maximum allowed definitions for automated collections.
   */
  OWNER_TYPE_LIMIT_EXCEEDED_FOR_AUTOMATED_COLLECTIONS,

  /**
   * You have reached the maximum allowed definitions to be used as admin filters.
   */
  OWNER_TYPE_LIMIT_EXCEEDED_FOR_USE_AS_ADMIN_FILTERS,

  /**
   * You cannot change the metaobject definition pointed to by a metaobject reference metafield definition.
   */
  METAOBJECT_DEFINITION_CHANGED,

  /**
   * Owner type can't be used in this mutation.
   */
  DISALLOWED_OWNER_TYPE,

  /**
   * The input combination is invalid.
   */
  INVALID_INPUT_COMBINATION,

  /**
   * The metafield definition constraints are invalid.
   */
  INVALID_CONSTRAINTS,

  /**
   * The metafield definition capability is invalid.
   */
  INVALID_CAPABILITY,

  /**
   * The metafield definition capability cannot be disabled.
   */
  CAPABILITY_CANNOT_BE_DISABLED,

  /**
   * Admin access can only be specified for app-owned metafield definitions.
   */
  ADMIN_ACCESS_INPUT_NOT_ALLOWED,

  /**
   * Definition is managed by app configuration and cannot be modified through the API.
   */
  APP_CONFIG_MANAGED
}
