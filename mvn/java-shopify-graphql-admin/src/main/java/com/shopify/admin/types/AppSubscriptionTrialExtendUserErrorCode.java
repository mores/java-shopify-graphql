package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `AppSubscriptionTrialExtendUserError`.
 */
public enum AppSubscriptionTrialExtendUserErrorCode {
  /**
   * The app subscription wasn't found.
   */
  SUBSCRIPTION_NOT_FOUND,

  /**
   * The trial isn't active.
   */
  TRIAL_NOT_ACTIVE,

  /**
   * The app subscription isn't active.
   */
  SUBSCRIPTION_NOT_ACTIVE
}
