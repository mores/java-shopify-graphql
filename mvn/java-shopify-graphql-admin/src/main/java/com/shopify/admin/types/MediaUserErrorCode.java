package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `MediaUserError`.
 */
public enum MediaUserErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * Video validation failed.
   */
  VIDEO_VALIDATION_ERROR,

  /**
   * Model validation failed.
   */
  MODEL3D_VALIDATION_ERROR,

  /**
   * Video creation throttle was exceeded.
   */
  VIDEO_THROTTLE_EXCEEDED,

  /**
   * Model3d creation throttle was exceeded.
   */
  MODEL3D_THROTTLE_EXCEEDED,

  /**
   * Exceeded the limit of media per product.
   */
  PRODUCT_MEDIA_LIMIT_EXCEEDED,

  /**
   * Exceeded the limit of media per shop.
   */
  SHOP_MEDIA_LIMIT_EXCEEDED,

  /**
   * Product does not exist.
   */
  PRODUCT_DOES_NOT_EXIST,

  /**
   * Media does not exist.
   */
  MEDIA_DOES_NOT_EXIST,

  /**
   * Media does not exist on the given product.
   */
  MEDIA_DOES_NOT_EXIST_ON_PRODUCT,

  /**
   * Only one mediaId is allowed per variant-media input pair.
   */
  TOO_MANY_MEDIA_PER_INPUT_PAIR,

  /**
   * Exceeded the maximum number of 100 variant-media pairs per mutation call.
   */
  MAXIMUM_VARIANT_MEDIA_PAIRS_EXCEEDED,

  /**
   * Invalid media type.
   */
  INVALID_MEDIA_TYPE,

  /**
   * Variant specified in more than one pair.
   */
  PRODUCT_VARIANT_SPECIFIED_MULTIPLE_TIMES,

  /**
   * Variant does not exist on the given product.
   */
  PRODUCT_VARIANT_DOES_NOT_EXIST_ON_PRODUCT,

  /**
   * Non-ready media are not supported.
   */
  NON_READY_MEDIA,

  /**
   * Product variant already has attached media.
   */
  PRODUCT_VARIANT_ALREADY_HAS_MEDIA,

  /**
   * The specified media is not attached to the specified variant.
   */
  MEDIA_IS_NOT_ATTACHED_TO_VARIANT,

  /**
   * Media cannot be modified. It is currently being modified by another operation.
   */
  MEDIA_CANNOT_BE_MODIFIED,

  /**
   * Product is suspended.
   */
  PRODUCT_SUSPENDED,

  /**
   * Missing arguments.
   */
  MISSING_ARGUMENTS
}
