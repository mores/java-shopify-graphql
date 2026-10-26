package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `MetaobjectUserError`.
 */
public enum MetaobjectUserErrorCode {
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
   * The metafield type is invalid.
   */
  INVALID_TYPE,

  /**
   * The value is invalid for the metafield type or the definition options.
   */
  INVALID_VALUE,

  /**
   * The value for the metafield definition option was invalid.
   */
  INVALID_OPTION,

  /**
   * Duplicate inputs were provided for this field key.
   */
  DUPLICATE_FIELD_INPUT,

  /**
   * No metaobject definition found for this type.
   */
  UNDEFINED_OBJECT_TYPE,

  /**
   * No field definition found for this key.
   */
  UNDEFINED_OBJECT_FIELD,

  /**
   * The specified field key is already in use.
   */
  OBJECT_FIELD_TAKEN,

  /**
   * Missing required fields were found for this object.
   */
  OBJECT_FIELD_REQUIRED,

  /**
   * The requested record couldn't be found.
   */
  RECORD_NOT_FOUND,

  /**
   * An unexpected error occurred.
   */
  INTERNAL_ERROR,

  /**
   * The maximum number of metaobjects definitions has been exceeded.
   */
  MAX_DEFINITIONS_EXCEEDED,

  /**
   * The maximum number of metaobjects per shop has been exceeded.
   */
  MAX_OBJECTS_EXCEEDED,

  /**
   * The maximum number of input metaobjects has been exceeded.
   */
  INPUT_LIMIT_EXCEEDED,

  /**
   * The targeted object cannot be modified.
   */
  IMMUTABLE,

  /**
   * Not authorized.
   */
  NOT_AUTHORIZED,

  /**
   * The provided name is reserved for system use.
   */
  RESERVED_NAME,

  /**
   * The display name cannot be the same when using the metaobject as a product option.
   */
  DISPLAY_NAME_CONFLICT,

  /**
   * Admin access can only be specified on metaobject definitions that have an app-reserved type.
   */
  ADMIN_ACCESS_INPUT_NOT_ALLOWED,

  /**
   * Definition is managed by app configuration and cannot be modified through the API.
   */
  APP_CONFIG_MANAGED,

  /**
   * Definition is required by an installed app and cannot be deleted.
   */
  STANDARD_METAOBJECT_DEFINITION_DEPENDENT_ON_APP,

  /**
   * The capability you are using is not enabled.
   */
  CAPABILITY_NOT_ENABLED,

  /**
   * The Online Store URL handle is already taken.
   */
  URL_HANDLE_TAKEN,

  /**
   * The Online Store URL handle is invalid.
   */
  URL_HANDLE_INVALID,

  /**
   * The Online Store URL handle cannot be blank.
   */
  URL_HANDLE_BLANK,

  /**
   * Renderable data input is referencing an invalid field.
   */
  FIELD_TYPE_INVALID,

  /**
   * The input is missing required keys.
   */
  MISSING_REQUIRED_KEYS,

  /**
   * The action cannot be completed because associated metaobjects are referenced by another resource.
   */
  REFERENCE_EXISTS_ERROR
}
