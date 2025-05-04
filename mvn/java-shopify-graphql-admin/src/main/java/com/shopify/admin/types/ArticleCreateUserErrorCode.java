package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `ArticleCreateUserError`.
 */
public enum ArticleCreateUserErrorCode {
  AMBIGUOUS_AUTHOR,

  AMBIGUOUS_BLOG,

  AUTHOR_FIELD_REQUIRED,

  AUTHOR_MUST_EXIST,

  INVALID_PUBLISH_DATE,

  BLOG_REFERENCE_REQUIRED,

  UPLOAD_FAILED,

  BLANK,

  NOT_FOUND,

  TOO_LONG,

  TAKEN,

  INVALID,

  INVALID_VALUE,

  INVALID_TYPE
}
