package com.shopify.admin.types;

/**
 * The lifecycle status of a rollout.
 */
public enum RolloutStatus {
  /**
   * The rollout is being set up and doesn't serve its treatments to buyers.
   */
  DRAFT,

  /**
   * The rollout is set to start at a future date and doesn't serve its treatments to buyers yet.
   */
  SCHEDULED,

  /**
   * The rollout was active and is stopped until it's resumed. It doesn't serve its treatments to buyers.
   */
  PAUSED,

  /**
   * The rollout is serving its treatments to buyers.
   */
  ACTIVE,

  /**
   * The rollout has ended and no longer serves its treatments to buyers.
   */
  CONCLUDED,

  /**
   * The rollout is archived and can't be changed. It doesn't serve its treatments to buyers.
   */
  ARCHIVED
}
