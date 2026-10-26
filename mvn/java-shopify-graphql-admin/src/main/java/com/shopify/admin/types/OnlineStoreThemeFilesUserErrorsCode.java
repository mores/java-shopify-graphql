package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `OnlineStoreThemeFilesUserErrors`.
 */
public enum OnlineStoreThemeFilesUserErrorsCode {
  /**
   * The record with the ID used as the input value couldn't be found.
   */
  NOT_FOUND,

  /**
   * The input value should be less than or equal to the maximum value allowed.
   */
  LESS_THAN_OR_EQUAL_TO,

  /**
   * There are theme files with conflicts.
   */
  THEME_FILES_CONFLICT,

  /**
   * There are files with the same filename.
   */
  DUPLICATE_FILE_INPUT,

  /**
   * Access denied.
   */
  ACCESS_DENIED,

  /**
   * This action is not available on your current plan. Please upgrade to access theme editing features.
   */
  THEME_LIMITED_PLAN,

  /**
   * Theme contextualization and condition types are not compatible with each other.
   */
  THEME_CONTEXTUALIZATION_NOT_COMPATIBLE_WITH_CONDITION_TYPES,

  /**
   * The file is invalid.
   */
  FILE_VALIDATION_ERROR,

  /**
   * Error.
   */
  ERROR,

  /**
   * Too many updates in a short period. Please try again later.
   */
  THROTTLED
}
