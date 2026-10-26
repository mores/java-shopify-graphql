package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `UrlRedirectUserError`.
 */
public enum UrlRedirectErrorCode {
  /**
   * Redirect does not exist.
   */
  DOES_NOT_EXIST,

  /**
   * Redirect could not be created.
   */
  CREATE_FAILED,

  /**
   * Redirect could not be updated.
   */
  UPDATE_FAILED,

  /**
   * Redirect could not be deleted.
   */
  DELETE_FAILED
}
