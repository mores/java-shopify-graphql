package com.shopify.admin.types;

/**
 * The available types of tactics for a marketing activity.
 */
public enum MarketingTactic {
  /**
   * An abandoned cart recovery email.
   */
  ABANDONED_CART,

  /**
   * An ad, such as a Facebook ad.
   */
  AD,

  /**
   * An affiliate link.
   */
  AFFILIATE,

  /**
   * A link.
   */
  LINK,

  /**
   * A loyalty program.
   */
  LOYALTY,

  /**
   * A messaging app, such as Facebook Messenger.
   */
  MESSAGE,

  /**
   * A newsletter.
   */
  NEWSLETTER,

  /**
   * A notification in the Shopify admin.
   */
  NOTIFICATION,

  /**
   * A blog post.
   */
  POST,

  /**
   * A retargeting ad.
   */
  RETARGETING,

  /**
   * A transactional email.
   */
  TRANSACTIONAL,

  /**
   * A popup on the online store.
   */
  STOREFRONT_APP,

  /**
   * Search engine optimization.
   */
  SEO
}
