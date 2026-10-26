package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `FilesUserError`.
 */
public enum FilesErrorCode {
  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * File does not exist.
   */
  FILE_DOES_NOT_EXIST,

  /**
   * File has a pending operation.
   */
  FILE_LOCKED,

  /**
   * Filename update is only supported on Image and GenericFile.
   */
  UNSUPPORTED_MEDIA_TYPE_FOR_FILENAME_UPDATE,

  /**
   * Specify one argument: search, IDs, or deleteAll.
   */
  TOO_MANY_ARGUMENTS,

  /**
   * The search term must not be blank.
   */
  BLANK_SEARCH,

  /**
   * At least one argument is required.
   */
  MISSING_ARGUMENTS,

  /**
   * Search query isn't supported.
   */
  INVALID_QUERY,

  /**
   * One or more associated products are suspended.
   */
  PRODUCT_SUSPENDED,

  /**
   * Invalid filename extension.
   */
  INVALID_FILENAME_EXTENSION,

  /**
   * The provided filename is invalid.
   */
  INVALID_FILENAME,

  /**
   * The provided filename already exists.
   */
  FILENAME_ALREADY_EXISTS,

  /**
   * The file is not supported on trial accounts that have not validated their
   * email. Either select a plan or verify the shop owner email to upload this file.
   */
  UNACCEPTABLE_UNVERIFIED_TRIAL_ASSET,

  /**
   * The file type is not supported.
   */
  UNACCEPTABLE_ASSET,

  /**
   * The file is not supported on trial accounts. Select a plan to upload this file.
   */
  UNACCEPTABLE_TRIAL_ASSET,

  /**
   * The alt value exceeds the maximum limit of 512 characters.
   */
  ALT_VALUE_LIMIT_EXCEEDED,

  /**
   * The file is not in the READY state.
   */
  NON_READY_STATE,

  /**
   * File cannot be updated in a failed state.
   */
  INVALID_FAILED_MEDIA_STATE,

  /**
   * Exceeded the limit of non-image media per shop.
   */
  NON_IMAGE_MEDIA_PER_SHOP_LIMIT_EXCEEDED,

  /**
   * Cannot create file with custom filename which does not match original source extension.
   */
  MISMATCHED_FILENAME_AND_ORIGINAL_SOURCE,

  /**
   * Duplicate resolution mode is not supported for this file type.
   */
  INVALID_DUPLICATE_MODE_FOR_TYPE,

  /**
   * Invalid image source url value provided.
   */
  INVALID_IMAGE_SOURCE_URL,

  /**
   * Duplicate resolution mode REPLACE cannot be used without specifying filename.
   */
  MISSING_FILENAME_FOR_DUPLICATE_MODE_REPLACE,

  /**
   * Exceeded the limit of media per product.
   */
  PRODUCT_MEDIA_LIMIT_EXCEEDED,

  /**
   * The file type is not supported for referencing.
   */
  UNSUPPORTED_FILE_REFERENCE,

  /**
   * The target resource does not exist.
   */
  REFERENCE_TARGET_DOES_NOT_EXIST,

  /**
   * Cannot add more than 10000 references to a file.
   */
  TOO_MANY_FILE_REFERENCE,

  /**
   * Invalid duplicate resolution mode provided.
   */
  INVALID_DUPLICATE_RESOLUTION_MODE,

  /**
   * Media cannot be modified. It is currently being modified by another operation.
   */
  MEDIA_CANNOT_BE_MODIFIED
}
