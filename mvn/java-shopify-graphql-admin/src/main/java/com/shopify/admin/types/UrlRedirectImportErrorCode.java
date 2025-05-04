package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `UrlRedirectImportUserError`.
 */
public enum UrlRedirectImportErrorCode {
  FILE_DOES_NOT_EXIST,

  NOT_FOUND,

  ALREADY_IMPORTED,

  IN_PROGRESS
}
