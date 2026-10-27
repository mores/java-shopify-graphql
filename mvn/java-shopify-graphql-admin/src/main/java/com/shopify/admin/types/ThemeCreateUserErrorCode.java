package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ThemeCreateUserError`.
 */
public enum ThemeCreateUserErrorCode {
  /**
   * Must be a zip file.
   */
  INVALID_ZIP,

  /**
   * Zip is empty.
   */
  ZIP_IS_EMPTY,

  /**
   * May not be used to fetch a file bigger
   *             than 50MB.
   */
  ZIP_TOO_LARGE,

  /**
   * Theme creation is not allowed for your shop's plan.
   */
  THEME_CREATION_NOT_ALLOWED_FOR_THEME_LIMITED_PLAN,

  /**
   * Invalid theme role for theme creation.
   */
  INVALID_THEME_ROLE_FOR_THEME_CREATION
}
