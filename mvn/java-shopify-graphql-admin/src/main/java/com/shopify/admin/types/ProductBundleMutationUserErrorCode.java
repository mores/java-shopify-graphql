package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ProductBundleMutationUserError`.
 */
public enum ProductBundleMutationUserErrorCode {
  /**
   * Something went wrong, please try again.
   */
  GENERIC_ERROR,

  /**
   * Product does not exist.
   */
  PRODUCT_DOES_NOT_EXIST,

  /**
   * Input is not valid.
   */
  INVALID_INPUT,

  /**
   * Error processing request in the background job.
   */
  JOB_ERROR
}
