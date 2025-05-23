package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ArticleUpdateUserError`.
 */
public enum ArticleUpdateUserErrorCode {
  AMBIGUOUS_AUTHOR,

  AMBIGUOUS_BLOG,

  AUTHOR_MUST_EXIST,

  INVALID_PUBLISH_DATE,

  UPLOAD_FAILED,

  BLANK,

  NOT_FOUND,

  TOO_LONG,

  TAKEN,

  INVALID
}
