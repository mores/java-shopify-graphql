package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ThemePublishUserError`.
 */
public enum ThemePublishUserErrorCode {
  NOT_FOUND,

  CANNOT_PUBLISH_THEME_DURING_INSTALL,

  THEME_PUBLISH_NOT_AVAILABLE_FOR_THEME_LIMITED_PLAN
}
