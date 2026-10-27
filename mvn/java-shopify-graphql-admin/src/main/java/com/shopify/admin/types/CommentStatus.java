package com.shopify.admin.types;

/**
 * The status of a comment.
 */
public enum CommentStatus {
  /**
   * The comment is marked as spam.
   */
  SPAM,

  /**
   * The comment has been removed.
   */
  REMOVED,

  /**
   * The comment is published.
   */
  PUBLISHED,

  /**
   * The comment is unapproved.
   */
  UNAPPROVED,

  /**
   * The comment is pending approval.
   */
  PENDING
}
