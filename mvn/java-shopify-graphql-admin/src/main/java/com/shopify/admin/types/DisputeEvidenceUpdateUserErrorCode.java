package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `DisputeEvidenceUpdateUserError`.
 */
public enum DisputeEvidenceUpdateUserErrorCode {
  /**
   * Dispute evidence could not be found.
   */
  DISPUTE_EVIDENCE_NOT_FOUND,

  /**
   * Evidence already accepted.
   */
  EVIDENCE_ALREADY_ACCEPTED,

  /**
   * Evidence past due date.
   */
  EVIDENCE_PAST_DUE_DATE,

  /**
   * The provider is reviewing the dispute.
   */
  EVIDENCE_UNDER_REVIEW,

  /**
   * Combined files size is too large.
   */
  FILES_SIZE_EXCEEDED_LIMIT,

  /**
   * File upload failed. Please try again.
   */
  FILE_NOT_FOUND,

  /**
   * Individual file size is too large.
   */
  TOO_LARGE,

  /**
   * The input value is invalid.
   */
  INVALID
}
