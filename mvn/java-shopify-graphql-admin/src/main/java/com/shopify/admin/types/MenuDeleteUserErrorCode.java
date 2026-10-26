package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `MenuDeleteUserError`.
 */
public enum MenuDeleteUserErrorCode {
  /**
   * Menu does not exist.
   */
  MENU_DOES_NOT_EXIST,

  /**
   * Default menu cannot be deleted.
   */
  UNABLE_TO_DELETE_DEFAULT_MENU
}
