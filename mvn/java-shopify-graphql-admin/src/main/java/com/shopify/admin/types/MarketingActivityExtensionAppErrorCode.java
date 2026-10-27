package com.shopify.admin.types;

/**
 * The error code resulted from the marketing activity extension integration.
 */
public enum MarketingActivityExtensionAppErrorCode {
  /**
   * The shop/user must be onboarded to use the app.
   */
  NOT_ONBOARDED_ERROR,

  /**
   * The app has returned validation errors.
   */
  VALIDATION_ERROR,

  /**
   * The app is either not responding or returning unexpected data.
   */
  API_ERROR,

  /**
   * The app has returned an error when invoking the platform.
   */
  PLATFORM_ERROR,

  /**
   * The app needs to be installed.
   */
  INSTALL_REQUIRED_ERROR
}
