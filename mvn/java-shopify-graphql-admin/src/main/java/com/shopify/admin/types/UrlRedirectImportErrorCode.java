package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `UrlRedirectImportUserError`.
 */
public enum UrlRedirectImportErrorCode {
  /**
   * CSV file does not exist at given URL.
   */
  FILE_DOES_NOT_EXIST,

  /**
   * URL redirect import not found.
   */
  NOT_FOUND,

  /**
   * The import has already completed.
   */
  ALREADY_IMPORTED,

  /**
   * The import is already in progress.
   */
  IN_PROGRESS
}
