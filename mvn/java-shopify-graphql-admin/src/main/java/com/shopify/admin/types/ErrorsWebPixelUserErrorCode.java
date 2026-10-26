package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ErrorsWebPixelUserError`.
 */
public enum ErrorsWebPixelUserErrorCode {
  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * The record with the ID used as the input value couldn't be found.
   */
  NOT_FOUND,

  /**
   * The provided settings does not match the expected settings definition on the app.
   */
  INVALID_SETTINGS,

  /**
   * An error occurred and the web pixel couldnt be deleted.
   */
  UNABLE_TO_DELETE,

  /**
   * No extension found.
   */
  NO_EXTENSION,

  /**
   * The provided settings is not a valid JSON.
   */
  INVALID_CONFIGURATION_JSON,

  /**
   * The settings definition of the web pixel extension is in an invalid state on the app.
   */
  INVALID_SETTINGS_DEFINITION,

  /**
   * An unexpected error occurred.
   */
  UNEXPECTED_ERROR,

  /**
   * The provided runtime context is invalid.
   */
  INVALID_RUNTIME_CONTEXT
}
