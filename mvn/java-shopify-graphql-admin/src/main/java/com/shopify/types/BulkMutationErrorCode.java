package com.shopify.types;

/**
 * Possible error codes that can be returned by `BulkMutationUserError`.
 */
public enum BulkMutationErrorCode {
  OPERATION_IN_PROGRESS,

  INVALID_MUTATION,

  INVALID_STAGED_UPLOAD_FILE,

  NO_SUCH_FILE,

  INTERNAL_FILE_SERVER_ERROR
}
