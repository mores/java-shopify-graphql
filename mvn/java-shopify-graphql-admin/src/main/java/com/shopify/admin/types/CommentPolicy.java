package com.shopify.admin.types;

/**
 * Possible comment policies for a blog.
 */
public enum CommentPolicy {
  /**
   * Readers can post comments to blog articles without moderation.
   */
  AUTO_PUBLISHED,

  /**
   * Readers cannot post comments to blog articles.
   */
  CLOSED,

  /**
   * Readers can post comments to blog articles, but comments must be moderated before they appear.
   */
  MODERATED
}
