package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `DisputeEvidenceUpdateUserError`.
 */
public enum DisputeEvidenceUpdateUserErrorCode {
  DISPUTE_EVIDENCE_NOT_FOUND,

  EVIDENCE_ALREADY_ACCEPTED,

  EVIDENCE_PAST_DUE_DATE,

  FILES_SIZE_EXCEEDED_LIMIT,

  FILE_NOT_FOUND,

  TOO_LARGE,

  INVALID
}
