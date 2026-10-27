package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ThemePublishUserError`.
 */
public enum ThemePublishUserErrorCode {
  /**
   * The record with the ID used as the input value couldn't be found.
   */
  NOT_FOUND,

  /**
   * Theme publishing is not available during install.
   */
  CANNOT_PUBLISH_THEME_DURING_INSTALL,

  /**
   * Theme publishing is not allowed on this plan.
   */
  THEME_PUBLISH_NOT_AVAILABLE_FOR_THEME_LIMITED_PLAN
}
