package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `AppUninstallAppUninstallError`.
 */
public enum AppUninstallAppUninstallErrorCode {
  /**
   * The app cannot be found.
   */
  APP_NOT_FOUND,

  /**
   * The app is not installed.
   */
  APP_NOT_INSTALLED,

  /**
   * User does not have sufficient permissions to uninstall this app.
   */
  USER_PERMISSIONS_INSUFFICIENT,

  /**
   * An error occurred while uninstalling the app.
   */
  APP_UNINSTALL_ERROR
}
