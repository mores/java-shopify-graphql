package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `CartTransformDeleteUserError`.
 */
public enum CartTransformDeleteUserErrorCode {
  /**
   * Could not find cart transform for provided id.
   */
  NOT_FOUND,

  /**
   * Unauthorized app scope.
   */
  UNAUTHORIZED_APP_SCOPE
}
