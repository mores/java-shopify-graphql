package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `OnlineStoreThemeFilesUserErrors`.
 */
public enum OnlineStoreThemeFilesUserErrorsCode {
  NOT_FOUND,

  LESS_THAN_OR_EQUAL_TO,

  THEME_FILES_CONFLICT,

  DUPLICATE_FILE_INPUT,

  ACCESS_DENIED,

  THEME_LIMITED_PLAN,

  FILE_VALIDATION_ERROR,

  ERROR,

  THROTTLED
}
