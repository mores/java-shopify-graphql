package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ArticleUpdateUserError`.
 */
public enum ArticleUpdateUserErrorCode {
  /**
   * Can't update an article author if both author name and user ID are supplied.
   */
  AMBIGUOUS_AUTHOR,

  /**
   * Can't create a blog from input if a blog ID is supplied.
   */
  AMBIGUOUS_BLOG,

  /**
   * User must exist if a user ID is supplied.
   */
  AUTHOR_MUST_EXIST,

  /**
   * Can’t set isPublished to true and also set a future publish date.
   */
  INVALID_PUBLISH_DATE,

  /**
   * Image upload failed.
   */
  UPLOAD_FAILED,

  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The record with the ID used as the input value couldn't be found.
   */
  NOT_FOUND,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The value is invalid for the metafield type or for the definition options.
   */
  INVALID_VALUE,

  /**
   * The metafield type is invalid.
   */
  INVALID_TYPE
}
