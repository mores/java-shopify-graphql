package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `MetafieldDefinitionCreateUserError`.
 */
public enum MetafieldDefinitionCreateUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value isn't included in the list.
   */
  INCLUSION,

  /**
   * The input value needs to be blank.
   */
  PRESENT,

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
   * The input value is blank.
   */
  BLANK,

  /**
   * A capability is required for the definition type but is disabled.
   */
  CAPABILITY_REQUIRED_BUT_DISABLED,

  /**
   * The definition limit per owner type has exceeded.
   */
  RESOURCE_TYPE_LIMIT_EXCEEDED,

  /**
   * The definition limit per owner type for the app has exceeded.
   */
  RESOURCE_TYPE_LIMIT_EXCEEDED_BY_APP,

  /**
   * The maximum limit of definitions per owner type has exceeded.
   */
  LIMIT_EXCEEDED,

  /**
   * An invalid option.
   */
  INVALID_OPTION,

  /**
   * A duplicate option.
   */
  DUPLICATE_OPTION,

  /**
   * This namespace and key combination is reserved for standard definitions.
   */
  RESERVED_NAMESPACE_KEY,

  /**
   * The pinned limit has been reached for the owner type.
   */
  PINNED_LIMIT_REACHED,

  /**
   * This namespace and key combination is already in use for a set of your metafields.
   */
  UNSTRUCTURED_ALREADY_EXISTS,

  /**
   * The metafield definition does not support pinning.
   */
  UNSUPPORTED_PINNING,

  /**
   * A field contains an invalid character.
   */
  INVALID_CHARACTER,

  /**
   * The definition type is not eligible to be used as collection condition.
   */
  TYPE_NOT_ALLOWED_FOR_CONDITIONS,

  /**
   * You have reached the maximum allowed definitions for automated collections.
   */
  OWNER_TYPE_LIMIT_EXCEEDED_FOR_AUTOMATED_COLLECTIONS,

  /**
   * You have reached the maximum allowed definitions to be used as admin filters.
   */
  OWNER_TYPE_LIMIT_EXCEEDED_FOR_USE_AS_ADMIN_FILTERS,

  /**
   * The metafield definition constraints are invalid.
   */
  INVALID_CONSTRAINTS,

  /**
   * The input combination is invalid.
   */
  INVALID_INPUT_COMBINATION,

  /**
   * The metafield definition capability is invalid.
   */
  INVALID_CAPABILITY,

  /**
   * Admin access can only be specified for app-owned metafield definitions.
   */
  ADMIN_ACCESS_INPUT_NOT_ALLOWED
}
